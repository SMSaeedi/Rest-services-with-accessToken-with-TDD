package com.example.demo.doSubjectSearch.model;

import com.example.demo.dataBaseConfig.Database;
import com.example.demo.doTitleSearch.model.Book;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DoSubjectSearch_VxA {

    public List<Book> doSubjectSearch(String search_key) {
        List<Book> list = new ArrayList<Book>();
        Connection con = Database.pickConnection();
        try {
            // Prepare SQL
            Statement statement = Database.createStatement(con);
            // Set parameter
//            statement.setString(1, );
            ResultSet rs = statement.executeQuery("SELECT * FROM tpcw_item, tpcw_author WHERE tpcw_item.i_a_id = tpcw_author.a_id AND tpcw_item.i_subject = '" +
                    search_key + "' AND ROWNUM <= 50 ORDER BY tpcw_item.i_title ");
            // Results
            while (rs.next()) {
                list.add(new Book(rs));
            }
            rs.close();
            statement.close();
            con.commit();
        } catch (java.lang.Exception ex) {
            //ex.printStackTrace();
        } finally {
            Database.relaseConnection(con);
        }
        return list;
    }
}