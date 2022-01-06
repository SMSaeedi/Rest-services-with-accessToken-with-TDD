package com.example.demo.getNewProducts.model;

import com.example.demo.dataBaseConfig.Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class GetNewProducts_Vx0 {

    public List<ShortBook> getNewProducts(String subject) {
        List<ShortBook> vec = new ArrayList<ShortBook>();
        Connection con = Database.pickConnection();
        try {
            // Prepare SQL
            PreparedStatement statement = con.prepareStatement("SELECT i_id, i_title, a_fname, a_lname " +
                    "FROM item, author " +
                    "WHERE item.i_a_id = author.a_id " +
                    "AND item.i_subject = ? " +
                    "AND ROWNUM <= 50 " +
                    "ORDER BY item.i_pub_date DESC,item.i_title ");

            // Set parameter
            statement.setString(1, subject);
            ResultSet rs = statement.executeQuery();
            // Results
            while (rs.next()) {
                vec.add(new ShortBook(rs));
            }
            rs.close();
            statement.close();
            con.commit();
        } catch (Exception ex) {
            //ex.printStackTrace();
        } finally {
            Database.relaseConnection(con);
        }
        return vec;
    }

    public List<ShortBook> getNewProductsTest(String title) {
        List<ShortBook> vec = new ArrayList<ShortBook>();

        vec.add(new ShortBook(title));

        return vec;
    }
}