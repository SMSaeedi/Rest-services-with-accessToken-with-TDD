package com.example.demo.newProducts.model;

import com.example.demo.dataBaseConfig.Database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.*;

public class NewProducts_VxA {

    public NewProductsOutput process(NewProductsInput input) throws Exception {
        NewProductsOutput npo = new NewProductsOutput();
        Connection conn = Database.pickConnection();
        try {
            if (conn != null) {
                npo = getData(conn, npo, input);
            }
            conn.commit();
        } catch (Exception e) {
            throw e;
        } finally {
            Database.relaseConnection(conn);
        }
        return npo;
    }

    private synchronized NewProductsOutput getData(Connection conn, NewProductsOutput npo, NewProductsInput input) throws SQLException {
        // setfetch size item_limit
        Long il = input.getItemLimit();
        Long l = null;
        Statement stmt = Database.createStatement(conn);
        if (il != null) {
            l = new Long(il);
            stmt.setFetchSize(l.intValue());
        }
        List<NewProductModel> npl = new ArrayList<NewProductModel>();
        // Date currDate= System.getCurrDate
        Calendar cal = Calendar.getInstance(TimeZone.getDefault());

        Long cod = input.getCutOffDuration();
        long time = 0;
        if (cod != null) {
            time = cal.getTimeInMillis() - cod.longValue();
        } else {
            time = cal.getTimeInMillis();
        }
        Date date = new Date(time);
        Format formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s = formatter.format(date);
        String sql = "select i_id, i_title, a_fname, a_lname" +
                " from item, author" +
                " where lower(i_subject) = lower('" +
                input.getSubjectString() + "')" +
                " and i_pub_date > to_timestamp('" + s + "', 'YYYY-MM-DD HH24:MI:SS')" +
                " and i_a_id = a_id" + " order by i_pub_date desc, i_title asc";

        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            long i_id = rs.getLong(1);
            String i_title = rs.getString(2);
            String a_fname = rs.getString(3);
            String a_lname = rs.getString(4);
            NewProductModel np = new NewProductModel();
            np.setItemId(i_id);
            np.setItemTitle(i_title);
            np.setAuthorLName(a_lname);
            np.setAuthorFName(a_fname);
            npl.add(np);

        }
        if (rs != null) {
            rs.close();
        }
        npo.setNewProductsList(npl);
        stmt.close();
        return (npo);
    }
}