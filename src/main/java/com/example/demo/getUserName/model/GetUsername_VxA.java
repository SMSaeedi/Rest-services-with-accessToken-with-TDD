package com.example.demo.getUserName.model;

import com.example.demo.dataBaseConfig.Database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class GetUsername_VxA {

    public String getUserName(int C_ID) {
        Connection con = Database.pickConnection();
        String u_name = null;
        try {
            // Prepare SQL
            Statement get_user_name = Database.createStatement(con);
            // Set parameter
//            get_user_name.setInt(1, C_ID);
            ResultSet rs = get_user_name.executeQuery("SELECT c_uname FROM tpcw_customer WHERE c_id = " + C_ID);
            // Results
            rs.next();
            u_name = rs.getString("c_uname");
            rs.close();
            get_user_name.close();
            con.commit();
        } catch (java.lang.Exception ex) {
            //ex.printStackTrace();
        } finally {
            Database.relaseConnection(con);
        }
        return u_name;
    }
}