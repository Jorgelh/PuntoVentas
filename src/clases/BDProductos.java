/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Connection;
import java.text.DecimalFormat;
/**
 *
 * @author jluis
 */
public class BDProductos {
    
    
    public static ArrayList<Productos> ListarProductos() {

        return consultarSQL("select id_producto,descripcion,truncate(precio,2) as precio FROM PanesBD.PRODUCTOS where tipo = 1");
    }
    
    public static ArrayList<Productos> ListarProductosExtra() {

        return consultarSQL("select id_adicional,descripcion,truncate(precio,2) as precio FROM PanesBD.adicional");
    }
    

    private static ArrayList<Productos> consultarSQL(String sql) {
        ArrayList<Productos> list = new ArrayList<Productos>();
        BDConexion conecta = new BDConexion();
        Connection cn = conecta.getConexion();
        DecimalFormat df = new DecimalFormat("#.00");
        
        try {
            Productos p;
            Statement stmt = cn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                p = new Productos();
                p.setId_producto(rs.getInt("id_producto"));
                p.setDescripcion(rs.getString("descripcion"));
                p.setPrecio("Q "+rs.getString("precio"));
                //p.setPrecio(Double.parseDouble(df.format(rs.getDouble("precio"))));
                System.out.println("precio ="+rs.getDouble("precio"));
                 System.out.println(df.format(rs.getDouble("precio")));
                list.add(p);
            }
            cn.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return null;
        }
        return list;
    }
    
    
    
}
