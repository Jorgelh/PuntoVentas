/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FELclass;

import clas.BDConexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author jluis
 */






public class ObtenerProductosFactura {
    
    
    
    private int cantidad;
    private String Descripcion2;
    private double precio;
    private double total;
    private double grantotal;

    public double getGrantotal() {
        return grantotal;
    }

    public void setGrantotal(double grantotal) {
        this.grantotal = grantotal;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion2() {
        return Descripcion2;
    }

    public void setDescripcion2(String Descripcion2) {
        this.Descripcion2 = Descripcion2;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    

      public static ArrayList<ObtenerProductosFactura> ListaProductosFactura(String a) {
        return SQLP("SELECT pe.cantidad,p.Descripcion,p.precio,pe.PRECIO as total FROM productos_pedido pe inner join productosFEL p on pe.ID_PRODUCTO = p.ID_PRODUCTO where ID_PEDIDO ="+a);    
 }  
private static ArrayList<ObtenerProductosFactura> SQLP(String sql){
    ArrayList<ObtenerProductosFactura> list = new ArrayList<ObtenerProductosFactura>();
    BDConexion conecta = new BDConexion();
    Connection cn = conecta.getConexion();
    
        try {
            ObtenerProductosFactura t;
            Statement stmt = cn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()){
                 t = new ObtenerProductosFactura();
                 t.setCantidad(rs.getInt("cantidad"));
                 t.setDescripcion2(rs.getString("Descripcion"));
                 t.setPrecio(rs.getDouble("precio"));
                 t.setTotal(rs.getDouble("total"));
                 list.add(t);
            }
            cn.close();
        } catch (Exception e) {
            System.out.println("error consulta DE LA ATABLA "+e);
            return null;
        } 
        return list;
} 

public static ArrayList<ObtenerProductosFactura> GranTotla(String b) {
        return total("select total from pedidos where ID_PEDIDO ="+b);    
 }  
private static ArrayList<ObtenerProductosFactura> total(String sql){
    ArrayList<ObtenerProductosFactura> list = new ArrayList<ObtenerProductosFactura>();
    BDConexion conecta = new BDConexion();
    Connection cn = conecta.getConexion();
        try {
            ObtenerProductosFactura t;
            Statement stmt = cn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()){
                 t = new ObtenerProductosFactura();
                 t.setGrantotal(rs.getInt("total"));
                 list.add(t);
            }
            cn.close();
        } catch (Exception e) {
            System.out.println("error consulta DE LA ATABLA "+e);
            return null;
        } 
        return list;
} 

    
    
    
}
