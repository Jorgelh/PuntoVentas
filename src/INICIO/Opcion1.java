/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package INICIO;

import static INICIO.Principal.ListarProductosPedidos;
import clases.BDConexion;
import clases.BDProductos;
import clases.InsertarProducto;
import java.awt.Color;
import java.awt.Graphics;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorge Lopez
 */
   


public class Opcion1 extends javax.swing.JPanel {

    
    int pan=1;
    int marca3 = 1;
    int marca4 = 1; 
    int marca5 = 1;
    int marca6 = 1;
    int marca7 = 1;
    int marca9 = 1;
    int marca8 = 1;
    int marca10 = 1;
    int marca11 = 1;
    int marca12 = 1;
    int marca13 = 1;
    int marca14 = 1;
    int sin1 = 0;
    int sin2 = 0;
    int sin3 = 0; 
    int sin4 = 0;
    int sin5 = 0;
    int sin6 = 0;
    int marca15 = 0;   
    int marca16 = 0;    
    int marca17 = 0;  
    int marca18 = 0;
    int marca19 = 0;
    int marca20 = 0;
    int marca21 = 0;
    int marca22 = 0;
    int marca23 = 0;
    int marca24 = 0;
    int marca25 = 0;
    int marca26 = 0;
    int marca27 = 0;
    int marca28 = 0;
    int marca29 = 0;
    int id_pedido = 0;
    int id_producto = 0;
    int id_producto_pedido = 0;
    ArrayList<Integer> Num = new ArrayList<>();
    ArrayList<Integer> NumSin = new ArrayList<>();

    @Override
    public void print(Graphics g) {
        super.print(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
   
     /**
     * Creates new form Opcion1
     * @param a
     */
    public Opcion1(int a) {
         
        
        initComponents();
        this.id_pedido=a;
        // ListadeProductos();
        // ListadeProductosExtras();
        String texto = "<html><center><body>SALCHICA<br>de<br>PEQUEÑA</body></center></html>";
        SalPequeña.setText(texto);
        String texto1 = "<html><center><body>CHORIZO<br>de<br>BREMEN</body></center></html>";
        ChoriBremen.setText(texto1);
        String texto2 = "<html><center><body>SALCHICHA<br>de<br>JUMBO</body></center></html>";
        SAlchi.setText(texto2);
        String texto3 = "<html><center><body>CHORIZO<br>de<br>AHUMADO</body></center></html>";
        ChoAhumado.setText(texto3);
        String texto4 = "<html><center><body>CHORIZO<br>de<br>ARGENTINO</body></center></html>";
        ChoArgenti.setText(texto4);
        String texto5 = "<html><center><body>PORCION<br>de<br>GUACAMOL</body></center></html>";
        PorciGuaca.setText(texto5);
        String texto6 = "<html><center><body>PORCION<br>de<br>MAYONESA</body></center></html>";
        PorciMayonesa.setText(texto6);
        String texto7 = "<html><center><body>PORCION DE<br>de<br>QUESO MOSARELA</body></center></html>";
         Queso.setText(texto7);
        if(pan ==1){Botton1.setBackground(Color.GREEN);}

    }

    private void todosBotones() {

        Botton3.setBackground(Color.red);
        marca3 = 1;
        Botton4.setBackground(Color.red);
        marca4 = 1;
        Botton5.setBackground(Color.red);
        marca5 = 1;
        Botton6.setBackground(Color.red);
        marca6 = 1;
        Botton7.setBackground(Color.red);
        marca7 = 1;
        Botton8.setBackground(Color.red);
        marca8 = 1;
        Botton9.setBackground(Color.red);
        marca9 = 1;
        Botton10.setBackground(Color.red);
        marca10 = 1;
        Botton11.setBackground(Color.red);
        marca11 = 1;
        Botton12.setBackground(Color.red);
        marca12 = 1;
        Botton13.setBackground(Color.red);
        marca13 = 1;
        Botton14.setBackground(Color.red);
        marca14 = 1;
        
    }
    
    private void Limpiar() {
       // pan= 3;
        marca3 = 1; marca4 = 1;marca5 = 1;marca6 = 1;marca7 = 1;marca8 = 1;marca9 = 1;marca10 = 1; marca11 = 1;marca12 = 1; marca13 = 1;marca14 = 1;
        Botton1.setBackground(Color.red);
        Botton2.setBackground(Color.red);
        Botton3.setBackground(Color.red);
        Botton4.setBackground(Color.red);
        Botton5.setBackground(Color.red);
        Botton6.setBackground(Color.red);
        Botton7.setBackground(Color.red);
        Botton8.setBackground(Color.red);
        Botton9.setBackground(Color.red);
        Botton10.setBackground(Color.red);
        Botton11.setBackground(Color.red);
        Botton12.setBackground(Color.red);
        Botton13.setBackground(Color.red);
        Botton14.setBackground(Color.red);
        Botton15.setBackground(Color.red);
        Botton16.setBackground(Color.red);
        Botton17.setBackground(Color.red);
        Botton18.setBackground(Color.red);
        Botton19.setBackground(Color.red);
        Botton20.setBackground(Color.red);
        Botton21.setBackground(Color.red);
        Botton22.setBackground(Color.red);
        Botton23.setBackground(Color.red);
        Botton24.setBackground(Color.red);
        Botton25.setBackground(Color.red);
        Botton26.setBackground(Color.red);
        Botton27.setBackground(Color.red);
        Botton28.setBackground(Color.red);
        Botton29.setBackground(Color.red);
        Botton30.setBackground(Color.red);
        Botton31.setBackground(Color.red);
        Botton32.setBackground(Color.red);
        Botton33.setBackground(Color.red);
        Botton34.setBackground(Color.red);
        Botton35.setBackground(Color.red);
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
        marca28 = 0;
        marca29 = 0;
        sin1 = 0;
        sin2 = 0;
        sin3 = 0; 
        sin4 = 0;
        sin5 = 0;
        sin6 = 0;
        Num.clear();
        NumSin.clear();
        
    }

    private void InsertarProductoPedido() {

        try {
            InsertarProducto p1 = new InsertarProducto();

            p1.setId_pedido(id_pedido);
            p1.setId_producto(id_producto);
            p1.setCantidad( Integer.parseInt( cantidad.getText()));
            p1.setTipo(pan);
            BDProductos.InsertarProducto_Pedido(p1);
            id_producto_pedido = p1.getIdregreso();
            insertarAdicional();
            insertarSin();
            JOptionPane.showMessageDialog(null, "Producto Agregado");
            
        } catch (Exception e) {
        }

    }
    
    
    
    private void insertarAdicional(){

    for(int i = 0; i < Num.size(); i++) {
    try {
        BDConexion conecta = new BDConexion();
        Connection con = conecta.getConexion();
        PreparedStatement smtp = null;
        //insert into PRODUCTOS_PEDIDO (id_pedido,id_producto,cantidad,tipo,extra) values(?,?,?,?,1)
        smtp =con.prepareStatement("insert into PRODUCTOS_PEDIDO (id_pedido,id_producto,pro_id_productos_pedido,cantidad,adicional) values(?,?,?,1,2)");
        smtp.setInt(1,id_pedido);
        smtp.setInt(2,Num.get(i));
        smtp.setInt(3, id_producto_pedido);
        smtp.executeUpdate();
        con.close();
        smtp.close();    
     } catch (Exception e) {
         
            JOptionPane.showMessageDialog(null,"QUE PASO: "+ e);}
    }
}
    
       private void insertarSin(){

    for(int i = 0; i < NumSin.size(); i++) {
    try {
        BDConexion conecta = new BDConexion();
        Connection con = conecta.getConexion();
        PreparedStatement smtp = null;
        smtp =con.prepareStatement("insert into NOTAS (id_productos_pedido,id) values(?,?)");
        smtp.setInt(1,id_producto_pedido);
        smtp.setInt(2,NumSin.get(i));
        smtp.executeUpdate();
        con.close();
        smtp.close();    
     } catch (Exception e) {
         
            JOptionPane.showMessageDialog(null,"QUE PASO: "+ e);}
    }
}
       
       private  void bloquear(boolean b){
        
           jLabel16.setEnabled(b);
           jLabel17.setEnabled(b);
           jLabel18.setEnabled(b);
           jLabel19.setEnabled(b);
           jLabel20.setEnabled(b);
           jLabel21.setEnabled(b);
           
           
       
       
       }

    /* private void ListadeProductos() {
        
        
        ArrayList<Productos> result = BDProductos.ListarProductos();
        recargarTable(result);
    }
    
    public void recargarTable(ArrayList<Productos> list) {
        Object[][] datos = new Object[list.size()][2];
        int i = 0;
        for (Productos m : list)
        {
            datos[i][0] = m.getDescripcion();
            datos[i][1] = m.getPrecio();
            i++;
        }
        Panes.setModel(new javax.swing.table.DefaultTableModel(
                datos,
                new String[]{
                    "DESCRIPCION","PRECIO"
                } ) 
        
        {
                     @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        });
       
        TableColumn columna1 = Panes.getColumn("DESCRIPCION");
             columna1.setPreferredWidth(50);
             TableColumn columna2 = Panes.getColumn("PRECIO");
             columna2.setPreferredWidth(10);
             
    }
    
   
    
    
    
    
    
    private void ListadeProductosExtras() {
        
        
        ArrayList<Productos> result = BDProductos.ListarProductos();
        recargarTableExtra(result);
    }
    
    public void recargarTableExtra(ArrayList<Productos> list) {
        Object[][] datos = new Object[list.size()][2];
        boolean ColumnasEditables[]={false,false,true};//nuevo de agregar columna seleccionable
        Class tipo[]=new Class[]{java.lang.Object.class,java.lang.Object.class,java.lang.Boolean.class};//nuevo de agregar columna seleccionable
        int i = 0;
        for (Productos m : list)
        {
            datos[i][0] = m.getDescripcion();
            datos[i][1] = m.getPrecio();
            i++;
        }
        Extra.setModel(new javax.swing.table.DefaultTableModel(
                datos,
                new String[]{
                    "DESCRIPCION","PRECIO","CHEK"
                }) {
                     @Override
            public boolean isCellEditable(int row, int column) {//nuevo de agregar columna seleccionable
                return ColumnasEditables[column];//nuevo de agregar columna seleccionable
            }
            
            public Class getColumnClass(int index){
            return tipo[index];
            }
        });
        TableColumn columna1 = Extra.getColumn("DESCRIPCION");
             columna1.setPreferredWidth(100);
             TableColumn columna2 = Extra.getColumn("PRECIO");
             columna2.setPreferredWidth(50);
    }
    
    private void Tomar() {
    
    //String Extra = (Integer.parseInt(String.valueOf(Extra.getModel().getValueAt(Extra.getSelectedRow(),0))));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        P = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        Botton7 = new Clases.PanelRound();
        jLabel8 = new javax.swing.JLabel();
        Botton12 = new Clases.PanelRound();
        jLabel13 = new javax.swing.JLabel();
        Botton3 = new Clases.PanelRound();
        jLabel4 = new javax.swing.JLabel();
        Botton8 = new Clases.PanelRound();
        jLabel9 = new javax.swing.JLabel();
        Botton4 = new Clases.PanelRound();
        jLabel5 = new javax.swing.JLabel();
        Botton9 = new Clases.PanelRound();
        jLabel10 = new javax.swing.JLabel();
        Botton11 = new Clases.PanelRound();
        jLabel12 = new javax.swing.JLabel();
        Botton5 = new Clases.PanelRound();
        jLabel6 = new javax.swing.JLabel();
        Botton10 = new Clases.PanelRound();
        jLabel11 = new javax.swing.JLabel();
        Botton14 = new Clases.PanelRound();
        jLabel15 = new javax.swing.JLabel();
        Botton6 = new Clases.PanelRound();
        jLabel7 = new javax.swing.JLabel();
        Botton13 = new Clases.PanelRound();
        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Botton2 = new Clases.PanelRound();
        jLabel24 = new javax.swing.JLabel();
        Botton1 = new Clases.PanelRound();
        jLabel23 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Botton15 = new Clases.PanelRound();
        SalPequeña = new javax.swing.JLabel();
        Botton16 = new Clases.PanelRound();
        ChoriBremen = new javax.swing.JLabel();
        Botton17 = new Clases.PanelRound();
        Extra3 = new javax.swing.JLabel();
        Botton18 = new Clases.PanelRound();
        Extra4 = new javax.swing.JLabel();
        Botton19 = new Clases.PanelRound();
        SAlchi = new javax.swing.JLabel();
        Botton20 = new Clases.PanelRound();
        Extra6 = new javax.swing.JLabel();
        Botton21 = new Clases.PanelRound();
        Extra7 = new javax.swing.JLabel();
        Botton22 = new Clases.PanelRound();
        ChoAhumado = new javax.swing.JLabel();
        Botton23 = new Clases.PanelRound();
        ChoArgenti = new javax.swing.JLabel();
        Botton25 = new Clases.PanelRound();
        Extra11 = new javax.swing.JLabel();
        Botton27 = new Clases.PanelRound();
        PorciMayonesa = new javax.swing.JLabel();
        Botton28 = new Clases.PanelRound();
        Extra14 = new javax.swing.JLabel();
        Botton29 = new Clases.PanelRound();
        Queso = new javax.swing.JLabel();
        Botton24 = new Clases.PanelRound();
        Extra10 = new javax.swing.JLabel();
        Botton26 = new Clases.PanelRound();
        PorciGuaca = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Botton30 = new Clases.PanelRound();
        jLabel16 = new javax.swing.JLabel();
        Botton31 = new Clases.PanelRound();
        jLabel17 = new javax.swing.JLabel();
        Botton32 = new Clases.PanelRound();
        jLabel18 = new javax.swing.JLabel();
        Botton33 = new Clases.PanelRound();
        jLabel19 = new javax.swing.JLabel();
        Botton34 = new Clases.PanelRound();
        jLabel20 = new javax.swing.JLabel();
        Botton35 = new Clases.PanelRound();
        jLabel21 = new javax.swing.JLabel();
        Botton36 = new Clases.PanelRound();
        BotonAgregar = new Clases.PanelRound();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        cantidad = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 341, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 191, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(11, 46, 102));
        setPreferredSize(new java.awt.Dimension(730, 690));

        jLabel1.setText("1");

        P.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        P.setForeground(new java.awt.Color(255, 255, 255));
        P.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        P.setText("PANES");

        jPanel5.setBackground(new java.awt.Color(11, 46, 102));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Botton7.setBackground(new java.awt.Color(255, 0, 0));
        Botton7.setRoundBottomLeft(20);
        Botton7.setRoundBottomRight(20);
        Botton7.setRoundTopLeft(20);
        Botton7.setRoundTopRight(20);
        Botton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton7MouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("SALCHICHA JUMBO");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton7Layout = new javax.swing.GroupLayout(Botton7);
        Botton7.setLayout(Botton7Layout);
        Botton7Layout.setHorizontalGroup(
            Botton7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Botton7Layout.setVerticalGroup(
            Botton7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        jPanel5.add(Botton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 150, -1));

        Botton12.setBackground(new java.awt.Color(255, 0, 0));
        Botton12.setRoundBottomLeft(20);
        Botton12.setRoundBottomRight(20);
        Botton12.setRoundTopLeft(20);
        Botton12.setRoundTopRight(20);
        Botton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton12MouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("TOCINO");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton12Layout = new javax.swing.GroupLayout(Botton12);
        Botton12.setLayout(Botton12Layout);
        Botton12Layout.setHorizontalGroup(
            Botton12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        Botton12Layout.setVerticalGroup(
            Botton12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        jPanel5.add(Botton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 150, -1));

        Botton3.setBackground(new java.awt.Color(255, 0, 0));
        Botton3.setRoundBottomLeft(20);
        Botton3.setRoundBottomRight(20);
        Botton3.setRoundTopLeft(20);
        Botton3.setRoundTopRight(20);
        Botton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton3MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("SALCHICHA PEQUEÑA");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton3Layout = new javax.swing.GroupLayout(Botton3);
        Botton3.setLayout(Botton3Layout);
        Botton3Layout.setHorizontalGroup(
            Botton3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Botton3Layout.setVerticalGroup(
            Botton3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        jPanel5.add(Botton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, -1));

        Botton8.setBackground(new java.awt.Color(255, 0, 0));
        Botton8.setRoundBottomLeft(20);
        Botton8.setRoundBottomRight(20);
        Botton8.setRoundTopLeft(20);
        Botton8.setRoundTopRight(20);
        Botton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton8MouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("ADOBADO");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton8Layout = new javax.swing.GroupLayout(Botton8);
        Botton8.setLayout(Botton8Layout);
        Botton8Layout.setHorizontalGroup(
            Botton8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        Botton8Layout.setVerticalGroup(
            Botton8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        jPanel5.add(Botton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 150, -1));

        Botton4.setBackground(new java.awt.Color(255, 0, 0));
        Botton4.setRoundBottomLeft(20);
        Botton4.setRoundBottomRight(20);
        Botton4.setRoundTopLeft(20);
        Botton4.setRoundTopRight(20);
        Botton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton4MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("CHORIZO BREMEN");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton4Layout = new javax.swing.GroupLayout(Botton4);
        Botton4.setLayout(Botton4Layout);
        Botton4Layout.setHorizontalGroup(
            Botton4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        Botton4Layout.setVerticalGroup(
            Botton4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        jPanel5.add(Botton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 150, -1));

        Botton9.setBackground(new java.awt.Color(255, 0, 0));
        Botton9.setRoundBottomLeft(20);
        Botton9.setRoundBottomRight(20);
        Botton9.setRoundTopLeft(20);
        Botton9.setRoundTopRight(20);
        Botton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton9MouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("RES");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton9Layout = new javax.swing.GroupLayout(Botton9);
        Botton9.setLayout(Botton9Layout);
        Botton9Layout.setHorizontalGroup(
            Botton9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        Botton9Layout.setVerticalGroup(
            Botton9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        jPanel5.add(Botton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 150, -1));

        Botton11.setBackground(new java.awt.Color(255, 0, 0));
        Botton11.setRoundBottomLeft(20);
        Botton11.setRoundBottomRight(20);
        Botton11.setRoundTopLeft(20);
        Botton11.setRoundTopRight(20);
        Botton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton11MouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("CHORIZO ARGENTINO");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton11Layout = new javax.swing.GroupLayout(Botton11);
        Botton11.setLayout(Botton11Layout);
        Botton11Layout.setHorizontalGroup(
            Botton11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Botton11Layout.setVerticalGroup(
            Botton11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        jPanel5.add(Botton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 150, -1));

        Botton5.setBackground(new java.awt.Color(255, 0, 0));
        Botton5.setRoundBottomLeft(20);
        Botton5.setRoundBottomRight(20);
        Botton5.setRoundTopLeft(20);
        Botton5.setRoundTopRight(20);
        Botton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton5MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("SALAMI");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton5Layout = new javax.swing.GroupLayout(Botton5);
        Botton5.setLayout(Botton5Layout);
        Botton5Layout.setHorizontalGroup(
            Botton5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        Botton5Layout.setVerticalGroup(
            Botton5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        jPanel5.add(Botton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 150, -1));

        Botton10.setBackground(new java.awt.Color(255, 0, 0));
        Botton10.setRoundBottomLeft(20);
        Botton10.setRoundBottomRight(20);
        Botton10.setRoundTopLeft(20);
        Botton10.setRoundTopRight(20);
        Botton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton10MouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("CHORIZO AHUMADO");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton10Layout = new javax.swing.GroupLayout(Botton10);
        Botton10.setLayout(Botton10Layout);
        Botton10Layout.setHorizontalGroup(
            Botton10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Botton10Layout.setVerticalGroup(
            Botton10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        jPanel5.add(Botton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 150, -1));

        Botton14.setBackground(new java.awt.Color(255, 0, 0));
        Botton14.setEnabled(false);
        Botton14.setRoundBottomLeft(20);
        Botton14.setRoundBottomRight(20);
        Botton14.setRoundTopLeft(20);
        Botton14.setRoundTopRight(20);
        Botton14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton14MouseClicked(evt);
            }
        });

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton14Layout = new javax.swing.GroupLayout(Botton14);
        Botton14.setLayout(Botton14Layout);
        Botton14Layout.setHorizontalGroup(
            Botton14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        Botton14Layout.setVerticalGroup(
            Botton14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        jPanel5.add(Botton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, 150, -1));

        Botton6.setBackground(new java.awt.Color(255, 0, 0));
        Botton6.setRoundBottomLeft(20);
        Botton6.setRoundBottomRight(20);
        Botton6.setRoundTopLeft(20);
        Botton6.setRoundTopRight(20);
        Botton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton6MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("LONGANIZA");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton6Layout = new javax.swing.GroupLayout(Botton6);
        Botton6.setLayout(Botton6Layout);
        Botton6Layout.setHorizontalGroup(
            Botton6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        Botton6Layout.setVerticalGroup(
            Botton6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        jPanel5.add(Botton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 150, -1));

        Botton13.setBackground(new java.awt.Color(255, 0, 0));
        Botton13.setRoundBottomLeft(20);
        Botton13.setRoundBottomRight(20);
        Botton13.setRoundTopLeft(20);
        Botton13.setRoundTopRight(20);
        Botton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton13MouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("VEGETARIANO");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton13Layout = new javax.swing.GroupLayout(Botton13);
        Botton13.setLayout(Botton13Layout);
        Botton13Layout.setHorizontalGroup(
            Botton13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        Botton13Layout.setVerticalGroup(
            Botton13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        jPanel5.add(Botton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 150, -1));

        jPanel1.setBackground(new java.awt.Color(11, 46, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Botton2.setBackground(new java.awt.Color(255, 0, 0));
        Botton2.setRoundBottomLeft(20);
        Botton2.setRoundBottomRight(20);
        Botton2.setRoundTopLeft(20);
        Botton2.setRoundTopRight(20);

        jLabel24.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("TORTILLA");
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton2Layout = new javax.swing.GroupLayout(Botton2);
        Botton2.setLayout(Botton2Layout);
        Botton2Layout.setHorizontalGroup(
            Botton2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        Botton2Layout.setVerticalGroup(
            Botton2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        jPanel1.add(Botton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 150, -1));

        Botton1.setBackground(new java.awt.Color(255, 0, 0));
        Botton1.setRoundBottomLeft(20);
        Botton1.setRoundBottomRight(20);
        Botton1.setRoundTopLeft(20);
        Botton1.setRoundTopRight(20);

        jLabel23.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("PAN");
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton1Layout = new javax.swing.GroupLayout(Botton1);
        Botton1.setLayout(Botton1Layout);
        Botton1Layout.setHorizontalGroup(
            Botton1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        Botton1Layout.setVerticalGroup(
            Botton1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
        );

        jPanel1.add(Botton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel3.setBackground(new java.awt.Color(11, 46, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Botton15.setBackground(new java.awt.Color(255, 0, 0));
        Botton15.setRoundBottomLeft(20);
        Botton15.setRoundBottomRight(20);
        Botton15.setRoundTopLeft(20);
        Botton15.setRoundTopRight(20);
        Botton15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton15MouseClicked(evt);
            }
        });

        SalPequeña.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        SalPequeña.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SalPequeña.setText("SALCHICHA PEQUEÑA");
        SalPequeña.setToolTipText("");
        SalPequeña.setName("SALCHICHA PEQUEÑA"); // NOI18N
        SalPequeña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalPequeñaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton15Layout = new javax.swing.GroupLayout(Botton15);
        Botton15.setLayout(Botton15Layout);
        Botton15Layout.setHorizontalGroup(
            Botton15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SalPequeña, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
        );
        Botton15Layout.setVerticalGroup(
            Botton15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SalPequeña, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        jPanel3.add(Botton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        Botton16.setBackground(new java.awt.Color(255, 0, 0));
        Botton16.setRoundBottomLeft(20);
        Botton16.setRoundBottomRight(20);
        Botton16.setRoundTopLeft(20);
        Botton16.setRoundTopRight(20);
        Botton16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton16MouseClicked(evt);
            }
        });

        ChoriBremen.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        ChoriBremen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ChoriBremen.setText("CHORIZO BREMEN");
        ChoriBremen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChoriBremenMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton16Layout = new javax.swing.GroupLayout(Botton16);
        Botton16.setLayout(Botton16Layout);
        Botton16Layout.setHorizontalGroup(
            Botton16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ChoriBremen, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
        );
        Botton16Layout.setVerticalGroup(
            Botton16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ChoriBremen, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        jPanel3.add(Botton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        Botton17.setBackground(new java.awt.Color(255, 0, 0));
        Botton17.setRoundBottomLeft(20);
        Botton17.setRoundBottomRight(20);
        Botton17.setRoundTopLeft(20);
        Botton17.setRoundTopRight(20);
        Botton17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton17MouseClicked(evt);
            }
        });

        Extra3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Extra3.setText("SALAMI");
        Extra3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Extra3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton17Layout = new javax.swing.GroupLayout(Botton17);
        Botton17.setLayout(Botton17Layout);
        Botton17Layout.setHorizontalGroup(
            Botton17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Extra3, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
        );
        Botton17Layout.setVerticalGroup(
            Botton17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Extra3, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        jPanel3.add(Botton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        Botton18.setBackground(new java.awt.Color(255, 0, 0));
        Botton18.setRoundBottomLeft(20);
        Botton18.setRoundBottomRight(20);
        Botton18.setRoundTopLeft(20);
        Botton18.setRoundTopRight(20);
        Botton18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton18MouseClicked(evt);
            }
        });

        Extra4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Extra4.setText("LONGANIZA");
        Extra4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Extra4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton18Layout = new javax.swing.GroupLayout(Botton18);
        Botton18.setLayout(Botton18Layout);
        Botton18Layout.setHorizontalGroup(
            Botton18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Extra4, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
        );
        Botton18Layout.setVerticalGroup(
            Botton18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Extra4, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        jPanel3.add(Botton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        Botton19.setBackground(new java.awt.Color(255, 0, 0));
        Botton19.setRoundBottomLeft(20);
        Botton19.setRoundBottomRight(20);
        Botton19.setRoundTopLeft(20);
        Botton19.setRoundTopRight(20);
        Botton19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton19MouseClicked(evt);
            }
        });

        SAlchi.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        SAlchi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SAlchi.setText("SALCHI JUMBO");
        SAlchi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SAlchiMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton19Layout = new javax.swing.GroupLayout(Botton19);
        Botton19.setLayout(Botton19Layout);
        Botton19Layout.setHorizontalGroup(
            Botton19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Botton19Layout.createSequentialGroup()
                .addComponent(SAlchi, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Botton19Layout.setVerticalGroup(
            Botton19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SAlchi, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        jPanel3.add(Botton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));

        Botton20.setBackground(new java.awt.Color(255, 0, 0));
        Botton20.setRoundBottomLeft(20);
        Botton20.setRoundBottomRight(20);
        Botton20.setRoundTopLeft(20);
        Botton20.setRoundTopRight(20);
        Botton20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton20MouseClicked(evt);
            }
        });

        Extra6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Extra6.setText("ADOBADO");
        Extra6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Extra6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton20Layout = new javax.swing.GroupLayout(Botton20);
        Botton20.setLayout(Botton20Layout);
        Botton20Layout.setHorizontalGroup(
            Botton20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Extra6, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
        );
        Botton20Layout.setVerticalGroup(
            Botton20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Extra6, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        jPanel3.add(Botton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, -1, -1));

        Botton21.setBackground(new java.awt.Color(255, 0, 0));
        Botton21.setRoundBottomLeft(20);
        Botton21.setRoundBottomRight(20);
        Botton21.setRoundTopLeft(20);
        Botton21.setRoundTopRight(20);
        Botton21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton21MouseClicked(evt);
            }
        });

        Extra7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Extra7.setText("RES");
        Extra7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Extra7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton21Layout = new javax.swing.GroupLayout(Botton21);
        Botton21.setLayout(Botton21Layout);
        Botton21Layout.setHorizontalGroup(
            Botton21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Extra7, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
        );
        Botton21Layout.setVerticalGroup(
            Botton21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Extra7, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        jPanel3.add(Botton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        Botton22.setBackground(new java.awt.Color(255, 0, 0));
        Botton22.setRoundBottomLeft(20);
        Botton22.setRoundBottomRight(20);
        Botton22.setRoundTopLeft(20);
        Botton22.setRoundTopRight(20);
        Botton22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton22MouseClicked(evt);
            }
        });

        ChoAhumado.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        ChoAhumado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ChoAhumado.setText("CHO AHUMADO");
        ChoAhumado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChoAhumadoMouseClicked(evt);
            }
        });
        ChoAhumado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ChoAhumadoKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout Botton22Layout = new javax.swing.GroupLayout(Botton22);
        Botton22.setLayout(Botton22Layout);
        Botton22Layout.setHorizontalGroup(
            Botton22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Botton22Layout.createSequentialGroup()
                .addComponent(ChoAhumado, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Botton22Layout.setVerticalGroup(
            Botton22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ChoAhumado, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        jPanel3.add(Botton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, -1));

        Botton23.setBackground(new java.awt.Color(255, 0, 0));
        Botton23.setRoundBottomLeft(20);
        Botton23.setRoundBottomRight(20);
        Botton23.setRoundTopLeft(20);
        Botton23.setRoundTopRight(20);
        Botton23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton23MouseClicked(evt);
            }
        });

        ChoArgenti.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        ChoArgenti.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ChoArgenti.setText("CHORI ARGENTINO");
        ChoArgenti.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChoArgentiMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton23Layout = new javax.swing.GroupLayout(Botton23);
        Botton23.setLayout(Botton23Layout);
        Botton23Layout.setHorizontalGroup(
            Botton23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Botton23Layout.createSequentialGroup()
                .addComponent(ChoArgenti, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Botton23Layout.setVerticalGroup(
            Botton23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ChoArgenti, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        jPanel3.add(Botton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, -1, -1));

        Botton25.setBackground(new java.awt.Color(255, 0, 0));
        Botton25.setRoundBottomLeft(20);
        Botton25.setRoundBottomRight(20);
        Botton25.setRoundTopLeft(20);
        Botton25.setRoundTopRight(20);
        Botton25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton25MouseClicked(evt);
            }
        });

        Extra11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Extra11.setText("PAN");
        Extra11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Extra11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton25Layout = new javax.swing.GroupLayout(Botton25);
        Botton25.setLayout(Botton25Layout);
        Botton25Layout.setHorizontalGroup(
            Botton25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Extra11, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
        );
        Botton25Layout.setVerticalGroup(
            Botton25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Extra11, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        jPanel3.add(Botton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));

        Botton27.setBackground(new java.awt.Color(255, 0, 0));
        Botton27.setRoundBottomLeft(20);
        Botton27.setRoundBottomRight(20);
        Botton27.setRoundTopLeft(20);
        Botton27.setRoundTopRight(20);
        Botton27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton27MouseClicked(evt);
            }
        });

        PorciMayonesa.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        PorciMayonesa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PorciMayonesa.setText("PORCI MAYONESA");
        PorciMayonesa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PorciMayonesaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton27Layout = new javax.swing.GroupLayout(Botton27);
        Botton27.setLayout(Botton27Layout);
        Botton27Layout.setHorizontalGroup(
            Botton27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PorciMayonesa, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
        );
        Botton27Layout.setVerticalGroup(
            Botton27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PorciMayonesa, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        jPanel3.add(Botton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        Botton28.setBackground(new java.awt.Color(255, 0, 0));
        Botton28.setRoundBottomLeft(20);
        Botton28.setRoundBottomRight(20);
        Botton28.setRoundTopLeft(20);
        Botton28.setRoundTopRight(20);
        Botton28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton28MouseClicked(evt);
            }
        });

        Extra14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Extra14.setText("CEBOLLIN");
        Extra14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Extra14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton28Layout = new javax.swing.GroupLayout(Botton28);
        Botton28.setLayout(Botton28Layout);
        Botton28Layout.setHorizontalGroup(
            Botton28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Extra14, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
        );
        Botton28Layout.setVerticalGroup(
            Botton28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Extra14, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        jPanel3.add(Botton28, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, -1, -1));

        Botton29.setBackground(new java.awt.Color(255, 0, 0));
        Botton29.setRoundBottomLeft(20);
        Botton29.setRoundBottomRight(20);
        Botton29.setRoundTopLeft(20);
        Botton29.setRoundTopRight(20);
        Botton29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton29MouseClicked(evt);
            }
        });

        Queso.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Queso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Queso.setText("jLabel30");
        Queso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                QuesoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton29Layout = new javax.swing.GroupLayout(Botton29);
        Botton29.setLayout(Botton29Layout);
        Botton29Layout.setHorizontalGroup(
            Botton29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Queso, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
        );
        Botton29Layout.setVerticalGroup(
            Botton29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Queso, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        jPanel3.add(Botton29, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, -1, -1));

        Botton24.setBackground(new java.awt.Color(255, 0, 0));
        Botton24.setRoundBottomLeft(20);
        Botton24.setRoundBottomRight(20);
        Botton24.setRoundTopLeft(20);
        Botton24.setRoundTopRight(20);
        Botton24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton24MouseClicked(evt);
            }
        });

        Extra10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Extra10.setText("TOCINO");
        Extra10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Extra10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton24Layout = new javax.swing.GroupLayout(Botton24);
        Botton24.setLayout(Botton24Layout);
        Botton24Layout.setHorizontalGroup(
            Botton24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Extra10, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
        );
        Botton24Layout.setVerticalGroup(
            Botton24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Extra10, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        jPanel3.add(Botton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        Botton26.setBackground(new java.awt.Color(255, 0, 0));
        Botton26.setRoundBottomLeft(20);
        Botton26.setRoundBottomRight(20);
        Botton26.setRoundTopLeft(20);
        Botton26.setRoundTopRight(20);
        Botton26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton26MouseClicked(evt);
            }
        });

        PorciGuaca.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        PorciGuaca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PorciGuaca.setText("PORCIO GUACAMOL");
        PorciGuaca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PorciGuacaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton26Layout = new javax.swing.GroupLayout(Botton26);
        Botton26.setLayout(Botton26Layout);
        Botton26Layout.setHorizontalGroup(
            Botton26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Botton26Layout.createSequentialGroup()
                .addComponent(PorciGuaca, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Botton26Layout.setVerticalGroup(
            Botton26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PorciGuaca, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        jPanel3.add(Botton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, -1, -1));

        jPanel2.setBackground(new java.awt.Color(11, 46, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Botton30.setBackground(new java.awt.Color(255, 0, 0));
        Botton30.setRoundBottomLeft(10);
        Botton30.setRoundBottomRight(10);
        Botton30.setRoundTopLeft(10);
        Botton30.setRoundTopRight(10);
        Botton30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton30MouseClicked(evt);
            }
        });

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("CON TODO");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton30Layout = new javax.swing.GroupLayout(Botton30);
        Botton30.setLayout(Botton30Layout);
        Botton30Layout.setHorizontalGroup(
            Botton30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        Botton30Layout.setVerticalGroup(
            Botton30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel2.add(Botton30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 190, 30));

        Botton31.setBackground(new java.awt.Color(255, 0, 0));
        Botton31.setRoundBottomLeft(10);
        Botton31.setRoundBottomRight(10);
        Botton31.setRoundTopLeft(10);
        Botton31.setRoundTopRight(10);
        Botton31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton31MouseClicked(evt);
            }
        });

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("SIN SALSA DULCE");
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton31Layout = new javax.swing.GroupLayout(Botton31);
        Botton31.setLayout(Botton31Layout);
        Botton31Layout.setHorizontalGroup(
            Botton31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Botton31Layout.createSequentialGroup()
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                .addContainerGap())
        );
        Botton31Layout.setVerticalGroup(
            Botton31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel2.add(Botton31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 190, 30));

        Botton32.setBackground(new java.awt.Color(255, 0, 0));
        Botton32.setRoundBottomLeft(10);
        Botton32.setRoundBottomRight(10);
        Botton32.setRoundTopLeft(10);
        Botton32.setRoundTopRight(10);
        Botton32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton32MouseClicked(evt);
            }
        });

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("SIN MAYONESA");
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton32Layout = new javax.swing.GroupLayout(Botton32);
        Botton32.setLayout(Botton32Layout);
        Botton32Layout.setHorizontalGroup(
            Botton32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        Botton32Layout.setVerticalGroup(
            Botton32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel2.add(Botton32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 190, 30));

        Botton33.setBackground(new java.awt.Color(255, 0, 0));
        Botton33.setRoundBottomLeft(10);
        Botton33.setRoundBottomRight(10);
        Botton33.setRoundTopLeft(10);
        Botton33.setRoundTopRight(10);
        Botton33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton33MouseClicked(evt);
            }
        });

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("SIN MOSTASA");
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton33Layout = new javax.swing.GroupLayout(Botton33);
        Botton33.setLayout(Botton33Layout);
        Botton33Layout.setHorizontalGroup(
            Botton33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        Botton33Layout.setVerticalGroup(
            Botton33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel2.add(Botton33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 190, 30));

        Botton34.setBackground(new java.awt.Color(255, 0, 0));
        Botton34.setRoundBottomLeft(10);
        Botton34.setRoundBottomRight(10);
        Botton34.setRoundTopLeft(10);
        Botton34.setRoundTopRight(10);
        Botton34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton34MouseClicked(evt);
            }
        });

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("SIN CEBOLLA");
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton34Layout = new javax.swing.GroupLayout(Botton34);
        Botton34.setLayout(Botton34Layout);
        Botton34Layout.setHorizontalGroup(
            Botton34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        Botton34Layout.setVerticalGroup(
            Botton34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel2.add(Botton34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 190, 30));

        Botton35.setBackground(new java.awt.Color(255, 0, 0));
        Botton35.setRoundBottomLeft(10);
        Botton35.setRoundBottomRight(10);
        Botton35.setRoundTopLeft(10);
        Botton35.setRoundTopRight(10);
        Botton35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton35MouseClicked(evt);
            }
        });

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("SIN REPOLLO");
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton35Layout = new javax.swing.GroupLayout(Botton35);
        Botton35.setLayout(Botton35Layout);
        Botton35Layout.setHorizontalGroup(
            Botton35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        Botton35Layout.setVerticalGroup(
            Botton35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel2.add(Botton35, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 190, 30));

        Botton36.setBackground(new java.awt.Color(255, 0, 0));
        Botton36.setRoundBottomLeft(10);
        Botton36.setRoundBottomRight(10);
        Botton36.setRoundTopLeft(10);
        Botton36.setRoundTopRight(10);
        Botton36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton36MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton36Layout = new javax.swing.GroupLayout(Botton36);
        Botton36.setLayout(Botton36Layout);
        Botton36Layout.setHorizontalGroup(
            Botton36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        Botton36Layout.setVerticalGroup(
            Botton36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel2.add(Botton36, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 190, 30));

        BotonAgregar.setBackground(new java.awt.Color(51, 255, 51));
        BotonAgregar.setRoundBottomLeft(20);
        BotonAgregar.setRoundBottomRight(20);
        BotonAgregar.setRoundTopLeft(20);
        BotonAgregar.setRoundTopRight(20);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("AGREGAR");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout BotonAgregarLayout = new javax.swing.GroupLayout(BotonAgregar);
        BotonAgregar.setLayout(BotonAgregarLayout);
        BotonAgregarLayout.setHorizontalGroup(
            BotonAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
        );
        BotonAgregarLayout.setVerticalGroup(
            BotonAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotonAgregarLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ABAJO.png"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ARRIBA.png"))); // NOI18N
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        cantidad.setEditable(false);
        cantidad.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        cantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cantidad.setText("1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(BotonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(29, 29, 29))))
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 38, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(306, 306, 306)
                        .addComponent(P)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(P))
                .addGap(2, 2, 2)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BotonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(27, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    
    
    
    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked

        InsertarProductoPedido();
        ListarProductosPedidos();
        Limpiar();
        
    }//GEN-LAST:event_jLabel3MouseClicked

    private void Botton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton7MouseClicked

    private void Botton12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton12MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton12MouseClicked

    private void Botton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton3MouseClicked

    private void Botton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton8MouseClicked

    private void Botton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton4MouseClicked

    private void Botton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton9MouseClicked

    private void Botton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton11MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton11MouseClicked

    private void Botton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton5MouseClicked

    private void Botton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton10MouseClicked

    private void Botton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton6MouseClicked

    private void Botton13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton13MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton13MouseClicked

    private void Botton14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton14MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton14MouseClicked

    private void Botton15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton15MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton15MouseClicked

    private void Botton16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton16MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton16MouseClicked

    private void Botton17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton17MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton17MouseClicked

    private void Botton18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton18MouseClicked
        if (marca15 == 1) {
            Botton15.setBackground(Color.GREEN);
            marca15 = 0;
        } else {
            Botton15.setBackground(Color.red);
            marca15 = 1;
            
        }
    }//GEN-LAST:event_Botton18MouseClicked

    private void Botton19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton19MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton19MouseClicked

    private void Botton20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton20MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton20MouseClicked

    private void Botton21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton21MouseClicked

        //   if(a==1 ){Botton1.setBackground(Color.GREEN);a=0;}else{Botton1.setBackground(Color.red);a=1;}

    }//GEN-LAST:event_Botton21MouseClicked

    private void Botton22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton22MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton22MouseClicked

    private void Botton23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton23MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton23MouseClicked

    private void Botton24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton24MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton24MouseClicked

    private void Botton25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton25MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton25MouseClicked

    private void Botton26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton26MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton26MouseClicked

    private void Botton27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton27MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton27MouseClicked

    private void Botton28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton28MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton28MouseClicked

    private void Botton29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton29MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton29MouseClicked

    private void Botton30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton30MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton30MouseClicked

    private void Botton31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton31MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton31MouseClicked

    private void Botton32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton32MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton32MouseClicked

    private void Botton33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton33MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton33MouseClicked

    private void Botton34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton34MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton34MouseClicked

    private void Botton35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton35MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton35MouseClicked

    private void Botton36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton36MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton36MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked

        todosBotones();
        if (marca3 == 1) {
            Botton3.setBackground(Color.GREEN);
            marca3 = 0;
        } else {
            Botton3.setBackground(Color.red);
            marca3 = 1;
        }
        id_producto = 1;
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        todosBotones();
        if (marca4 == 1) {
            Botton4.setBackground(Color.GREEN);
            marca4 = 0;
        } else {
            Botton4.setBackground(Color.red);
            marca4 = 1;
        }
        id_producto = 2;
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        todosBotones();
        if (marca5 == 1) {
            Botton5.setBackground(Color.GREEN);
            marca5 = 0;
        } else {
            Botton5.setBackground(Color.red);
            marca5 = 1;
        }
        id_producto = 3;
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        todosBotones();
        if (marca6 == 1) {
            Botton6.setBackground(Color.GREEN);
            marca6 = 0;
        } else {
            Botton6.setBackground(Color.red);
            marca6 = 1;
        }
        id_producto = 4;
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        todosBotones();
        if (marca7 == 1) {
            Botton7.setBackground(Color.GREEN);
            marca7 = 0;
        } else {
            Botton7.setBackground(Color.red);
            marca7 = 1;
        }
        id_producto = 5;
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        todosBotones();
        if (marca8 == 1) {
            Botton8.setBackground(Color.GREEN);
            marca8 = 0;
        } else {
            Botton8.setBackground(Color.red);
            marca8 = 1;
        }
        id_producto = 6;
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        todosBotones();
        if (marca9 == 1) {
            Botton9.setBackground(Color.GREEN);
            marca9 = 0;
        } else {
            Botton9.setBackground(Color.red);
            marca9 = 1;
        }
        id_producto = 7;
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        todosBotones();

        if (marca10 == 1) {
            Botton10.setBackground(Color.GREEN);
            marca10 = 0;
        } else {
            Botton10.setBackground(Color.red);
            marca10 = 1;
        }
        id_producto = 8;
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        todosBotones();
        if (marca11 == 1) {
            Botton11.setBackground(Color.GREEN);
            marca11 = 0;
        } else {
            Botton11.setBackground(Color.red);
            marca11 = 1;
        }
        id_producto = 9;
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        todosBotones();
        if (marca12 == 1) {
            Botton12.setBackground(Color.GREEN);
            marca12 = 0;
        } else {
            Botton12.setBackground(Color.red);
            marca12 = 1;
        }
        id_producto = 10;
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        todosBotones();
        if (marca13 == 1) {
            Botton13.setBackground(Color.GREEN);
            marca13 = 0;
        } else {
            Botton13.setBackground(Color.red);
            marca13 = 1;
        }
        id_producto = 11;
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        todosBotones();
        if (marca14 == 1) {
            Botton14.setBackground(Color.GREEN);
            marca14 = 0;
        } else {
            Botton14.setBackground(Color.red);
            marca14 = 1;
        }
        id_producto = 12;
    }//GEN-LAST:event_jLabel15MouseClicked

    private void SalPequeñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalPequeñaMouseClicked

        if (marca15 == 0) {
            Botton15.setBackground(Color.GREEN);
            marca15 = 1;
            Num.add(52);
        } else {
            Botton15.setBackground(Color.red);
            marca15 = 0;
            int remov = Num.indexOf(52);
            Num.remove(remov);
            
        }
        SalPequeña.setText(String.valueOf(marca15));
        
    }//GEN-LAST:event_SalPequeñaMouseClicked

    private void ChoriBremenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChoriBremenMouseClicked
        if (marca16 == 0) {
            Botton16.setBackground(Color.GREEN);
            marca16 = 1;
            Num.add(53);
        } else {
            Botton16.setBackground(Color.red);
            marca16 = 0;
            int remov = Num.indexOf(53);
            Num.remove(remov);
        }
        ChoriBremen.setText(String.valueOf(marca16));

    }//GEN-LAST:event_ChoriBremenMouseClicked

    private void Extra3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Extra3MouseClicked
        if (marca17 == 0) {
            Botton17.setBackground(Color.GREEN);
            marca17 = 1;
            Num.add(54);
        } else {
            Botton17.setBackground(Color.red);
            marca17 = 0;
            int remov = Num.indexOf(54);
            Num.remove(remov);
        }
        Extra3.setText(String.valueOf(marca17));
    }//GEN-LAST:event_Extra3MouseClicked

    private void Extra4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Extra4MouseClicked
        if (marca18 == 0) {
            Botton18.setBackground(Color.GREEN);
            marca18 = 1;
            Num.add(55);
        } else {
            Botton18.setBackground(Color.red);
            marca18 = 0;
            int remov = Num.indexOf(55);
            Num.remove(remov);
        }
        Extra4.setText(String.valueOf(marca18));
    }//GEN-LAST:event_Extra4MouseClicked

    private void SAlchiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SAlchiMouseClicked
        if (marca19 == 0) {
            Botton19.setBackground(Color.GREEN);
            marca19 = 1;
            Num.add(56);
        } else {
            Botton19.setBackground(Color.red);
            marca19 = 0;
            int remov = Num.indexOf(56);
            Num.remove(remov);
        }
        SAlchi.setText(String.valueOf(marca19));
    }//GEN-LAST:event_SAlchiMouseClicked

    private void Extra6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Extra6MouseClicked
        if (marca20 == 0) {
            Botton20.setBackground(Color.GREEN);
            marca20 = 1;
            Num.add(57);
        } else {
            Botton20.setBackground(Color.red);
            marca20 = 0;
           int remov = Num.indexOf(57);
            Num.remove(remov);
        }
        Extra6.setText(String.valueOf(marca20));
    }//GEN-LAST:event_Extra6MouseClicked

    private void Extra7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Extra7MouseClicked
        if (marca21 == 0) {
            Botton21.setBackground(Color.GREEN);
            marca21 = 1;
            Num.add(58);
        } else {
            Botton21.setBackground(Color.red);
            marca21 = 0;
           int remov = Num.indexOf(58);
            Num.remove(remov);
        }
        Extra7.setText(String.valueOf(marca21));
    }//GEN-LAST:event_Extra7MouseClicked

    private void ChoAhumadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChoAhumadoMouseClicked
        if (marca22 == 0) {
            Botton22.setBackground(Color.GREEN);
            marca22 = 1;
            Num.add(59);
        } else {
            Botton22.setBackground(Color.red);
            marca22 = 0;
            int remov = Num.indexOf(59);
            Num.remove(remov);
        }
        ChoAhumado.setText(String.valueOf(marca22));
    }//GEN-LAST:event_ChoAhumadoMouseClicked

    private void ChoArgentiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChoArgentiMouseClicked
        if (marca23 == 0) {
            Botton23.setBackground(Color.GREEN);
            marca23 = 1;
            Num.add(60);
        } else {
            Botton23.setBackground(Color.red);
            marca23 = 0;
            int remov = Num.indexOf(60);
            Num.remove(remov);
        }
        ChoArgenti.setText(String.valueOf(marca23));
    }//GEN-LAST:event_ChoArgentiMouseClicked

    private void Extra10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Extra10MouseClicked
        if (marca24 == 0) {
            Botton24.setBackground(Color.GREEN);
            marca24 = 1;
            Num.add(61);
        } else {
            Botton24.setBackground(Color.red);
            marca24 = 0;
            int remov = Num.indexOf(61);
            Num.remove(remov);
        }
        Extra10.setText(String.valueOf(marca24));
    }//GEN-LAST:event_Extra10MouseClicked

    private void Extra11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Extra11MouseClicked
        if (marca25 == 0) {
            Botton25.setBackground(Color.GREEN);
            marca25 = 1;
            Num.add(62);
        } else {
            Botton25.setBackground(Color.red);
            marca25 = 0;
            int remov = Num.indexOf(62);
            Num.remove(remov);
        }
        Extra11.setText(String.valueOf(marca25));
    }//GEN-LAST:event_Extra11MouseClicked

    private void PorciGuacaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PorciGuacaMouseClicked
        if (marca26 == 0) {
            Botton26.setBackground(Color.GREEN);
            marca26 = 1;
            Num.add(63);
        } else {
            Botton26.setBackground(Color.red);
            marca26 = 0;
            int remov = Num.indexOf(63);
            Num.remove(remov);
        }
        PorciGuaca.setText(String.valueOf(marca26));
    }//GEN-LAST:event_PorciGuacaMouseClicked

    private void PorciMayonesaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PorciMayonesaMouseClicked
        if (marca27 == 0) {
            Botton27.setBackground(Color.GREEN);
            marca27 = 1;
            Num.add(64);
        } else {
            Botton27.setBackground(Color.red);
            marca27 = 0;
            int remov = Num.indexOf(64);
            Num.remove(remov);
        }
        PorciMayonesa.setText(String.valueOf(marca27));
    }//GEN-LAST:event_PorciMayonesaMouseClicked

    private void Extra14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Extra14MouseClicked
        if (marca28 == 0) {
            Botton28.setBackground(Color.GREEN);
            marca28 = 1;
            Num.add(65);
        } else {
            Botton28.setBackground(Color.red);
            marca28 = 0;
            int remov = Num.indexOf(65);
            Num.remove(remov);
        }
        Extra14.setText(String.valueOf(marca28));
    }//GEN-LAST:event_Extra14MouseClicked

    private void QuesoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuesoMouseClicked
        
        
        if (marca29 == 0) {
            Botton29.setBackground(Color.GREEN);
            marca29 = 1;
            Num.add(66);
        } else {
            Botton29.setBackground(Color.red);
            marca29 = 0;
            int remov = Num.indexOf(66);
            Num.remove(remov);
           
        }
        Queso.setText(String.valueOf(marca29));
    }//GEN-LAST:event_QuesoMouseClicked

    private void ChoAhumadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ChoAhumadoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_ChoAhumadoKeyReleased

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
       if (sin1 == 0) {
            Botton30.setBackground(Color.GREEN);
            sin1 = 1;
            NumSin.add(1);
            bloquear(true);
        } else {
            Botton30.setBackground(Color.red);
            sin1 = 0;
            int remov = NumSin.indexOf(1);
            NumSin.remove(remov);
            bloquear(false);
            
        }
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
     if (sin2 == 0) {
            Botton31.setBackground(Color.GREEN);
            sin2 = 1;
            NumSin.add(2);
        } else {
            Botton31.setBackground(Color.red);
            sin2 = 0;
            int remov = NumSin.indexOf(2);
            NumSin.remove(remov);
            
        }
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
       if (sin3 == 0) {
            Botton32.setBackground(Color.GREEN);
            sin3 = 1;
            NumSin.add(3);
        } else {
            Botton32.setBackground(Color.red);
            sin3 = 0;
            int remov = NumSin.indexOf(3);
            NumSin.remove(remov);
            
        }
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
      if (sin4 == 0) {
            Botton33.setBackground(Color.GREEN);
            sin4 = 1;
            NumSin.add(4);
        } else {
            Botton33.setBackground(Color.red);
            sin4 = 0;
            int remov = NumSin.indexOf(4);
            NumSin.remove(remov);
            
        }
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        if (sin5 == 0) {
            Botton34.setBackground(Color.GREEN);
            sin5 = 1;
            NumSin.add(5);
        } else {
            Botton34.setBackground(Color.red);
            sin5 = 0;
            int remov = NumSin.indexOf(5);
            NumSin.remove(remov);
            
        }
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        if (sin6 == 0) {
            Botton35.setBackground(Color.GREEN);
            sin6 = 1;
            NumSin.add(6);
        } else {
            Botton35.setBackground(Color.red);
            sin6 = 0;
            int remov = NumSin.indexOf(6);
            NumSin.remove(remov);
            
        }
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
       int suma =Integer.parseInt(cantidad.getText());
       suma = suma +1;
        cantidad.setText(String.valueOf(suma));
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
       
        if(Integer.parseInt(cantidad.getText())!=1){
        int resta =Integer.parseInt(cantidad.getText());
       resta = resta -1;
        cantidad.setText(String.valueOf(resta));
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
            
            if (pan == 1) {
                Botton1.setBackground(Color.GREEN);
                Botton2.setBackground(Color.RED);
            } 
        System.out.println("QUE ES "+pan);
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
            System.out.println("ENTRA 0");
            if (pan == 0) {
                Botton1.setBackground(Color.RED);
                Botton2.setBackground(Color.GREEN);
            } 
        System.out.println("QUE ES "+pan);
    }//GEN-LAST:event_jLabel24MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Clases.PanelRound BotonAgregar;
    private Clases.PanelRound Botton1;
    private Clases.PanelRound Botton10;
    private Clases.PanelRound Botton11;
    private Clases.PanelRound Botton12;
    private Clases.PanelRound Botton13;
    private Clases.PanelRound Botton14;
    private Clases.PanelRound Botton15;
    private Clases.PanelRound Botton16;
    private Clases.PanelRound Botton17;
    private Clases.PanelRound Botton18;
    private Clases.PanelRound Botton19;
    private Clases.PanelRound Botton2;
    private Clases.PanelRound Botton20;
    private Clases.PanelRound Botton21;
    private Clases.PanelRound Botton22;
    private Clases.PanelRound Botton23;
    private Clases.PanelRound Botton24;
    private Clases.PanelRound Botton25;
    private Clases.PanelRound Botton26;
    private Clases.PanelRound Botton27;
    private Clases.PanelRound Botton28;
    private Clases.PanelRound Botton29;
    private Clases.PanelRound Botton3;
    private Clases.PanelRound Botton30;
    private Clases.PanelRound Botton31;
    private Clases.PanelRound Botton32;
    private Clases.PanelRound Botton33;
    private Clases.PanelRound Botton34;
    private Clases.PanelRound Botton35;
    private Clases.PanelRound Botton36;
    private Clases.PanelRound Botton4;
    private Clases.PanelRound Botton5;
    private Clases.PanelRound Botton6;
    private Clases.PanelRound Botton7;
    private Clases.PanelRound Botton8;
    private Clases.PanelRound Botton9;
    private javax.swing.JLabel ChoAhumado;
    private javax.swing.JLabel ChoArgenti;
    private javax.swing.JLabel ChoriBremen;
    private javax.swing.JLabel Extra10;
    private javax.swing.JLabel Extra11;
    private javax.swing.JLabel Extra14;
    private javax.swing.JLabel Extra3;
    private javax.swing.JLabel Extra4;
    private javax.swing.JLabel Extra6;
    private javax.swing.JLabel Extra7;
    private javax.swing.JLabel P;
    private javax.swing.JLabel PorciGuaca;
    private javax.swing.JLabel PorciMayonesa;
    private javax.swing.JLabel Queso;
    private javax.swing.JLabel SAlchi;
    private javax.swing.JLabel SalPequeña;
    private javax.swing.JTextField cantidad;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables

    
}
