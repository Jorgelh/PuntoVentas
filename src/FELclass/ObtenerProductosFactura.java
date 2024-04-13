/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FELclass;
import java.sql.*;
import clas.BDConexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

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
    private String nit;
    private String Nombre;
    private int idNit;
    private int idFel;
    private String Serie;
    private String numero;
    private String autorizacion;
    private String fechaCertifica;
    private int id_pedido;

    public int getIdFel() {
        return idFel;
    }

    public void setIdFel(int idFel) {
        this.idFel = idFel;
    }

    public String getSerie() {
        return Serie;
    }

    public void setSerie(String Serie) {
        this.Serie = Serie;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAutorizacion() {
        return autorizacion;
    }

    public void setAutorizacion(String autorizacion) {
        this.autorizacion = autorizacion;
    }

    public String getFechaCertifica() {
        return fechaCertifica;
    }

    public void setFechaCertifica(String fechaCertifica) {
        this.fechaCertifica = fechaCertifica;
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }
    
    
    

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getIdNit() {
        return idNit;
    }

    public void setIdNit(int idNit) {
        this.idNit = idNit;
    }

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
public static ObtenerProductosFactura InsertarNit(ObtenerProductosFactura t) throws SQLException{
        BDConexion conecta = new BDConexion();
        Connection con = conecta.getConexion();
        PreparedStatement smtp = null;
        smtp =con.prepareStatement("insert into compradornit(nombre,nit) values('"+t.getNombre()+"','"+t.getNit()+"')",Statement.RETURN_GENERATED_KEYS);
        try {
         smtp.executeUpdate();
     } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);}
        
        ResultSet rs = smtp.getGeneratedKeys();
        if(rs.next()){int id = rs.getInt(1);
          t.setIdNit(id);
        }
       con.close();
       smtp.close(); 
        return t;
       
    } 

  public static ObtenerProductosFactura InsertarFEL(ObtenerProductosFactura t) throws SQLException{
        BDConexion conecta = new BDConexion();
        Connection con = conecta.getConexion();
        PreparedStatement smtp = null;
        smtp =con.prepareStatement("insert into fel(serie,numero,autorizacion,fechacertificacion,id_pedido,idNit) values('"+t.getSerie()+"','"+t.getNumero()+"','"+t.getAutorizacion()+"','"+t.getFechaCertifica()+"',"+t.getId_pedido()+","+t.getIdNit()+")");
        try {
         smtp.executeUpdate();
     } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);}
       con.close();
       smtp.close(); 
       return t;
       
    } 


}
