/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication31;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Thilinika
 */
public class DBconnect {
    
    public static Connection connect(){
    
    Connection conn =null;
    
    
    try
     {
     
         Class.forName("com.mysql.jdbc.Driver");
         conn =DriverManager.getConnection("jdbc:mysql://localhost:3307/example?","root","");
     
     }
     catch(Exception e)
     {
         System.out.println(e);
     
     }
    return conn;
}
}