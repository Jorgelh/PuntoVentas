/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package INICIO;

import static INICIO.Principal.ListarProductosPedidos;
import clas.BDConexion;
import clas.BDProductos;
import clas.InsertarProducto;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorge Lopez
 */
public class Opcion2 extends javax.swing.JPanel {
    int entra = 2;
    int menu = 0;
    double precio;
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
    int sin1 = 0;
    int sin2 = 0;
    int sin3 = 0; 
    int sin4 = 0;
    int sin5 = 0;
    int sin6 = 0;
    int sin7 = 0;
    int sin8 = 0;
    int sin9 = 0;
    int sin10 = 0;
    int sin11 = 0;
    int sin12 = 0;
    int sin13 = 0;
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
    int id_producto_pedido = 0;
    ArrayList<Integer> Num = new ArrayList<>();
    ArrayList<Integer> NumSin = new ArrayList<>(); 
    ArrayList<Integer> Cantidacarnes = new ArrayList<>();
    Color Botrojo = new Color(255,102,102); 
    Color Botverde = new Color(102,255,102);
    /**
     * Creates new form Opcion2
     */
    public Opcion2(int a) {
        initComponents();
        this.id_pedido = a;
        
         String texto = "<html><center><body>SALCHICA<br>PEQUEÑA</body></center></html>";
        SalPequeña.setText(texto);
        Salchi.setText(texto);
        String texto1 = "<html><center><body>CHORIZO<br>BREMEN</body></center></html>";
        ChoriBremen.setText(texto1);
        Chori.setText(texto1);
        String texto2 = "<html><center><body>SALCHICHA<br>JUMBO</body></center></html>";
        SAlchi.setText(texto2);
        SalJumbo.setText(texto2);        
        String texto3 = "<html><center><body>CHORIZO<br>AHUMADO</body></center></html>";
        ChoAhumado.setText(texto3);
        ahumado.setText(texto3);
        String texto4 = "<html><center><body>CHORIZO<br>ARGENTINO</body></center></html>";
        ChoArgenti.setText(texto4);
        Argentino.setText(texto4);
        String texto5 = "<html><center><body>PORCION DE<br>GUACAMOL</body></center></html>";
        PorciGuaca.setText(texto5);
        String texto6 = "<html><center><body>PORCION DE<br>TORTILLAS</body></center></html>";
        PorciMayonesa.setText(texto6);
        String texto7 = "<html><center><body>PORCION DE<br>QUESO MOSARELA</body></center></html>";
         Queso.setText(texto7);
         String texto8 = "<html><center><body>TODAS LAS<br>CARNES</body></center></html>";
         todas.setText(texto8);
    }
    
    private void todosBotones() {
          //[255,102,102]
          
        Botton1.setBackground(Botrojo);
        Botton2.setBackground(Botrojo);
        Botton37.setBackground(Botrojo);
        Botton38.setBackground(Botrojo);
        Botton39.setBackground(Botrojo);
        Botton40.setBackground(Botrojo);
        menu = 2;
            
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
        Botton36.setBackground(Botrojo);
        Botton41.setBackground(Botrojo);
        Botton42.setBackground(Botrojo);
        Botton43.setBackground(Botrojo);
        Botton44.setBackground(Botrojo);
        Botton45.setBackground(Botrojo);
        Botton46.setBackground(Botrojo);
        Botton47.setBackground(Botrojo);
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
     
     private void InsertarProductoTortilla() {

        try {
            InsertarProducto p1 = new InsertarProducto();

            p1.setId_pedido(id_pedido);
            p1.setId_producto(menu);
            p1.setCantidad( Integer.parseInt( cantidad.getText()));
            //p1.setPrecio(precio);
            BDProductos.InsertarProducto_Pedido_tortilla(p1);
            id_producto_pedido = p1.getIdregreso();
            
            if(menu != 17){inserCarnes();}
            insertarAdicional();
            insertarSin();
            Limpiar();
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
        //insert into PRODUCTOS_PEDIDO (id_pedido,id_producto,cantidad,tipo,extra) values(?,?,?,?,1) select precio*"+t.getCantidad()+" from PRODUCTOS where ID_PRODUCTO =  "+t.getId_producto()+" 
        smtp =con.prepareStatement("insert into PRODUCTOS_PEDIDO (id_pedido,id_producto,pro_id_productos_pedido,cantidad,adicional,precio) values(?,?,?,?,2,(select ("+cantidad.getText()+"*precio) as precio from PRODUCTOS where id_producto = "+Num.get(i)+"))");
        smtp.setInt(1,id_pedido);
        smtp.setInt(2,Num.get(i));
        smtp.setInt(3, id_producto_pedido);
        smtp.setInt(4, Integer.parseInt(cantidad.getText()));
        smtp.executeUpdate();
        con.close();
        smtp.close();    
     } catch (Exception e) {
         
            JOptionPane.showMessageDialog(null,"QUE PASO INSER ADICIONAL: "+ e);}
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
         
            JOptionPane.showMessageDialog(null,"QUE PASO INSER DE NOTA: "+ e);}
    }
}
       
       private void inserCarnes(){   

    for(int i = 0; i < Cantidacarnes.size(); i++) {
    try {
        BDConexion conecta = new BDConexion();
        Connection con = conecta.getConexion();
        PreparedStatement smtp = null;
        //insert into PRODUCTOS_PEDIDO (id_pedido,id_producto,cantidad,tipo,extra) values(?,?,?,?,1) select precio*"+t.getCantidad()+" from PRODUCTOS where ID_PRODUCTO =  "+t.getId_producto()+" 
        smtp =con.prepareStatement("insert into NOTAS (id_productos_pedido,id) values(?,?)");
        smtp.setInt(1, id_producto_pedido);
        smtp.setInt(2,Cantidacarnes.get(i));
        smtp.executeUpdate();
        con.close();
        smtp.close();    
     } catch (Exception e) {
         
            JOptionPane.showMessageDialog(null,"QUE PASO CARNES: "+ e);}
        }
    }
       
       private void Limpiar() {
        marca3 = 1; marca4 = 1;marca5 = 1;marca6 = 1;marca7 = 1;marca8 = 1;marca9 = 1;marca10 = 1; marca11 = 1;marca12 = 1; marca13 = 1;
        Botton1.setBackground(Botrojo);
        Botton2.setBackground(Botrojo);
        Botton3.setBackground(Botrojo);
        Botton4.setBackground(Botrojo);
        Botton5.setBackground(Botrojo);
        Botton6.setBackground(Botrojo);
        Botton7.setBackground(Botrojo);
        Botton8.setBackground(Botrojo);
        Botton9.setBackground(Botrojo);
        Botton10.setBackground(Botrojo);
        Botton11.setBackground(Botrojo);
        Botton12.setBackground(Botrojo);
        Botton13.setBackground(Botrojo);
        Botton14.setBackground(Botrojo);
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
        Botton42.setBackground(Botrojo);
        Botton43.setBackground(Botrojo);
        Botton44.setBackground(Botrojo);
        Botton45.setBackground(Botrojo);
        Botton46.setBackground(Botrojo);
        Botton47.setBackground(Botrojo);
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
        sin7 = 0;
        sin8 = 0;
        sin9 = 0;
        sin10 = 0;
        sin11 = 0;
        sin12 = 0;
        sin13 = 0;
        Num.clear();
        NumSin.clear();
        Cantidacarnes.clear();
        cantidad.setText("1");
        
    }
       
        private void limpiarSin(){
        Botton30.setBackground(Botrojo);
        Botton31.setBackground(Botrojo);
        Botton32.setBackground(Botrojo);
        Botton33.setBackground(Botrojo);
        Botton34.setBackground(Botrojo);
        Botton35.setBackground(Botrojo);
        Botton36.setBackground(Botrojo);
        Botton41.setBackground(Botrojo);
        Botton42.setBackground(Botrojo);
        Botton43.setBackground(Botrojo);
        Botton44.setBackground(Botrojo);
        Botton45.setBackground(Botrojo);
        Botton46.setBackground(Botrojo);
        Botton47.setBackground(Botrojo);
        sin1 = 0;
        sin2 = 0;
        sin3 = 0; 
        sin4 = 0;
        sin5 = 0;
        sin6 = 0;
        sin7 = 0;
        sin8 = 0;
        sin9 = 0;
        sin10 = 0;
        sin11 = 0;
        sin12 = 0;
        sin13 = 0;
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
        SalJumbo = new javax.swing.JLabel();
        Botton12 = new Clases.PanelRound();
        jLabel13 = new javax.swing.JLabel();
        Botton3 = new Clases.PanelRound();
        Salchi = new javax.swing.JLabel();
        Botton8 = new Clases.PanelRound();
        jLabel9 = new javax.swing.JLabel();
        Botton4 = new Clases.PanelRound();
        Chori = new javax.swing.JLabel();
        Botton9 = new Clases.PanelRound();
        jLabel10 = new javax.swing.JLabel();
        Botton11 = new Clases.PanelRound();
        Argentino = new javax.swing.JLabel();
        Botton5 = new Clases.PanelRound();
        jLabel6 = new javax.swing.JLabel();
        Botton10 = new Clases.PanelRound();
        ahumado = new javax.swing.JLabel();
        Botton14 = new Clases.PanelRound();
        Botton6 = new Clases.PanelRound();
        jLabel7 = new javax.swing.JLabel();
        Botton13 = new Clases.PanelRound();
        todas = new javax.swing.JLabel();
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
        jLabel31 = new javax.swing.JLabel();
        Botton41 = new Clases.PanelRound();
        jLabel25 = new javax.swing.JLabel();
        Botton42 = new Clases.PanelRound();
        jLabel26 = new javax.swing.JLabel();
        Botton43 = new Clases.PanelRound();
        jLabel27 = new javax.swing.JLabel();
        Botton44 = new Clases.PanelRound();
        jLabel28 = new javax.swing.JLabel();
        Botton45 = new Clases.PanelRound();
        jLabel29 = new javax.swing.JLabel();
        Botton46 = new Clases.PanelRound();
        jLabel30 = new javax.swing.JLabel();
        Botton47 = new Clases.PanelRound();
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

        jPanel1.add(Botton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 120, -1));

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

        jPanel1.add(Botton37, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, -1, -1));

        Botton39.setBackground(new java.awt.Color(255, 102, 102));
        Botton39.setMaximumSize(null);
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

        jPanel1.add(Botton39, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));

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
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        Botton2Layout.setVerticalGroup(
            Botton2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        jPanel1.add(Botton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, -1, -1));

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

        jPanel1.add(Botton38, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

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

        jPanel1.add(Botton40, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 34, 480, 100));

        jPanel5.setBackground(new java.awt.Color(77, 77, 77));

        Botton7.setBackground(new java.awt.Color(255, 102, 102));
        Botton7.setPreferredSize(new java.awt.Dimension(110, 55));
        Botton7.setRoundBottomLeft(20);
        Botton7.setRoundBottomRight(20);
        Botton7.setRoundTopLeft(20);
        Botton7.setRoundTopRight(20);

        SalJumbo.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        SalJumbo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SalJumbo.setText("SALCHICHA JUMBO");
        SalJumbo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalJumboMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton7Layout = new javax.swing.GroupLayout(Botton7);
        Botton7.setLayout(Botton7Layout);
        Botton7Layout.setHorizontalGroup(
            Botton7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Botton7Layout.createSequentialGroup()
                .addComponent(SalJumbo, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        Botton7Layout.setVerticalGroup(
            Botton7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SalJumbo, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
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
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
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

        Salchi.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        Salchi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Salchi.setText("SALCHICHA PEQUEÑA");
        Salchi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalchiMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton3Layout = new javax.swing.GroupLayout(Botton3);
        Botton3.setLayout(Botton3Layout);
        Botton3Layout.setHorizontalGroup(
            Botton3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Botton3Layout.createSequentialGroup()
                .addComponent(Salchi, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        Botton3Layout.setVerticalGroup(
            Botton3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Salchi, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
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

        Chori.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        Chori.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Chori.setText("CHORIZO BREMEN");
        Chori.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChoriMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton4Layout = new javax.swing.GroupLayout(Botton4);
        Botton4.setLayout(Botton4Layout);
        Botton4Layout.setHorizontalGroup(
            Botton4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Botton4Layout.createSequentialGroup()
                .addComponent(Chori, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Botton4Layout.setVerticalGroup(
            Botton4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Chori, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
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

        Argentino.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        Argentino.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Argentino.setText("CHORIZO ARGENTINO");
        Argentino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ArgentinoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton11Layout = new javax.swing.GroupLayout(Botton11);
        Botton11.setLayout(Botton11Layout);
        Botton11Layout.setHorizontalGroup(
            Botton11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Botton11Layout.createSequentialGroup()
                .addComponent(Argentino, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Botton11Layout.setVerticalGroup(
            Botton11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Argentino, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
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

        ahumado.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        ahumado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ahumado.setText("CHORIZO AHUMADO");
        ahumado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ahumadoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton10Layout = new javax.swing.GroupLayout(Botton10);
        Botton10.setLayout(Botton10Layout);
        Botton10Layout.setHorizontalGroup(
            Botton10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Botton10Layout.createSequentialGroup()
                .addComponent(ahumado, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Botton10Layout.setVerticalGroup(
            Botton10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ahumado, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
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
            .addGap(0, 0, Short.MAX_VALUE)
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

        todas.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        todas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        todas.setText("TODAS LAS CARNES");
        todas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                todasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton13Layout = new javax.swing.GroupLayout(Botton13);
        Botton13.setLayout(Botton13Layout);
        Botton13Layout.setHorizontalGroup(
            Botton13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(todas, javax.swing.GroupLayout.PREFERRED_SIZE, 110, Short.MAX_VALUE)
        );
        Botton13Layout.setVerticalGroup(
            Botton13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(todas, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(Botton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Botton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Botton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Botton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(Botton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Botton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Botton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(Botton11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Botton12, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Botton13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Botton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Botton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(13, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Botton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botton10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Botton14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botton13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botton11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botton12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 470, -1));

        jPanel2.setBackground(new java.awt.Color(77, 77, 77));

        Botton30.setBackground(new java.awt.Color(255, 102, 102));
        Botton30.setPreferredSize(new java.awt.Dimension(90, 30));
        Botton30.setRoundBottomLeft(10);
        Botton30.setRoundBottomRight(10);
        Botton30.setRoundTopLeft(10);
        Botton30.setRoundTopRight(10);
        Botton30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton30MouseClicked(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("CON TODO");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel16MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout Botton30Layout = new javax.swing.GroupLayout(Botton30);
        Botton30.setLayout(Botton30Layout);
        Botton30Layout.setHorizontalGroup(
            Botton30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        Botton30Layout.setVerticalGroup(
            Botton30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        Botton31.setBackground(new java.awt.Color(255, 102, 102));
        Botton31.setPreferredSize(new java.awt.Dimension(90, 30));
        Botton31.setRoundBottomLeft(10);
        Botton31.setRoundBottomRight(10);
        Botton31.setRoundTopLeft(10);
        Botton31.setRoundTopRight(10);
        Botton31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton31MouseClicked(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("SIN SALSA ");
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel17MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout Botton31Layout = new javax.swing.GroupLayout(Botton31);
        Botton31.setLayout(Botton31Layout);
        Botton31Layout.setHorizontalGroup(
            Botton31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        Botton31Layout.setVerticalGroup(
            Botton31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        Botton32.setBackground(new java.awt.Color(255, 102, 102));
        Botton32.setPreferredSize(new java.awt.Dimension(90, 30));
        Botton32.setRoundBottomLeft(10);
        Botton32.setRoundBottomRight(10);
        Botton32.setRoundTopLeft(10);
        Botton32.setRoundTopRight(10);
        Botton32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton32MouseClicked(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
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
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        Botton32Layout.setVerticalGroup(
            Botton32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        Botton33.setBackground(new java.awt.Color(255, 102, 102));
        Botton33.setPreferredSize(new java.awt.Dimension(90, 30));
        Botton33.setRoundBottomLeft(10);
        Botton33.setRoundBottomRight(10);
        Botton33.setRoundTopLeft(10);
        Botton33.setRoundTopRight(10);
        Botton33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton33MouseClicked(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
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
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        Botton33Layout.setVerticalGroup(
            Botton33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        Botton34.setBackground(new java.awt.Color(255, 102, 102));
        Botton34.setPreferredSize(new java.awt.Dimension(90, 30));
        Botton34.setRoundBottomLeft(10);
        Botton34.setRoundBottomRight(10);
        Botton34.setRoundTopLeft(10);
        Botton34.setRoundTopRight(10);
        Botton34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton34MouseClicked(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
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
            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        Botton34Layout.setVerticalGroup(
            Botton34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        Botton35.setBackground(new java.awt.Color(255, 102, 102));
        Botton35.setPreferredSize(new java.awt.Dimension(90, 30));
        Botton35.setRoundBottomLeft(10);
        Botton35.setRoundBottomRight(10);
        Botton35.setRoundTopLeft(10);
        Botton35.setRoundTopRight(10);
        Botton35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton35MouseClicked(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
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
            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        Botton35Layout.setVerticalGroup(
            Botton35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        Botton36.setBackground(new java.awt.Color(255, 102, 102));
        Botton36.setPreferredSize(new java.awt.Dimension(90, 30));
        Botton36.setRoundBottomLeft(10);
        Botton36.setRoundBottomRight(10);
        Botton36.setRoundTopLeft(10);
        Botton36.setRoundTopRight(10);
        Botton36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton36MouseClicked(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("SIN CHIMICHURI");
        jLabel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel31MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton36Layout = new javax.swing.GroupLayout(Botton36);
        Botton36.setLayout(Botton36Layout);
        Botton36Layout.setHorizontalGroup(
            Botton36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        Botton36Layout.setVerticalGroup(
            Botton36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        Botton41.setBackground(new java.awt.Color(255, 102, 102));
        Botton41.setPreferredSize(new java.awt.Dimension(90, 30));
        Botton41.setRoundBottomLeft(10);
        Botton41.setRoundBottomRight(10);
        Botton41.setRoundTopLeft(10);
        Botton41.setRoundTopRight(10);
        Botton41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton41MouseClicked(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("SOLO GUACAMOL");
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton41Layout = new javax.swing.GroupLayout(Botton41);
        Botton41.setLayout(Botton41Layout);
        Botton41Layout.setHorizontalGroup(
            Botton41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Botton41Layout.setVerticalGroup(
            Botton41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        Botton42.setBackground(new java.awt.Color(255, 102, 102));
        Botton42.setPreferredSize(new java.awt.Dimension(90, 30));
        Botton42.setRoundBottomLeft(10);
        Botton42.setRoundBottomRight(10);
        Botton42.setRoundTopLeft(10);
        Botton42.setRoundTopRight(10);
        Botton42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton42MouseClicked(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("SIN CHIRMOL");
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton42Layout = new javax.swing.GroupLayout(Botton42);
        Botton42.setLayout(Botton42Layout);
        Botton42Layout.setHorizontalGroup(
            Botton42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        Botton42Layout.setVerticalGroup(
            Botton42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        Botton43.setBackground(new java.awt.Color(255, 102, 102));
        Botton43.setPreferredSize(new java.awt.Dimension(90, 30));
        Botton43.setRoundBottomLeft(10);
        Botton43.setRoundBottomRight(10);
        Botton43.setRoundTopLeft(10);
        Botton43.setRoundTopRight(10);
        Botton43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton43MouseClicked(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("SOLO MAYONESA");
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton43Layout = new javax.swing.GroupLayout(Botton43);
        Botton43.setLayout(Botton43Layout);
        Botton43Layout.setHorizontalGroup(
            Botton43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Botton43Layout.setVerticalGroup(
            Botton43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        Botton44.setBackground(new java.awt.Color(255, 102, 102));
        Botton44.setPreferredSize(new java.awt.Dimension(90, 30));
        Botton44.setRoundBottomLeft(10);
        Botton44.setRoundBottomRight(10);
        Botton44.setRoundTopLeft(10);
        Botton44.setRoundTopRight(10);
        Botton44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton44MouseClicked(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("SOLO MOSTASA");
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton44Layout = new javax.swing.GroupLayout(Botton44);
        Botton44.setLayout(Botton44Layout);
        Botton44Layout.setHorizontalGroup(
            Botton44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        Botton44Layout.setVerticalGroup(
            Botton44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        Botton45.setBackground(new java.awt.Color(255, 102, 102));
        Botton45.setPreferredSize(new java.awt.Dimension(90, 30));
        Botton45.setRoundBottomLeft(10);
        Botton45.setRoundBottomRight(10);
        Botton45.setRoundTopLeft(10);
        Botton45.setRoundTopRight(10);
        Botton45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton45MouseClicked(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("SOLO GUACAMOL");
        jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel29MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton45Layout = new javax.swing.GroupLayout(Botton45);
        Botton45.setLayout(Botton45Layout);
        Botton45Layout.setHorizontalGroup(
            Botton45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Botton45Layout.setVerticalGroup(
            Botton45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        Botton46.setBackground(new java.awt.Color(255, 102, 102));
        Botton46.setPreferredSize(new java.awt.Dimension(90, 30));
        Botton46.setRoundBottomLeft(10);
        Botton46.setRoundBottomRight(10);
        Botton46.setRoundTopLeft(10);
        Botton46.setRoundTopRight(10);
        Botton46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton46MouseClicked(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("SOLO CHIMICHURI");
        jLabel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel30MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton46Layout = new javax.swing.GroupLayout(Botton46);
        Botton46.setLayout(Botton46Layout);
        Botton46Layout.setHorizontalGroup(
            Botton46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Botton46Layout.setVerticalGroup(
            Botton46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        Botton47.setBackground(new java.awt.Color(255, 102, 102));
        Botton47.setPreferredSize(new java.awt.Dimension(90, 30));
        Botton47.setRoundBottomLeft(10);
        Botton47.setRoundBottomRight(10);
        Botton47.setRoundTopLeft(10);
        Botton47.setRoundTopRight(10);
        Botton47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton47MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton47Layout = new javax.swing.GroupLayout(Botton47);
        Botton47.setLayout(Botton47Layout);
        Botton47Layout.setHorizontalGroup(
            Botton47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        Botton47Layout.setVerticalGroup(
            Botton47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Botton36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(Botton47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(Botton33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Botton44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(Botton32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Botton43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Botton35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Botton46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Botton30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Botton41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Botton31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Botton42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Botton34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Botton45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Botton30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botton41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Botton31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botton42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Botton32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botton43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Botton33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botton44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Botton34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botton45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Botton35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botton46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Botton36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botton47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 210, -1));

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

        SalPequeña.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
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

        ChoriBremen.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
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
            .addComponent(ChoriBremen, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
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

        Extra3.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
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

        Extra4.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
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

        SAlchi.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
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

        Extra6.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
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

        Extra7.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
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

        ChoAhumado.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
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

        ChoArgenti.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
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

        Extra11.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
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

        PorciMayonesa.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
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

        Extra14.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
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

        Queso.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
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

        Extra10.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
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

        PorciGuaca.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
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

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 253, 270));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 600, -1, -1));

        cantidad.setEditable(false);
        cantidad.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        cantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cantidad.setText("1");
        add(cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 610, 60, 28));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ARRIBA.png"))); // NOI18N
        jButton2.setPreferredSize(new java.awt.Dimension(40, 47));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 600, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ABAJO.png"))); // NOI18N
        jButton1.setPreferredSize(new java.awt.Dimension(40, 47));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 600, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void SalJumboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalJumboMouseClicked
       //Boton Salchicha Jumbo
       carne5();
    }//GEN-LAST:event_SalJumboMouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        //Boton Tosino
        carne10();
    }//GEN-LAST:event_jLabel13MouseClicked

    private void Botton12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton12MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton12MouseClicked

    private void SalchiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalchiMouseClicked
        //Boton Salchicha
        carne1();
    }//GEN-LAST:event_SalchiMouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
    //Boton Adobado        
       carne6();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void Botton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton8MouseClicked

    private void ChoriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChoriMouseClicked
     carne2();
    }//GEN-LAST:event_ChoriMouseClicked

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

    private void ArgentinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ArgentinoMouseClicked
     //Boton Chorizo Argentino        
       carne9();
    }//GEN-LAST:event_ArgentinoMouseClicked

    private void Botton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton11MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton11MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
   carne3();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void Botton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton5MouseClicked

    private void ahumadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ahumadoMouseClicked
         //Boton Chorizo Ahumado

       carne8();
    }//GEN-LAST:event_ahumadoMouseClicked

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
      
        if(entra == 2){limpiarSin();NumSin.clear();}
       
        if (sin1 == 0) {
            Botton30.setBackground(Botverde);
            sin1 = 1;
            entra = 3;
            NumSin.add(1);
            colores();
            //Botton32.setEnabled(true);
            //Botton33.setEnabled(true);
        } else {
            Botton30.setBackground(Botrojo);
            sin1 = 0;
            entra = 2;
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
            if(entra ==2){ 
            
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
        if(entra ==2){ 
            if (sin3 == 0) {
                Botton32.setBackground(Botverde);
                sin3 = 1;
                NumSin.add(3);
            } else {
                Botton32.setBackground(Botrojo);
                sin3 = 0;
                int remov = NumSin.indexOf(3);
                NumSin.remove(remov);

            
        }}
    }//GEN-LAST:event_jLabel18MouseClicked

    private void Botton32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton32MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton32MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        if(entra ==2){ 
            if (sin4 == 0) {
                Botton33.setBackground(Botverde);
                sin4 = 1;
                NumSin.add(4);
            } else {
                Botton33.setBackground(Botrojo);
                sin4 = 0;
                int remov = NumSin.indexOf(4);
                NumSin.remove(remov);
        }}
    }//GEN-LAST:event_jLabel19MouseClicked

    private void Botton33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton33MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton33MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
   
        if(entra ==2){ 
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
       if(entra ==2){ 
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
       if(entra ==2){ 
        if (marca15 == 0) {
            Botton15.setBackground(Botverde);
            marca15 = 1;
            Num.add(52);
        } else {
            Botton15.setBackground(Botrojo);
            marca15 = 0;entra =1;
            int remov = Num.indexOf(52);
            Num.remove(remov);

        }
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
       Limpiar();
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
       if(NumSin.size()!=0){        
        int a =Cantidacarnes.size(); System.out.println("CARNES = "+a+" Y MENU= "+menu);
        if(Cantidacarnes.size()!=0){
        if(menu == 12)
        {
            if(Cantidacarnes.size()>0 && Cantidacarnes.size()<=1){InsertarProductoTortilla();} else {JOptionPane.showMessageDialog(null, "SELECCIONE SOLO UNA CARNE");}
        }
        else if(menu == 13)
        { 
            if(Cantidacarnes.size()>1 && Cantidacarnes.size()<=2){InsertarProductoTortilla();} else {JOptionPane.showMessageDialog(null, "SELECCIONE SOLO DOS CARNES");}
        }
        
        else if (menu == 14){if(Cantidacarnes.size()>2 && Cantidacarnes.size()<=3){InsertarProductoTortilla();} else {JOptionPane.showMessageDialog(null, "SELECCIONE SOLO TRES CARNES");}}
        
        else if (menu == 15){if(Cantidacarnes.size()>3 && Cantidacarnes.size()<=4){InsertarProductoTortilla();} else {JOptionPane.showMessageDialog(null, "SELECCIONE SOLO CUATRO CARNES");}}
        
        
        else if(menu == 16){if(Cantidacarnes.size()>4 && Cantidacarnes.size()<=5){InsertarProductoTortilla();} else {JOptionPane.showMessageDialog(null, "SELECCIONE SOLO CINCO CARNES");}}
        
        else {InsertarProductoTortilla();}
        }else {{JOptionPane.showMessageDialog(null, "SELECCIONE UNA DE LAS CARNES");}}
        ListarProductosPedidos();
       }else {JOptionPane.showMessageDialog(null, "AGREGUE UNA NOTA");}
         
    }//GEN-LAST:event_jLabel24MouseClicked

    private void todasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_todasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_todasMouseClicked

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
           if(entra ==2){ 
            if (sin7 == 0) {
                Botton41.setBackground(Botverde);
                sin7 = 1;
                NumSin.add(14);
            } else {
                Botton41.setBackground(Botrojo);
                sin7 = 0;
                int remov = NumSin.indexOf(14);
                NumSin.remove(remov);
            }}
    }//GEN-LAST:event_jLabel25MouseClicked

    private void Botton41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton41MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton41MouseClicked

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
              if(entra ==2){ 
            if (sin8 == 0) {
                Botton42.setBackground(Botverde);
                sin8 = 1;
                NumSin.add(25);
            } else {
                Botton42.setBackground(Botrojo);
                sin8 = 0;
                int remov = NumSin.indexOf(25);
                NumSin.remove(remov);

            }}
    }//GEN-LAST:event_jLabel26MouseClicked

    private void Botton42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton42MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton42MouseClicked

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
            if(entra ==2){ 
            if (sin9 == 0) {
                Botton43.setBackground(Botverde);
                sin9 = 1;
                NumSin.add(9);
            } else {
                Botton43.setBackground(Botrojo);
                sin9 = 0;
                int remov = NumSin.indexOf(9);
                NumSin.remove(remov);

            }}
    }//GEN-LAST:event_jLabel27MouseClicked

    private void Botton43MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton43MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton43MouseClicked

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked
            if(entra ==2){ 
            if (sin10 == 0) {
                Botton44.setBackground(Botverde);
                sin10 = 1;
                NumSin.add(10);
            } else {
                Botton44.setBackground(Botrojo);
                sin10 = 0;
                int remov = NumSin.indexOf(10);
                NumSin.remove(remov);

            }}
    }//GEN-LAST:event_jLabel28MouseClicked

    private void Botton44MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton44MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton44MouseClicked

    private void jLabel29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseClicked
           if(entra ==2){ 
            if (sin11 == 0) {
                Botton45.setBackground(Botverde);
                sin11= 1;
                NumSin.add(11);
            } else {
                Botton45.setBackground(Botrojo);
                sin11 = 0;
                int remov = NumSin.indexOf(11);
                NumSin.remove(remov);

            }}
    }//GEN-LAST:event_jLabel29MouseClicked

    private void Botton45MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton45MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton45MouseClicked

    private void jLabel30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseClicked
            if(entra ==2){ 
            if (sin12 == 0) {
                Botton46.setBackground(Botverde);
                sin12 = 1;
                NumSin.add(13);
            } else {
                Botton46.setBackground(Botrojo);
                sin12 = 0;
                int remov = NumSin.indexOf(13);
                NumSin.remove(remov);
            }}
    }//GEN-LAST:event_jLabel30MouseClicked

    private void Botton46MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton46MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton46MouseClicked

    private void Botton47MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton47MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton47MouseClicked

    private void jLabel17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel17MouseEntered

    private void jLabel31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseClicked
           if(entra ==2){ 
            if (sin13 == 0) {
                Botton36.setBackground(Botverde);
                sin13 = 1;
                NumSin.add(7);
            } else {
                Botton36.setBackground(Botrojo);
                sin13 = 0;
                int remov = NumSin.indexOf(7);
                NumSin.remove(remov);
            }}
    }//GEN-LAST:event_jLabel31MouseClicked

    private void jLabel16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel16MouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Argentino;
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
    private Clases.PanelRound Botton41;
    private Clases.PanelRound Botton42;
    private Clases.PanelRound Botton43;
    private Clases.PanelRound Botton44;
    private Clases.PanelRound Botton45;
    private Clases.PanelRound Botton46;
    private Clases.PanelRound Botton47;
    private Clases.PanelRound Botton5;
    private Clases.PanelRound Botton6;
    private Clases.PanelRound Botton7;
    private Clases.PanelRound Botton8;
    private Clases.PanelRound Botton9;
    private javax.swing.JLabel ChoAhumado;
    private javax.swing.JLabel ChoArgenti;
    private javax.swing.JLabel Chori;
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
    private javax.swing.JLabel SalJumbo;
    private javax.swing.JLabel SalPequeña;
    private javax.swing.JLabel Salchi;
    private javax.swing.JLabel ahumado;
    private javax.swing.JTextField cantidad;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private Clases.PanelRound panelRound1;
    private javax.swing.JLabel todas;
    // End of variables declaration//GEN-END:variables
}
