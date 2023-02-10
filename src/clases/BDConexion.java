/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;


import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author jluis
 */
public class BDConexion {
    
    
   
        
    public static final String URL = "jdbc:mysql://68.64.164.99:10273/PanesBD";
    public static final String USER = "admin";
    public static final String CLAVE = "JFj9Sh9y";
     
    public Connection getConexion(){
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USER, CLAVE);
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        return con;
    }
       
        
        
        
    }
    
    
    
    

