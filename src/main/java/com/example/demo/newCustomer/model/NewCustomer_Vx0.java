package com.example.demo.newCustomer.model;


import com.example.demo.changePaymentMethod.model.LongWrapper;
import com.example.demo.changePaymentMethod.model.Pov;
import com.example.demo.dataBaseConfig.Database;

import java.sql.*;

public class NewCustomer_Vx0 {

    public NewCustomerOutput process(NewCustomerInput input) {
        NewCustomerOutput nco = new NewCustomerOutput();
        String pm = input.getPaymentMethod();
        if (pm != null) {
            if (true) {
                Pov pov = new Pov();
                LongWrapper wrapper = pov.call("" + input.getPoId(), input.getBusinessName());
                wrapper.getValue().getClass();
                Connection conn = Database.pickConnection();
                try {
                    if (conn != null) {
                        long addr_id_temp = getAddressID(conn, input);
                        if (addr_id_temp == -1) {
                            addr_id_temp = createAddress(conn, input);
                            if (addr_id_temp == -1) {
                                throw new RuntimeException("DB Error: Couldn't create Address ID");
                            }
                        }

                        long c_id = insertCostumer(conn, input, addr_id_temp);
                        if (c_id != -1) {
                            nco.setCustomerId(c_id);
                        } else {
                            throw new RuntimeException("DB Error: Couldn't insert Costumer");
                        }
                    }
                    conn.commit();
                } catch (SQLException e) {
                    e.printStackTrace();
                } finally {
                    Database.relaseConnection(conn);
                }
            }
        }
        return nco;
    }

    public NewCustomerOutput test(NewCustomerInput input) {
        NewCustomerOutput nco = new NewCustomerOutput();
        input.setPoId(11111L);
        input.setBusinessName("Programmer");
        input.setBillingZip("9821");
        nco.setCustomerId(input.getPoId());
        return nco;
    }

    private synchronized long getAddressID(Connection conn, NewCustomerInput input)
            throws SQLException {
        long addId = -1;
        long addr_co_id = getCOID(conn, input);
        if (addr_co_id != -1) {
            String ba1 = input.getBillingAddr1();
            String ba2 = input.getBillingAddr2();
            String bc = input.getBillingCity();
            String bs = input.getBillingState();
            String bz = input.getBillingZip();
            String sql = null;
            if ((ba1 != null) && (ba2 != null) && (bc != null) && (bs != null) && (bz != null)) {
                String CR = System.getProperty("line.separator");
                sql = "select addr_id from address " +
                        " where lower(ADDR_STREET1) = ? " + "   and lower(ADDR_STREET2) = ? " +
                        "   and lower(ADDR_CITY) = ? " + "   and lower(ADDR_STATE) = ? " +
                        "   and lower(ADDR_ZIP) = ? " + "   and ADDR_CO_ID = ?";
            }
            PreparedStatement ps101 = conn.prepareStatement(sql);
            ps101.setString(1, ba1.toLowerCase().trim());
            ps101.setString(2, ba2.toLowerCase().trim());
            ps101.setString(3, bc.toLowerCase().trim());
            ps101.setString(4, bs.toLowerCase().trim());
            ps101.setString(5, bz.toLowerCase().trim());
            ps101.setLong(6, addr_co_id);
            ResultSet rs = ps101.executeQuery();
            boolean v = rs.next();
            if (v) {
                addId = rs.getLong(1);
            }
            if (rs != null) {
                rs.close();
            }
            ps101.close();
        }
        return (addId);
    }

    private synchronized long createAddress(Connection conn, NewCustomerInput input)
            throws SQLException {
        long addr_id = -1;
        String sql = "";
        long addr_co_id = getCOID(conn, input);
        Statement stmt = Database.createStatement(conn);
        if (addr_co_id != -1) {
            sql = "select max(addr_id) from address";
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                addr_id = rs.getLong(1);
            }
            addr_id++;
            sql = "INSERT INTO ADDRESS(ADDR_ID, ADDR_STREET1, ADDR_STREET2, ADDR_CITY, ADDR_STATE, ADDR_ZIP, ADDR_CO_ID)" +
                    " VALUES(?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps138 = conn.prepareStatement(sql);
            ps138.setLong(1, addr_id);
            ps138.setString(2, input.getBillingAddr1());
            ps138.setString(3, input.getBillingAddr2());
            ps138.setString(4, input.getBillingCity());
            ps138.setString(5, input.getBillingState());
            ps138.setString(6, input.getBillingZip());
            ps138.setLong(7, addr_co_id);
            int rc = ps138.executeUpdate();
            if (rs != null) {
                rs.close();
            }
            ps138.close();
            stmt.close();
        }
        return (addr_id);
    }

    private long getCOID(Connection conn, NewCustomerInput input) throws SQLException {
        long res = -1;
        String sql = "select co_id from country where lower(co_name) = lower(?)";
        PreparedStatement ps158 = conn.prepareStatement(sql);
        ps158.setString(1, input.getBillingCountry());
        ResultSet rs = ps158.executeQuery();
        if (rs.next()) {
            res = rs.getLong(1);
        }
        if (rs != null) {
            rs.close();
        }
        ps158.close();
        return (res);
    }

    private synchronized long insertCostumer(Connection conn, NewCustomerInput input, long addr_id_temp) throws
            SQLException {
        long c_id = -1;
      /*  Lcg64RngTools tools = new Lcg64RngTools(System.currentTimeMillis());
        int discount = tools.Next(0, 50);
        String sql = "";
        Statement stmt = Database.createStatement(conn);
        sql = "SELECT max(C_ID) FROM customer";
        ResultSet rs = stmt.executeQuery(sql);
        if (rs.next()) {
            c_id = rs.getLong(1);
        }
        c_id++;
        sql = "INSERT INTO CUSTOMER( C_ID, C_BUSINESS_NAME, C_BUSINESS_INFO, C_PASSWD, C_CONTACT_FNAME, C_CONTACT_LNAME, C_CONTACT_PHONE," + " C_CONTACT_EMAIL," + " C_PAYMENT_METHOD," + " C_CREDIT_INFO," + " C_DISCOUNT," + " C_ADDR_ID," + " C_PO)" + " " +
                " VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps197 = conn.prepareStatement(sql);
        ps197.setLong(1, c_id);
        ps197.setString(2, input.getBusinessName());
        ps197.setString(3, input.getBusinessInfo());
        ps197.setString(4, input.getPassword());
        ps197.setString(5, input.getContactFName());
        ps197.setString(6, input.getContactLName());
        ps197.setString(7, input.getContactPhone());
        ps197.setString(8, input.getContactEmail());
        ps197.setString(9, input.getPaymentMethod());
        ps197.setString(10, input.getCreditInfo());
        ps197.setInt(11, discount);
        ps197.setLong(12, addr_id_temp);
        ps197.setLong(13, input.getPoId());
        int rc = ps197.executeUpdate();
        if (rs != null) {
            rs.close();
        }
        ps197.close();
        stmt.close();*/
        return (c_id);
    }
}
