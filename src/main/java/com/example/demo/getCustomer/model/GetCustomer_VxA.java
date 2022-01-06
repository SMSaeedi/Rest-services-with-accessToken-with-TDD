package com.example.demo.getCustomer.model;

import com.example.demo.dataBaseConfig.Database;
import com.example.demo.newCustomer.model.Customer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class GetCustomer_VxA {

    public Customer getCustomer(String UNAME) {
        Customer cust = null;
        Connection con = Database.pickConnection();
        try {
            Statement statement = Database.createStatement(con);
            ResultSet rs = statement.executeQuery("SELECT * FROM tpcw_customer, TPCW_ADDRESS, tpcw_country WHERE tpcw_customer.c_addr_id = TPCW_ADDRESS.addr_id AND TPCW_ADDRESS.addr_co_id = tpcw_country.co_id AND tpcw_customer.c_uname = '" + UNAME + "'");
            if (rs.next()) {
                cust = new Customer(rs);
            } else {
                rs.close();
                statement.close();
                return null;
            }
            statement.close();
            con.commit();
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
        } finally {
            Database.relaseConnection(con);
        }
        return cust;
    }
}