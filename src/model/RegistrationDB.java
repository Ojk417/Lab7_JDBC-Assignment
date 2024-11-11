/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Go
 */
public class RegistrationDB {
   
 // add to mysql jar file    
    
 public static Connection mycon(){
 
     try {
         
         Class.forName("com.mysql.jdbc.Driver");
         Connection c = DriverManager.getConnection("jdbc:mysql://"
                 + "localhost:3306/connector","root","password");
         
         return c ;
         
     } catch (Exception e) {
     }
     return null;
 
 
 }
    
}
