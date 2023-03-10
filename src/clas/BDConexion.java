/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clas;


import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author jluis
 */
public class BDConexion {
    
      //public static final String URL = "jdbc:mysql://34.134.216.151:3306/elrey";
       public static final String URL = "jdbc:mysql://localhost:3306/elrey?useTimezone=true&serverTimezone=UTC";
    public static final String USER = "elrey";
    public static final String CLAVE = "campana";
     
    public Connection getConexion(){
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USER, CLAVE);
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
            JOptionPane.showMessageDialog(null,"ERROR: "+e);
        }
        return con;
    }
   
    }
    
    
    
    

