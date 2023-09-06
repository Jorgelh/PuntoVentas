/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package INICIO;

import Class.BDIngresos;
import static INICIO.Principal.ListarProductosPedidos;
import clas.BDConexion;
import clas.BDProductos;
import clas.InsertarProducto;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author jluis
 */
public class Opcion6 extends javax.swing.JPanel {
    
    int existe = 0;
    int id_producto;
    int id_nota;
    int id_producto_pedido = 0;
    int opcion;
    
    int id_pedido = 0;
    ArrayList<Integer> Num = new ArrayList<>();
    Color Botrojo = new Color(255,102,102); 
    Color Botverde = new Color(0,204,0);
    /**
     * Creates new form Opcion5
     */
    public Opcion6(int a) {
        initComponents();
         this.id_pedido=a;
        String texto = "<html><center><body>COCA COLA<br>VIDRIO NORMAL</body></center></html>";
        UNO.setText(texto);
        String texto1 = "<html><center><body>COCA COLA<br>VIDRIO MEDIO LITRO</body></center></html>";
        DOS.setText(texto1);
        String texto2 = "<html><center><body>COCA COLA<br>DESECHABLE PEQUEÑA</body></center></html>";
        TRES.setText(texto2);
        String texto3 = "<html><center><body>COCA COLA CERO<br>DESECHABLE PEQUEÑA</body></center></html>";
        CUATRO.setText(texto3);
        String texto4 = "<html><center><body>COCA COLA<br>DESECHABLE GRANDE</body></center></html>";
        CINCO.setText(texto4);
        String texto5 = "<html><center><body>COCA COLA<br>EN LATA</body></center></html>";
        SEIS.setText(texto5);
        String texto6 = "<html><center><body>FANTA UVA<br>VIDRIO NORMAL</body></center></html>";
        SIETE.setText(texto6);
        String texto7 = "<html><center><body>FANTA UVA<br>DESECHABLE PEQUEÑA</body></center></html>";
        OCHO.setText(texto7);
         String texto8 = "<html><center><body>FANTA NARANJA<br>VIDRIO NORMAL</body></center></html>";
        NUEVE.setText(texto8);
         String texto9 = "<html><center><body>FANTA NARANJA<br>DESECHABLE PEQUEÑA</body></center></html>";
        DIES.setText(texto9);
         String texto10 = "<html><center><body>COCA COLA<br>FAMILIAR 2.5L</body></center></html>";
        ONCE.setText(texto10);
         String texto11 = "<html><center><body>SPRITE<br>VIDRIO NORMAL</body></center></html>";
        DOCE.setText(texto11);
         String texto12 = "<html><center><body>SPRITE<br>DESECHABLE PEQUEÑA</body></center></html>";
        TRESE.setText(texto12);
         String texto13 = "<html><center><body>MINERAL<br>VIDRIO NORMAL</body></center></html>";
        CATORCE.setText(texto13);
         String texto14 = "<html><center><body>MINERAL<br>DESECHABLE GRANDE</body></center></html>";
        QUINCE.setText(texto14);
         String texto15 = "<html><center><body>TE FRIO<br>LIMON</body></center></html>";
        DIESISEIS.setText(texto15);
         String texto16 = "<html><center><body>TE FRIO<br>DE MELOCOTON</body></center></html>";
        DIESSIETE.setText(texto16);
         String texto17 = "<html><center><body>AGUA FRESCA</body></center></html>";
        DIESOCHO.setText(texto17);
         String texto18 = "<html><center><body>FANTA ROJA<br>DESECHABLE GRANDE</body></center></html>";
        DIESINUEVA.setText(texto18);
         String texto19 = "<html><center><body>POWERADE AZUL</body></center></html>";
        VEINTE.setText(texto19);
        String texto20 = "<html><center><body>POWERADE ROJO</body></center></html>";
        VEINTIUNO.setText(texto20);
         String texto21 = "<html><center><body>AGUA PURA</body></center></html>";
        VEINDOS.setText(texto21);
         String texto22 = "<html><center><body>CHOCOLATE 8 ONZ</body></center></html>";
        VEITITRES.setText(texto22);
         String texto23 = "<html><center><body>CHOCOLATE 12 ONZ</body></center></html>";
        VEINTICUATRO.setText(texto23);
         String texto24 = "<html><center><body>CAFE 8 ONZ</body></center></html>";
        VEITICINCO.setText(texto24);
         String texto25 = "<html><center><body>CAFE 12 ONZ</body></center></html>";
        VEITISEIS.setText(texto25);
        String texto26 = "<html><center><body>ADICIONAL DE<br>CREMORA</body></center></html>";
        VEITISIETE.setText(texto26);
    }
    
    
    
     Timer timer = new Timer(300, new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        Color Original = new Color(255,102,102);
        B1.setBackground(Original);
        B2.setBackground(Original);
        B3.setBackground(Original);
        B4.setBackground(Original);
        B5.setBackground(Original);
        B6.setBackground(Original);
        B7.setBackground(Original);
        B8.setBackground(Original);
        B9.setBackground(Original);
        B10.setBackground(Original);
        B11.setBackground(Original);
        B12.setBackground(Original);
        B13.setBackground(Original);
        B14.setBackground(Original);
        B15.setBackground(Original);
        B16.setBackground(Original);
        B17.setBackground(Original);
        B18.setBackground(Original);
        B19.setBackground(Original);
        B20.setBackground(Original);
        B21.setBackground(Original);
        B23.setBackground(Original);
        B22.setBackground(Original);
        B24.setBackground(Original);
        B25.setBackground(Original);
        B26.setBackground(Original);
        B27.setBackground(Original);
        B29.setBackground(Original);
        }
    });
    
    
    

   /* private void Limpiar() {
      
        B1.setBackground(Botrojo);
        B2.setBackground(Botrojo);
        B3.setBackground(Botrojo);
        B4.setBackground(Botrojo);
        B5.setBackground(Botrojo);
        B6.setBackground(Botrojo);
        B7.setBackground(Botrojo);
        B8.setBackground(Botrojo);
        B9.setBackground(Botrojo);
        B10.setBackground(Botrojo);
        B11.setBackground(Botrojo);
        B12.setBackground(Botrojo);
        B13.setBackground(Botrojo);
        B14.setBackground(Botrojo);
        B15.setBackground(Botrojo);
        B16.setBackground(Botrojo);
        B17.setBackground(Botrojo);
        B18.setBackground(Botrojo);
        B19.setBackground(Botrojo);
        B20.setBackground(Botrojo);
        B21.setBackground(Botrojo);
        B23.setBackground(Botrojo);
        B22.setBackground(Botrojo);
        B24.setBackground(Botrojo);
        B26.setBackground(Botrojo);
        B25.setBackground(Botrojo);
        B27.setBackground(Botrojo);
        marca1 = 0;   
        marca2 = 0;    
        marca3 = 0;  
        marca4 = 0;
        marca5 = 0;
        marca6 = 0;
        marca7 = 0;
        marca8 = 0;
        marca9 = 0;
        marca10 = 0;
        marca11 = 0;
        marca12 = 0;
        marca13 = 0;
        marca14 = 0;   
        marca15 = 0;    
        marca16 = 0;  
        marca17 = 0;
        marca18 = 0;
        marca19 = 0;
        marca20 = 0;
        marca21 = 0;
        marca22 = 0;
        marca23 = 0;
        marca24 = 0;
        marca25 = 0;
        marca26 = 0;
        marca27 = 0;
        Num.clear();
        cantidad.setText("1");
    }*/
    
    public void BuscarExistencia() {
        try {
            BDConexion conecta = new BDConexion();
            Connection cn = conecta.getConexion();
            java.sql.Statement stmt = cn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT cantidad as EXISTE FROM productos_pedido  WHERE id_pedido =  " + id_pedido + " AND id_producto =" + id_producto+" and opcion = "+ id_nota);
            while (rs.next()) {
                existe = rs.getInt(1);
            }
            rs.close();
            stmt.close();
            cn.close();
        } catch (Exception error) {
            System.out.print(error);
        }
    }
    
    private void eliminarProducto() {
        try {
            BDConexion conecta = new BDConexion();
            Connection con = conecta.getConexion();
            PreparedStatement ps = null;
            ps = con.prepareStatement("delete from productos_pedido where ID_PEDIDO =" + id_pedido + " and id_producto = " + id_producto+" and opcion = "+ id_nota);
            ps.executeUpdate();
            con.close();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROr = " + ex);
        }
       // INICIO.ListarProductosPedidos();
        ListarProductosPedidos();
        existe = 0;
    }
    
     private void InsertarProductoPedido() {

        try {
            InsertarProducto p1 = new InsertarProducto();
            p1.setId_pedido(id_pedido);
            p1.setId_producto(id_producto);
            p1.setId_nota(id_nota);
            BDProductos.InsertarProducto_Pedido_gaseosa(p1);
            id_producto_pedido = p1.getIdregreso();
            insertarNota();
            //JOptionPane.showMessageDialog(null, "Producto Agregado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "QUE MIERDA PASA= " + e);
        }
        //INICIO.ListarProductosPedidos();
         ListarProductosPedidos();
        existe = 0;
    }
     
     private void InsertarProductoPedidoSinNota() {

        try {
            InsertarProducto p1 = new InsertarProducto();
            p1.setId_pedido(id_pedido);
            p1.setId_producto(id_producto);
            p1.setId_nota(id_nota);
            BDProductos.InsertarProducto_Pedido_gaseosa_SinNota(p1);
            id_producto_pedido = p1.getIdregreso();
            //JOptionPane.showMessageDialog(null, "Producto Agregado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "QUE MIERDA PASA= " + e);
        }
        //INICIO.ListarProductosPedidos();
         ListarProductosPedidos();
        existe = 0;
    }
     
      private void UpdateCantidadMenos() {
        try {
            BDConexion conecta = new BDConexion();
            Connection con = conecta.getConexion();
            PreparedStatement smtp = null;
            PreparedStatement sm = null;
            sm = con.prepareStatement("{call Opcion6_regresarinventario(1,"+id_producto+")}");
            smtp = con.prepareStatement("update productos_pedido SET CANTIDAD = CANTIDAD-1,Precio = precio-(SELECT PRECIO FROM productos WHERE id_producto = " + id_producto + ") WHERE id_pedido = " + id_pedido + " AND id_producto = " + id_producto+" and opcion = "+ id_nota);
            smtp.executeUpdate();
            sm.executeUpdate();
            con.close();
            smtp.close();
            sm.close();
            // JOptionPane.showMessageDialog(null, "Guardado...");
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, ex);
        }

        //INICIO.ListarProductosPedidos();
         ListarProductosPedidos();
        existe = 0;
    }
     
     private void UpdateCantidad() {
        try {
            BDConexion conecta = new BDConexion();
            Connection con = conecta.getConexion();
            PreparedStatement smtp = null;
            PreparedStatement sm = null;
            sm = con.prepareStatement("{call Opcion6(1,"+id_producto+")}");
            smtp = con.prepareStatement("update productos_pedido SET CANTIDAD = CANTIDAD+1, Precio = CANTIDAD*(SELECT PRECIO FROM productos WHERE id_producto = " + id_producto + ") WHERE id_pedido = " + id_pedido + " AND id_producto = " + id_producto+" and opcion = "+ id_nota);
            smtp.executeUpdate();
            sm.executeUpdate();
            con.close();
            smtp.close();
            sm.close();
            // JOptionPane.showMessageDialog(null, "Guardado...");
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, ex);
        }

        //INICIO.ListarProductosPedidos();
         ListarProductosPedidos();
        existe = 0;
    }
    
    
    
    
    
    
    /* private void insertarGaseosas(){

    for(int i = 0; i < Num.size(); i++) {
    try {
        BDConexion conecta = new BDConexion();
        Connection con = conecta.getConexion();
        PreparedStatement smtp = null;
        PreparedStatement sm = null;
        //insert into PRODUCTOS_PEDIDO (id_pedido,id_producto,cantidad,tipo,extra) values(?,?,?,?,1) select precio*"+t.getCantidad()+" from PRODUCTOS where ID_PRODUCTO =  "+t.getId_producto()+" 
        sm = con.prepareStatement("{call Opcion6("+Integer.parseInt(cantidad.getText())+","+Num.get(i)+")}");
        smtp =con.prepareStatement("insert into PRODUCTOS_PEDIDO (id_pedido,id_producto,cantidad,adicional,precio,opcion) values(?,?,?,2,(select precio*"+cantidad.getText()+" from PRODUCTOS where id_producto = "+Num.get(i)+"),6)");
        smtp.setInt(1,id_pedido);
        smtp.setInt(2,Num.get(i));
        smtp.setInt(3, Integer.parseInt(cantidad.getText()));
        smtp.executeUpdate();
        sm.executeUpdate();
        con.close();
        smtp.close();  
        sm.close();    
     } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"QUE PASO: "+ e);}
    }
   // Limpiar();
}*/

     
     private void insertarNota(){

    try {
        BDConexion conecta = new BDConexion();
        Connection con = conecta.getConexion();
        PreparedStatement smtp = null;
        smtp =con.prepareStatement("insert into notas (id_productos_pedido,id) values(?,?)");
        smtp.setInt(1,id_producto_pedido);
        smtp.setInt(2,id_nota);
        smtp.executeUpdate();
        con.close();
        smtp.close();    
     } catch (Exception e) {
         
            JOptionPane.showMessageDialog(null,"QUE PASO: "+ e);}
    }
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        B1 = new Clases.PanelRound();
        UNO = new javax.swing.JLabel();
        B2 = new Clases.PanelRound();
        DOS = new javax.swing.JLabel();
        B3 = new Clases.PanelRound();
        TRES = new javax.swing.JLabel();
        B4 = new Clases.PanelRound();
        CUATRO = new javax.swing.JLabel();
        B5 = new Clases.PanelRound();
        CINCO = new javax.swing.JLabel();
        B6 = new Clases.PanelRound();
        SEIS = new javax.swing.JLabel();
        B7 = new Clases.PanelRound();
        SIETE = new javax.swing.JLabel();
        B8 = new Clases.PanelRound();
        OCHO = new javax.swing.JLabel();
        B9 = new Clases.PanelRound();
        NUEVE = new javax.swing.JLabel();
        B10 = new Clases.PanelRound();
        DIES = new javax.swing.JLabel();
        B11 = new Clases.PanelRound();
        ONCE = new javax.swing.JLabel();
        B12 = new Clases.PanelRound();
        DOCE = new javax.swing.JLabel();
        B13 = new Clases.PanelRound();
        TRESE = new javax.swing.JLabel();
        B14 = new Clases.PanelRound();
        CATORCE = new javax.swing.JLabel();
        B15 = new Clases.PanelRound();
        QUINCE = new javax.swing.JLabel();
        B16 = new Clases.PanelRound();
        DIESISEIS = new javax.swing.JLabel();
        B17 = new Clases.PanelRound();
        DIESSIETE = new javax.swing.JLabel();
        B18 = new Clases.PanelRound();
        DIESOCHO = new javax.swing.JLabel();
        B19 = new Clases.PanelRound();
        DIESINUEVA = new javax.swing.JLabel();
        B20 = new Clases.PanelRound();
        VEINTE = new javax.swing.JLabel();
        B21 = new Clases.PanelRound();
        VEINTIUNO = new javax.swing.JLabel();
        B22 = new Clases.PanelRound();
        VEINDOS = new javax.swing.JLabel();
        B23 = new Clases.PanelRound();
        VEITITRES = new javax.swing.JLabel();
        B24 = new Clases.PanelRound();
        VEINTICUATRO = new javax.swing.JLabel();
        B25 = new Clases.PanelRound();
        VEITICINCO = new javax.swing.JLabel();
        B26 = new Clases.PanelRound();
        VEITISEIS = new javax.swing.JLabel();
        B27 = new Clases.PanelRound();
        VEITISIETE = new javax.swing.JLabel();
        B29 = new Clases.PanelRound();
        VEINTINUEVE = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 153));
        setPreferredSize(new java.awt.Dimension(730, 690));

        B1.setBackground(new java.awt.Color(255, 102, 102));
        B1.setPreferredSize(new java.awt.Dimension(145, 45));
        B1.setRoundBottomLeft(15);
        B1.setRoundBottomRight(15);
        B1.setRoundTopLeft(15);
        B1.setRoundTopRight(15);
        B1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B1MouseClicked(evt);
            }
        });

        UNO.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        UNO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UNO.setText("COCA COLA VI NORMAL");
        UNO.setToolTipText("");
        UNO.setName("SALCHICHA PEQUEÑA"); // NOI18N
        UNO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UNOMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout B1Layout = new javax.swing.GroupLayout(B1);
        B1.setLayout(B1Layout);
        B1Layout.setHorizontalGroup(
            B1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UNO, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );
        B1Layout.setVerticalGroup(
            B1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UNO, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        B2.setBackground(new java.awt.Color(255, 102, 102));
        B2.setPreferredSize(new java.awt.Dimension(145, 45));
        B2.setRoundBottomLeft(15);
        B2.setRoundBottomRight(15);
        B2.setRoundTopLeft(15);
        B2.setRoundTopRight(15);
        B2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B2MouseClicked(evt);
            }
        });

        DOS.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        DOS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DOS.setText("COCA COLA V MEDIO LIT");
        DOS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DOSMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout B2Layout = new javax.swing.GroupLayout(B2);
        B2.setLayout(B2Layout);
        B2Layout.setHorizontalGroup(
            B2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DOS, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );
        B2Layout.setVerticalGroup(
            B2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DOS, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        B3.setBackground(new java.awt.Color(255, 102, 102));
        B3.setPreferredSize(new java.awt.Dimension(145, 45));
        B3.setRoundBottomLeft(15);
        B3.setRoundBottomRight(15);
        B3.setRoundTopLeft(15);
        B3.setRoundTopRight(15);
        B3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B3MouseClicked(evt);
            }
        });

        TRES.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        TRES.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TRES.setText("COCA COLA DESECHABLE PEQUEÑA");
        TRES.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TRESMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout B3Layout = new javax.swing.GroupLayout(B3);
        B3.setLayout(B3Layout);
        B3Layout.setHorizontalGroup(
            B3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TRES, javax.swing.GroupLayout.PREFERRED_SIZE, 145, Short.MAX_VALUE)
        );
        B3Layout.setVerticalGroup(
            B3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TRES, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        B4.setBackground(new java.awt.Color(255, 102, 102));
        B4.setPreferredSize(new java.awt.Dimension(145, 45));
        B4.setRoundBottomLeft(15);
        B4.setRoundBottomRight(15);
        B4.setRoundTopLeft(15);
        B4.setRoundTopRight(15);

        CUATRO.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        CUATRO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CUATRO.setText("COCA DIETA");
        CUATRO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CUATROMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout B4Layout = new javax.swing.GroupLayout(B4);
        B4.setLayout(B4Layout);
        B4Layout.setHorizontalGroup(
            B4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CUATRO, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );
        B4Layout.setVerticalGroup(
            B4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CUATRO, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        B5.setBackground(new java.awt.Color(255, 102, 102));
        B5.setPreferredSize(new java.awt.Dimension(145, 45));
        B5.setRoundBottomLeft(15);
        B5.setRoundBottomRight(15);
        B5.setRoundTopLeft(15);
        B5.setRoundTopRight(15);
        B5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B5MouseClicked(evt);
            }
        });

        CINCO.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        CINCO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CINCO.setText("DESECHABLE GRANDE");
        CINCO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CINCOMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout B5Layout = new javax.swing.GroupLayout(B5);
        B5.setLayout(B5Layout);
        B5Layout.setHorizontalGroup(
            B5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CINCO, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );
        B5Layout.setVerticalGroup(
            B5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CINCO, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        B6.setBackground(new java.awt.Color(255, 102, 102));
        B6.setPreferredSize(new java.awt.Dimension(145, 45));
        B6.setRoundBottomLeft(15);
        B6.setRoundBottomRight(15);
        B6.setRoundTopLeft(15);
        B6.setRoundTopRight(15);
        B6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B6MouseClicked(evt);
            }
        });

        SEIS.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        SEIS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SEIS.setText("COCA LATA");
        SEIS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SEISMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout B6Layout = new javax.swing.GroupLayout(B6);
        B6.setLayout(B6Layout);
        B6Layout.setHorizontalGroup(
            B6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SEIS, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );
        B6Layout.setVerticalGroup(
            B6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SEIS, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        B7.setBackground(new java.awt.Color(255, 102, 102));
        B7.setPreferredSize(new java.awt.Dimension(145, 45));
        B7.setRoundBottomLeft(15);
        B7.setRoundBottomRight(15);
        B7.setRoundTopLeft(15);
        B7.setRoundTopRight(15);
        B7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B7MouseClicked(evt);
            }
        });

        SIETE.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        SIETE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SIETE.setText("FANTA UVA VIDRIO");
        SIETE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SIETEMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout B7Layout = new javax.swing.GroupLayout(B7);
        B7.setLayout(B7Layout);
        B7Layout.setHorizontalGroup(
            B7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SIETE, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );
        B7Layout.setVerticalGroup(
            B7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SIETE, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        B8.setBackground(new java.awt.Color(255, 102, 102));
        B8.setPreferredSize(new java.awt.Dimension(145, 45));
        B8.setRoundBottomLeft(15);
        B8.setRoundBottomRight(15);
        B8.setRoundTopLeft(15);
        B8.setRoundTopRight(15);
        B8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B8MouseClicked(evt);
            }
        });

        OCHO.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        OCHO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        OCHO.setText("FANTA UVA DESECHABLE");
        OCHO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OCHOMouseClicked(evt);
            }
        });
        OCHO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                OCHOKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout B8Layout = new javax.swing.GroupLayout(B8);
        B8.setLayout(B8Layout);
        B8Layout.setHorizontalGroup(
            B8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OCHO, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );
        B8Layout.setVerticalGroup(
            B8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OCHO, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        B9.setBackground(new java.awt.Color(255, 102, 102));
        B9.setPreferredSize(new java.awt.Dimension(145, 45));
        B9.setRoundBottomLeft(15);
        B9.setRoundBottomRight(15);
        B9.setRoundTopLeft(15);
        B9.setRoundTopRight(15);
        B9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B9MouseClicked(evt);
            }
        });

        NUEVE.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        NUEVE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NUEVE.setText("FANTA NARANJA VIDRIO");
        NUEVE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NUEVEMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout B9Layout = new javax.swing.GroupLayout(B9);
        B9.setLayout(B9Layout);
        B9Layout.setHorizontalGroup(
            B9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(NUEVE, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );
        B9Layout.setVerticalGroup(
            B9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(NUEVE, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        B10.setBackground(new java.awt.Color(255, 102, 102));
        B10.setPreferredSize(new java.awt.Dimension(145, 45));
        B10.setRoundBottomLeft(15);
        B10.setRoundBottomRight(15);
        B10.setRoundTopLeft(15);
        B10.setRoundTopRight(15);
        B10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B10MouseClicked(evt);
            }
        });

        DIES.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        DIES.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DIES.setText("FATA NARANJA DESECHABLE");
        DIES.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DIESMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout B10Layout = new javax.swing.GroupLayout(B10);
        B10.setLayout(B10Layout);
        B10Layout.setHorizontalGroup(
            B10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DIES, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        B10Layout.setVerticalGroup(
            B10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DIES, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        B11.setBackground(new java.awt.Color(255, 102, 102));
        B11.setPreferredSize(new java.awt.Dimension(145, 45));
        B11.setRoundBottomLeft(15);
        B11.setRoundBottomRight(15);
        B11.setRoundTopLeft(15);
        B11.setRoundTopRight(15);
        B11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B11MouseClicked(evt);
            }
        });

        ONCE.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        ONCE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ONCE.setText("COCA COLA 2.5LTS");
        ONCE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ONCEMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ONCEMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout B11Layout = new javax.swing.GroupLayout(B11);
        B11.setLayout(B11Layout);
        B11Layout.setHorizontalGroup(
            B11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ONCE, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );
        B11Layout.setVerticalGroup(
            B11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ONCE, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        B12.setBackground(new java.awt.Color(255, 102, 102));
        B12.setPreferredSize(new java.awt.Dimension(145, 45));
        B12.setRoundBottomLeft(15);
        B12.setRoundBottomRight(15);
        B12.setRoundTopLeft(15);
        B12.setRoundTopRight(15);
        B12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B12MouseClicked(evt);
            }
        });

        DOCE.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        DOCE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DOCE.setText("SPIRTE VIDRIO");
        DOCE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DOCEMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout B12Layout = new javax.swing.GroupLayout(B12);
        B12.setLayout(B12Layout);
        B12Layout.setHorizontalGroup(
            B12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DOCE, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );
        B12Layout.setVerticalGroup(
            B12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DOCE, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        B13.setBackground(new java.awt.Color(255, 102, 102));
        B13.setPreferredSize(new java.awt.Dimension(145, 45));
        B13.setRoundBottomLeft(15);
        B13.setRoundBottomRight(15);
        B13.setRoundTopLeft(15);
        B13.setRoundTopRight(15);
        B13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B13MouseClicked(evt);
            }
        });

        TRESE.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        TRESE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TRESE.setText("SPIRTE DESECHABLE");
        TRESE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TRESEMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout B13Layout = new javax.swing.GroupLayout(B13);
        B13.setLayout(B13Layout);
        B13Layout.setHorizontalGroup(
            B13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TRESE, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );
        B13Layout.setVerticalGroup(
            B13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TRESE, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        B14.setBackground(new java.awt.Color(255, 102, 102));
        B14.setPreferredSize(new java.awt.Dimension(145, 45));
        B14.setRoundBottomLeft(15);
        B14.setRoundBottomRight(15);
        B14.setRoundTopLeft(15);
        B14.setRoundTopRight(15);
        B14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B14MouseClicked(evt);
            }
        });

        CATORCE.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        CATORCE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CATORCE.setText("MINERAL VIDRIO");
        CATORCE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CATORCEMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout B14Layout = new javax.swing.GroupLayout(B14);
        B14.setLayout(B14Layout);
        B14Layout.setHorizontalGroup(
            B14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CATORCE, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );
        B14Layout.setVerticalGroup(
            B14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CATORCE, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        B15.setBackground(new java.awt.Color(255, 102, 102));
        B15.setPreferredSize(new java.awt.Dimension(145, 45));
        B15.setRoundBottomLeft(15);
        B15.setRoundBottomRight(15);
        B15.setRoundTopLeft(15);
        B15.setRoundTopRight(15);
        B15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B15MouseClicked(evt);
            }
        });

        QUINCE.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        QUINCE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        QUINCE.setText("MINERAL DESECHABLE");
        QUINCE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                QUINCEMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                QUINCEMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout B15Layout = new javax.swing.GroupLayout(B15);
        B15.setLayout(B15Layout);
        B15Layout.setHorizontalGroup(
            B15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(QUINCE, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );
        B15Layout.setVerticalGroup(
            B15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(QUINCE, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        B16.setBackground(new java.awt.Color(255, 102, 102));
        B16.setPreferredSize(new java.awt.Dimension(145, 45));
        B16.setRoundBottomLeft(15);
        B16.setRoundBottomRight(15);
        B16.setRoundTopLeft(15);
        B16.setRoundTopRight(15);
        B16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B16MouseClicked(evt);
            }
        });

        DIESISEIS.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        DIESISEIS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DIESISEIS.setText("TE FRIO LIMON");
        DIESISEIS.setToolTipText("");
        DIESISEIS.setName("SALCHICHA PEQUEÑA"); // NOI18N
        DIESISEIS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DIESISEISMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout B16Layout = new javax.swing.GroupLayout(B16);
        B16.setLayout(B16Layout);
        B16Layout.setHorizontalGroup(
            B16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DIESISEIS, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );
        B16Layout.setVerticalGroup(
            B16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DIESISEIS, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        B17.setBackground(new java.awt.Color(255, 102, 102));
        B17.setPreferredSize(new java.awt.Dimension(145, 45));
        B17.setRoundBottomLeft(15);
        B17.setRoundBottomRight(15);
        B17.setRoundTopLeft(15);
        B17.setRoundTopRight(15);
        B17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B17MouseClicked(evt);
            }
        });

        DIESSIETE.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        DIESSIETE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DIESSIETE.setText("TE FRIO MELOCOTON");
        DIESSIETE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DIESSIETEMouseClicked(evt);
            }
        });
        DIESSIETE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                DIESSIETEKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout B17Layout = new javax.swing.GroupLayout(B17);
        B17.setLayout(B17Layout);
        B17Layout.setHorizontalGroup(
            B17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, B17Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DIESSIETE, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        B17Layout.setVerticalGroup(
            B17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DIESSIETE, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        B18.setBackground(new java.awt.Color(255, 102, 102));
        B18.setPreferredSize(new java.awt.Dimension(145, 45));
        B18.setRoundBottomLeft(15);
        B18.setRoundBottomRight(15);
        B18.setRoundTopLeft(15);
        B18.setRoundTopRight(15);
        B18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B18MouseClicked(evt);
            }
        });

        DIESOCHO.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        DIESOCHO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DIESOCHO.setText("AGUA FRESCA");
        DIESOCHO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DIESOCHOMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout B18Layout = new javax.swing.GroupLayout(B18);
        B18.setLayout(B18Layout);
        B18Layout.setHorizontalGroup(
            B18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DIESOCHO, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );
        B18Layout.setVerticalGroup(
            B18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DIESOCHO, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        B19.setBackground(new java.awt.Color(255, 102, 102));
        B19.setPreferredSize(new java.awt.Dimension(145, 45));
        B19.setRoundBottomLeft(15);
        B19.setRoundBottomRight(15);
        B19.setRoundTopLeft(15);
        B19.setRoundTopRight(15);
        B19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B19MouseClicked(evt);
            }
        });

        DIESINUEVA.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        DIESINUEVA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DIESINUEVA.setText("FANTA ROJA DESECHABLE");
        DIESINUEVA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DIESINUEVAMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout B19Layout = new javax.swing.GroupLayout(B19);
        B19.setLayout(B19Layout);
        B19Layout.setHorizontalGroup(
            B19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DIESINUEVA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        B19Layout.setVerticalGroup(
            B19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DIESINUEVA, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        B20.setBackground(new java.awt.Color(255, 102, 102));
        B20.setPreferredSize(new java.awt.Dimension(145, 45));
        B20.setRoundBottomLeft(15);
        B20.setRoundBottomRight(15);
        B20.setRoundTopLeft(15);
        B20.setRoundTopRight(15);
        B20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B20MouseClicked(evt);
            }
        });

        VEINTE.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        VEINTE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VEINTE.setText("POWERADE AZUL");
        VEINTE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VEINTEMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout B20Layout = new javax.swing.GroupLayout(B20);
        B20.setLayout(B20Layout);
        B20Layout.setHorizontalGroup(
            B20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VEINTE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        B20Layout.setVerticalGroup(
            B20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VEINTE, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        B21.setBackground(new java.awt.Color(255, 102, 102));
        B21.setPreferredSize(new java.awt.Dimension(145, 45));
        B21.setRoundBottomLeft(15);
        B21.setRoundBottomRight(15);
        B21.setRoundTopLeft(15);
        B21.setRoundTopRight(15);
        B21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B21MouseClicked(evt);
            }
        });

        VEINTIUNO.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        VEINTIUNO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VEINTIUNO.setText("POWERADE ROJO");
        VEINTIUNO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VEINTIUNOMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout B21Layout = new javax.swing.GroupLayout(B21);
        B21.setLayout(B21Layout);
        B21Layout.setHorizontalGroup(
            B21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VEINTIUNO, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
        );
        B21Layout.setVerticalGroup(
            B21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VEINTIUNO, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        B22.setBackground(new java.awt.Color(255, 102, 102));
        B22.setPreferredSize(new java.awt.Dimension(145, 45));
        B22.setRoundBottomLeft(15);
        B22.setRoundBottomRight(15);
        B22.setRoundTopLeft(15);
        B22.setRoundTopRight(15);
        B22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B22MouseClicked(evt);
            }
        });

        VEINDOS.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        VEINDOS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VEINDOS.setText("AGUA PURA");
        VEINDOS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VEINDOSMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout B22Layout = new javax.swing.GroupLayout(B22);
        B22.setLayout(B22Layout);
        B22Layout.setHorizontalGroup(
            B22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VEINDOS, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );
        B22Layout.setVerticalGroup(
            B22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VEINDOS, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        B23.setBackground(new java.awt.Color(255, 102, 102));
        B23.setPreferredSize(new java.awt.Dimension(145, 45));
        B23.setRoundBottomLeft(15);
        B23.setRoundBottomRight(15);
        B23.setRoundTopLeft(15);
        B23.setRoundTopRight(15);
        B23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B23MouseClicked(evt);
            }
        });

        VEITITRES.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        VEITITRES.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VEITITRES.setText("CHOCOLATE 8ONZ");
        VEITITRES.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VEITITRESMouseClicked(evt);
            }
        });
        VEITITRES.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                VEITITRESKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout B23Layout = new javax.swing.GroupLayout(B23);
        B23.setLayout(B23Layout);
        B23Layout.setHorizontalGroup(
            B23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VEITITRES, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );
        B23Layout.setVerticalGroup(
            B23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VEITITRES, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        B24.setBackground(new java.awt.Color(255, 102, 102));
        B24.setPreferredSize(new java.awt.Dimension(145, 45));
        B24.setRoundBottomLeft(15);
        B24.setRoundBottomRight(15);
        B24.setRoundTopLeft(15);
        B24.setRoundTopRight(15);
        B24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B24MouseClicked(evt);
            }
        });

        VEINTICUATRO.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        VEINTICUATRO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VEINTICUATRO.setText("CHOCOLATE 12 ONZ");
        VEINTICUATRO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VEINTICUATROMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                VEINTICUATROMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout B24Layout = new javax.swing.GroupLayout(B24);
        B24.setLayout(B24Layout);
        B24Layout.setHorizontalGroup(
            B24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VEINTICUATRO, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );
        B24Layout.setVerticalGroup(
            B24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VEINTICUATRO, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        B25.setBackground(new java.awt.Color(255, 102, 102));
        B25.setPreferredSize(new java.awt.Dimension(145, 45));
        B25.setRoundBottomLeft(15);
        B25.setRoundBottomRight(15);
        B25.setRoundTopLeft(15);
        B25.setRoundTopRight(15);
        B25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B25MouseClicked(evt);
            }
        });

        VEITICINCO.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        VEITICINCO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VEITICINCO.setText("CAFE 8 ONZ");
        VEITICINCO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VEITICINCOMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout B25Layout = new javax.swing.GroupLayout(B25);
        B25.setLayout(B25Layout);
        B25Layout.setHorizontalGroup(
            B25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VEITICINCO, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );
        B25Layout.setVerticalGroup(
            B25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VEITICINCO, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        B26.setBackground(new java.awt.Color(255, 102, 102));
        B26.setPreferredSize(new java.awt.Dimension(145, 45));
        B26.setRoundBottomLeft(15);
        B26.setRoundBottomRight(15);
        B26.setRoundTopLeft(15);
        B26.setRoundTopRight(15);
        B26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B26MouseClicked(evt);
            }
        });

        VEITISEIS.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        VEITISEIS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VEITISEIS.setText("CAFE 12 ONZ");
        VEITISEIS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VEITISEISMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout B26Layout = new javax.swing.GroupLayout(B26);
        B26.setLayout(B26Layout);
        B26Layout.setHorizontalGroup(
            B26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VEITISEIS, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );
        B26Layout.setVerticalGroup(
            B26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VEITISEIS, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        B27.setBackground(new java.awt.Color(255, 102, 102));
        B27.setPreferredSize(new java.awt.Dimension(145, 45));
        B27.setRoundBottomLeft(15);
        B27.setRoundBottomRight(15);
        B27.setRoundTopLeft(15);
        B27.setRoundTopRight(15);
        B27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B27MouseClicked(evt);
            }
        });

        VEITISIETE.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        VEITISIETE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VEITISIETE.setText("CREMORA");
        VEITISIETE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VEITISIETEMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout B27Layout = new javax.swing.GroupLayout(B27);
        B27.setLayout(B27Layout);
        B27Layout.setHorizontalGroup(
            B27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VEITISIETE, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );
        B27Layout.setVerticalGroup(
            B27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VEITISIETE, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        B29.setBackground(new java.awt.Color(255, 102, 102));
        B29.setPreferredSize(new java.awt.Dimension(145, 45));
        B29.setRoundBottomLeft(15);
        B29.setRoundBottomRight(15);
        B29.setRoundTopLeft(15);
        B29.setRoundTopRight(15);
        B29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B29MouseClicked(evt);
            }
        });

        VEINTINUEVE.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        VEINTINUEVE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VEINTINUEVE.setText("TE CALIENTE");
        VEINTINUEVE.setToolTipText("");
        VEINTINUEVE.setName("SALCHICHA PEQUEÑA"); // NOI18N
        VEINTINUEVE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VEINTINUEVEMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout B29Layout = new javax.swing.GroupLayout(B29);
        B29.setLayout(B29Layout);
        B29Layout.setHorizontalGroup(
            B29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VEINTINUEVE, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );
        B29Layout.setVerticalGroup(
            B29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VEINTINUEVE, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(B1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(B6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(B9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(B14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(B23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(B25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(B27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(B10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(B24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(B22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(B19, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(B17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(B13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(B15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(B11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(B18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(151, 151, 151)
                                                .addComponent(B21, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 2, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(B26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(B20, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)))
                                .addContainerGap())))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(B29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(B17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(B15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(B13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(B12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(B21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(B14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(B29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(261, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void UNOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UNOMouseClicked
 if ((evt.getModifiers() & 4) != 0) {
            id_producto = 25;
            id_nota = 28;
            BuscarExistencia();
            if (existe >= 2) {
                UpdateCantidadMenos();
            } else if (existe == 1) {
                eliminarProducto();
            } else {
                JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");
            }
            B1.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        } else {
            id_producto = 25;
            id_nota = 28;
            BuscarExistencia();
            if (existe == 0) {
                InsertarProductoPedido();
            } else {
                UpdateCantidad();
            }
            B1.setBackground(Color.YELLOW);
            timer.setRepeats(false);
            timer.start();
       }

    }//GEN-LAST:event_UNOMouseClicked

    private void B1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_B1MouseClicked

    private void DOSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DOSMouseClicked
        if ((evt.getModifiers() & 4) != 0) {
            id_producto = 26;
            id_nota = 28;
            BuscarExistencia();
            if (existe >= 2) {
                UpdateCantidadMenos();
            } else if (existe == 1) {
                eliminarProducto();
            } else {
                JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");
            }
            B2.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        } else {
            id_producto = 26;
            id_nota = 28;
            BuscarExistencia();
            if (existe == 0) {
                InsertarProductoPedido();
            } else {
                UpdateCantidad();
            }
            B2.setBackground(Color.YELLOW);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_DOSMouseClicked

    private void B2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_B2MouseClicked

    private void TRESMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TRESMouseClicked
        if ((evt.getModifiers() & 4) != 0) {
            id_producto = 27;
            id_nota = 28;
            BuscarExistencia();
            if (existe >= 2) {
                UpdateCantidadMenos();
            } else if (existe == 1) {
                eliminarProducto();
            } else {
                JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");
            }
            B3.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        } else {
            id_producto = 27;
            id_nota = 28;
            BuscarExistencia();
            if (existe == 0) {
                InsertarProductoPedido();
            } else {
                UpdateCantidad();
            }
            B3.setBackground(Color.YELLOW);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_TRESMouseClicked

    private void B3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_B3MouseClicked

    private void CUATROMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CUATROMouseClicked
         if ((evt.getModifiers() & 4) != 0) {
            id_producto = 27;
            id_nota = 39;
            BuscarExistencia();
            if (existe >= 2) {
                UpdateCantidadMenos();
            } else if (existe == 1) {
                eliminarProducto();
            } else {
                JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");
            }
            B4.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        } else {
            id_producto = 27;
            id_nota = 39;
            BuscarExistencia();
            if (existe == 0) {
                InsertarProductoPedido();
            } else {
                UpdateCantidad();
            }
            B4.setBackground(Color.YELLOW);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_CUATROMouseClicked

    private void CINCOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CINCOMouseClicked
       if ((evt.getModifiers() & 4) != 0) {
            id_producto = 26;
            id_nota = 28;
            BuscarExistencia();
            if (existe >= 2) {
                UpdateCantidadMenos();
            } else if (existe == 1) {
                eliminarProducto();
            } else {
                JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");
            }
            B5.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        } else {
            id_producto = 26;
            id_nota = 28;
            BuscarExistencia();
            if (existe == 0) {
                InsertarProductoPedido();
            } else {
                UpdateCantidad();
            }
            B5.setBackground(Color.YELLOW);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_CINCOMouseClicked

    private void B5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_B5MouseClicked

    private void SEISMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SEISMouseClicked
       if ((evt.getModifiers() & 4) != 0) {
            id_producto = 27;
            id_nota = 28;
            BuscarExistencia();
            if (existe >= 2) {
                UpdateCantidadMenos();
            } else if (existe == 1) {
                eliminarProducto();
            } else {
                JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");
            }
            B6.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        } else {
            id_producto = 27;
            id_nota = 28;
            BuscarExistencia();
            if (existe == 0) {
                InsertarProductoPedido();
            } else {
                UpdateCantidad();
            }
            B6.setBackground(Color.YELLOW);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_SEISMouseClicked

    private void B6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_B6MouseClicked

    private void SIETEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SIETEMouseClicked
        if ((evt.getModifiers() & 4) != 0) {
            id_producto = 25;
            id_nota = 29;
            BuscarExistencia();
            if (existe >= 2) {
                UpdateCantidadMenos();
            } else if (existe == 1) {
                eliminarProducto();
            } else {
                JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");
            }
            B7.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        } else {
            id_producto = 25;
            id_nota = 29;
            BuscarExistencia();
            if (existe == 0) {
                InsertarProductoPedido();
            } else {
                UpdateCantidad();
            }
            B7.setBackground(Color.YELLOW);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_SIETEMouseClicked

    private void B7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B7MouseClicked

        //   if(a==1 ){Botton1.setBackground(Botverde);a=0;}else{Botton1.setBackground(c);a=1;}
    }//GEN-LAST:event_B7MouseClicked

    private void OCHOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OCHOMouseClicked
        if ((evt.getModifiers() & 4) != 0) {
            id_producto = 27;
            id_nota = 29;
            BuscarExistencia();
            if (existe >= 2) {
                UpdateCantidadMenos();
            } else if (existe == 1) {
                eliminarProducto();
            } else {
                JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");
            }
            B8.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        } else {
            id_producto = 27;
            id_nota = 29;
            BuscarExistencia();
            if (existe == 0) {
                InsertarProductoPedido();
            } else {
                UpdateCantidad();
            }
            B8.setBackground(Color.YELLOW);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_OCHOMouseClicked

    private void OCHOKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_OCHOKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_OCHOKeyReleased

    private void B8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_B8MouseClicked

    private void NUEVEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NUEVEMouseClicked
       if ((evt.getModifiers() & 4) != 0) {
            id_producto = 25;
            id_nota = 30;
            BuscarExistencia();
            if (existe >= 2) {
                UpdateCantidadMenos();
            } else if (existe == 1) {
                eliminarProducto();
            } else {
                JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");
            }
            B9.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        } else {
            id_producto = 25;
            id_nota = 30;
            BuscarExistencia();
            if (existe == 0) {
                InsertarProductoPedido();
            } else {
                UpdateCantidad();
            }
            B9.setBackground(Color.YELLOW);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_NUEVEMouseClicked

    private void B9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_B9MouseClicked

    private void ONCEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ONCEMouseClicked
       if ((evt.getModifiers() & 4) != 0) {
            id_producto = 36;
            id_nota = 28;
            BuscarExistencia();
            if (existe >= 2) {
                UpdateCantidadMenos();
            } else if (existe == 1) {
                eliminarProducto();
            } else {
                JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");
            }
            B11.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        } else {
            id_producto = 36;
            id_nota = 28;
            BuscarExistencia();
            if (existe == 0) {
                InsertarProductoPedido();
            } else {
                UpdateCantidad();
            }
            B11.setBackground(Color.YELLOW);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_ONCEMouseClicked

    private void B11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B11MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_B11MouseClicked

    private void TRESEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TRESEMouseClicked
        if ((evt.getModifiers() & 4) != 0) {
            id_producto = 27;
            id_nota = 31;
            BuscarExistencia();
            if (existe >= 2) {
                UpdateCantidadMenos();
            } else if (existe == 1) {
                eliminarProducto();
            } else {
                JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");
            }
            B13.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        } else {
            id_producto = 27;
            id_nota = 31;
            BuscarExistencia();
            if (existe == 0) {
                InsertarProductoPedido();
            } else {
                UpdateCantidad();
            }
            B13.setBackground(Color.YELLOW);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_TRESEMouseClicked

    private void B13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B13MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_B13MouseClicked

    private void CATORCEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CATORCEMouseClicked
       if ((evt.getModifiers() & 4) != 0) {
            id_producto = 25;
            id_nota = 32;
            BuscarExistencia();
            if (existe >= 2) {
                UpdateCantidadMenos();
            } else if (existe == 1) {
                eliminarProducto();
            } else {
                JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");
            }
            B14.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        } else {
            id_producto = 25;
            id_nota = 32;
            BuscarExistencia();
            if (existe == 0) {
                InsertarProductoPedido();
            } else {
                UpdateCantidad();
            }
            B14.setBackground(Color.YELLOW);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_CATORCEMouseClicked

    private void B14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B14MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_B14MouseClicked

    private void QUINCEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QUINCEMouseClicked

        if ((evt.getModifiers() & 4) != 0) {
            id_producto = 26;
            id_nota = 32;
            BuscarExistencia();
            if (existe >= 2) {
                UpdateCantidadMenos();
            } else if (existe == 1) {
                eliminarProducto();
            } else {
                JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");
            }
            B15.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        } else {
            id_producto = 26;
            id_nota = 32;
            BuscarExistencia();
            if (existe == 0) {
                InsertarProductoPedido();
            } else {
                UpdateCantidad();
            }
            B15.setBackground(Color.YELLOW);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_QUINCEMouseClicked

    private void B15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B15MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_B15MouseClicked

    private void DIESMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DIESMouseClicked
        if ((evt.getModifiers() & 4) != 0) {
            id_producto = 27;
            id_nota = 30;
            BuscarExistencia();
            if (existe >= 2) {
                UpdateCantidadMenos();
            } else if (existe == 1) {
                eliminarProducto();
            } else {
                JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");
            }
            B10.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        } else {
            id_producto = 27;
            id_nota = 30;
            BuscarExistencia();
            if (existe == 0) {
                InsertarProductoPedido();
            } else {
                UpdateCantidad();
            }
            B10.setBackground(Color.YELLOW);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_DIESMouseClicked

    private void B10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_B10MouseClicked

    private void DOCEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DOCEMouseClicked
         if ((evt.getModifiers() & 4) != 0) {
            id_producto = 25;
            id_nota = 31;
            BuscarExistencia();
            if (existe >= 2) {
                UpdateCantidadMenos();
            } else if (existe == 1) {
                eliminarProducto();
            } else {
                JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");
            }
            B12.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        } else {
            id_producto = 25;
            id_nota = 31;
            BuscarExistencia();
            if (existe == 0) {
                InsertarProductoPedido();
            } else {
                UpdateCantidad();
            }
            B12.setBackground(Color.YELLOW);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_DOCEMouseClicked

    private void B12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B12MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_B12MouseClicked

    private void QUINCEMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QUINCEMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_QUINCEMouseEntered

    private void DIESISEISMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DIESISEISMouseClicked
       if ((evt.getModifiers() & 4) != 0) {
            id_producto = 29;
            id_nota = 33;
            BuscarExistencia();
            if (existe >= 2) {
                UpdateCantidadMenos();
            } else if (existe == 1) {
                eliminarProducto();
            } else {
                JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");
            }
            B16.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        } else {
            id_producto = 29;
            id_nota = 33;
            BuscarExistencia();
            if (existe == 0) {
                InsertarProductoPedido();
            } else {
                UpdateCantidad();
            }
            B16.setBackground(Color.YELLOW);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_DIESISEISMouseClicked

    private void B16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B16MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_B16MouseClicked

    private void DIESSIETEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DIESSIETEMouseClicked
        if ((evt.getModifiers() & 4) != 0) {
            id_producto = 29;
            id_nota = 34;
            BuscarExistencia();
            if (existe >= 2) {
                UpdateCantidadMenos();
            } else if (existe == 1) {
                eliminarProducto();
            } else {
                JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");
            }
            B17.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        } else {
            id_producto = 29;
            id_nota = 34;
            BuscarExistencia();
            if (existe == 0) {
                InsertarProductoPedido();
            } else {
                UpdateCantidad();
            }
            B17.setBackground(Color.YELLOW);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_DIESSIETEMouseClicked

    private void B17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B17MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_B17MouseClicked

    private void DIESOCHOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DIESOCHOMouseClicked
          if ((evt.getModifiers() & 4) != 0) {
            id_producto = 26;
            id_nota = 35;
            BuscarExistencia();
            if (existe >= 2) {
                UpdateCantidadMenos();
            } else if (existe == 1) {
                eliminarProducto();
            } else {
                JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");
            }
            B18.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        } else {
            id_producto = 26;
            id_nota = 35;
            BuscarExistencia();
            if (existe == 0) {
                InsertarProductoPedido();
            } else {
                UpdateCantidad();
            }
            B18.setBackground(Color.YELLOW);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_DIESOCHOMouseClicked

    private void B18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B18MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_B18MouseClicked

    private void DIESINUEVAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DIESINUEVAMouseClicked
         if ((evt.getModifiers() & 4) != 0) {
            id_producto = 26;
            id_nota = 36;
            BuscarExistencia();
            if (existe >= 2) {
                UpdateCantidadMenos();
            } else if (existe == 1) {
                eliminarProducto();
            } else {
                JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");
            }
            B19.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        } else {
            id_producto = 26;
            id_nota = 36;
            BuscarExistencia();
            if (existe == 0) {
                InsertarProductoPedido();
            } else {
                UpdateCantidad();
            }
            B19.setBackground(Color.YELLOW);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_DIESINUEVAMouseClicked

    private void B19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B19MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_B19MouseClicked

    private void VEINTEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VEINTEMouseClicked
        if ((evt.getModifiers() & 4) != 0) {
            id_producto = 28;
            id_nota = 37;
            BuscarExistencia();
            if (existe >= 2) {
                UpdateCantidadMenos();
            } else if (existe == 1) {
                eliminarProducto();
            } else {
                JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");
            }
            B20.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        } else {
            id_producto = 28;
            id_nota = 37;
            BuscarExistencia();
            if (existe == 0) {
                InsertarProductoPedido();
            } else {
                UpdateCantidad();
            }
            B20.setBackground(Color.YELLOW);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_VEINTEMouseClicked

    private void B20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B20MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_B20MouseClicked

    private void VEINTIUNOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VEINTIUNOMouseClicked
        if ((evt.getModifiers() & 4) != 0) {
            id_producto = 28;
            id_nota = 38;
            BuscarExistencia();
            if (existe >= 2) {
                UpdateCantidadMenos();
            } else if (existe == 1) {
                eliminarProducto();
            } else {
                JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");
            }
            B21.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        } else {
            id_producto = 28;
            id_nota = 38;
            BuscarExistencia();
            if (existe == 0) {
                InsertarProductoPedido();
            } else {
                UpdateCantidad();
            }
            B21.setBackground(Color.YELLOW);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_VEINTIUNOMouseClicked

    private void B21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B21MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_B21MouseClicked

    private void VEITITRESMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VEITITRESMouseClicked
        if ((evt.getModifiers() & 4) != 0) {
            id_producto = 30;
            id_nota = 40;
            BuscarExistencia();
            if (existe >= 2) {
                UpdateCantidadMenos();
            } else if (existe == 1) {
                eliminarProducto();
            } else {
                JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");
            }
            B23.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        } else {
            id_producto = 30;
            id_nota = 40;
            BuscarExistencia();
            if (existe == 0) {
                InsertarProductoPedidoSinNota();
            } else {
                UpdateCantidad();
            }
            B23.setBackground(Color.YELLOW);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_VEITITRESMouseClicked

    private void VEITITRESKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_VEITITRESKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_VEITITRESKeyReleased

    private void B23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B23MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_B23MouseClicked

    private void VEINDOSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VEINDOSMouseClicked
        if ((evt.getModifiers() & 4) != 0) {
            id_producto = 34;
            id_nota = 40;
            BuscarExistencia();
            if (existe >= 2) {
                UpdateCantidadMenos();
            } else if (existe == 1) {
                eliminarProducto();
            } else {
                JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");
            }
            B22.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        } else {
            id_producto = 34;
            id_nota = 40;
            BuscarExistencia();
            if (existe == 0) {
                InsertarProductoPedidoSinNota();
            } else {
                UpdateCantidad();
            }
            B22.setBackground(Color.YELLOW);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_VEINDOSMouseClicked

    private void B22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B22MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_B22MouseClicked

    private void VEINTICUATROMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VEINTICUATROMouseClicked
       if ((evt.getModifiers() & 4) != 0) {
            id_producto = 31;
            id_nota = 40;
            BuscarExistencia();
            if (existe >= 2) {
                UpdateCantidadMenos();
            } else if (existe == 1) {
                eliminarProducto();
            } else {
                JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");
            }
            B24.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        } else {
            id_producto = 31;
            id_nota = 40;
            BuscarExistencia();
            if (existe == 0) {
                InsertarProductoPedidoSinNota();
            } else {
                UpdateCantidad();
            }
            B24.setBackground(Color.YELLOW);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_VEINTICUATROMouseClicked

    private void B24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B24MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_B24MouseClicked

    private void VEITISEISMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VEITISEISMouseClicked
         if ((evt.getModifiers() & 4) != 0) {
            id_producto = 33;
            id_nota = 40;
            BuscarExistencia();
            if (existe >= 2) {
                
            } else if (existe == 1) {
                eliminarProducto();
            } else {
                JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");
            }
            B26.setBackground(Color.darkGray);

            timer.setRepeats(false);
            timer.start();
        } else {
            id_producto = 33;
            id_nota = 40;
            BuscarExistencia();
            if (existe == 0) {
                InsertarProductoPedidoSinNota();
            } else {
                UpdateCantidad();
            }
            B26.setBackground(Color.YELLOW);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_VEITISEISMouseClicked

    private void B26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B26MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_B26MouseClicked

    private void VEITICINCOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VEITICINCOMouseClicked
        if ((evt.getModifiers() & 4) != 0) {
            id_producto = 32;
             id_nota = 40;
            BuscarExistencia();
            if (existe >= 2) {
                UpdateCantidadMenos();
            } else if (existe == 1) {
                eliminarProducto();
            } else {
                JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");
            }
            B25.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        } else {
            id_producto = 32;
            id_nota = 40;
            BuscarExistencia();
            if (existe == 0) {
                InsertarProductoPedidoSinNota();
            } else {
                UpdateCantidad();
            }
            B25.setBackground(Color.YELLOW);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_VEITICINCOMouseClicked

    private void B25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B25MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_B25MouseClicked

    private void VEITISIETEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VEITISIETEMouseClicked
       if ((evt.getModifiers() & 4) != 0) {
            id_producto = 51;
             id_nota = 40;
            BuscarExistencia();
            if (existe >= 2) {
                UpdateCantidadMenos();
            } else if (existe == 1) {
                eliminarProducto();
            } else {
                JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");
            }
            B27.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        } else {
            id_producto = 51;
             id_nota = 40;
            BuscarExistencia();
            if (existe == 0) {
                InsertarProductoPedidoSinNota();
            } else {
                UpdateCantidad();
            }
            B27.setBackground(Color.YELLOW);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_VEITISIETEMouseClicked

    private void B27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B27MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_B27MouseClicked

    private void VEINTINUEVEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VEINTINUEVEMouseClicked
         if ((evt.getModifiers() & 4) != 0) {
            id_producto = 35;
             id_nota = 40;
            BuscarExistencia();
            if (existe >= 2) {
                UpdateCantidadMenos();
            } else if (existe == 1) {
                eliminarProducto();
            } else {
                JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");
            }
            B29.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        } else {
            id_producto = 35;
             id_nota = 40;
            BuscarExistencia();
            if (existe == 0) {
                InsertarProductoPedidoSinNota();
            } else {
                UpdateCantidad();
            }
            B29.setBackground(Color.YELLOW);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_VEINTINUEVEMouseClicked

    private void B29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B29MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_B29MouseClicked

    private void VEINTICUATROMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VEINTICUATROMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_VEINTICUATROMouseEntered

    private void DIESSIETEKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DIESSIETEKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_DIESSIETEKeyReleased

    private void ONCEMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ONCEMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_ONCEMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Clases.PanelRound B1;
    private Clases.PanelRound B10;
    private Clases.PanelRound B11;
    private Clases.PanelRound B12;
    private Clases.PanelRound B13;
    private Clases.PanelRound B14;
    private Clases.PanelRound B15;
    private Clases.PanelRound B16;
    private Clases.PanelRound B17;
    private Clases.PanelRound B18;
    private Clases.PanelRound B19;
    private Clases.PanelRound B2;
    private Clases.PanelRound B20;
    private Clases.PanelRound B21;
    private Clases.PanelRound B22;
    private Clases.PanelRound B23;
    private Clases.PanelRound B24;
    private Clases.PanelRound B25;
    private Clases.PanelRound B26;
    private Clases.PanelRound B27;
    private Clases.PanelRound B29;
    private Clases.PanelRound B3;
    private Clases.PanelRound B4;
    private Clases.PanelRound B5;
    private Clases.PanelRound B6;
    private Clases.PanelRound B7;
    private Clases.PanelRound B8;
    private Clases.PanelRound B9;
    private javax.swing.JLabel CATORCE;
    private javax.swing.JLabel CINCO;
    private javax.swing.JLabel CUATRO;
    private javax.swing.JLabel DIES;
    private javax.swing.JLabel DIESINUEVA;
    private javax.swing.JLabel DIESISEIS;
    private javax.swing.JLabel DIESOCHO;
    private javax.swing.JLabel DIESSIETE;
    private javax.swing.JLabel DOCE;
    private javax.swing.JLabel DOS;
    private javax.swing.JLabel NUEVE;
    private javax.swing.JLabel OCHO;
    private javax.swing.JLabel ONCE;
    private javax.swing.JLabel QUINCE;
    private javax.swing.JLabel SEIS;
    private javax.swing.JLabel SIETE;
    private javax.swing.JLabel TRES;
    private javax.swing.JLabel TRESE;
    private javax.swing.JLabel UNO;
    private javax.swing.JLabel VEINDOS;
    private javax.swing.JLabel VEINTE;
    private javax.swing.JLabel VEINTICUATRO;
    private javax.swing.JLabel VEINTINUEVE;
    private javax.swing.JLabel VEINTIUNO;
    private javax.swing.JLabel VEITICINCO;
    private javax.swing.JLabel VEITISEIS;
    private javax.swing.JLabel VEITISIETE;
    private javax.swing.JLabel VEITITRES;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
