/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clas;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author jluis
 */

public class BDConexion {
   
          //public static final String URL = "jdbc:mysql://26.195.136.94:3306/elrey?useTimezone=true&serverTimezone=UTC";//ENCUENTRO
         public static final String URL = "jdbc:mysql://26.65.135.22:3306/elrey?useTimezone=true&serverTimezone=UTC";//ZONA4}26.65.135.22
       //public static final String URL = "jdbc:mysql://localhost:3306/elrey?useTimezone=true&serverTimezone=UTC";//localhost
     //public static final String URL = "jdbc:mysql://192.168.0.14:3306/elrey?useTimezone=true&serverTimezone=UTC";//localhost
     // public static final String URL = "jdbc:mysql://26.175.57.65:3306/elrey?useTimezone=true&serverTimezone=UTC";//FARO
    //public static final String URL = "jdbc:mysql://26.178.84.253:3306/elrey?useTimezone=true&serverTimezone=UTC";//administrador
   public static final String USER = "elrey";
   public static final String CLAVE = "campana";
    /*public static final String USER = "AdminApp";
    public static final String CLAVE = "Coast@cm"; */
    public Connection getConexion(){
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USER, CLAVE);
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Error: " + e.getMessage());
            JOptionPane.showMessageDialog(null,"ERROR: "+e);
        }
        return con;
    }
   
    }
    
    
    
    

