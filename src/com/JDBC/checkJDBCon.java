/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author alim.khan
 */
public class checkJDBCon {
    public static void main(String args[]){
        String JDBCURL = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String pwd = "";
        
        try{
            System.out.println("Connecting MyDQL database");
            Connection myConn = DriverManager.getConnection(JDBCURL, user, pwd);
            System.out.println("Connection Sucessful");
            myConn.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
