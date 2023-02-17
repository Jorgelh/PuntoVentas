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
    
    //public static final String URL = "jdbc:mysql://34.134.216.151:3306/elrey";
    public static final String URL = "jdbc:mysql://localhost:3306/elrey1";
    public static final String USER = "root";
    public static final String CLAVE = "campana";
     
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
    
    
    
    

