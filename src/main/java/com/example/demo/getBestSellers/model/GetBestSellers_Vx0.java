package com.example.demo.getBestSellers.model;

import com.example.demo.dataBaseConfig.Database;
import com.example.demo.doTitleSearch.model.Book;
import com.example.demo.newProducts.model.ShortBook;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class GetBestSellers_Vx0 {

    public List<ShortBook> getBestSellers(String subject) {
        List<ShortBook> books = new ArrayList<ShortBook>();
        Connection con = Database.pickConnection();
        try {
            // Prepare SQL
            //The following is the original, unoptimized best sellers query.
            PreparedStatement statement = con.prepareStatement("SELECT i_id, i_title, a_fname, a_lname " +
                    "FROM tpcw_item, tpcw_author, tpcw_order_line " +
                    "WHERE tpcw_item.i_id = tpcw_order_line.ol_i_id " +
                    "AND tpcw_item.i_a_id = tpcw_author.a_id " +
                    "AND tpcw_order_line.ol_o_id > (SELECT MAX(o_id)-3333 FROM tpcw_orders) " +
                    "AND tpcw_item.i_subject = ? " +
                    "AND ROWNUM <= 50 " +
                    "GROUP BY i_id, i_title, a_fname, a_lname " +
                    "ORDER BY SUM(ol_qty) DESC ");
            //This is Mikko's optimized version, which depends on the fact that
            //A table named "bestseller" has been created.
	    /*PreparedStatement statement = con.prepareStatement
            ("SELECT bestseller.i_id, i_title, a_fname, a_lname, ol_qty " +
            "FROM tpcw_item, bestseller, tpcw_author WHERE tpcw_item.i_subject = ?" +
            " AND tpcw_item.i_id = bestseller.i_id AND tpcw_item.i_a_id = tpcw_author.a_id " +
            " ORDER BY ol_qty DESC FETCH FIRST 50 ROWS ONLY");*/

            // Set parameter
            statement.setString(1, subject);
            ResultSet rs = statement.executeQuery();

            // Results
            while (rs.next()) {
                books.add(new ShortBook(rs));
            }
            rs.close();
            statement.close();
            con.commit();
        } catch (java.lang.Exception ex) {
            //ex.printStackTrace();
        } finally {
            Database.relaseConnection(con);
        }
        return books;
    }

    public List<ShortBook> getBestSellersTest(ShortBook subject) {
        List<ShortBook> vec = new ArrayList<ShortBook>();

        if (subject.i_title.equals("Pride and Prejudice"))
            vec.add(new ShortBook(1,"Pride and Prejudice", "Jane", "Austen"));
        else if (subject.i_title.equals("Sense and Sensibility"))
            vec.add(new ShortBook(2,"Sense and Sensibility", "Jane", "Austen"));
        else if (subject.i_title.equals("Sandition"))
            vec.add(new ShortBook(3,"Sandition", "Jane", "Austen"));
        else if (subject.i_title.equals("Great expectation"))
            vec.add(new ShortBook(4,"Great expectation", "Charles", "Dickens"));
        else if (subject.i_title.equals("Little Dorrit"))
            vec.add(new ShortBook(5,"Little Dorrit", "Charles", "Dickens"));
        else
            vec.add(new ShortBook());
        
        return vec;
    }
}