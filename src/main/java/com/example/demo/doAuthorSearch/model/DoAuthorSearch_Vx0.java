package com.example.demo.doAuthorSearch.model;

import com.example.demo.dataBaseConfig.Database;
import com.example.demo.doTitleSearch.model.Book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DoAuthorSearch_Vx0 {

    public List<Book> doAuthorSearch(String search_key) {
        List<Book> vec = new ArrayList<Book>();
        Connection con = Database.pickConnection();
        try {
            // Prepare SQL
            PreparedStatement statement = con.prepareStatement("SELECT * FROM tpcw_author, tpcw_item WHERE tpcw_author.a_lname LIKE ? AND tpcw_item.i_a_id = tpcw_author.a_id AND ROWNUM <= 50 ORDER BY tpcw_item.i_title ");
            // Set parameter
            statement.setString(1, search_key + "%");
            ResultSet rs = statement.executeQuery();
            // Results
            while (rs.next()) {
                vec.add(new Book(rs));
            }
            rs.close();
            statement.close();
            con.commit();
        } catch (java.lang.Exception ex) {
            //ex.printStackTrace();
        } finally {
            Database.relaseConnection(con);
        }
        return vec;
    }

    public List<Book> doAuthorSearchTest(Book search_key) {
        List<Book> vec = new ArrayList<Book>();

        if (search_key.a_fname.equals("Jane")) {
            vec.add(new Book("Pride and Prejudice", "Jane Austen", "Jane"));
            vec.add(new Book("Sense and Sensibility", "Jane Austen", "Jane"));
            vec.add(new Book("Sandition", "Jane Austen", "Jane"));
        } else if (search_key.a_fname.equals("Charles")) {
            vec.add(new Book("Great expectation", "Charles Dickens", "Charles"));
            vec.add(new Book("Little Dorrit", "Charles Dickens", "Charles"));
        } else
            vec.add(new Book());

        return vec;
    }
}