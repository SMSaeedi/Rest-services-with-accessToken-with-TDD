package com.example.demo.getNewProducts.model;

import com.example.demo.dataBaseConfig.Database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class GetNewProducts_VxA {

    public List<ShortBook> getNewProducts(String subject) {
        List<ShortBook> vec = new ArrayList<ShortBook>();
        Connection con = Database.pickConnection();
        try {
            // Prepare SQL
            Statement statement = Database.createStatement(con);
            // Set parameter
//            statement.setString(1, );
            ResultSet rs = statement.executeQuery("SELECT i_id, i_title, a_fname, a_lname " +
                    "FROM item, author " +
                    "WHERE item.i_a_id = author.a_id " +
                    "AND item.i_subject = '" + subject + "' " +
                    "AND ROWNUM <= 50 " +
                    "ORDER BY item.i_pub_date DESC,item.i_title ");
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
}
