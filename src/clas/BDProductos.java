/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clas;

//import com.mysql.cj.xdevapi.Statement;
import java.sql.*;
import java.sql.Connection;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author jluis
 */
public class BDProductos {
    
    
    int a;
    
    
    public static ArrayList<Productos> ListarProductos() {

        return consultarSQL("select id_producto,descripcion,truncate(precio,2) as precio FROM PRODUCTOS where tipo = 1");
    }
    
    public static ArrayList<Productos> ListarProductosExtra() {

        return consultarSQL("select id_adicional,descripcion,truncate(precio,2) as precio FROM ADICIONAL");
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
                //System.out.println("precio ="+rs.getDouble("precio"));
                 //System.out.println(df.format(rs.getDouble("precio")));
                list.add(p);
            }
            cn.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return null;
        }
        return list;
    }
    
    
    
    
 public static InsertarProducto InsertarProducto_Pedido(InsertarProducto t) throws SQLException{
        BDConexion conecta = new BDConexion();
        Connection con = conecta.getConexion();
        PreparedStatement smtp = null;
        smtp =con.prepareStatement("insert into PRODUCTOS_PEDIDO (id_pedido,id_producto,cantidad,tipo,adicional,precio) values(?,?,?,?,1,(select precio*"+t.getCantidad()+" from PRODUCTOS where ID_PRODUCTO =  "+t.getId_producto()+" ))",Statement.RETURN_GENERATED_KEYS);
        try {
         smtp.setInt(1,t.getId_pedido());
         smtp.setInt(2,t.getId_producto());
         smtp.setInt(3, t.getCantidad());
         smtp.setInt(4, t.getTipo());
         smtp.executeUpdate();
     } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);}
        
        ResultSet rs = smtp.getGeneratedKeys();
        if(rs.next()){int id1 = rs.getInt(1);
          t.setIdregreso(id1);
        }
        
       con.close();
       smtp.close(); 
        return t;
       
    }
 
   public static InsertarProducto InsertarProducto_Pedido_tortilla(InsertarProducto t) throws SQLException{
        BDConexion conecta = new BDConexion();
        Connection con = conecta.getConexion();
        PreparedStatement smtp = null;
        smtp =con.prepareStatement("insert into PRODUCTOS_PEDIDO (id_pedido,id_producto,cantidad,tipo,adicional,precio) values(?,?,?,2,1,(select precio*"+t.getCantidad()+" from PRODUCTOS where ID_PRODUCTO =  "+t.getId_producto()+" ))",Statement.RETURN_GENERATED_KEYS);
        try {
         smtp.setInt(1,t.getId_pedido());
         smtp.setInt(2,t.getId_producto());
         smtp.setInt(3, t.getCantidad());
         smtp.executeUpdate();
     } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);}
        
        ResultSet rs = smtp.getGeneratedKeys();
        if(rs.next()){int id1 = rs.getInt(1);
          t.setIdregreso(id1);
        }
        
       con.close();
       smtp.close(); 
        return t;
       
    }
 
 
 
 
    public static InsertarProducto InsertarPedido(InsertarProducto t) throws SQLException{
        BDConexion conecta = new BDConexion();
        Connection con = conecta.getConexion();
        PreparedStatement smtp = null;
        smtp =con.prepareStatement("insert into PEDIDOS (FECHA) values(CURRENT_TIMESTAMP)",Statement.RETURN_GENERATED_KEYS);
          
        try {
         //smtp.setString(1,t.getFecha());
         smtp.executeUpdate();
     } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);}
        
        ResultSet rs = smtp.getGeneratedKeys();
        if(rs.next()){int id = rs.getInt(1);
          t.setIdregresoPedido(id);
        }
        
       con.close();
       smtp.close(); 
        return t;
       
    } 
    
    
    
    /*public static ArrayList<InsertarProducto> ListarProductosPedidos (int a ) {
        return SQL3("select  p.cantidad,\n" +
"if(p.tipo = 1,'PAN DE','TORTILLA DE') as tipo,\n" +
" pro.DESCRIPCION as des,GROUP_CONCAT(dn.descripcion SEPARATOR ' / ') as Extra\n" +
" from productos_pedido p \n" +
"inner join productos pro on pro.ID_PRODUCTO = p.ID_PRODUCTO join notas n on p.ID_PRODUCTOS_PEDIDO = n.ID_PRODUCTOS_PEDIDO join descripcionnotas dn on\n" +
"  dn.id = n.ID where p.ID_PEDIDO = "+a+" group by cantidad,tipo,pro.DESCRIPCION" );
    }*/
    
 public static ArrayList<InsertarProducto> ListarProductosPedidos (int a ) {
        return SQL3("select\n" +
"cantidad,\n" +
"if(p.adicional = 1, \n" +
"    concat(if(p.tipo = 1,'PAN DE','TORTILLA DE'),'  ',pro.DESCRIPCION,' ',\n" +
"    (select  GROUP_CONCAT(dn.descripcion SEPARATOR ' / ') as descri from  NOTAS n inner join DESCRIPCIONNOTAS dn on\n" +
"dn.id = n.ID where ID_PRODUCTOS_PEDIDO = p.ID_PRODUCTOS_PEDIDO)),pro.DESCRIPCION) as DESCRIPCION,p.PRECIO\n" +
"from PRODUCTOS_PEDIDO p \n" +
"inner join PRODUCTOS pro on p.ID_PRODUCTO = pro.ID_PRODUCTO where p.id_pedido ="+a+";");    
 }  

private static ArrayList<InsertarProducto> SQL3(String sql){
    ArrayList<InsertarProducto> list = new ArrayList<InsertarProducto>();
    BDConexion conecta = new BDConexion();
    Connection cn = conecta.getConexion();
        try {
            InsertarProducto t;
            Statement stmt = cn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()){
                 t = new InsertarProducto();
                 t.setDescripcion(rs.getString("DESCRIPCION").toUpperCase());
                 t.setCantidad1(rs.getInt("cantidad"));
                 t.setPrecio(rs.getDouble("Precio"));
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
