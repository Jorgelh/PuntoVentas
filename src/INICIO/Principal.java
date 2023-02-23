/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package INICIO;
import static INICIO.ConsultaPedidos.Pedidos;
import clas.BDConexion;
import clas.BDProductos;
import clas.InsertarProducto;
import clas.TextAreaRenderer;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.TableColumn;

/**
 *
 * @author jluis
 */
public class Principal extends javax.swing.JFrame {
    public static int id_pedido;
    /**
     * Creates new form Principal
     */
    
    public Principal(int i) {
      
        
         try {
             UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
             
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
        }
        initComponents();
        
        this.id_pedido = i;
        this.setLocationRelativeTo(null);
        PanelMismoColor();
       PEDIDO_ID.setText(String.valueOf(id_pedido));
      //this.setExtendedState(MAXIMIZED_BOTH); 
      
      
        String texto7 = "<html><center><body>TORTILLAS<br>DE<br>MAIZ</body></center></html>";
        Torti.setText(texto7);
        JTMaiz.setPreferredSize(new Dimension (80, 60));
        String texto8 = "<html><center><body>TORTILLAS<br>DE<br>HARINA</body></center></html>";
        harina.setText(texto8);
        jHarina6.setPreferredSize(new Dimension (80, 60));
    }
    
    
public void Opcion1(){
    Opcion1 op1 = new Opcion1(id_pedido);
    op1.setSize(730, 690);
    op1.setLocation(0, 0);
    PanelPrincipal.removeAll();
    PanelPrincipal.add(op1,BorderLayout.CENTER);
    PanelPrincipal.revalidate();
    PanelPrincipal.repaint();
}  
private void Opcion2(){
    Opcion2 op2 = new Opcion2();
    op2.setSize(730, 650);
    op2.setLocation(0, 0);
    PanelPrincipal.removeAll();
    PanelPrincipal.add(op2,BorderLayout.CENTER);
    PanelPrincipal.revalidate();
    PanelPrincipal.repaint();
}
private void Opcion3(){
    Opcion3 op3 = new Opcion3();
    op3.setSize(730, 650);
    op3.setLocation(0, 0);
    PanelPrincipal.removeAll();
    PanelPrincipal.add(op3,BorderLayout.CENTER);
    PanelPrincipal.revalidate();
    PanelPrincipal.repaint();
}
private void Opcion4(){
    Opcion4 op4 = new Opcion4();
    op4.setSize(730, 650);
    op4.setLocation(0, 0);
    PanelPrincipal.removeAll();
    PanelPrincipal.add(op4,BorderLayout.CENTER);
    PanelPrincipal.revalidate();
    PanelPrincipal.repaint();
}
private void Opcion5(){
    Opcion5 op5 = new Opcion5();
    op5.setSize(730, 650);
    op5.setLocation(0, 0);
    PanelPrincipal.removeAll();
    PanelPrincipal.add(op5,BorderLayout.CENTER);
    PanelPrincipal.revalidate();
    PanelPrincipal.repaint();
}
private void PanelMismoColor(){
     Color c = new Color(238,238,238);  
     panelRound.setBackground(c);
     complemento2.setBackground(c);
     complemento3.setBackground(c);
     complemento4.setBackground(c);
     complemento5.setBackground(c);
     PanelPrincipal.setBackground(c);
}

    /*public static void Listar() {
        ListarProductosPedidos a = new ListarProductosPedidos();
    }*/



 public static void ListarProductosPedidos(){
     
        ArrayList<InsertarProducto> result = BDProductos.ListarProductosPedidos(id_pedido);
        RecargarTabla(result);  
    }
     public static void RecargarTabla(ArrayList<InsertarProducto> list) {
         
              Object[][] datos = new Object[list.size()][3];
              int i = 0;
              for(InsertarProducto t : list)
              {
                  datos[i][0] = t.getDescripcion();
                  datos[i][1] = t.getCantidad1();
                  datos[i][2] = t.getPrecio();
                  i++;
              }    
             Pedidos.setModel(new javax.swing.table.DefaultTableModel(
                datos,
                new String[]{
                "DESCRIPCION","CANTIDAD","PRECIO"
             })
             {  
                 @Override
                 public boolean isCellEditable(int row, int column){
                 return false;

             }
             });
             Pedidos.getColumnModel().getColumn(0).setCellRenderer(new TextAreaRenderer());
             TableColumn columna1 = Pedidos.getColumn("DESCRIPCION");
             columna1.setPreferredWidth(250);
             TableColumn columna2 = Pedidos.getColumn("CANTIDAD");
             columna2.setPreferredWidth(10);
             TableColumn columna3 = Pedidos.getColumn("PRECIO");
             columna3.setPreferredWidth(10);
             sumaTotal();
     }


 public static void sumaTotal() {
       
            try {
                 BDConexion conecta = new BDConexion();
                Connection cn = conecta.getConexion();
                java.sql.Statement stmt = cn.createStatement();
            //ResultSet rs = stmt.executeQuery(sql);
                //Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("select sum(precio) as Total from PRODUCTOS_PEDIDO where id_pedido =" + id_pedido);
                while (rs.next()) {
                    int cantidad = rs.getInt(1);
                    Total.setText("Q. "+String.valueOf(cantidad));
                }
                rs.close();
                stmt.close();
                cn.close();
                
            } catch (Exception error) {
                System.out.print(error);
            }
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BotonSalir = new javax.swing.JPanel();
        TxtSalir = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        panelRound = new Clases.PanelRound();
        JPanes = new Clases.PanelRound();
        jpanes4 = new javax.swing.JLabel();
        JTMaiz = new Clases.PanelRound();
        Torti = new javax.swing.JLabel();
        complemento2 = new Clases.PanelRound();
        jHarina6 = new Clases.PanelRound();
        harina = new javax.swing.JLabel();
        complemento3 = new Clases.PanelRound();
        jPanel8 = new Clases.PanelRound();
        jLabel7 = new javax.swing.JLabel();
        complemento5 = new Clases.PanelRound();
        jPanel5 = new Clases.PanelRound();
        jLabel9 = new javax.swing.JLabel();
        complemento4 = new Clases.PanelRound();
        panelRound1 = new Clases.PanelRound();
        jLabel8 = new javax.swing.JLabel();
        complemento6 = new Clases.PanelRound();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Pedidos = new javax.swing.JTable();
        jPanel12 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        PEDIDO_ID = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Total = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        PEDIDO_ID1 = new javax.swing.JTextField();
        panelRound2 = new Clases.PanelRound();
        jLabel3 = new javax.swing.JLabel();
        panelRound3 = new Clases.PanelRound();
        panelRound4 = new Clases.PanelRound();
        PanelPrincipal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(1350, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(1500, 900));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(java.awt.Color.lightGray);
        jPanel2.setPreferredSize(new java.awt.Dimension(1460, 51));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Sistema de Comandas ");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(464, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 30));

        BotonSalir.setBackground(java.awt.Color.lightGray);
        BotonSalir.setForeground(java.awt.SystemColor.control);
        BotonSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonSalirMouseExited(evt);
            }
        });

        TxtSalir.setBackground(new java.awt.Color(255, 255, 255));
        TxtSalir.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        TxtSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TxtSalir.setText("X");
        TxtSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TxtSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TxtSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TxtSalirMouseExited(evt);
            }
        });

        javax.swing.GroupLayout BotonSalirLayout = new javax.swing.GroupLayout(BotonSalir);
        BotonSalir.setLayout(BotonSalirLayout);
        BotonSalirLayout.setHorizontalGroup(
            BotonSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotonSalirLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(TxtSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        BotonSalirLayout.setVerticalGroup(
            BotonSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TxtSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(BotonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 0, 60, 30));

        jPanel3.setBackground(new java.awt.Color(238, 238, 238));
        jPanel3.setMinimumSize(new java.awt.Dimension(180, 720));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 581, -1, -1));

        panelRound.setBackground(new java.awt.Color(255, 255, 255));
        panelRound.setRoundBottomLeft(28);
        panelRound.setRoundTopLeft(28);
        panelRound.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(panelRound, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 40, 60));

        JPanes.setBackground(new java.awt.Color(177, 216, 119));
        JPanes.setRoundBottomLeft(20);
        JPanes.setRoundBottomRight(28);
        JPanes.setRoundTopLeft(20);
        JPanes.setRoundTopRight(28);

        jpanes4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jpanes4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jpanes4.setText("PANES");
        jpanes4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpanes4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpanes4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout JPanesLayout = new javax.swing.GroupLayout(JPanes);
        JPanes.setLayout(JPanesLayout);
        JPanesLayout.setHorizontalGroup(
            JPanesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanes4, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        JPanesLayout.setVerticalGroup(
            JPanesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jpanes4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(JPanes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 80, -1));

        JTMaiz.setBackground(new java.awt.Color(77, 77, 77));
        JTMaiz.setRoundBottomLeft(20);
        JTMaiz.setRoundBottomRight(28);
        JTMaiz.setRoundTopLeft(20);
        JTMaiz.setRoundTopRight(28);
        JTMaiz.setVerifyInputWhenFocusTarget(false);

        Torti.setBackground(new java.awt.Color(77, 77, 77));
        Torti.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Torti.setForeground(new java.awt.Color(255, 255, 255));
        Torti.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Torti.setText("TORTILLAS \nDE HARINA");
        Torti.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Torti.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TortiMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout JTMaizLayout = new javax.swing.GroupLayout(JTMaiz);
        JTMaiz.setLayout(JTMaizLayout);
        JTMaizLayout.setHorizontalGroup(
            JTMaizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Torti, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, Short.MAX_VALUE)
        );
        JTMaizLayout.setVerticalGroup(
            JTMaizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Torti, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel3.add(JTMaiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 80, -1));

        complemento2.setBackground(new java.awt.Color(255, 255, 255));
        complemento2.setRoundBottomLeft(28);
        complemento2.setRoundTopLeft(28);

        javax.swing.GroupLayout complemento2Layout = new javax.swing.GroupLayout(complemento2);
        complemento2.setLayout(complemento2Layout);
        complemento2Layout.setHorizontalGroup(
            complemento2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        complemento2Layout.setVerticalGroup(
            complemento2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel3.add(complemento2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        jHarina6.setBackground(new java.awt.Color(140, 220, 218));
        jHarina6.setRoundBottomLeft(20);
        jHarina6.setRoundBottomRight(28);
        jHarina6.setRoundTopLeft(20);
        jHarina6.setRoundTopRight(28);

        harina.setBackground(new java.awt.Color(140, 220, 218));
        harina.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        harina.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        harina.setText("TORTILLA DE MAIZ");
        harina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        harina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                harinaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jHarina6Layout = new javax.swing.GroupLayout(jHarina6);
        jHarina6.setLayout(jHarina6Layout);
        jHarina6Layout.setHorizontalGroup(
            jHarina6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(harina, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, Short.MAX_VALUE)
        );
        jHarina6Layout.setVerticalGroup(
            jHarina6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(harina, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel3.add(jHarina6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 80, 60));

        complemento3.setBackground(new java.awt.Color(255, 255, 255));
        complemento3.setRoundBottomLeft(28);
        complemento3.setRoundTopLeft(28);

        javax.swing.GroupLayout complemento3Layout = new javax.swing.GroupLayout(complemento3);
        complemento3.setLayout(complemento3Layout);
        complemento3Layout.setHorizontalGroup(
            complemento3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        complemento3Layout.setVerticalGroup(
            complemento3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel3.add(complemento3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        jPanel8.setBackground(new java.awt.Color(177, 216, 119));
        jPanel8.setRoundBottomLeft(20);
        jPanel8.setRoundBottomRight(28);
        jPanel8.setRoundTopLeft(20);
        jPanel8.setRoundTopRight(28);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("BEBIDAS");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 80, -1));

        complemento5.setBackground(new java.awt.Color(255, 255, 255));
        complemento5.setRoundBottomLeft(28);
        complemento5.setRoundTopLeft(28);

        javax.swing.GroupLayout complemento5Layout = new javax.swing.GroupLayout(complemento5);
        complemento5.setLayout(complemento5Layout);
        complemento5Layout.setHorizontalGroup(
            complemento5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        complemento5Layout.setVerticalGroup(
            complemento5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel3.add(complemento5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, -1, -1));

        jPanel5.setBackground(new java.awt.Color(19, 195, 231));
        jPanel5.setRoundBottomLeft(20);
        jPanel5.setRoundBottomRight(28);
        jPanel5.setRoundTopLeft(20);
        jPanel5.setRoundTopRight(28);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("COMBOS");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 80, -1));

        complemento4.setBackground(new java.awt.Color(255, 255, 255));
        complemento4.setRoundBottomLeft(28);
        complemento4.setRoundTopLeft(28);

        javax.swing.GroupLayout complemento4Layout = new javax.swing.GroupLayout(complemento4);
        complemento4.setLayout(complemento4Layout);
        complemento4Layout.setHorizontalGroup(
            complemento4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        complemento4Layout.setVerticalGroup(
            complemento4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel3.add(complemento4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, -1, -1));

        panelRound1.setBackground(new java.awt.Color(255, 255, 153));
        panelRound1.setRoundBottomLeft(20);
        panelRound1.setRoundBottomRight(20);
        panelRound1.setRoundTopLeft(20);
        panelRound1.setRoundTopRight(20);
        panelRound1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelRound1MouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("ADICIONAL");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel3.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 80, 60));

        complemento6.setBackground(new java.awt.Color(255, 255, 255));
        complemento6.setRoundBottomLeft(28);
        complemento6.setRoundTopLeft(28);

        javax.swing.GroupLayout complemento6Layout = new javax.swing.GroupLayout(complemento6);
        complemento6.setLayout(complemento6Layout);
        complemento6Layout.setHorizontalGroup(
            complemento6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        complemento6Layout.setVerticalGroup(
            complemento6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel3.add(complemento6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 520, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 90, 690));

        jPanel9.setBackground(new java.awt.Color(238, 238, 238));
        jPanel9.setPreferredSize(new java.awt.Dimension(474, 300));

        Pedidos.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        Pedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Descripcion", "Cantidad", "Precio"
            }
        ));
        Pedidos.setFillsViewportHeight(true);
        Pedidos.setRowHeight(30);
        Pedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PedidosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Pedidos);
        if (Pedidos.getColumnModel().getColumnCount() > 0) {
            Pedidos.getColumnModel().getColumn(0).setMinWidth(250);
        }

        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("ORDEN#");

        PEDIDO_ID.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        PEDIDO_ID.setForeground(new java.awt.Color(0, 51, 255));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setText("TOTAL");

        Total.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Total.setForeground(new java.awt.Color(255, 0, 0));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setText("ORDEN#");

        PEDIDO_ID1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        PEDIDO_ID1.setForeground(new java.awt.Color(0, 51, 255));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PEDIDO_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Total, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PEDIDO_ID1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(PEDIDO_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(Total, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(PEDIDO_ID1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        panelRound2.setBackground(new java.awt.Color(102, 255, 0));
        panelRound2.setRoundBottomLeft(20);
        panelRound2.setRoundBottomRight(20);
        panelRound2.setRoundTopLeft(20);
        panelRound2.setRoundTopRight(20);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Finalizar Orden");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelRound3.setBackground(new java.awt.Color(255, 255, 102));
        panelRound3.setRoundBottomLeft(10);
        panelRound3.setRoundBottomRight(10);
        panelRound3.setRoundTopLeft(10);
        panelRound3.setRoundTopRight(10);

        javax.swing.GroupLayout panelRound3Layout = new javax.swing.GroupLayout(panelRound3);
        panelRound3.setLayout(panelRound3Layout);
        panelRound3Layout.setHorizontalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        panelRound3Layout.setVerticalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 51, Short.MAX_VALUE)
        );

        panelRound4.setBackground(new java.awt.Color(204, 255, 204));
        panelRound4.setRoundBottomLeft(10);
        panelRound4.setRoundBottomRight(10);
        panelRound4.setRoundTopLeft(10);
        panelRound4.setRoundTopRight(10);

        javax.swing.GroupLayout panelRound4Layout = new javax.swing.GroupLayout(panelRound4);
        panelRound4.setLayout(panelRound4Layout);
        panelRound4Layout.setHorizontalGroup(
            panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        panelRound4Layout.setVerticalGroup(
            panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(panelRound3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelRound4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelRound3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelRound4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(39, 39, 39))
        );

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 30, 410, 690));

        PanelPrincipal.setBackground(new java.awt.Color(238, 238, 238));
        PanelPrincipal.setPreferredSize(new java.awt.Dimension(680, 650));
        PanelPrincipal.setRequestFocusEnabled(false);
        PanelPrincipal.setVerifyInputWhenFocusTarget(false);
        PanelPrincipal.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                PanelPrincipalComponentAdded(evt);
            }
        });
        PanelPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelPrincipalMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );

        jPanel1.add(PanelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 650, 690));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1147, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtSalirMouseEntered
      BotonSalir.setBackground(Color.red);
      TxtSalir.setForeground(Color.white);
    }//GEN-LAST:event_TxtSalirMouseEntered

    private void TxtSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtSalirMouseExited
       BotonSalir.setBackground(Color.LIGHT_GRAY);
       TxtSalir.setForeground(Color.black);
    }//GEN-LAST:event_TxtSalirMouseExited

    private void TxtSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtSalirMouseClicked
      System.exit(0);
    }//GEN-LAST:event_TxtSalirMouseClicked

    private void BotonSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonSalirMouseExited
      
    }//GEN-LAST:event_BotonSalirMouseExited

    private void BotonSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonSalirMouseEntered
      
    }//GEN-LAST:event_BotonSalirMouseEntered

    private void jpanes4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpanes4MouseClicked
        PanelMismoColor();
        Color c = new Color(11,46,102); 
        Opcion1();
        panelRound.setBackground(c);
    }//GEN-LAST:event_jpanes4MouseClicked

    private void TortiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TortiMouseClicked
        PanelMismoColor();
        Color c = new Color(77,77,77); 
        Opcion2();
        complemento2.setBackground(c);
    }//GEN-LAST:event_TortiMouseClicked

    private void harinaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_harinaMouseClicked
        PanelMismoColor();
        Color c = new Color(140,220,218); 
        Opcion3();
        complemento3.setBackground(c);
      
    }//GEN-LAST:event_harinaMouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
       PanelMismoColor();
      Color c = new Color(177,216,119); 
        Opcion5();
      complemento5.setBackground(c);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
      Color c = new Color(19,195,231); 
        PanelMismoColor();
        Opcion4();
      complemento4.setBackground(c);

    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        try {
        PanelMismoColor();
        PanelPrincipal.removeAll();
        PanelPrincipal.revalidate();
        PanelPrincipal.repaint();
        JLabel Imagen = new JLabel("JLabel Set Icon Example.");
        PanelPrincipal.add(Imagen);
        Imagen.setIcon(new ImageIcon("C:\\Users\\jluis\\Documents\\NetBeansProjects\\PuntoDeVentas\\src\\img\\Shuco.jpg"));
        } catch (Exception e) {
            System.out.println("LINK = "+e);
        }
        
        
    }//GEN-LAST:event_jLabel1MouseClicked

    private void panelRound1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRound1MouseClicked

    }//GEN-LAST:event_panelRound1MouseClicked

    private void PanelPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelPrincipalMouseClicked

    }//GEN-LAST:event_PanelPrincipalMouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseClicked

    private void PedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PedidosMouseClicked
     
    }//GEN-LAST:event_PedidosMouseClicked

    private void PanelPrincipalComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_PanelPrincipalComponentAdded
      ListarProductosPedidos();
    }//GEN-LAST:event_PanelPrincipalComponentAdded

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
       ListarProductosPedidos();
    }//GEN-LAST:event_jLabel3MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BotonSalir;
    private Clases.PanelRound JPanes;
    private Clases.PanelRound JTMaiz;
    private javax.swing.JTextField PEDIDO_ID;
    private javax.swing.JTextField PEDIDO_ID1;
    private javax.swing.JPanel PanelPrincipal;
    public static javax.swing.JTable Pedidos;
    private javax.swing.JLabel Torti;
    public static javax.swing.JTextField Total;
    private javax.swing.JLabel TxtSalir;
    private Clases.PanelRound complemento2;
    private Clases.PanelRound complemento3;
    private Clases.PanelRound complemento4;
    private Clases.PanelRound complemento5;
    private Clases.PanelRound complemento6;
    private javax.swing.JLabel harina;
    private Clases.PanelRound jHarina6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private Clases.PanelRound jPanel5;
    private javax.swing.JPanel jPanel7;
    private Clases.PanelRound jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jpanes4;
    private Clases.PanelRound panelRound;
    private Clases.PanelRound panelRound1;
    private Clases.PanelRound panelRound2;
    private Clases.PanelRound panelRound3;
    private Clases.PanelRound panelRound4;
    // End of variables declaration//GEN-END:variables
}
