/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package INICIO;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorge Lopez
 */
public class Opcion2 extends javax.swing.JPanel {
    int menu = 0;
    int m1;
    int m2;
    int m3;
    int m4;
    int m5;
    int m6;
    double precio;
    int tipopan = 0;
    int pan=0;
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
    ArrayList<Integer> Cantidacarnes = new ArrayList<>();
    Color Botrojo = new Color(255,102,102); 
    Color Botverde = new Color(102,255,102);
    /**
     * Creates new form Opcion2
     */
    public Opcion2() {
        initComponents();
    }
    
    private void todosBotones() {
          //[255,102,102]
          
        Botton1.setBackground(Botrojo);
        m1 = 0;
        Botton2.setBackground(Botrojo);
        m2 = 0;
        Botton37.setBackground(Botrojo);
        m3 = 0;
        Botton38.setBackground(Botrojo);
        m4 = 0;
        Botton39.setBackground(Botrojo);
        m5 = 0;
        Botton40.setBackground(Botrojo);
        m6 = 0;
        Botton10.setBackground(Botrojo);
        menu = 0;
            marca10 = 1;
            
        if (marca13 == 1) {
           
        } else {
            Botton13.setBackground(Botrojo);
            marca13 = 1;
            if(Cantidacarnes.size() != 0){
            int remov = Cantidacarnes.indexOf(24);
            Cantidacarnes.remove(remov);}
          }    
           
        System.out.println("MENU = "+menu+" ARRAy ="+Cantidacarnes.size());
    }
    
   
    
    
     private  void colores(){
        
        //Botton30.setBackground(Botrojo);
        Botton31.setBackground(Botrojo);
        Botton32.setBackground(Botrojo);
        Botton33.setBackground(Botrojo);
        Botton34.setBackground(Botrojo);
        Botton35.setBackground(Botrojo);
       
       }
  
     
     private void carne1(){ //Boton Salchicha
      if (marca3 == 1) {
            Botton3.setBackground(Botverde);
            marca3 = 0;
            Cantidacarnes.add(15);
        } else {
            Botton3.setBackground(Botrojo);
            marca3 = 1;
            int remov = Cantidacarnes.indexOf(15);
            Cantidacarnes.remove(remov);
          }
      
     }
     private void carne2(){//Boton Chorizo bremen     
      if (marca4 == 1) {
            Botton4.setBackground(Botverde);
            marca4 = 0;
            Cantidacarnes.add(16);
        } else {
            Botton4.setBackground(Botrojo);
            marca4 = 1;
            int remov = Cantidacarnes.indexOf(16);
            Cantidacarnes.remove(remov);
          }
     }
     
     private void carne3(){ // Boton Salami   
      if (marca5 == 1) {
            Botton5.setBackground(Botverde);
            marca5 = 0;
            Cantidacarnes.add(17);
        } else {
            Botton5.setBackground(Botrojo);
            marca5 = 1;
            int remov = Cantidacarnes.indexOf(17);
            Cantidacarnes.remove(remov);
          }
      
     }
     private void carne4(){ //Boton Longaniza
      if (marca6 == 1) {
            Botton6.setBackground(Botverde);
            marca6 = 0;
            Cantidacarnes.add(18);
        } else {
            Botton6.setBackground(Botrojo);
            marca6 = 1;
            int remov = Cantidacarnes.indexOf(18);
            Cantidacarnes.remove(remov);
          }
     }
     private void carne5(){//Boton Salchicha Jumbo
      if (marca7 == 1) {
            Botton7.setBackground(Botverde);
            marca7 = 0;
            Cantidacarnes.add(19);
        } else {
            Botton7.setBackground(Botrojo);
            marca7 = 1;
            int remov = Cantidacarnes.indexOf(19);
            Cantidacarnes.remove(remov);
          }
     }
     private void carne6(){ //ADOBADO
      if (marca8 == 1) {
            Botton8.setBackground(Botverde);
            marca8 = 0;
            Cantidacarnes.add(20);
        } else {
            Botton8.setBackground(Botrojo);
            marca8 = 1;
            int remov = Cantidacarnes.indexOf(20);
            Cantidacarnes.remove(remov);
          }
     }
     private void carne7(){ //RES
      if (marca9 == 1) {
            Botton9.setBackground(Botverde);
            marca9 = 0;
            Cantidacarnes.add(21);
        } else {
            Botton9.setBackground(Botrojo);
            marca9 = 1;
            int remov = Cantidacarnes.indexOf(21);
            Cantidacarnes.remove(remov);
          }
     }
     private void carne8(){ //CHORIZO AHUMADO
      if (marca10 == 1) {
            Botton10.setBackground(Botverde);
            marca10 = 0;
            Cantidacarnes.add(22);
        } else {
            Botton10.setBackground(Botrojo);
            marca10 = 1;
            int remov = Cantidacarnes.indexOf(22);
            Cantidacarnes.remove(remov);
          }
     }
     private void carne9(){//Chorizo Argentino
      if (marca11 == 1) {
            Botton11.setBackground(Botverde);
            marca11 = 0;
            Cantidacarnes.add(23);
        } else {
            Botton11.setBackground(Botrojo);
            marca11 = 1;
            int remov = Cantidacarnes.indexOf(23);
            Cantidacarnes.remove(remov);
          }
     }
     private void carne10(){
      if (marca12 == 1) {
            Botton12.setBackground(Botverde);
            marca12 = 0;
            Cantidacarnes.add(24);
        } else {
            Botton12.setBackground(Botrojo);
            marca12 = 1;
            int remov = Cantidacarnes.indexOf(24);
            Cantidacarnes.remove(remov);
          }
     }
     
     private void TODAS(){
      if (marca13 == 1) {
            Botton13.setBackground(Botverde);
            marca13 = 0;
            Cantidacarnes.add(24);
        } else {
            Botton13.setBackground(Botrojo);
            marca13 = 1;
            int remov = Cantidacarnes.indexOf(24);
            Cantidacarnes.remove(remov);
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
        Botton1 = new Clases.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        Botton37 = new Clases.PanelRound();
        jLabel3 = new javax.swing.JLabel();
        Botton39 = new Clases.PanelRound();
        jLabel15 = new javax.swing.JLabel();
        Botton2 = new Clases.PanelRound();
        jLabel2 = new javax.swing.JLabel();
        Botton38 = new Clases.PanelRound();
        jLabel14 = new javax.swing.JLabel();
        Botton40 = new Clases.PanelRound();
        jLabel22 = new javax.swing.JLabel();
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
        Botton6 = new Clases.PanelRound();
        jLabel7 = new javax.swing.JLabel();
        Botton13 = new Clases.PanelRound();
        jLabel23 = new javax.swing.JLabel();
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
        panelRound1 = new Clases.PanelRound();
        jLabel24 = new javax.swing.JLabel();
        cantidad = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(77, 77, 77));
        setPreferredSize(new java.awt.Dimension(495, 690));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(77, 77, 77));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Botton1.setBackground(new java.awt.Color(255, 102, 102));
        Botton1.setPreferredSize(new java.awt.Dimension(85, 45));
        Botton1.setRoundBottomLeft(20);
        Botton1.setRoundBottomRight(20);
        Botton1.setRoundTopLeft(20);
        Botton1.setRoundTopRight(20);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("jLabel1");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton1Layout = new javax.swing.GroupLayout(Botton1);
        Botton1.setLayout(Botton1Layout);
        Botton1Layout.setHorizontalGroup(
            Botton1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Botton1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                .addContainerGap())
        );
        Botton1Layout.setVerticalGroup(
            Botton1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        jPanel1.add(Botton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 120, -1));

        Botton37.setBackground(new java.awt.Color(255, 102, 102));
        Botton37.setPreferredSize(new java.awt.Dimension(120, 45));
        Botton37.setRoundBottomLeft(20);
        Botton37.setRoundBottomRight(20);
        Botton37.setRoundTopLeft(20);
        Botton37.setRoundTopRight(20);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("jLabel3");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton37Layout = new javax.swing.GroupLayout(Botton37);
        Botton37.setLayout(Botton37Layout);
        Botton37Layout.setHorizontalGroup(
            Botton37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        Botton37Layout.setVerticalGroup(
            Botton37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        jPanel1.add(Botton37, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        Botton39.setBackground(new java.awt.Color(255, 102, 102));
        Botton39.setMaximumSize(null);
        Botton39.setMinimumSize(null);
        Botton39.setPreferredSize(new java.awt.Dimension(120, 45));
        Botton39.setRoundBottomLeft(20);
        Botton39.setRoundBottomRight(20);
        Botton39.setRoundTopLeft(20);
        Botton39.setRoundTopRight(20);

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("jLabel15");
        jLabel15.setMaximumSize(null);
        jLabel15.setMinimumSize(null);
        jLabel15.setPreferredSize(new java.awt.Dimension(85, 45));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton39Layout = new javax.swing.GroupLayout(Botton39);
        Botton39.setLayout(Botton39Layout);
        Botton39Layout.setHorizontalGroup(
            Botton39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        Botton39Layout.setVerticalGroup(
            Botton39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Botton39Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(Botton39, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));

        Botton2.setBackground(new java.awt.Color(255, 102, 102));
        Botton2.setPreferredSize(new java.awt.Dimension(120, 45));
        Botton2.setRoundBottomLeft(20);
        Botton2.setRoundBottomRight(20);
        Botton2.setRoundTopLeft(20);
        Botton2.setRoundTopRight(20);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("jLabel2");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton2Layout = new javax.swing.GroupLayout(Botton2);
        Botton2.setLayout(Botton2Layout);
        Botton2Layout.setHorizontalGroup(
            Botton2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Botton2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        Botton2Layout.setVerticalGroup(
            Botton2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        jPanel1.add(Botton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        Botton38.setBackground(new java.awt.Color(255, 102, 102));
        Botton38.setPreferredSize(new java.awt.Dimension(120, 45));
        Botton38.setRoundBottomLeft(20);
        Botton38.setRoundBottomRight(20);
        Botton38.setRoundTopLeft(20);
        Botton38.setRoundTopRight(20);

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("jLabel14");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton38Layout = new javax.swing.GroupLayout(Botton38);
        Botton38.setLayout(Botton38Layout);
        Botton38Layout.setHorizontalGroup(
            Botton38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        Botton38Layout.setVerticalGroup(
            Botton38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        jPanel1.add(Botton38, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        Botton40.setBackground(new java.awt.Color(255, 102, 102));
        Botton40.setPreferredSize(new java.awt.Dimension(120, 45));
        Botton40.setRoundBottomLeft(20);
        Botton40.setRoundBottomRight(20);
        Botton40.setRoundTopLeft(20);
        Botton40.setRoundTopRight(20);

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("jLabel22");
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton40Layout = new javax.swing.GroupLayout(Botton40);
        Botton40.setLayout(Botton40Layout);
        Botton40Layout.setHorizontalGroup(
            Botton40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Botton40Layout.createSequentialGroup()
                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                .addContainerGap())
        );
        Botton40Layout.setVerticalGroup(
            Botton40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Botton40Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(Botton40, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 480, 114));

        jPanel5.setBackground(new java.awt.Color(77, 77, 77));

        Botton7.setBackground(new java.awt.Color(255, 102, 102));
        Botton7.setPreferredSize(new java.awt.Dimension(110, 55));
        Botton7.setRoundBottomLeft(20);
        Botton7.setRoundBottomRight(20);
        Botton7.setRoundTopLeft(20);
        Botton7.setRoundTopRight(20);

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
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
            .addGroup(Botton7Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        Botton7Layout.setVerticalGroup(
            Botton7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        Botton12.setBackground(new java.awt.Color(255, 102, 102));
        Botton12.setPreferredSize(new java.awt.Dimension(110, 55));
        Botton12.setRoundBottomLeft(20);
        Botton12.setRoundBottomRight(20);
        Botton12.setRoundTopLeft(20);
        Botton12.setRoundTopRight(20);
        Botton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton12MouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
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
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        Botton12Layout.setVerticalGroup(
            Botton12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        Botton3.setBackground(new java.awt.Color(255, 102, 102));
        Botton3.setPreferredSize(new java.awt.Dimension(110, 55));
        Botton3.setRoundBottomLeft(20);
        Botton3.setRoundBottomRight(20);
        Botton3.setRoundTopLeft(20);
        Botton3.setRoundTopRight(20);

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
            .addGroup(Botton3Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        Botton3Layout.setVerticalGroup(
            Botton3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        Botton8.setBackground(new java.awt.Color(255, 102, 102));
        Botton8.setPreferredSize(new java.awt.Dimension(110, 55));
        Botton8.setRoundBottomLeft(20);
        Botton8.setRoundBottomRight(20);
        Botton8.setRoundTopLeft(20);
        Botton8.setRoundTopRight(20);
        Botton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton8MouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
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
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        Botton8Layout.setVerticalGroup(
            Botton8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        Botton4.setBackground(new java.awt.Color(255, 102, 102));
        Botton4.setPreferredSize(new java.awt.Dimension(110, 55));
        Botton4.setRoundBottomLeft(20);
        Botton4.setRoundBottomRight(20);
        Botton4.setRoundTopLeft(20);
        Botton4.setRoundTopRight(20);
        Botton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton4MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
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
            .addGroup(Botton4Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Botton4Layout.setVerticalGroup(
            Botton4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        Botton9.setBackground(new java.awt.Color(255, 102, 102));
        Botton9.setPreferredSize(new java.awt.Dimension(110, 55));
        Botton9.setRoundBottomLeft(20);
        Botton9.setRoundBottomRight(20);
        Botton9.setRoundTopLeft(20);
        Botton9.setRoundTopRight(20);
        Botton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton9MouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
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
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        Botton9Layout.setVerticalGroup(
            Botton9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        Botton11.setBackground(new java.awt.Color(255, 102, 102));
        Botton11.setPreferredSize(new java.awt.Dimension(110, 55));
        Botton11.setRoundBottomLeft(20);
        Botton11.setRoundBottomRight(20);
        Botton11.setRoundTopLeft(20);
        Botton11.setRoundTopRight(20);
        Botton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton11MouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
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
            .addGroup(Botton11Layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Botton11Layout.setVerticalGroup(
            Botton11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        Botton5.setBackground(new java.awt.Color(255, 102, 102));
        Botton5.setPreferredSize(new java.awt.Dimension(110, 55));
        Botton5.setRoundBottomLeft(20);
        Botton5.setRoundBottomRight(20);
        Botton5.setRoundTopLeft(20);
        Botton5.setRoundTopRight(20);
        Botton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton5MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
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
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        Botton5Layout.setVerticalGroup(
            Botton5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        Botton10.setBackground(new java.awt.Color(255, 102, 102));
        Botton10.setPreferredSize(new java.awt.Dimension(110, 55));
        Botton10.setRoundBottomLeft(20);
        Botton10.setRoundBottomRight(20);
        Botton10.setRoundTopLeft(20);
        Botton10.setRoundTopRight(20);
        Botton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton10MouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
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
            .addGroup(Botton10Layout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Botton10Layout.setVerticalGroup(
            Botton10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        Botton14.setBackground(new java.awt.Color(255, 102, 102));
        Botton14.setEnabled(false);
        Botton14.setPreferredSize(new java.awt.Dimension(110, 55));
        Botton14.setRoundBottomLeft(20);
        Botton14.setRoundBottomRight(20);
        Botton14.setRoundTopLeft(20);
        Botton14.setRoundTopRight(20);
        Botton14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton14Layout = new javax.swing.GroupLayout(Botton14);
        Botton14.setLayout(Botton14Layout);
        Botton14Layout.setHorizontalGroup(
            Botton14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        Botton14Layout.setVerticalGroup(
            Botton14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        Botton6.setBackground(new java.awt.Color(255, 102, 102));
        Botton6.setPreferredSize(new java.awt.Dimension(110, 55));
        Botton6.setRoundBottomLeft(20);
        Botton6.setRoundBottomRight(20);
        Botton6.setRoundTopLeft(20);
        Botton6.setRoundTopRight(20);
        Botton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton6MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
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
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        Botton6Layout.setVerticalGroup(
            Botton6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        Botton13.setBackground(new java.awt.Color(255, 102, 102));
        Botton13.setPreferredSize(new java.awt.Dimension(110, 55));
        Botton13.setRoundBottomLeft(20);
        Botton13.setRoundBottomRight(20);
        Botton13.setRoundTopLeft(20);
        Botton13.setRoundTopRight(20);
        Botton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton13MouseClicked(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("TODAS LAS CARNES");
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton13Layout = new javax.swing.GroupLayout(Botton13);
        Botton13.setLayout(Botton13Layout);
        Botton13Layout.setHorizontalGroup(
            Botton13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Botton13Layout.createSequentialGroup()
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        Botton13Layout.setVerticalGroup(
            Botton13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(Botton11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Botton12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Botton13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Botton14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(Botton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Botton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Botton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Botton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(Botton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Botton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Botton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Botton10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Botton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Botton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botton10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Botton11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Botton12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Botton14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Botton13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 140, 495, 211));

        jPanel2.setBackground(new java.awt.Color(77, 77, 77));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Botton30.setBackground(new java.awt.Color(255, 102, 102));
        Botton30.setRoundBottomLeft(10);
        Botton30.setRoundBottomRight(10);
        Botton30.setRoundTopLeft(10);
        Botton30.setRoundTopRight(10);
        Botton30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton30MouseClicked(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
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
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Botton30Layout.setVerticalGroup(
            Botton30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel2.add(Botton30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 30));

        Botton31.setBackground(new java.awt.Color(255, 102, 102));
        Botton31.setRoundBottomLeft(10);
        Botton31.setRoundBottomRight(10);
        Botton31.setRoundTopLeft(10);
        Botton31.setRoundTopRight(10);
        Botton31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton31MouseClicked(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
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
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        Botton31Layout.setVerticalGroup(
            Botton31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel2.add(Botton31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 100, 30));

        Botton32.setBackground(new java.awt.Color(255, 102, 102));
        Botton32.setRoundBottomLeft(10);
        Botton32.setRoundBottomRight(10);
        Botton32.setRoundTopLeft(10);
        Botton32.setRoundTopRight(10);
        Botton32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton32MouseClicked(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
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
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Botton32Layout.setVerticalGroup(
            Botton32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel2.add(Botton32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 100, 30));

        Botton33.setBackground(new java.awt.Color(255, 102, 102));
        Botton33.setRoundBottomLeft(10);
        Botton33.setRoundBottomRight(10);
        Botton33.setRoundTopLeft(10);
        Botton33.setRoundTopRight(10);
        Botton33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton33MouseClicked(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
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
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Botton33Layout.setVerticalGroup(
            Botton33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel2.add(Botton33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 100, 30));

        Botton34.setBackground(new java.awt.Color(255, 102, 102));
        Botton34.setRoundBottomLeft(10);
        Botton34.setRoundBottomRight(10);
        Botton34.setRoundTopLeft(10);
        Botton34.setRoundTopRight(10);
        Botton34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton34MouseClicked(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
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
            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Botton34Layout.setVerticalGroup(
            Botton34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel2.add(Botton34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 100, 30));

        Botton35.setBackground(new java.awt.Color(255, 102, 102));
        Botton35.setRoundBottomLeft(10);
        Botton35.setRoundBottomRight(10);
        Botton35.setRoundTopLeft(10);
        Botton35.setRoundTopRight(10);
        Botton35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton35MouseClicked(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
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
            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Botton35Layout.setVerticalGroup(
            Botton35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel2.add(Botton35, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 100, 30));

        Botton36.setBackground(new java.awt.Color(255, 102, 102));
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
            .addGap(0, 100, Short.MAX_VALUE)
        );
        Botton36Layout.setVerticalGroup(
            Botton36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel2.add(Botton36, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 100, 30));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 357, 212, 289));

        jPanel3.setBackground(new java.awt.Color(77, 77, 77));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        SalPequeña.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        SalPequeña.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SalPequeña.setText("SAPEQUEÑA");
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
            .addComponent(SalPequeña, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
        );
        Botton15Layout.setVerticalGroup(
            Botton15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SalPequeña, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        jPanel3.add(Botton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        Botton16.setBackground(new java.awt.Color(255, 102, 102));
        Botton16.setPreferredSize(new java.awt.Dimension(75, 45));
        Botton16.setRoundBottomLeft(15);
        Botton16.setRoundBottomRight(15);
        Botton16.setRoundTopLeft(15);
        Botton16.setRoundTopRight(15);
        Botton16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton16MouseClicked(evt);
            }
        });

        ChoriBremen.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ChoriBremen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ChoriBremen.setText("CHOBREMEN");
        ChoriBremen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChoriBremenMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton16Layout = new javax.swing.GroupLayout(Botton16);
        Botton16.setLayout(Botton16Layout);
        Botton16Layout.setHorizontalGroup(
            Botton16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Botton16Layout.createSequentialGroup()
                .addComponent(ChoriBremen)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        Botton16Layout.setVerticalGroup(
            Botton16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ChoriBremen, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        jPanel3.add(Botton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        Botton17.setBackground(new java.awt.Color(255, 102, 102));
        Botton17.setPreferredSize(new java.awt.Dimension(75, 45));
        Botton17.setRoundBottomLeft(15);
        Botton17.setRoundBottomRight(15);
        Botton17.setRoundTopLeft(15);
        Botton17.setRoundTopRight(15);
        Botton17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton17MouseClicked(evt);
            }
        });

        Extra3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
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
            .addComponent(Extra3, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
        );
        Botton17Layout.setVerticalGroup(
            Botton17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Extra3, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        jPanel3.add(Botton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        Botton18.setBackground(new java.awt.Color(255, 102, 102));
        Botton18.setPreferredSize(new java.awt.Dimension(75, 45));
        Botton18.setRoundBottomLeft(15);
        Botton18.setRoundBottomRight(15);
        Botton18.setRoundTopLeft(15);
        Botton18.setRoundTopRight(15);
        Botton18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton18MouseClicked(evt);
            }
        });

        Extra4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
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
            .addComponent(Extra4, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
        );
        Botton18Layout.setVerticalGroup(
            Botton18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Extra4, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        jPanel3.add(Botton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        Botton19.setBackground(new java.awt.Color(255, 102, 102));
        Botton19.setPreferredSize(new java.awt.Dimension(75, 45));
        Botton19.setRoundBottomLeft(15);
        Botton19.setRoundBottomRight(15);
        Botton19.setRoundTopLeft(15);
        Botton19.setRoundTopRight(15);
        Botton19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton19MouseClicked(evt);
            }
        });

        SAlchi.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
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
                .addComponent(SAlchi, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        Botton19Layout.setVerticalGroup(
            Botton19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SAlchi, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        jPanel3.add(Botton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        Botton20.setBackground(new java.awt.Color(255, 102, 102));
        Botton20.setPreferredSize(new java.awt.Dimension(75, 45));
        Botton20.setRoundBottomLeft(15);
        Botton20.setRoundBottomRight(15);
        Botton20.setRoundTopLeft(15);
        Botton20.setRoundTopRight(15);
        Botton20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton20MouseClicked(evt);
            }
        });

        Extra6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
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
            .addComponent(Extra6, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
        );
        Botton20Layout.setVerticalGroup(
            Botton20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Extra6, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        jPanel3.add(Botton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, -1, -1));

        Botton21.setBackground(new java.awt.Color(255, 102, 102));
        Botton21.setPreferredSize(new java.awt.Dimension(75, 45));
        Botton21.setRoundBottomLeft(15);
        Botton21.setRoundBottomRight(15);
        Botton21.setRoundTopLeft(15);
        Botton21.setRoundTopRight(15);
        Botton21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton21MouseClicked(evt);
            }
        });

        Extra7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
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
            .addComponent(Extra7, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
        );
        Botton21Layout.setVerticalGroup(
            Botton21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Extra7, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        jPanel3.add(Botton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        Botton22.setBackground(new java.awt.Color(255, 102, 102));
        Botton22.setPreferredSize(new java.awt.Dimension(75, 45));
        Botton22.setRoundBottomLeft(15);
        Botton22.setRoundBottomRight(15);
        Botton22.setRoundTopLeft(15);
        Botton22.setRoundTopRight(15);
        Botton22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton22MouseClicked(evt);
            }
        });

        ChoAhumado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
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
                .addComponent(ChoAhumado, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Botton22Layout.setVerticalGroup(
            Botton22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ChoAhumado, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        jPanel3.add(Botton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        Botton23.setBackground(new java.awt.Color(255, 102, 102));
        Botton23.setPreferredSize(new java.awt.Dimension(75, 45));
        Botton23.setRoundBottomLeft(15);
        Botton23.setRoundBottomRight(15);
        Botton23.setRoundTopLeft(15);
        Botton23.setRoundTopRight(15);
        Botton23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton23MouseClicked(evt);
            }
        });

        ChoArgenti.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
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
                .addComponent(ChoArgenti, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        Botton23Layout.setVerticalGroup(
            Botton23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ChoArgenti, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        jPanel3.add(Botton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, -1, -1));

        Botton25.setBackground(new java.awt.Color(255, 102, 102));
        Botton25.setPreferredSize(new java.awt.Dimension(75, 45));
        Botton25.setRoundBottomLeft(15);
        Botton25.setRoundBottomRight(15);
        Botton25.setRoundTopLeft(15);
        Botton25.setRoundTopRight(15);
        Botton25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton25MouseClicked(evt);
            }
        });

        Extra11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
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
            .addComponent(Extra11, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
        );
        Botton25Layout.setVerticalGroup(
            Botton25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Extra11, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        jPanel3.add(Botton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        Botton27.setBackground(new java.awt.Color(255, 102, 102));
        Botton27.setPreferredSize(new java.awt.Dimension(75, 45));
        Botton27.setRoundBottomLeft(15);
        Botton27.setRoundBottomRight(15);
        Botton27.setRoundTopLeft(15);
        Botton27.setRoundTopRight(15);
        Botton27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton27MouseClicked(evt);
            }
        });

        PorciMayonesa.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        PorciMayonesa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PorciMayonesa.setText("POR MAYONESA");
        PorciMayonesa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PorciMayonesaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton27Layout = new javax.swing.GroupLayout(Botton27);
        Botton27.setLayout(Botton27Layout);
        Botton27Layout.setHorizontalGroup(
            Botton27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Botton27Layout.createSequentialGroup()
                .addComponent(PorciMayonesa, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Botton27Layout.setVerticalGroup(
            Botton27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PorciMayonesa, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        jPanel3.add(Botton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        Botton28.setBackground(new java.awt.Color(255, 102, 102));
        Botton28.setPreferredSize(new java.awt.Dimension(75, 45));
        Botton28.setRoundBottomLeft(15);
        Botton28.setRoundBottomRight(15);
        Botton28.setRoundTopLeft(15);
        Botton28.setRoundTopRight(15);
        Botton28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton28MouseClicked(evt);
            }
        });

        Extra14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
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
            .addComponent(Extra14, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
        );
        Botton28Layout.setVerticalGroup(
            Botton28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Extra14, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        jPanel3.add(Botton28, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, -1));

        Botton29.setBackground(new java.awt.Color(255, 102, 102));
        Botton29.setPreferredSize(new java.awt.Dimension(75, 45));
        Botton29.setRoundBottomLeft(15);
        Botton29.setRoundBottomRight(15);
        Botton29.setRoundTopLeft(15);
        Botton29.setRoundTopRight(15);
        Botton29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton29MouseClicked(evt);
            }
        });

        Queso.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
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
            .addComponent(Queso, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
        );
        Botton29Layout.setVerticalGroup(
            Botton29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Queso, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        jPanel3.add(Botton29, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, -1, -1));

        Botton24.setBackground(new java.awt.Color(255, 102, 102));
        Botton24.setPreferredSize(new java.awt.Dimension(75, 45));
        Botton24.setRoundBottomLeft(15);
        Botton24.setRoundBottomRight(15);
        Botton24.setRoundTopLeft(15);
        Botton24.setRoundTopRight(15);
        Botton24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton24MouseClicked(evt);
            }
        });

        Extra10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
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
            .addComponent(Extra10, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
        );
        Botton24Layout.setVerticalGroup(
            Botton24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Extra10, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        jPanel3.add(Botton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        Botton26.setBackground(new java.awt.Color(255, 102, 102));
        Botton26.setPreferredSize(new java.awt.Dimension(75, 45));
        Botton26.setRoundBottomLeft(15);
        Botton26.setRoundBottomRight(15);
        Botton26.setRoundTopLeft(15);
        Botton26.setRoundTopRight(15);
        Botton26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton26MouseClicked(evt);
            }
        });

        PorciGuaca.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
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
            .addComponent(PorciGuaca, javax.swing.GroupLayout.PREFERRED_SIZE, 76, Short.MAX_VALUE)
        );
        Botton26Layout.setVerticalGroup(
            Botton26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PorciGuaca, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        jPanel3.add(Botton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, -1, -1));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 363, 253, 270));

        panelRound1.setRoundBottomLeft(15);
        panelRound1.setRoundBottomRight(15);
        panelRound1.setRoundTopLeft(15);
        panelRound1.setRoundTopRight(15);

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("jLabel24");
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
        );

        add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 650, -1, -1));

        cantidad.setEditable(false);
        cantidad.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        cantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cantidad.setText("1");
        add(cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 650, 55, 28));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ARRIBA.png"))); // NOI18N
        jButton2.setPreferredSize(new java.awt.Dimension(40, 47));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 640, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ABAJO.png"))); // NOI18N
        jButton1.setPreferredSize(new java.awt.Dimension(40, 47));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 640, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
       //Boton Salchicha Jumbo
       carne5();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        //Boton Tosino
        carne10();
    }//GEN-LAST:event_jLabel13MouseClicked

    private void Botton12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton12MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton12MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        //Boton Salchicha
        carne1();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
    //Boton Adobado        
       carne6();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void Botton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton8MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
     carne2();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void Botton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton4MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
         //Boton Res
        carne7();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void Botton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton9MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
     //Boton Chorizo Argentino        
       carne9();
    }//GEN-LAST:event_jLabel12MouseClicked

    private void Botton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton11MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton11MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
   carne3();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void Botton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton5MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
         //Boton Chorizo Ahumado

       carne8();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void Botton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton10MouseClicked

    private void Botton14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton14MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton14MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        carne4();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void Botton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton6MouseClicked

    private void Botton13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton13MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton13MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        if(sin2 !=1 && sin3 !=1 && sin4 !=1 && sin5 !=1 && sin6 !=1)
        NumSin.clear();
        if (sin1 == 0) {
            Botton30.setBackground(Botverde);
            sin1 = 1;
            NumSin.add(1);
            colores();
            //Botton32.setEnabled(true);
            //Botton33.setEnabled(true);
        } else {
            Botton30.setBackground(Botrojo);
            sin1 = 0;
            int remov = NumSin.indexOf(1);
            NumSin.remove(remov);
            //bloquear(false);
            /*Botton31.setEnabled(false);
            Botton32.setEnabled(false);
            Botton33.setEnabled(false);
            Botton34.setEnabled(false);
            Botton35.setEnabled(false);*/
        }
    }//GEN-LAST:event_jLabel16MouseClicked

    private void Botton30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton30MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton30MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        if(sin1 ==1){ }else{
            if (sin2 == 0) {
                Botton31.setBackground(Botverde);
                sin2 = 1;
                NumSin.add(2);
            } else {
                Botton31.setBackground(Botrojo);
                sin2 = 0;
                int remov = NumSin.indexOf(2);
                NumSin.remove(remov);

            }
        }
    }//GEN-LAST:event_jLabel17MouseClicked

    private void Botton31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton31MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton31MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        if(sin1 ==1){ }else{
            if (sin3 == 0) {
                Botton32.setBackground(Botverde);
                sin3 = 1;
                NumSin.add(3);
            } else {
                Botton32.setBackground(Botrojo);
                sin3 = 0;
                int remov = NumSin.indexOf(3);
                NumSin.remove(remov);

            }
        }
    }//GEN-LAST:event_jLabel18MouseClicked

    private void Botton32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton32MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton32MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        if(sin1 ==1){ }else{
            if (sin4 == 0) {
                Botton33.setBackground(Botverde);
                sin4 = 1;
                NumSin.add(4);
            } else {
                Botton33.setBackground(Botrojo);
                sin4 = 0;
                int remov = NumSin.indexOf(4);
                NumSin.remove(remov);

            }
        }
    }//GEN-LAST:event_jLabel19MouseClicked

    private void Botton33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton33MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton33MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        if(sin1 ==1){ }else{
            if (sin5 == 0) {
                Botton34.setBackground(Botverde);
                sin5 = 1;
                NumSin.add(5);
            } else {
                Botton34.setBackground(Botrojo);
                sin5 = 0;
                int remov = NumSin.indexOf(5);
                NumSin.remove(remov);

            }}
    }//GEN-LAST:event_jLabel20MouseClicked

    private void Botton34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton34MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton34MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        if(sin1 ==1){ }else{
            if (sin6 == 0) {
                Botton35.setBackground(Botverde);
                sin6 = 1;
                NumSin.add(6);
            } else {
                Botton35.setBackground(Botrojo);
                sin6 = 0;
                int remov = NumSin.indexOf(6);
                NumSin.remove(remov);

            }}
    }//GEN-LAST:event_jLabel21MouseClicked

    private void Botton35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton35MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton35MouseClicked

    private void Botton36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton36MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton36MouseClicked

    private void SalPequeñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalPequeñaMouseClicked
       
        if (marca15 == 0) {
            Botton15.setBackground(Botverde);
            marca15 = 1;
            Num.add(52);
        } else {
            Botton15.setBackground(Botrojo);
            marca15 = 0;
            int remov = Num.indexOf(52);
            Num.remove(remov);

        }

    }//GEN-LAST:event_SalPequeñaMouseClicked

    private void Botton15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton15MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton15MouseClicked

    private void ChoriBremenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChoriBremenMouseClicked
        if (marca16 == 0) {
            Botton16.setBackground(Botverde);
            marca16 = 1;
            Num.add(53);
        } else {
            Botton16.setBackground(Botrojo);
            marca16 = 0;
            int remov = Num.indexOf(53);
            Num.remove(remov);
        }
    }//GEN-LAST:event_ChoriBremenMouseClicked

    private void Botton16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton16MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton16MouseClicked

    private void Extra3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Extra3MouseClicked
        if (marca17 == 0) {
            Botton17.setBackground(Botverde);
            marca17 = 1;
            Num.add(54);
        } else {
            Botton17.setBackground(Botrojo);
            marca17 = 0;
            int remov = Num.indexOf(54);
            Num.remove(remov);
        }
    }//GEN-LAST:event_Extra3MouseClicked

    private void Botton17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton17MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton17MouseClicked

    private void Extra4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Extra4MouseClicked
        if (marca18 == 0) {
            Botton18.setBackground(Botverde);
            marca18 = 1;
            Num.add(55);
        } else {
            Botton18.setBackground(Botrojo);
            marca18 = 0;
            int remov = Num.indexOf(55);
            Num.remove(remov);
        }
    }//GEN-LAST:event_Extra4MouseClicked

    private void Botton18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton18MouseClicked
        if (marca15 == 1) {
            Botton15.setBackground(Botverde);
            marca15 = 0;
        } else {
            Botton15.setBackground(Botrojo);
            marca15 = 1;

        }
    }//GEN-LAST:event_Botton18MouseClicked

    private void SAlchiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SAlchiMouseClicked
        if (marca19 == 0) {
            Botton19.setBackground(Botverde);
            marca19 = 1;
            Num.add(56);
        } else {
            Botton19.setBackground(Botrojo);
            marca19 = 0;
            int remov = Num.indexOf(56);
            Num.remove(remov);
        }
    }//GEN-LAST:event_SAlchiMouseClicked

    private void Botton19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton19MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton19MouseClicked

    private void Extra6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Extra6MouseClicked
        if (marca20 == 0) {
            Botton20.setBackground(Botverde);
            marca20 = 1;
            Num.add(57);
        } else {
            Botton20.setBackground(Botrojo);
            marca20 = 0;
            int remov = Num.indexOf(57);
            Num.remove(remov);
        }
    }//GEN-LAST:event_Extra6MouseClicked

    private void Botton20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton20MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton20MouseClicked

    private void Extra7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Extra7MouseClicked
        if (marca21 == 0) {
            Botton21.setBackground(Botverde);
            marca21 = 1;
            Num.add(58);
        } else {
            Botton21.setBackground(Botrojo);
            marca21 = 0;
            int remov = Num.indexOf(58);
            Num.remove(remov);
        }
    }//GEN-LAST:event_Extra7MouseClicked

    private void Botton21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton21MouseClicked

        //   if(a==1 ){Botton1.setBackground(Botverde);a=0;}else{Botton1.setBackground(c);a=1;}
    }//GEN-LAST:event_Botton21MouseClicked

    private void ChoAhumadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChoAhumadoMouseClicked
        if (marca22 == 0) {
            Botton22.setBackground(Botverde);
            marca22 = 1;
            Num.add(59);
        } else {
            Botton22.setBackground(Botrojo);
            marca22 = 0;
            int remov = Num.indexOf(59);
            Num.remove(remov);
        }
    }//GEN-LAST:event_ChoAhumadoMouseClicked

    private void ChoAhumadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ChoAhumadoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_ChoAhumadoKeyReleased

    private void Botton22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton22MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton22MouseClicked

    private void ChoArgentiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChoArgentiMouseClicked
        if (marca23 == 0) {
            Botton23.setBackground(Botverde);
            marca23 = 1;
            Num.add(60);
        } else {
            Botton23.setBackground(Botrojo);
            marca23 = 0;
            int remov = Num.indexOf(60);
            Num.remove(remov);
        }
    }//GEN-LAST:event_ChoArgentiMouseClicked

    private void Botton23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton23MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton23MouseClicked

    private void Extra11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Extra11MouseClicked
        if (marca25 == 0) {
            Botton25.setBackground(Botverde);
            marca25 = 1;
            Num.add(62);
        } else {
            Botton25.setBackground(Botrojo);
            marca25 = 0;
            int remov = Num.indexOf(62);
            Num.remove(remov);
        }
    }//GEN-LAST:event_Extra11MouseClicked

    private void Botton25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton25MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton25MouseClicked

    private void PorciMayonesaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PorciMayonesaMouseClicked
        if (marca27 == 0) {
            Botton27.setBackground(Botverde);
            marca27 = 1;
            Num.add(64);
        } else {
            Botton27.setBackground(Botrojo);
            marca27 = 0;
            int remov = Num.indexOf(64);
            Num.remove(remov);
        }
    }//GEN-LAST:event_PorciMayonesaMouseClicked

    private void Botton27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton27MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton27MouseClicked

    private void Extra14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Extra14MouseClicked
        if (marca28 == 0) {
            Botton28.setBackground(Botverde);
            marca28 = 1;
            Num.add(65);
        } else {
            Botton28.setBackground(Botrojo);
            marca28 = 0;
            int remov = Num.indexOf(65);
            Num.remove(remov);
        }
    }//GEN-LAST:event_Extra14MouseClicked

    private void Botton28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton28MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton28MouseClicked

    private void QuesoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuesoMouseClicked

        if (marca29 == 0) {
            Botton29.setBackground(Botverde);
            marca29 = 1;
            Num.add(66);
        } else {
            Botton29.setBackground(Botrojo);
            marca29 = 0;
            int remov = Num.indexOf(66);
            Num.remove(remov);

        }
    }//GEN-LAST:event_QuesoMouseClicked

    private void Botton29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton29MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton29MouseClicked

    private void Extra10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Extra10MouseClicked
        if (marca24 == 0) {
            Botton24.setBackground(Botverde);
            marca24 = 1;
            Num.add(61);
        } else {
            Botton24.setBackground(Botrojo);
            marca24 = 0;
            int remov = Num.indexOf(61);
            Num.remove(remov);
        }
    }//GEN-LAST:event_Extra10MouseClicked

    private void Botton24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton24MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton24MouseClicked

    private void PorciGuacaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PorciGuacaMouseClicked
        if (marca26 == 0) {
            Botton26.setBackground(Botverde);
            marca26 = 1;
            Num.add(63);
        } else {
            Botton26.setBackground(Botrojo);
            marca26 = 0;
            int remov = Num.indexOf(63);
            Num.remove(remov);
        }
    }//GEN-LAST:event_PorciGuacaMouseClicked

    private void Botton26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton26MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton26MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
       //Boton 1
       
       todosBotones();
       Botton1.setBackground(Botverde);
       menu = 12;
       
       
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // Boton2
   
       todosBotones();
       Botton2.setBackground(Botverde);
       menu = 13;
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // Boton3
        
        todosBotones();
        Botton37.setBackground(Botverde);
        menu = 14;
        
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // Boton4
      
        todosBotones();
        Botton38.setBackground(Botverde);
        menu = 15;
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // Booton5
         
        todosBotones();
        Botton39.setBackground(Botverde);
        menu = 16;
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
     // Boton6
        
        todosBotones();
        Botton40.setBackground(Botverde);
        menu = 17;
        TODAS();
    }//GEN-LAST:event_jLabel22MouseClicked

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

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        
        int a =Cantidacarnes.size(); System.out.println("CARNES = "+a+" Y MENU= "+menu);
        if(Cantidacarnes.size()!=0){
        if(menu == 12)
        {
            if(Cantidacarnes.size()>0 && Cantidacarnes.size()<=1){JOptionPane.showMessageDialog(null, "CARNES BIEN");} else {JOptionPane.showMessageDialog(null, "CARNES MAL");}
        }
        else if(menu == 13)
        { 
            if(Cantidacarnes.size()>1 && Cantidacarnes.size()<=2){JOptionPane.showMessageDialog(null, "CARNES BIEN");} else {JOptionPane.showMessageDialog(null, "CARNES MAL");}
        }
        
        else if (menu == 14){if(Cantidacarnes.size()>2 && Cantidacarnes.size()<=3){JOptionPane.showMessageDialog(null, "CARNES BIEN");} else {JOptionPane.showMessageDialog(null, "CARNES MAL");}}
        
        else if (menu == 15){if(Cantidacarnes.size()>3 && Cantidacarnes.size()<=4){JOptionPane.showMessageDialog(null, "CARNES BIEN");} else {JOptionPane.showMessageDialog(null, "CARNES MAL");}}
        
        
        else if(menu == 16){if(Cantidacarnes.size()>4 && Cantidacarnes.size()<=5){JOptionPane.showMessageDialog(null, "CARNES BIEN");} else {JOptionPane.showMessageDialog(null, "CARNES MAL");}}
        
        else {
        {JOptionPane.showMessageDialog(null, "TODAS LAS CARNES");}}
        }else {{JOptionPane.showMessageDialog(null, "SELECCIONE UNA DE LAS CARNES");}}   
    }//GEN-LAST:event_jLabel24MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel23MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private Clases.PanelRound Botton37;
    private Clases.PanelRound Botton38;
    private Clases.PanelRound Botton39;
    private Clases.PanelRound Botton4;
    private Clases.PanelRound Botton40;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
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
    private javax.swing.JPanel jPanel5;
    private Clases.PanelRound panelRound1;
    // End of variables declaration//GEN-END:variables
}
