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
public class Opcion6 extends javax.swing.JPanel {
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
        String texto3 = "<html><center><body>COCA COLA<br>DIETA DESECHABLE</body></center></html>";
        CUATRO.setText(texto3);
        String texto4 = "<html><center><body>COCA COLA<br>DESECHABLE GRANDE</body></center></html>";
        CINCO.setText(texto4);
        String texto5 = "<html><center><body>COCA COLA<br>EN LATA</body></center></html>";
        SEIS.setText(texto5);
        String texto6 = "<html><center><body>FANTA UVA<br>VIDRIO</body></center></html>";
        SIETE.setText(texto6);
        String texto7 = "<html><center><body>FANTA UVA<br>DESECHABLE</body></center></html>";
        OCHO.setText(texto7);
        
         String texto8 = "<html><center><body>FANTA NARANJA<br>VIDRIO</body></center></html>";
        NUEVE.setText(texto8);
         String texto9 = "<html><center><body>FANTA NARANJA<br>DESECHABLE</body></center></html>";
        DIES.setText(texto9);
         String texto10 = "<html><center><body>COCA COLA<br>FAMILIAR 2.5L</body></center></html>";
        ONCE.setText(texto10);
         String texto11 = "<html><center><body>SPRITE<br>VIDRIO</body></center></html>";
        DOCE.setText(texto11);
         String texto12 = "<html><center><body>SPRITE<br>DESECHABLE</body></center></html>";
        TRESE.setText(texto12);
         String texto13 = "<html><center><body>MINERAL<br>VIDRIO</body></center></html>";
        CATORCE.setText(texto13);
         String texto14 = "<html><center><body>MINERAL<br>DESECHABLE</body></center></html>";
        QUINCE.setText(texto14);
         String texto15 = "<html><center><body>TE FRIO<br>DESECHABLE LIMON</body></center></html>";
        DIESISEIS.setText(texto15);
         String texto16 = "<html><center><body>TE FRIO<br>DE MELOCOTON</body></center></html>";
        DIESISIETE.setText(texto16);
         String texto17 = "<html><center><body>AGUA FRESCA<br>DESECHABLE</body></center></html>";
        DIESIOCHO.setText(texto17);
         String texto18 = "<html><center><body>FANTA ROJA<br>DESECHABLE</body></center></html>";
        DIESINUEVA.setText(texto18);
         String texto19 = "<html><center><body>POWERADE AZUL</body></center></html>";
        VEITE.setText(texto19);
        
        String texto20 = "<html><center><body>POWERADE ROJO</body></center></html>";
        VEITIUNO.setText(texto20);
         String texto21 = "<html><center><body>AGUA PURA</body></center></html>";
        VEINDOS.setText(texto21);
         String texto22 = "<html><center><body>CHOCOLATE 8 ONZ</body></center></html>";
        VEITITRES.setText(texto22);
         String texto23 = "<html><center><body>CHOCOLATE 12 ONZ</body></center></html>";
        VEITICUATRO.setText(texto23);
         String texto24 = "<html><center><body>CAFE 8 ONZ</body></center></html>";
        VEITICINCO.setText(texto24);
         String texto25 = "<html><center><body>CAFE 12 ONZ</body></center></html>";
        VEITISEIS.setText(texto25);
        String texto26 = "<html><center><body>ADICIONAL DE<br>CREMORA</body></center></html>";
        VEITISIETE.setText(texto26);
    }

    private void Limpiar() {
      
        Botton15.setBackground(Botrojo);
        Botton16.setBackground(Botrojo);
        Botton17.setBackground(Botrojo);
        Botton18.setBackground(Botrojo);
        Botton19.setBackground(Botrojo);
        Botton20.setBackground(Botrojo);
        Botton21.setBackground(Botrojo);
        Botton22.setBackground(Botrojo);
        Botton23.setBackground(Botrojo);
        Botton24.setBackground(Botrojo);
        Botton25.setBackground(Botrojo);
        Botton26.setBackground(Botrojo);
        Botton27.setBackground(Botrojo);
        Botton28.setBackground(Botrojo);
        Botton29.setBackground(Botrojo);
        Botton30.setBackground(Botrojo);
        Botton31.setBackground(Botrojo);
        Botton32.setBackground(Botrojo);
        Botton33.setBackground(Botrojo);
        Botton34.setBackground(Botrojo);
        Botton35.setBackground(Botrojo);
        Botton36.setBackground(Botrojo);
        Botton37.setBackground(Botrojo);
        Botton38.setBackground(Botrojo);
        Botton39.setBackground(Botrojo);
        Botton40.setBackground(Botrojo);
        Botton41.setBackground(Botrojo);
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
        Botton15 = new Clases.PanelRound();
        UNO = new javax.swing.JLabel();
        Botton16 = new Clases.PanelRound();
        DOS = new javax.swing.JLabel();
        Botton17 = new Clases.PanelRound();
        TRES = new javax.swing.JLabel();
        Botton18 = new Clases.PanelRound();
        CUATRO = new javax.swing.JLabel();
        Botton19 = new Clases.PanelRound();
        CINCO = new javax.swing.JLabel();
        Botton20 = new Clases.PanelRound();
        SEIS = new javax.swing.JLabel();
        Botton22 = new Clases.PanelRound();
        OCHO = new javax.swing.JLabel();
        Botton21 = new Clases.PanelRound();
        SIETE = new javax.swing.JLabel();
        Botton23 = new Clases.PanelRound();
        NUEVE = new javax.swing.JLabel();
        Botton25 = new Clases.PanelRound();
        ONCE = new javax.swing.JLabel();
        Botton27 = new Clases.PanelRound();
        TRESE = new javax.swing.JLabel();
        Botton28 = new Clases.PanelRound();
        CATORCE = new javax.swing.JLabel();
        Botton29 = new Clases.PanelRound();
        QUINCE = new javax.swing.JLabel();
        Botton24 = new Clases.PanelRound();
        DIES = new javax.swing.JLabel();
        Botton26 = new Clases.PanelRound();
        DOCE = new javax.swing.JLabel();
        Botton31 = new Clases.PanelRound();
        DIESISIETE = new javax.swing.JLabel();
        Botton32 = new Clases.PanelRound();
        DIESIOCHO = new javax.swing.JLabel();
        Botton30 = new Clases.PanelRound();
        DIESISEIS = new javax.swing.JLabel();
        Botton33 = new Clases.PanelRound();
        DIESINUEVA = new javax.swing.JLabel();
        Botton34 = new Clases.PanelRound();
        VEITE = new javax.swing.JLabel();
        Botton35 = new Clases.PanelRound();
        VEITIUNO = new javax.swing.JLabel();
        Botton36 = new Clases.PanelRound();
        VEITITRES = new javax.swing.JLabel();
        Botton37 = new Clases.PanelRound();
        VEINDOS = new javax.swing.JLabel();
        Botton38 = new Clases.PanelRound();
        VEITICUATRO = new javax.swing.JLabel();
        Botton40 = new Clases.PanelRound();
        VEITICINCO = new javax.swing.JLabel();
        Botton39 = new Clases.PanelRound();
        VEITISEIS = new javax.swing.JLabel();
        Botton41 = new Clases.PanelRound();
        VEITISIETE = new javax.swing.JLabel();

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
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, -1, -1));

        cantidad.setEditable(false);
        cantidad.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        cantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cantidad.setText("1");
        add(cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, 50, 28));

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
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, -1, -1));

        BotonAgregar.setBackground(new java.awt.Color(255, 153, 153));
        BotonAgregar.setPreferredSize(new java.awt.Dimension(80, 55));
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotonAgregarLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        BotonAgregarLayout.setVerticalGroup(
            BotonAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        add(BotonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, -1, -1));

        Botton15.setBackground(new java.awt.Color(255, 102, 102));
        Botton15.setPreferredSize(new java.awt.Dimension(75, 45));
        Botton15.setRoundBottomLeft(15);
        Botton15.setRoundBottomRight(15);
        Botton15.setRoundTopLeft(15);
        Botton15.setRoundTopRight(15);
        Botton15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton15MouseClicked(evt);
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

        javax.swing.GroupLayout Botton15Layout = new javax.swing.GroupLayout(Botton15);
        Botton15.setLayout(Botton15Layout);
        Botton15Layout.setHorizontalGroup(
            Botton15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UNO, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
        );
        Botton15Layout.setVerticalGroup(
            Botton15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UNO, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        Botton16.setBackground(new java.awt.Color(255, 102, 102));
        Botton16.setPreferredSize(new java.awt.Dimension(136, 33));
        Botton16.setRoundBottomLeft(15);
        Botton16.setRoundBottomRight(15);
        Botton16.setRoundTopLeft(15);
        Botton16.setRoundTopRight(15);
        Botton16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton16MouseClicked(evt);
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

        javax.swing.GroupLayout Botton16Layout = new javax.swing.GroupLayout(Botton16);
        Botton16.setLayout(Botton16Layout);
        Botton16Layout.setHorizontalGroup(
            Botton16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DOS, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
        );
        Botton16Layout.setVerticalGroup(
            Botton16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DOS, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        Botton17.setBackground(new java.awt.Color(255, 102, 102));
        Botton17.setPreferredSize(new java.awt.Dimension(136, 33));
        Botton17.setRoundBottomLeft(15);
        Botton17.setRoundBottomRight(15);
        Botton17.setRoundTopLeft(15);
        Botton17.setRoundTopRight(15);
        Botton17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton17MouseClicked(evt);
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

        javax.swing.GroupLayout Botton17Layout = new javax.swing.GroupLayout(Botton17);
        Botton17.setLayout(Botton17Layout);
        Botton17Layout.setHorizontalGroup(
            Botton17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Botton17Layout.createSequentialGroup()
                .addComponent(TRES, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Botton17Layout.setVerticalGroup(
            Botton17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TRES, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        Botton18.setBackground(new java.awt.Color(255, 102, 102));
        Botton18.setPreferredSize(new java.awt.Dimension(136, 33));
        Botton18.setRoundBottomLeft(15);
        Botton18.setRoundBottomRight(15);
        Botton18.setRoundTopLeft(15);
        Botton18.setRoundTopRight(15);
        Botton18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton18MouseClicked(evt);
            }
        });

        CUATRO.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        CUATRO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CUATRO.setText("COCA DIETA");
        CUATRO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CUATROMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton18Layout = new javax.swing.GroupLayout(Botton18);
        Botton18.setLayout(Botton18Layout);
        Botton18Layout.setHorizontalGroup(
            Botton18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CUATRO, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
        );
        Botton18Layout.setVerticalGroup(
            Botton18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CUATRO, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        Botton19.setBackground(new java.awt.Color(255, 102, 102));
        Botton19.setPreferredSize(new java.awt.Dimension(136, 33));
        Botton19.setRoundBottomLeft(15);
        Botton19.setRoundBottomRight(15);
        Botton19.setRoundTopLeft(15);
        Botton19.setRoundTopRight(15);
        Botton19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton19MouseClicked(evt);
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

        javax.swing.GroupLayout Botton19Layout = new javax.swing.GroupLayout(Botton19);
        Botton19.setLayout(Botton19Layout);
        Botton19Layout.setHorizontalGroup(
            Botton19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CINCO, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
        );
        Botton19Layout.setVerticalGroup(
            Botton19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CINCO, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        Botton20.setBackground(new java.awt.Color(255, 102, 102));
        Botton20.setPreferredSize(new java.awt.Dimension(136, 33));
        Botton20.setRoundBottomLeft(15);
        Botton20.setRoundBottomRight(15);
        Botton20.setRoundTopLeft(15);
        Botton20.setRoundTopRight(15);
        Botton20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton20MouseClicked(evt);
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

        javax.swing.GroupLayout Botton20Layout = new javax.swing.GroupLayout(Botton20);
        Botton20.setLayout(Botton20Layout);
        Botton20Layout.setHorizontalGroup(
            Botton20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SEIS, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
        );
        Botton20Layout.setVerticalGroup(
            Botton20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SEIS, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        Botton22.setBackground(new java.awt.Color(255, 102, 102));
        Botton22.setPreferredSize(new java.awt.Dimension(136, 33));
        Botton22.setRoundBottomLeft(15);
        Botton22.setRoundBottomRight(15);
        Botton22.setRoundTopLeft(15);
        Botton22.setRoundTopRight(15);
        Botton22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton22MouseClicked(evt);
            }
        });

        OCHO.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        OCHO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        OCHO.setText("FANTA DESECHABLE");
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

        javax.swing.GroupLayout Botton22Layout = new javax.swing.GroupLayout(Botton22);
        Botton22.setLayout(Botton22Layout);
        Botton22Layout.setHorizontalGroup(
            Botton22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OCHO, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
        );
        Botton22Layout.setVerticalGroup(
            Botton22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OCHO, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        Botton21.setBackground(new java.awt.Color(255, 102, 102));
        Botton21.setPreferredSize(new java.awt.Dimension(136, 33));
        Botton21.setRoundBottomLeft(15);
        Botton21.setRoundBottomRight(15);
        Botton21.setRoundTopLeft(15);
        Botton21.setRoundTopRight(15);
        Botton21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton21MouseClicked(evt);
            }
        });

        SIETE.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        SIETE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SIETE.setText("FANTA UVA");
        SIETE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SIETEMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton21Layout = new javax.swing.GroupLayout(Botton21);
        Botton21.setLayout(Botton21Layout);
        Botton21Layout.setHorizontalGroup(
            Botton21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SIETE, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
        );
        Botton21Layout.setVerticalGroup(
            Botton21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SIETE, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        Botton23.setBackground(new java.awt.Color(255, 102, 102));
        Botton23.setPreferredSize(new java.awt.Dimension(136, 33));
        Botton23.setRoundBottomLeft(15);
        Botton23.setRoundBottomRight(15);
        Botton23.setRoundTopLeft(15);
        Botton23.setRoundTopRight(15);
        Botton23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton23MouseClicked(evt);
            }
        });

        NUEVE.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        NUEVE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NUEVE.setText("FANTA NARANJA");
        NUEVE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NUEVEMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton23Layout = new javax.swing.GroupLayout(Botton23);
        Botton23.setLayout(Botton23Layout);
        Botton23Layout.setHorizontalGroup(
            Botton23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(NUEVE, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
        );
        Botton23Layout.setVerticalGroup(
            Botton23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(NUEVE, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        Botton25.setBackground(new java.awt.Color(255, 102, 102));
        Botton25.setPreferredSize(new java.awt.Dimension(136, 33));
        Botton25.setRoundBottomLeft(15);
        Botton25.setRoundBottomRight(15);
        Botton25.setRoundTopLeft(15);
        Botton25.setRoundTopRight(15);
        Botton25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton25MouseClicked(evt);
            }
        });

        ONCE.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        ONCE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ONCE.setText("PAN");
        ONCE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ONCEMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton25Layout = new javax.swing.GroupLayout(Botton25);
        Botton25.setLayout(Botton25Layout);
        Botton25Layout.setHorizontalGroup(
            Botton25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ONCE, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
        );
        Botton25Layout.setVerticalGroup(
            Botton25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ONCE, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        Botton27.setBackground(new java.awt.Color(255, 102, 102));
        Botton27.setPreferredSize(new java.awt.Dimension(136, 33));
        Botton27.setRoundBottomLeft(15);
        Botton27.setRoundBottomRight(15);
        Botton27.setRoundTopLeft(15);
        Botton27.setRoundTopRight(15);
        Botton27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton27MouseClicked(evt);
            }
        });

        TRESE.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        TRESE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TRESE.setText("tortilla");
        TRESE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TRESEMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton27Layout = new javax.swing.GroupLayout(Botton27);
        Botton27.setLayout(Botton27Layout);
        Botton27Layout.setHorizontalGroup(
            Botton27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TRESE, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
        );
        Botton27Layout.setVerticalGroup(
            Botton27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TRESE, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        Botton28.setBackground(new java.awt.Color(255, 102, 102));
        Botton28.setPreferredSize(new java.awt.Dimension(136, 33));
        Botton28.setRoundBottomLeft(15);
        Botton28.setRoundBottomRight(15);
        Botton28.setRoundTopLeft(15);
        Botton28.setRoundTopRight(15);
        Botton28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton28MouseClicked(evt);
            }
        });

        CATORCE.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        CATORCE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CATORCE.setText("CEBOLLIN");
        CATORCE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CATORCEMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton28Layout = new javax.swing.GroupLayout(Botton28);
        Botton28.setLayout(Botton28Layout);
        Botton28Layout.setHorizontalGroup(
            Botton28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CATORCE, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
        );
        Botton28Layout.setVerticalGroup(
            Botton28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CATORCE, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        Botton29.setBackground(new java.awt.Color(255, 102, 102));
        Botton29.setPreferredSize(new java.awt.Dimension(136, 33));
        Botton29.setRoundBottomLeft(15);
        Botton29.setRoundBottomRight(15);
        Botton29.setRoundTopLeft(15);
        Botton29.setRoundTopRight(15);
        Botton29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton29MouseClicked(evt);
            }
        });

        QUINCE.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        QUINCE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        QUINCE.setText("jLabel30");
        QUINCE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                QUINCEMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                QUINCEMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout Botton29Layout = new javax.swing.GroupLayout(Botton29);
        Botton29.setLayout(Botton29Layout);
        Botton29Layout.setHorizontalGroup(
            Botton29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(QUINCE, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
        );
        Botton29Layout.setVerticalGroup(
            Botton29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(QUINCE, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        Botton24.setBackground(new java.awt.Color(255, 102, 102));
        Botton24.setPreferredSize(new java.awt.Dimension(136, 33));
        Botton24.setRoundBottomLeft(15);
        Botton24.setRoundBottomRight(15);
        Botton24.setRoundTopLeft(15);
        Botton24.setRoundTopRight(15);
        Botton24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton24MouseClicked(evt);
            }
        });

        DIES.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        DIES.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DIES.setText("FATA DESECHABLE");
        DIES.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DIESMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton24Layout = new javax.swing.GroupLayout(Botton24);
        Botton24.setLayout(Botton24Layout);
        Botton24Layout.setHorizontalGroup(
            Botton24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DIES, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
        );
        Botton24Layout.setVerticalGroup(
            Botton24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DIES, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        Botton26.setBackground(new java.awt.Color(255, 102, 102));
        Botton26.setPreferredSize(new java.awt.Dimension(136, 33));
        Botton26.setRoundBottomLeft(15);
        Botton26.setRoundBottomRight(15);
        Botton26.setRoundTopLeft(15);
        Botton26.setRoundTopRight(15);
        Botton26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton26MouseClicked(evt);
            }
        });

        DOCE.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        DOCE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DOCE.setText("PORCIO GUACAMOL");
        DOCE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DOCEMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton26Layout = new javax.swing.GroupLayout(Botton26);
        Botton26.setLayout(Botton26Layout);
        Botton26Layout.setHorizontalGroup(
            Botton26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DOCE, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
        );
        Botton26Layout.setVerticalGroup(
            Botton26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DOCE, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        Botton31.setBackground(new java.awt.Color(255, 102, 102));
        Botton31.setPreferredSize(new java.awt.Dimension(136, 33));
        Botton31.setRoundBottomLeft(15);
        Botton31.setRoundBottomRight(15);
        Botton31.setRoundTopLeft(15);
        Botton31.setRoundTopRight(15);
        Botton31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton31MouseClicked(evt);
            }
        });

        DIESISIETE.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        DIESISIETE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DIESISIETE.setText("CHOBREMEN");
        DIESISIETE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DIESISIETEMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton31Layout = new javax.swing.GroupLayout(Botton31);
        Botton31.setLayout(Botton31Layout);
        Botton31Layout.setHorizontalGroup(
            Botton31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Botton31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DIESISIETE, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                .addContainerGap())
        );
        Botton31Layout.setVerticalGroup(
            Botton31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DIESISIETE, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        Botton32.setBackground(new java.awt.Color(255, 102, 102));
        Botton32.setPreferredSize(new java.awt.Dimension(136, 33));
        Botton32.setRoundBottomLeft(15);
        Botton32.setRoundBottomRight(15);
        Botton32.setRoundTopLeft(15);
        Botton32.setRoundTopRight(15);
        Botton32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton32MouseClicked(evt);
            }
        });

        DIESIOCHO.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        DIESIOCHO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DIESIOCHO.setText("SALAMI");
        DIESIOCHO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DIESIOCHOMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton32Layout = new javax.swing.GroupLayout(Botton32);
        Botton32.setLayout(Botton32Layout);
        Botton32Layout.setHorizontalGroup(
            Botton32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DIESIOCHO, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
        );
        Botton32Layout.setVerticalGroup(
            Botton32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DIESIOCHO, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        Botton30.setBackground(new java.awt.Color(255, 102, 102));
        Botton30.setPreferredSize(new java.awt.Dimension(75, 45));
        Botton30.setRoundBottomLeft(15);
        Botton30.setRoundBottomRight(15);
        Botton30.setRoundTopLeft(15);
        Botton30.setRoundTopRight(15);
        Botton30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton30MouseClicked(evt);
            }
        });

        DIESISEIS.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        DIESISEIS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DIESISEIS.setText("SAPEQUEÑA");
        DIESISEIS.setToolTipText("");
        DIESISEIS.setName("SALCHICHA PEQUEÑA"); // NOI18N
        DIESISEIS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DIESISEISMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton30Layout = new javax.swing.GroupLayout(Botton30);
        Botton30.setLayout(Botton30Layout);
        Botton30Layout.setHorizontalGroup(
            Botton30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DIESISEIS, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
        );
        Botton30Layout.setVerticalGroup(
            Botton30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DIESISEIS, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        Botton33.setBackground(new java.awt.Color(255, 102, 102));
        Botton33.setPreferredSize(new java.awt.Dimension(136, 33));
        Botton33.setRoundBottomLeft(15);
        Botton33.setRoundBottomRight(15);
        Botton33.setRoundTopLeft(15);
        Botton33.setRoundTopRight(15);
        Botton33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton33MouseClicked(evt);
            }
        });

        DIESINUEVA.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        DIESINUEVA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DIESINUEVA.setText("LONGANIZA");
        DIESINUEVA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DIESINUEVAMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton33Layout = new javax.swing.GroupLayout(Botton33);
        Botton33.setLayout(Botton33Layout);
        Botton33Layout.setHorizontalGroup(
            Botton33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DIESINUEVA, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
        );
        Botton33Layout.setVerticalGroup(
            Botton33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DIESINUEVA, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        Botton34.setBackground(new java.awt.Color(255, 102, 102));
        Botton34.setPreferredSize(new java.awt.Dimension(136, 33));
        Botton34.setRoundBottomLeft(15);
        Botton34.setRoundBottomRight(15);
        Botton34.setRoundTopLeft(15);
        Botton34.setRoundTopRight(15);
        Botton34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton34MouseClicked(evt);
            }
        });

        VEITE.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        VEITE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VEITE.setText("SALCHI JUMBO");
        VEITE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VEITEMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton34Layout = new javax.swing.GroupLayout(Botton34);
        Botton34.setLayout(Botton34Layout);
        Botton34Layout.setHorizontalGroup(
            Botton34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VEITE, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
        );
        Botton34Layout.setVerticalGroup(
            Botton34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VEITE, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        Botton35.setBackground(new java.awt.Color(255, 102, 102));
        Botton35.setPreferredSize(new java.awt.Dimension(136, 33));
        Botton35.setRoundBottomLeft(15);
        Botton35.setRoundBottomRight(15);
        Botton35.setRoundTopLeft(15);
        Botton35.setRoundTopRight(15);
        Botton35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton35MouseClicked(evt);
            }
        });

        VEITIUNO.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        VEITIUNO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VEITIUNO.setText("ADOBADO");
        VEITIUNO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VEITIUNOMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton35Layout = new javax.swing.GroupLayout(Botton35);
        Botton35.setLayout(Botton35Layout);
        Botton35Layout.setHorizontalGroup(
            Botton35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VEITIUNO, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
        );
        Botton35Layout.setVerticalGroup(
            Botton35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VEITIUNO, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        Botton36.setBackground(new java.awt.Color(255, 102, 102));
        Botton36.setPreferredSize(new java.awt.Dimension(136, 33));
        Botton36.setRoundBottomLeft(15);
        Botton36.setRoundBottomRight(15);
        Botton36.setRoundTopLeft(15);
        Botton36.setRoundTopRight(15);
        Botton36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton36MouseClicked(evt);
            }
        });

        VEITITRES.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        VEITITRES.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VEITITRES.setText("CHO AHUMADO");
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

        javax.swing.GroupLayout Botton36Layout = new javax.swing.GroupLayout(Botton36);
        Botton36.setLayout(Botton36Layout);
        Botton36Layout.setHorizontalGroup(
            Botton36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VEITITRES, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
        );
        Botton36Layout.setVerticalGroup(
            Botton36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VEITITRES, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        Botton37.setBackground(new java.awt.Color(255, 102, 102));
        Botton37.setPreferredSize(new java.awt.Dimension(136, 33));
        Botton37.setRoundBottomLeft(15);
        Botton37.setRoundBottomRight(15);
        Botton37.setRoundTopLeft(15);
        Botton37.setRoundTopRight(15);
        Botton37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton37MouseClicked(evt);
            }
        });

        VEINDOS.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        VEINDOS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VEINDOS.setText("RES");
        VEINDOS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VEINDOSMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton37Layout = new javax.swing.GroupLayout(Botton37);
        Botton37.setLayout(Botton37Layout);
        Botton37Layout.setHorizontalGroup(
            Botton37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VEINDOS, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
        );
        Botton37Layout.setVerticalGroup(
            Botton37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VEINDOS, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        Botton38.setBackground(new java.awt.Color(255, 102, 102));
        Botton38.setPreferredSize(new java.awt.Dimension(136, 33));
        Botton38.setRoundBottomLeft(15);
        Botton38.setRoundBottomRight(15);
        Botton38.setRoundTopLeft(15);
        Botton38.setRoundTopRight(15);
        Botton38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton38MouseClicked(evt);
            }
        });

        VEITICUATRO.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        VEITICUATRO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VEITICUATRO.setText("CHORI ARGENTINO");
        VEITICUATRO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VEITICUATROMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton38Layout = new javax.swing.GroupLayout(Botton38);
        Botton38.setLayout(Botton38Layout);
        Botton38Layout.setHorizontalGroup(
            Botton38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VEITICUATRO, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
        );
        Botton38Layout.setVerticalGroup(
            Botton38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VEITICUATRO, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        Botton40.setBackground(new java.awt.Color(255, 102, 102));
        Botton40.setPreferredSize(new java.awt.Dimension(136, 33));
        Botton40.setRoundBottomLeft(15);
        Botton40.setRoundBottomRight(15);
        Botton40.setRoundTopLeft(15);
        Botton40.setRoundTopRight(15);
        Botton40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton40MouseClicked(evt);
            }
        });

        VEITICINCO.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        VEITICINCO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VEITICINCO.setText("tortilla");
        VEITICINCO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VEITICINCOMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton40Layout = new javax.swing.GroupLayout(Botton40);
        Botton40.setLayout(Botton40Layout);
        Botton40Layout.setHorizontalGroup(
            Botton40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VEITICINCO, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
        );
        Botton40Layout.setVerticalGroup(
            Botton40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VEITICINCO, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        Botton39.setBackground(new java.awt.Color(255, 102, 102));
        Botton39.setPreferredSize(new java.awt.Dimension(136, 33));
        Botton39.setRoundBottomLeft(15);
        Botton39.setRoundBottomRight(15);
        Botton39.setRoundTopLeft(15);
        Botton39.setRoundTopRight(15);
        Botton39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton39MouseClicked(evt);
            }
        });

        VEITISEIS.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        VEITISEIS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VEITISEIS.setText("PAN");
        VEITISEIS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VEITISEISMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton39Layout = new javax.swing.GroupLayout(Botton39);
        Botton39.setLayout(Botton39Layout);
        Botton39Layout.setHorizontalGroup(
            Botton39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VEITISEIS, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
        );
        Botton39Layout.setVerticalGroup(
            Botton39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VEITISEIS, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        Botton41.setBackground(new java.awt.Color(255, 102, 102));
        Botton41.setPreferredSize(new java.awt.Dimension(136, 33));
        Botton41.setRoundBottomLeft(15);
        Botton41.setRoundBottomRight(15);
        Botton41.setRoundTopLeft(15);
        Botton41.setRoundTopRight(15);
        Botton41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton41MouseClicked(evt);
            }
        });

        VEITISIETE.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        VEITISIETE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VEITISIETE.setText("CEBOLLIN");
        VEITISIETE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VEITISIETEMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton41Layout = new javax.swing.GroupLayout(Botton41);
        Botton41.setLayout(Botton41Layout);
        Botton41Layout.setHorizontalGroup(
            Botton41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VEITISIETE, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
        );
        Botton41Layout.setVerticalGroup(
            Botton41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VEITISIETE, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Botton15, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(Botton16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(Botton17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Botton18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(Botton19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(Botton20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Botton21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(Botton22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(Botton23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Botton24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(Botton25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(Botton26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Botton27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(Botton28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Botton29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Botton40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Botton39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Botton41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Botton37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Botton36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(Botton38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Botton33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Botton34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Botton35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Botton30, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Botton31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(Botton32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Botton15, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botton16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botton17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Botton18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botton19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botton20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Botton21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botton22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botton23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Botton24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botton25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botton26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Botton29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botton27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botton28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Botton30, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botton31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botton32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Botton33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botton34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botton35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Botton37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botton36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botton38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Botton40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botton39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botton41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 420, 370));
    }// </editor-fold>//GEN-END:initComponents

    private void UNOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UNOMouseClicked

        if (marca1 == 0) {
            Botton15.setBackground(Botverde);
            marca1 = 1;
            Num.add(25);
        } else {
            Botton15.setBackground(Botrojo);
            marca1 = 0;
            int remov = Num.indexOf(25);
            Num.remove(remov);

        }

    }//GEN-LAST:event_UNOMouseClicked

    private void Botton15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton15MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton15MouseClicked

    private void DOSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DOSMouseClicked
        if (marca2 == 0) {
            Botton16.setBackground(Botverde);
            marca2 = 1;
            Num.add(26);
        } else {
            Botton16.setBackground(Botrojo);
            marca2 = 0;
            int remov = Num.indexOf(26);
            Num.remove(remov);
        }
    }//GEN-LAST:event_DOSMouseClicked

    private void Botton16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton16MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton16MouseClicked

    private void TRESMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TRESMouseClicked
        if (marca3 == 0) {
            Botton17.setBackground(Botverde);
            marca3 = 1;
            Num.add(27);
        } else {
            Botton17.setBackground(Botrojo);
            marca3 = 0;
            int remov = Num.indexOf(27);
            Num.remove(remov);
        }
    }//GEN-LAST:event_TRESMouseClicked

    private void Botton17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton17MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton17MouseClicked

    private void CUATROMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CUATROMouseClicked
        if (marca4 == 0) {
            Botton18.setBackground(Botverde);
            marca4 = 1;
            Num.add(28);
        } else {
            Botton18.setBackground(Botrojo);
            marca4 = 0;
            int remov = Num.indexOf(28);
            Num.remove(remov);
        }
    }//GEN-LAST:event_CUATROMouseClicked

    private void Botton18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton18MouseClicked
        if (marca15 == 1) {
            Botton15.setBackground(Botverde);
            marca15 = 0;
        } else {
            Botton15.setBackground(Botrojo);
            marca15 = 1;

        }
    }//GEN-LAST:event_Botton18MouseClicked

    private void CINCOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CINCOMouseClicked
        if (marca5 == 0) {
            Botton19.setBackground(Botverde);
            marca5 = 1;
            Num.add(29);
        } else {
            Botton19.setBackground(Botrojo);
            marca5 = 0;
            int remov = Num.indexOf(29);
            Num.remove(remov);
        }
    }//GEN-LAST:event_CINCOMouseClicked

    private void Botton19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton19MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton19MouseClicked

    private void SEISMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SEISMouseClicked
        if (marca6 == 0) {
            Botton20.setBackground(Botverde);
            marca6 = 1;
            Num.add(30);
        } else {
            Botton20.setBackground(Botrojo);
            marca6 = 0;
            int remov = Num.indexOf(30);
            Num.remove(remov);
        }
    }//GEN-LAST:event_SEISMouseClicked

    private void Botton20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton20MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton20MouseClicked

    private void SIETEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SIETEMouseClicked
        if (marca7 == 0) {
            Botton21.setBackground(Botverde);
            marca7 = 1;
            Num.add(31);
        } else {
            Botton21.setBackground(Botrojo);
            marca7 = 0;
            int remov = Num.indexOf(31);
            Num.remove(remov);
        }
    }//GEN-LAST:event_SIETEMouseClicked

    private void Botton21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton21MouseClicked

        //   if(a==1 ){Botton1.setBackground(Botverde);a=0;}else{Botton1.setBackground(c);a=1;}
    }//GEN-LAST:event_Botton21MouseClicked

    private void OCHOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OCHOMouseClicked
        if (marca8 == 0) {
            Botton22.setBackground(Botverde);
            marca8 = 1;
            Num.add(32);
        } else {
            Botton22.setBackground(Botrojo);
            marca8 = 0;
            int remov = Num.indexOf(32);
            Num.remove(remov);
        }
    }//GEN-LAST:event_OCHOMouseClicked

    private void OCHOKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_OCHOKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_OCHOKeyReleased

    private void Botton22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton22MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton22MouseClicked

    private void NUEVEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NUEVEMouseClicked
        if (marca9 == 0) {
            Botton23.setBackground(Botverde);
            marca9 = 1;
            Num.add(33);
        } else {
            Botton23.setBackground(Botrojo);
            marca9 = 0;
            int remov = Num.indexOf(33);
            Num.remove(remov);
        }
    }//GEN-LAST:event_NUEVEMouseClicked

    private void Botton23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton23MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton23MouseClicked

    private void ONCEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ONCEMouseClicked
        if (marca11 == 0) {
            Botton25.setBackground(Botverde);
            marca11 = 1;
            Num.add(35);
        } else {
            Botton25.setBackground(Botrojo);
            marca11 = 0;
            int remov = Num.indexOf(35);
            Num.remove(remov);
        }
    }//GEN-LAST:event_ONCEMouseClicked

    private void Botton25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton25MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton25MouseClicked

    private void TRESEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TRESEMouseClicked
        if (marca13 == 0) {
            Botton27.setBackground(Botverde);
            marca13 = 1;
            Num.add(37);
        } else {
            Botton27.setBackground(Botrojo);
            marca13 = 0;
            int remov = Num.indexOf(37);
            Num.remove(remov);
        }
    }//GEN-LAST:event_TRESEMouseClicked

    private void Botton27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton27MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton27MouseClicked

    private void CATORCEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CATORCEMouseClicked
        if (marca14 == 0) {
            Botton28.setBackground(Botverde);
            marca14 = 1;
            Num.add(38);
        } else {
            Botton28.setBackground(Botrojo);
            marca14 = 0;
            int remov = Num.indexOf(38);
            Num.remove(remov);
        }
    }//GEN-LAST:event_CATORCEMouseClicked

    private void Botton28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton28MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton28MouseClicked

    private void QUINCEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QUINCEMouseClicked

        if (marca15 == 0) {
            Botton29.setBackground(Botverde);
            marca15 = 1;
            Num.add(39);
        } else {
            Botton29.setBackground(Botrojo);
            marca15 = 0;
            int remov = Num.indexOf(39);
            Num.remove(remov);

        }
    }//GEN-LAST:event_QUINCEMouseClicked

    private void Botton29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton29MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton29MouseClicked

    private void DIESMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DIESMouseClicked
        if (marca10 == 0) {
            Botton24.setBackground(Botverde);
            marca10 = 1;
            Num.add(34);
        } else {
            Botton24.setBackground(Botrojo);
            marca10 = 0;
            int remov = Num.indexOf(34);
            Num.remove(remov);
        }
    }//GEN-LAST:event_DIESMouseClicked

    private void Botton24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton24MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton24MouseClicked

    private void DOCEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DOCEMouseClicked
        if (marca12 == 0) {
            Botton26.setBackground(Botverde);
            marca12 = 1;
            Num.add(36);
        } else {
            Botton26.setBackground(Botrojo);
            marca12 = 0;
            int remov = Num.indexOf(36);
            Num.remove(remov);
        }
    }//GEN-LAST:event_DOCEMouseClicked

    private void Botton26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton26MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton26MouseClicked

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

    private void QUINCEMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QUINCEMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_QUINCEMouseEntered

    private void DIESISEISMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DIESISEISMouseClicked
         if (marca16 == 0) {
            Botton30.setBackground(Botverde);
            marca16 = 1;
            Num.add(40);
        } else {
            Botton30.setBackground(Botrojo);
            marca16 = 0;
            int remov = Num.indexOf(40);
            Num.remove(remov);
        }
    }//GEN-LAST:event_DIESISEISMouseClicked

    private void Botton30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton30MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton30MouseClicked

    private void DIESISIETEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DIESISIETEMouseClicked
         if (marca17 == 0) {
            Botton31.setBackground(Botverde);
            marca17 = 1;
            Num.add(41);
        } else {
            Botton31.setBackground(Botrojo);
            marca17 = 0;
            int remov = Num.indexOf(41);
            Num.remove(remov);
        }
    }//GEN-LAST:event_DIESISIETEMouseClicked

    private void Botton31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton31MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton31MouseClicked

    private void DIESIOCHOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DIESIOCHOMouseClicked
         if (marca18 == 0) {
            Botton32.setBackground(Botverde);
            marca18 = 1;
            Num.add(42);
        } else {
            Botton32.setBackground(Botrojo);
            marca18 = 0;
            int remov = Num.indexOf(42);
            Num.remove(remov);
        }
    }//GEN-LAST:event_DIESIOCHOMouseClicked

    private void Botton32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton32MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton32MouseClicked

    private void DIESINUEVAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DIESINUEVAMouseClicked
         if (marca19 == 0) {
            Botton33.setBackground(Botverde);
            marca19 = 1;
            Num.add(43);
        } else {
            Botton33.setBackground(Botrojo);
            marca19 = 0;
            int remov = Num.indexOf(43);
            Num.remove(remov);
        }
    }//GEN-LAST:event_DIESINUEVAMouseClicked

    private void Botton33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton33MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton33MouseClicked

    private void VEITEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VEITEMouseClicked
        if (marca20 == 0) {
            Botton34.setBackground(Botverde);
            marca20 = 1;
            Num.add(44);
        } else {
            Botton34.setBackground(Botrojo);
            marca20 = 0;
            int remov = Num.indexOf(44);
            Num.remove(remov);
        }
    }//GEN-LAST:event_VEITEMouseClicked

    private void Botton34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton34MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton34MouseClicked

    private void VEITIUNOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VEITIUNOMouseClicked
        if (marca21 == 0) {
            Botton35.setBackground(Botverde);
            marca21 = 1;
            Num.add(45);
        } else {
            Botton35.setBackground(Botrojo);
            marca21 = 0;
            int remov = Num.indexOf(45);
            Num.remove(remov);
        }
    }//GEN-LAST:event_VEITIUNOMouseClicked

    private void Botton35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton35MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton35MouseClicked

    private void VEITITRESMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VEITITRESMouseClicked
        if (marca23 == 0) {
            Botton36.setBackground(Botverde);
            marca23 = 1;
            Num.add(47);
        } else {
            Botton36.setBackground(Botrojo);
            marca23 = 0;
            int remov = Num.indexOf(47);
            Num.remove(remov);
        }
    }//GEN-LAST:event_VEITITRESMouseClicked

    private void VEITITRESKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_VEITITRESKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_VEITITRESKeyReleased

    private void Botton36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton36MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton36MouseClicked

    private void VEINDOSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VEINDOSMouseClicked
       if (marca22 == 0) {
            Botton37.setBackground(Botverde);
            marca22 = 1;
            Num.add(46);
        } else {
            Botton37.setBackground(Botrojo);
            marca22 = 0;
            int remov = Num.indexOf(46);
            Num.remove(remov);
        }
    }//GEN-LAST:event_VEINDOSMouseClicked

    private void Botton37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton37MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton37MouseClicked

    private void VEITICUATROMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VEITICUATROMouseClicked
       if (marca24 == 0) {
            Botton38.setBackground(Botverde);
            marca24 = 1;
            Num.add(48);
        } else {
            Botton38.setBackground(Botrojo);
            marca24 = 0;
            int remov = Num.indexOf(48);
            Num.remove(remov);
        }
    }//GEN-LAST:event_VEITICUATROMouseClicked

    private void Botton38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton38MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton38MouseClicked

    private void VEITISEISMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VEITISEISMouseClicked
         if (marca26 == 0) {
            Botton39.setBackground(Botverde);
            marca26 = 1;
            Num.add(50);
        } else {
            Botton39.setBackground(Botrojo);
            marca26 = 0;
            int remov = Num.indexOf(50);
            Num.remove(remov);
        }
    }//GEN-LAST:event_VEITISEISMouseClicked

    private void Botton39MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton39MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton39MouseClicked

    private void VEITICINCOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VEITICINCOMouseClicked
         if (marca25 == 0) {
            Botton40.setBackground(Botverde);
            marca25 = 1;
            Num.add(49);
        } else {
            Botton40.setBackground(Botrojo);
            marca25 = 0;
            int remov = Num.indexOf(49);
            Num.remove(remov);
        }
    }//GEN-LAST:event_VEITICINCOMouseClicked

    private void Botton40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton40MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton40MouseClicked

    private void VEITISIETEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VEITISIETEMouseClicked
        if (marca27 == 0) {
            Botton41.setBackground(Botverde);
            marca27 = 1;
            Num.add(51);
        } else {
            Botton41.setBackground(Botrojo);
            marca27 = 0;
            int remov = Num.indexOf(51);
            Num.remove(remov);
        }
    }//GEN-LAST:event_VEITISIETEMouseClicked

    private void Botton41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton41MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton41MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Clases.PanelRound BotonAgregar;
    private Clases.PanelRound Botton15;
    private Clases.PanelRound Botton16;
    private Clases.PanelRound Botton17;
    private Clases.PanelRound Botton18;
    private Clases.PanelRound Botton19;
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
    private Clases.PanelRound Botton30;
    private Clases.PanelRound Botton31;
    private Clases.PanelRound Botton32;
    private Clases.PanelRound Botton33;
    private Clases.PanelRound Botton34;
    private Clases.PanelRound Botton35;
    private Clases.PanelRound Botton36;
    private Clases.PanelRound Botton37;
    private Clases.PanelRound Botton38;
    private Clases.PanelRound Botton39;
    private Clases.PanelRound Botton40;
    private Clases.PanelRound Botton41;
    private javax.swing.JLabel CATORCE;
    private javax.swing.JLabel CINCO;
    private javax.swing.JLabel CUATRO;
    private javax.swing.JLabel DIES;
    private javax.swing.JLabel DIESINUEVA;
    private javax.swing.JLabel DIESIOCHO;
    private javax.swing.JLabel DIESISEIS;
    private javax.swing.JLabel DIESISIETE;
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
    private javax.swing.JLabel VEITE;
    private javax.swing.JLabel VEITICINCO;
    private javax.swing.JLabel VEITICUATRO;
    private javax.swing.JLabel VEITISEIS;
    private javax.swing.JLabel VEITISIETE;
    private javax.swing.JLabel VEITITRES;
    private javax.swing.JLabel VEITIUNO;
    private javax.swing.JTextField cantidad;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
