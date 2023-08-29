/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package INICIO;

import static INICIO.Principal.ListarProductosPedidos;
import clas.BDConexion;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author jluis
 */
public class Opcion61 extends javax.swing.JPanel {
    int marca1 = 0;   
    int marca2 = 0;    
    int marca3 = 0;  
    int marca4 = 0;
    int marca5 = 0;
    int marca6 = 0;
    int marca7 = 0;
    int marca8 = 0;
    int marca9 = 0;
    int marca10 = 0;
    int marca11 = 0;
    int marca12 = 0;
    int marca13 = 0;
    int marca14 = 0;
    int marca15 = 0;
    
    
    int id_pedido = 0;
    ArrayList<Integer> Num = new ArrayList<>();
    Color Botrojo = new Color(153,204,255); 
    Color Botverde = new Color(0,204,0);
    /**
     * Creates new form Opcion5
     */
    public Opcion61(int a) {
        initComponents();
         this.id_pedido=a;
        String texto1 = "<html><center><body>GASEOSA<br>VIDRIO NORMAL<br><font color='RED'>Q7.00</font></body></center></html>";
        UNO.setText(texto1);
        String texto2 = "<html><center><body>GASEOSA<br>VIDRIO O DESCHABLE GRANDE<br><font color='RED'>Q10.00</font></body></center></html>";
        DOS.setText(texto2);
        String texto3 = "<html><center><body>GASEOSA<br>DESECHABLE O LATA PEQUEÑA<br><font color='RED'>Q7.00</font></body></center></html>";
        TRES.setText(texto3);
        String texto4 = "<html><center><body>POWERADES<br><font color='RED'>Q10.00</font></body></center></html>";
        CUATRO.setText(texto4);
        String texto5 = "<html><center><body>TE FRIO<br><font color='RED'>Q10.00</font></body></center></html>";
        CINCO.setText(texto5);
        String texto6 = "<html><center><body>TE CALIENTE<br><font color='RED'>Q7.00</font></body></center></html>";
        SEIS.setText(texto6);
        String texto7 = "<html><center><body>CAFE 8onz<br><font color='RED'>Q7.00</font></body></center></html>";
        SIETE.setText(texto7);
        String texto8 = "<html><center><body>CAFE 12onz<br><font color='RED'>Q10.00</font></body></center></html>";
        OCHO.setText(texto8);
         String texto9 = "<html><center><body>CHOCOLATE 8onz<br><font color='RED'>Q9.00</font></body></center></html>";
        NUEVE.setText(texto9);
         String texto10 = "<html><center><body>CHOLATE 12onzO<br><font color='RED'>Q12.00</font></body></center></html>";
        DIES.setText(texto10);
        String texto11 = "<html><center><body>COCA COLA<br>FAMILIAR 2.5L<br><font color='RED'>Q26.00</font></body></center></html>";
        ONCE.setText(texto11);
        String texto12 = "<html><center><body>AGUA PURA<br><font color='RED'>Q5.00</font></body></center></html>";
        DOCE.setText(texto12);
      
    }

    private void Limpiar() {
      
        Botton1.setBackground(Botrojo);
        Botton2.setBackground(Botrojo);
        Botton3.setBackground(Botrojo);
        Botton4.setBackground(Botrojo);
        Botton5.setBackground(Botrojo);
        Botton6.setBackground(Botrojo);
        Botton8.setBackground(Botrojo);
        Botton7.setBackground(Botrojo);
        Botton9.setBackground(Botrojo);
        Botton11.setBackground(Botrojo);
        Botton10.setBackground(Botrojo);
        Botton12.setBackground(Botrojo);
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
        Num.clear();
        cantidad.setText("1");
    }
    
     private void insertarGaseosas(){

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
    Limpiar();
}
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        cantidad = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        BotonAgregar = new Clases.PanelRound();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Botton1 = new Clases.PanelRound();
        UNO = new javax.swing.JLabel();
        Botton2 = new Clases.PanelRound();
        DOS = new javax.swing.JLabel();
        Botton3 = new Clases.PanelRound();
        TRES = new javax.swing.JLabel();
        Botton4 = new Clases.PanelRound();
        CUATRO = new javax.swing.JLabel();
        Botton5 = new Clases.PanelRound();
        CINCO = new javax.swing.JLabel();
        Botton6 = new Clases.PanelRound();
        SEIS = new javax.swing.JLabel();
        Botton7 = new Clases.PanelRound();
        OCHO = new javax.swing.JLabel();
        Botton8 = new Clases.PanelRound();
        SIETE = new javax.swing.JLabel();
        Botton9 = new Clases.PanelRound();
        NUEVE = new javax.swing.JLabel();
        Botton10 = new Clases.PanelRound();
        DIES = new javax.swing.JLabel();
        Botton11 = new Clases.PanelRound();
        ONCE = new javax.swing.JLabel();
        Botton12 = new Clases.PanelRound();
        DOCE = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 153));
        setPreferredSize(new java.awt.Dimension(730, 690));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ARRIBA.png"))); // NOI18N
        jButton2.setPreferredSize(new java.awt.Dimension(40, 47));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, -1, -1));

        cantidad.setEditable(false);
        cantidad.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        cantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cantidad.setText("1");
        add(cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 460, 50, 28));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ABAJO.png"))); // NOI18N
        jButton1.setPreferredSize(new java.awt.Dimension(40, 47));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, -1, -1));

        BotonAgregar.setBackground(new java.awt.Color(255, 153, 153));
        BotonAgregar.setPreferredSize(new java.awt.Dimension(136, 60));
        BotonAgregar.setRoundBottomLeft(20);
        BotonAgregar.setRoundBottomRight(20);
        BotonAgregar.setRoundTopLeft(20);
        BotonAgregar.setRoundTopRight(20);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
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
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        BotonAgregarLayout.setVerticalGroup(
            BotonAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        add(BotonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, 120, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));

        Botton1.setBackground(new java.awt.Color(153, 204, 255));
        Botton1.setPreferredSize(new java.awt.Dimension(136, 60));
        Botton1.setRoundBottomLeft(15);
        Botton1.setRoundBottomRight(15);
        Botton1.setRoundTopLeft(15);
        Botton1.setRoundTopRight(15);
        Botton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton1MouseClicked(evt);
            }
        });

        UNO.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        UNO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UNO.setText("vidrio normal");
        UNO.setToolTipText("");
        UNO.setName("SALCHICHA PEQUEÑA"); // NOI18N
        UNO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UNOMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton1Layout = new javax.swing.GroupLayout(Botton1);
        Botton1.setLayout(Botton1Layout);
        Botton1Layout.setHorizontalGroup(
            Botton1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UNO, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
        );
        Botton1Layout.setVerticalGroup(
            Botton1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UNO, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        Botton2.setBackground(new java.awt.Color(153, 204, 255));
        Botton2.setPreferredSize(new java.awt.Dimension(136, 60));
        Botton2.setRoundBottomLeft(15);
        Botton2.setRoundBottomRight(15);
        Botton2.setRoundTopLeft(15);
        Botton2.setRoundTopRight(15);
        Botton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton2MouseClicked(evt);
            }
        });

        DOS.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        DOS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DOS.setText("vidrio/DESECHABLE grande");
        DOS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DOSMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton2Layout = new javax.swing.GroupLayout(Botton2);
        Botton2.setLayout(Botton2Layout);
        Botton2Layout.setHorizontalGroup(
            Botton2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DOS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Botton2Layout.setVerticalGroup(
            Botton2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DOS, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        Botton3.setBackground(new java.awt.Color(153, 204, 255));
        Botton3.setPreferredSize(new java.awt.Dimension(136, 60));
        Botton3.setRoundBottomLeft(15);
        Botton3.setRoundBottomRight(15);
        Botton3.setRoundTopLeft(15);
        Botton3.setRoundTopRight(15);
        Botton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton3MouseClicked(evt);
            }
        });

        TRES.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        TRES.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TRES.setText("DESECHABLE normal");
        TRES.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TRESMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton3Layout = new javax.swing.GroupLayout(Botton3);
        Botton3.setLayout(Botton3Layout);
        Botton3Layout.setHorizontalGroup(
            Botton3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Botton3Layout.createSequentialGroup()
                .addComponent(TRES, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Botton3Layout.setVerticalGroup(
            Botton3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TRES, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        Botton4.setBackground(new java.awt.Color(153, 204, 255));
        Botton4.setPreferredSize(new java.awt.Dimension(136, 60));
        Botton4.setRoundBottomLeft(15);
        Botton4.setRoundBottomRight(15);
        Botton4.setRoundTopLeft(15);
        Botton4.setRoundTopRight(15);
        Botton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton4MouseClicked(evt);
            }
        });

        CUATRO.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        CUATRO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CUATRO.setText("POWERADE");
        CUATRO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CUATROMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton4Layout = new javax.swing.GroupLayout(Botton4);
        Botton4.setLayout(Botton4Layout);
        Botton4Layout.setHorizontalGroup(
            Botton4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CUATRO, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
        );
        Botton4Layout.setVerticalGroup(
            Botton4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CUATRO, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        Botton5.setBackground(new java.awt.Color(153, 204, 255));
        Botton5.setPreferredSize(new java.awt.Dimension(136, 60));
        Botton5.setRoundBottomLeft(15);
        Botton5.setRoundBottomRight(15);
        Botton5.setRoundTopLeft(15);
        Botton5.setRoundTopRight(15);
        Botton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton5MouseClicked(evt);
            }
        });

        CINCO.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        CINCO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CINCO.setText("TE FRIO");
        CINCO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CINCOMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton5Layout = new javax.swing.GroupLayout(Botton5);
        Botton5.setLayout(Botton5Layout);
        Botton5Layout.setHorizontalGroup(
            Botton5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CINCO, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
        );
        Botton5Layout.setVerticalGroup(
            Botton5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CINCO, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        Botton6.setBackground(new java.awt.Color(153, 204, 255));
        Botton6.setPreferredSize(new java.awt.Dimension(136, 60));
        Botton6.setRoundBottomLeft(15);
        Botton6.setRoundBottomRight(15);
        Botton6.setRoundTopLeft(15);
        Botton6.setRoundTopRight(15);
        Botton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton6MouseClicked(evt);
            }
        });

        SEIS.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        SEIS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SEIS.setText("TE CALIENTE");
        SEIS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SEISMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton6Layout = new javax.swing.GroupLayout(Botton6);
        Botton6.setLayout(Botton6Layout);
        Botton6Layout.setHorizontalGroup(
            Botton6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SEIS, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
        );
        Botton6Layout.setVerticalGroup(
            Botton6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SEIS, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        Botton7.setBackground(new java.awt.Color(153, 204, 255));
        Botton7.setPreferredSize(new java.awt.Dimension(136, 60));
        Botton7.setRoundBottomLeft(15);
        Botton7.setRoundBottomRight(15);
        Botton7.setRoundTopLeft(15);
        Botton7.setRoundTopRight(15);
        Botton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton7MouseClicked(evt);
            }
        });

        OCHO.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        OCHO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        OCHO.setText("cafe 12 onz");
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

        javax.swing.GroupLayout Botton7Layout = new javax.swing.GroupLayout(Botton7);
        Botton7.setLayout(Botton7Layout);
        Botton7Layout.setHorizontalGroup(
            Botton7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OCHO, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
        );
        Botton7Layout.setVerticalGroup(
            Botton7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OCHO, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        Botton8.setBackground(new java.awt.Color(153, 204, 255));
        Botton8.setPreferredSize(new java.awt.Dimension(136, 60));
        Botton8.setRoundBottomLeft(15);
        Botton8.setRoundBottomRight(15);
        Botton8.setRoundTopLeft(15);
        Botton8.setRoundTopRight(15);
        Botton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton8MouseClicked(evt);
            }
        });

        SIETE.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        SIETE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SIETE.setText("cafe 8 onz");
        SIETE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SIETEMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton8Layout = new javax.swing.GroupLayout(Botton8);
        Botton8.setLayout(Botton8Layout);
        Botton8Layout.setHorizontalGroup(
            Botton8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SIETE, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
        );
        Botton8Layout.setVerticalGroup(
            Botton8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SIETE, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        Botton9.setBackground(new java.awt.Color(153, 204, 255));
        Botton9.setPreferredSize(new java.awt.Dimension(136, 60));
        Botton9.setRoundBottomLeft(15);
        Botton9.setRoundBottomRight(15);
        Botton9.setRoundTopLeft(15);
        Botton9.setRoundTopRight(15);
        Botton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton9MouseClicked(evt);
            }
        });

        NUEVE.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        NUEVE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NUEVE.setText("chocolate 8 onz");
        NUEVE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NUEVEMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton9Layout = new javax.swing.GroupLayout(Botton9);
        Botton9.setLayout(Botton9Layout);
        Botton9Layout.setHorizontalGroup(
            Botton9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(NUEVE, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
        );
        Botton9Layout.setVerticalGroup(
            Botton9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(NUEVE, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        Botton10.setBackground(new java.awt.Color(153, 204, 255));
        Botton10.setPreferredSize(new java.awt.Dimension(136, 60));
        Botton10.setRoundBottomLeft(15);
        Botton10.setRoundBottomRight(15);
        Botton10.setRoundTopLeft(15);
        Botton10.setRoundTopRight(15);
        Botton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton10MouseClicked(evt);
            }
        });

        DIES.setBackground(new java.awt.Color(153, 204, 255));
        DIES.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        DIES.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DIES.setText("chocolate 12 onz");
        DIES.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DIESMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton10Layout = new javax.swing.GroupLayout(Botton10);
        Botton10.setLayout(Botton10Layout);
        Botton10Layout.setHorizontalGroup(
            Botton10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Botton10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(DIES, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Botton10Layout.setVerticalGroup(
            Botton10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Botton10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(DIES, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Botton11.setBackground(new java.awt.Color(153, 204, 255));
        Botton11.setPreferredSize(new java.awt.Dimension(136, 60));
        Botton11.setRoundBottomLeft(15);
        Botton11.setRoundBottomRight(15);
        Botton11.setRoundTopLeft(15);
        Botton11.setRoundTopRight(15);
        Botton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton11MouseClicked(evt);
            }
        });

        ONCE.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        ONCE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ONCE.setText("COCA 2.5");
        ONCE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ONCEMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton11Layout = new javax.swing.GroupLayout(Botton11);
        Botton11.setLayout(Botton11Layout);
        Botton11Layout.setHorizontalGroup(
            Botton11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Botton11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ONCE, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                .addContainerGap())
        );
        Botton11Layout.setVerticalGroup(
            Botton11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ONCE, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        Botton12.setBackground(new java.awt.Color(153, 204, 255));
        Botton12.setPreferredSize(new java.awt.Dimension(136, 60));
        Botton12.setRoundBottomLeft(15);
        Botton12.setRoundBottomRight(15);
        Botton12.setRoundTopLeft(15);
        Botton12.setRoundTopRight(15);
        Botton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton12MouseClicked(evt);
            }
        });

        DOCE.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        DOCE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DOCE.setText("AGUA PURA");
        DOCE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DOCEMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton12Layout = new javax.swing.GroupLayout(Botton12);
        Botton12.setLayout(Botton12Layout);
        Botton12Layout.setHorizontalGroup(
            Botton12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Botton12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DOCE, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                .addContainerGap())
        );
        Botton12Layout.setVerticalGroup(
            Botton12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DOCE, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Botton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(Botton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(Botton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Botton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(Botton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(Botton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Botton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(Botton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(Botton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Botton10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Botton11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Botton12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Botton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Botton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Botton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Botton10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botton11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botton12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 420, 270));
    }// </editor-fold>//GEN-END:initComponents

    private void UNOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UNOMouseClicked

        if (marca1 == 0) {
            Botton1.setBackground(Botverde);
            marca1 = 1;
            Num.add(25);
        } else {
            Botton1.setBackground(Botrojo);
            marca1 = 0;
            int remov = Num.indexOf(25);
            Num.remove(remov);

        }

    }//GEN-LAST:event_UNOMouseClicked

    private void Botton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton1MouseClicked

    private void DOSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DOSMouseClicked
        if (marca2 == 0) {
            Botton2.setBackground(Botverde);
            marca2 = 1;
            Num.add(26);
        } else {
            Botton2.setBackground(Botrojo);
            marca2 = 0;
            int remov = Num.indexOf(26);
            Num.remove(remov);
        }
    }//GEN-LAST:event_DOSMouseClicked

    private void Botton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton2MouseClicked

    private void TRESMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TRESMouseClicked
        if (marca3 == 0) {
            Botton3.setBackground(Botverde);
            marca3 = 1;
            Num.add(27);
        } else {
            Botton3.setBackground(Botrojo);
            marca3 = 0;
            int remov = Num.indexOf(27);
            Num.remove(remov);
        }
    }//GEN-LAST:event_TRESMouseClicked

    private void Botton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton3MouseClicked

    private void CUATROMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CUATROMouseClicked
        if (marca4 == 0) {
            Botton4.setBackground(Botverde);
            marca4 = 1;
            Num.add(28);
        } else {
            Botton4.setBackground(Botrojo);
            marca4 = 0;
            int remov = Num.indexOf(28);
            Num.remove(remov);
        }
    }//GEN-LAST:event_CUATROMouseClicked

    private void Botton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton4MouseClicked
        if (marca15 == 1) {
            Botton1.setBackground(Botverde);
            marca15 = 0;
        } else {
            Botton1.setBackground(Botrojo);
            marca15 = 1;

        }
    }//GEN-LAST:event_Botton4MouseClicked

    private void CINCOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CINCOMouseClicked
        if (marca5 == 0) {
            Botton5.setBackground(Botverde);
            marca5 = 1;
            Num.add(29);
        } else {
            Botton5.setBackground(Botrojo);
            marca5 = 0;
            int remov = Num.indexOf(29);
            Num.remove(remov);
        }
    }//GEN-LAST:event_CINCOMouseClicked

    private void Botton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton5MouseClicked

    private void SEISMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SEISMouseClicked
        if (marca6 == 0) {
            Botton6.setBackground(Botverde);
            marca6 = 1;
            Num.add(35);
        } else {
            Botton6.setBackground(Botrojo);
            marca6 = 0;
            int remov = Num.indexOf(35);
            Num.remove(remov);
        }
    }//GEN-LAST:event_SEISMouseClicked

    private void Botton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton6MouseClicked

    private void SIETEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SIETEMouseClicked
        if (marca7 == 0) {
            Botton8.setBackground(Botverde);
            marca7 = 1;
            Num.add(32);
        } else {
            Botton8.setBackground(Botrojo);
            marca7 = 0;
            int remov = Num.indexOf(32);
            Num.remove(remov);
        }
    }//GEN-LAST:event_SIETEMouseClicked

    private void Botton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton8MouseClicked

        //   if(a==1 ){Botton1.setBackground(Botverde);a=0;}else{Botton1.setBackground(c);a=1;}
    }//GEN-LAST:event_Botton8MouseClicked

    private void OCHOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OCHOMouseClicked
        if (marca8 == 0) {
            Botton7.setBackground(Botverde);
            marca8 = 1;
            Num.add(33);
        } else {
            Botton7.setBackground(Botrojo);
            marca8 = 0;
            int remov = Num.indexOf(33);
            Num.remove(remov);
        }
    }//GEN-LAST:event_OCHOMouseClicked

    private void OCHOKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_OCHOKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_OCHOKeyReleased

    private void Botton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton7MouseClicked

    private void NUEVEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NUEVEMouseClicked
        if (marca9 == 0) {
            Botton9.setBackground(Botverde);
            marca9 = 1;
            Num.add(30);
        } else {
            Botton9.setBackground(Botrojo);
            marca9 = 0;
            int remov = Num.indexOf(30);
            Num.remove(remov);
        }
    }//GEN-LAST:event_NUEVEMouseClicked

    private void Botton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton9MouseClicked

    private void ONCEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ONCEMouseClicked
        if (marca11 == 0) {
            Botton11.setBackground(Botverde);
            marca11 = 1;
            Num.add(36);
        } else {
            Botton11.setBackground(Botrojo);
            marca11 = 0;
            int remov = Num.indexOf(36);
            Num.remove(remov);
        }
    }//GEN-LAST:event_ONCEMouseClicked

    private void Botton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton10MouseClicked

    private void DIESMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DIESMouseClicked
        if (marca10 == 0) {
            Botton10.setBackground(Botverde);
            marca10 = 1;
            Num.add(31);
        } else {
            Botton10.setBackground(Botrojo);
            marca10 = 0;
            int remov = Num.indexOf(31);
            Num.remove(remov);
        }
    }//GEN-LAST:event_DIESMouseClicked

    private void Botton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton11MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton11MouseClicked

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        if(Num.size()!=0){
            insertarGaseosas();
            ListarProductosPedidos();
        }else{JOptionPane.showMessageDialog(null, "SELECCIONAR UNA OPCION...");}
    }//GEN-LAST:event_jLabel3MouseClicked

    private void DOCEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DOCEMouseClicked
        if (marca6 == 0) {
            Botton12.setBackground(Botverde);
            marca6 = 1;
            Num.add(34);
        } else {
            Botton12.setBackground(Botrojo);
            marca12 = 0;
            int remov = Num.indexOf(34);
            Num.remove(remov);
        }
    }//GEN-LAST:event_DOCEMouseClicked

    private void Botton12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton12MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton12MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Clases.PanelRound BotonAgregar;
    private Clases.PanelRound Botton1;
    private Clases.PanelRound Botton10;
    private Clases.PanelRound Botton11;
    private Clases.PanelRound Botton12;
    private Clases.PanelRound Botton2;
    private Clases.PanelRound Botton3;
    private Clases.PanelRound Botton4;
    private Clases.PanelRound Botton5;
    private Clases.PanelRound Botton6;
    private Clases.PanelRound Botton7;
    private Clases.PanelRound Botton8;
    private Clases.PanelRound Botton9;
    private javax.swing.JLabel CINCO;
    private javax.swing.JLabel CUATRO;
    private javax.swing.JLabel DIES;
    private javax.swing.JLabel DOCE;
    private javax.swing.JLabel DOS;
    private javax.swing.JLabel NUEVE;
    private javax.swing.JLabel OCHO;
    private javax.swing.JLabel ONCE;
    private javax.swing.JLabel SEIS;
    private javax.swing.JLabel SIETE;
    private javax.swing.JLabel TRES;
    private javax.swing.JLabel UNO;
    private javax.swing.JTextField cantidad;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
