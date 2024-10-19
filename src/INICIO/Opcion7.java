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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author jluis
 */
public class Opcion7 extends javax.swing.JPanel {
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
    int marca3c = 1;
    int marca4c = 1; 
    int marca5c = 1;
    int marca6c = 1;
    int marca7c = 1;
    int marca9c = 1;
    int marca8c = 1;
    int marca10c = 1;
    int marca11c = 1;
    int marca12c = 1;
    int marca30 = 0;
    int marca31 = 0;
    int marca32 = 0;
    int id_producto = 0;
    int id_producto_pedido = 0;
    int id_pedido = 0;
    int pan = 0;
    int marcapan = 0;
    int huevos = 0;
     int carnesrepetida;
    double cantidadcarnesrepetida;
    int cantidadcarnes;
    int descargacantidad;
    String nombredecarnes;
    ArrayList<Integer> Cantidacarnes = new ArrayList<>();
    ArrayList<String> NombreCarnes = new ArrayList<>();
    ArrayList<Integer> Num = new ArrayList<>();
    ArrayList<Integer> NumSin = new ArrayList<>();
    ArrayList<Integer> NumSin2 = new ArrayList<>();
    Color Botrojo = new Color(153,204,255); 
    Color Botverde = new Color(0,204,0);
    /**
     * Creates new form Opcion5
     */
    public Opcion7(int a) {
        initComponents();
         this.id_pedido=a;
        String texto1 = "<html><center><body>DESAYUNO CHAPIN<br><font color='RED'>Q25.00</font></body></center></html>";
        UNO.setText(texto1);
        String texto2 = "<html><center><body>DESAYUNO DEL REY<br><font color='RED'>Q45.00</font></body></center></html>";
        DOS.setText(texto2);
        String texto3 = "<html><center><body>DESAYUNO AMERICANO<br><font color='RED'>Q35.00</font></body></center></html>";
        TRES.setText(texto3);
        String texto4 = "<html><center><body>DESAYUNO AMERICANO<br>SUPREMO<br><font color='RED'>Q40.00</font></body></center></html>";
        CUATRO.setText(texto4);
        String texto5 = "<html><center><body>DESAYUNO INFANTIL<br><font color='RED'>Q30.00</font></body></center></html>";
        CINCO.setText(texto5);
        String texto6 = "<html><center><body>BURRITO SUPREMO<br><font color='RED'>Q30.00</font></body></center></html>";
        SEIS.setText(texto6);
        String texto7 = "<html><center><body>ESTRELLADO<br>TIERNO</font></body></center></html>";
        Extra13.setText(texto7);
        String texto8 = "<html><center><body>ESTRELLADO<br>COCIDO</font></body></center></html>";
        Extra14.setText(texto8);
        
        /*
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
        DOCE.setText(texto12);*/
      
    }
    
     Timer timerBoton = new Timer(400, new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("LLEGA");
                    Botton14.setBackground(Botrojo);
                }
            });

    private void Limpiar() {
        
        Botton1.setBackground(Botrojo);
        Botton2.setBackground(Botrojo);
        Botton3.setBackground(Botrojo);
        Botton4.setBackground(Botrojo);
        Botton5.setBackground(Botrojo);
        Botton6.setBackground(Botrojo);
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
        marca1 = 0;   
        marca2 = 0;    
        marca3 = 0;  
        marca4 = 0;
        marca5 = 0;
        marca6 = 0;
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
        marca24 = 0;
        marca26 = 0;
        NumSin.clear();
        NumSin2.clear();
        pan = 0;
        marcapan = 0;
        Num.clear();
        cantidad.setText("1");
        id_producto = 0;
        id_producto_pedido = 0;
        borrar();
    }
    
    
    private void todosBotones() {
          //[255,102,102]
        Botton1.setBackground(Botrojo);
        marca1 = 1;
        Botton2.setBackground(Botrojo);
        marca2 = 1;
        Botton3.setBackground(Botrojo);
        marca3 = 1;
        Botton4.setBackground(Botrojo);
        marca4 = 1;
        Botton5.setBackground(Botrojo);
        marca5 = 1;
        Botton6.setBackground(Botrojo);
        marca6 = 1;
        Botton25.setBackground(Botrojo);
        marca25 = 0;
        Botton26.setBackground(Botrojo);
        marca26 = 0;
        Botton30.setBackground(Botrojo);
        marca30 = 0;
        Botton31.setBackground(Botrojo);
        marca31 = 0;
        Botton32.setBackground(Botrojo);
        marca32 = 0;
        pan = 0;
      
    }
    
    
    private void InsertarProducto() {
        try {
            InsertarProducto p1 = new InsertarProducto();
            p1.setId_pedido(id_pedido);
            p1.setId_producto(id_producto);
            p1.setCantidad( Integer.parseInt( cantidad.getText()));
            p1.setTipo(pan);
            BDProductos.InsertarProducto_Pedido_Desayuno(p1);
            id_producto_pedido = p1.getIdregreso();
            if(marcapan == 2){inserCarnes();}
            insertarAdicional();
            insertarSin();
            if(huevos>0){insertarSin2();}
            System.out.println(id_pedido);
            ListarProductosPedidos();
            Limpiar();
            //JOptionPane.showMessageDialog(null, "Producto Agregado");
         }catch (Exception e) {
        }
     }
    

    private void insertarAdicional(){

    for(int i = 0; i < Num.size(); i++) {
    try {
        BDConexion conecta = new BDConexion();
        Connection con = conecta.getConexion();
        PreparedStatement smtp = null;
        PreparedStatement sm = null;
        sm = con.prepareStatement("{call Opcion_adicional("+Integer.parseInt(cantidad.getText())+","+Num.get(i)+")}");
        smtp =con.prepareStatement("insert into productos_pedido (id_pedido,id_producto,pro_id_productos_pedido,cantidad,adicional,precio,opcion) values(?,?,?,?,2,(select precio*"+cantidad.getText()+" from productos where id_producto = "+Num.get(i)+"),5)");
        smtp.setInt(1,id_pedido);
        smtp.setInt(2,Num.get(i));
        smtp.setInt(3, id_producto_pedido);
        smtp.setInt(4, Integer.parseInt(cantidad.getText()));
        smtp.executeUpdate();
        sm.executeUpdate();
        con.close();
        smtp.close();  
        sm.close();  
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
        smtp =con.prepareStatement("insert into notas (id_productos_pedido,id) values(?,?)");
        smtp.setInt(1,id_producto_pedido);
        smtp.setInt(2,NumSin.get(i));
        smtp.executeUpdate();
        con.close();
        smtp.close();    
     }catch (Exception e){
         
            JOptionPane.showMessageDialog(null,"QUE PASO: "+ e);}
    }
}
     
 private void insertarSin2(){
    for(int i = 0; i < NumSin2.size(); i++) {
    try {
        BDConexion conecta = new BDConexion();
        Connection con = conecta.getConexion();
        PreparedStatement smtp = null;
        smtp =con.prepareStatement("insert into notas (id_productos_pedido,id) values(?,?)");
        smtp.setInt(1,id_producto_pedido);
        smtp.setInt(2,NumSin2.get(i));
        smtp.executeUpdate();
        con.close();
        smtp.close();    
     }catch (Exception e){
         
            JOptionPane.showMessageDialog(null,"QUE PASO: "+ e);}
    }
}    
     
     private void inserCarnes(){   

    for(int i = 0; i < Cantidacarnes.size(); i++) {
        
     if(null==Cantidacarnes.get(i)){
            if(carnesrepetida == Cantidacarnes.get(i)){cantidadcarnesrepetida = cantidadcarnesrepetida+1;}else{cantidadcarnesrepetida = Integer.parseInt(cantidad.getText());}//NUEVO
            carnesrepetida = Cantidacarnes.get(i);//NUEVO
        }
        else switch (Cantidacarnes.get(i)) {
            case 17:
                if(carnesrepetida == Cantidacarnes.get(i)){cantidadcarnesrepetida = cantidadcarnesrepetida+4;}else{cantidadcarnesrepetida =0; cantidadcarnesrepetida = cantidadcarnesrepetida+4;}//NUEVO
                carnesrepetida = Cantidacarnes.get(i);//NUEVO
                break;
            case 21:
                if(carnesrepetida == Cantidacarnes.get(i)){cantidadcarnesrepetida = cantidadcarnesrepetida+2.67;}else{cantidadcarnesrepetida =0; cantidadcarnesrepetida = cantidadcarnesrepetida+2.67;}//NUEVO
                carnesrepetida = Cantidacarnes.get(i);//NUEVO
                break;
            case 20:
                if(carnesrepetida == Cantidacarnes.get(i)){cantidadcarnesrepetida = cantidadcarnesrepetida+3.20;}else{cantidadcarnesrepetida =0; cantidadcarnesrepetida = cantidadcarnesrepetida+3.20;}//NUEVO
                carnesrepetida = Cantidacarnes.get(i);//NUEVO
                break;
            case 24:
                if(carnesrepetida == Cantidacarnes.get(i)){cantidadcarnesrepetida = cantidadcarnesrepetida+2;}else{cantidadcarnesrepetida =0; cantidadcarnesrepetida = cantidadcarnesrepetida+2;}//NUEVO
                carnesrepetida = Cantidacarnes.get(i);//NUEVO
                break;
            case 23:
                if(carnesrepetida == Cantidacarnes.get(i)){cantidadcarnesrepetida = cantidadcarnesrepetida+1;}else{cantidadcarnesrepetida =0; cantidadcarnesrepetida = cantidadcarnesrepetida+1;}//NUEVO
                carnesrepetida = Cantidacarnes.get(i);//NUEVO
                break;
            default:
                if(carnesrepetida == Cantidacarnes.get(i)){cantidadcarnesrepetida = cantidadcarnesrepetida+1;}else{cantidadcarnesrepetida = Integer.parseInt(cantidad.getText());}//NUEVO
                carnesrepetida = Cantidacarnes.get(i);//NUEVO
                break;
        }
        carnesrepetida = Cantidacarnes.get(i);//NUEVO
        
        
    try {
        if(Cantidacarnes.get(i)==17){descargacantidad = Integer.parseInt(cantidad.getText())*3;}else{descargacantidad = Integer.parseInt(cantidad.getText());}
        BDConexion conecta = new BDConexion();
        Connection con = conecta.getConexion();
        PreparedStatement smtp = null;
        PreparedStatement sm = null;
        //insert into PRODUCTOS_PEDIDO (id_pedido,id_producto,cantidad,tipo,extra) values(?,?,?,?,1) select precio*"+t.getCantidad()+" from PRODUCTOS where ID_PRODUCTO =  "+t.getId_producto()+" 
        sm = con.prepareStatement("{call Opcion7_carnes("+Integer.parseInt(cantidad.getText())+","+Cantidacarnes.get(i)+")}");
        smtp =con.prepareStatement("insert into NOTAS (id_productos_pedido,id,cantidad,tipo) values(?,?,"+cantidadcarnesrepetida*Integer.parseInt(cantidad.getText())+",1)");
        smtp.setInt(1, id_producto_pedido);
        smtp.setInt(2,Cantidacarnes.get(i));
        smtp.executeUpdate();
        sm.executeUpdate();
        con.close();
        smtp.close(); 
        sm.close();  
     } catch (Exception e) {
         
            JOptionPane.showMessageDialog(null,"QUE PASO CARNES: "+ e);}
        }
    }
     
    private void carne1(){ //Boton Salchicha
      if (marca3c == 1) {
            Botton8.setBackground(Botverde);
            marca3c = 0;NombreCarnes.add("SALCHICHA");
            Cantidacarnes.add(15);
            
        } else {
            Botton8.setBackground(Botrojo);
            marca3c = 1;
            int remov = Cantidacarnes.indexOf(15);
            Cantidacarnes.remove(remov);
            int r = NombreCarnes.indexOf("SALCHICHA");
            NombreCarnes.remove(r);
          }
      
     }
     private void carne2(){//Boton Chorizo bremen     
      if (marca4c == 1) {
            Botton10.setBackground(Botverde);
            marca4c = 0;NombreCarnes.add("BREMEN");
            Cantidacarnes.add(16);
            
        } else {
            Botton10.setBackground(Botrojo);
            marca4c = 1;
            int remov = Cantidacarnes.indexOf(16);
            Cantidacarnes.remove(remov);
            int r = NombreCarnes.indexOf("BREMEN");
            NombreCarnes.remove(r);
          }
     }
     
     private void carne3(){ // Boton Salami   
      if (marca5c == 1) {
            Botton14.setBackground(Botverde);
            marca5c = 0;  NombreCarnes.add("SALAMI");
            Cantidacarnes.add(17);
            
        } else {
            Botton14.setBackground(Botrojo);
            marca5c = 1;
            int remov = Cantidacarnes.indexOf(17);
            Cantidacarnes.remove(remov);
            int r = NombreCarnes.indexOf("SALAMI");
            NombreCarnes.remove(r);
          }
      
     }
     private void carne4(){ //Boton Longaniza
      if (marca6c == 1) {
            Botton29.setBackground(Botverde);
            marca6c = 0;NombreCarnes.add("LONGANIZA"); 
            Cantidacarnes.add(18); 
            
        } else {
            Botton29.setBackground(Botrojo);
            marca6c = 1;
            int remov = Cantidacarnes.indexOf(18);
            Cantidacarnes.remove(remov);
            int r = NombreCarnes.indexOf("LONGANIZA");
            NombreCarnes.remove(r);
          }
     }
     private void carne5(){//Boton Salchicha Jumbo
      if (marca7c == 1) {
            Botton7.setBackground(Botverde);
            marca7c = 0;
            Cantidacarnes.add(19);
             NombreCarnes.add("JUMBO"); 
        } else {
            Botton7.setBackground(Botrojo);
            marca7c = 1;
            int remov = Cantidacarnes.indexOf(19);
            Cantidacarnes.remove(remov);
            int r = NombreCarnes.indexOf("JUMBO");
            NombreCarnes.remove(r);
          }
     }
     private void carne6(){ //ADOBADO
      if (marca8c == 1) {
            Botton9.setBackground(Botverde);
            marca8c = 0;
            Cantidacarnes.add(20); 
            NombreCarnes.add("ADOBADO"); 
        } else {
            Botton9.setBackground(Botrojo);
            marca8c = 1;
            int remov = Cantidacarnes.indexOf(20);
            Cantidacarnes.remove(remov);
            /*int r = NombreCarnes.indexOf("ADOBADO");
            NombreCarnes.remove(r);*/
          }
     }
     private void carne7(){ //RES
      if (marca9c == 1) {
            Botton11.setBackground(Botverde);
            marca9c = 0;
            Cantidacarnes.add(21);
            NombreCarnes.add("RES"); 
        } else {
            Botton11.setBackground(Botrojo);
            marca9c = 1;
            int remov = Cantidacarnes.indexOf(21);
            Cantidacarnes.remove(remov);
            int r = NombreCarnes.indexOf("RES");
            NombreCarnes.remove(r);
          }
     }
     private void carne8(){ //CHORIZO AHUMADO
      if (marca10c == 1) {
            Botton27.setBackground(Botverde);
            marca10c = 0;
            Cantidacarnes.add(22);
            NombreCarnes.add("AHUMADO");
        } else {
            Botton27.setBackground(Botrojo);
            marca10c = 1;
            int remov = Cantidacarnes.indexOf(22);
            Cantidacarnes.remove(remov);
            int r = NombreCarnes.indexOf("AHUMADO");
            NombreCarnes.remove(r);
          }
     }
     private void carne9(){//Chorizo Argentino
      if (marca11c == 1) {
            Botton13.setBackground(Botverde);
            marca11c = 0;
            Cantidacarnes.add(23); 
            NombreCarnes.add("ARGENTINO"); 
        } else {
            Botton13.setBackground(Botrojo);
            marca11c = 1;
            int remov = Cantidacarnes.indexOf(23);
            Cantidacarnes.remove(remov);
            int r = NombreCarnes.indexOf("ARGENTINO");
            NombreCarnes.remove(r);
          }
     }
     private void carne10(){
      if (marca12c == 1) {
            Botton12.setBackground(Botverde);
            marca12c = 0;
            Cantidacarnes.add(24);
            NombreCarnes.add("TOCINO");
        } else {
            Botton12.setBackground(Botrojo);
            marca12c = 1;
            int remov = Cantidacarnes.indexOf(24);
            Cantidacarnes.remove(remov);
            int r = NombreCarnes.indexOf("TOCINO");
            NombreCarnes.remove(r);
          }
     }
     
     private void borrar(){
     Botton14.setBackground(Botverde);
        timerBoton.setRepeats(false);
        timerBoton.start();
        Cantidacarnes.clear();
        NombreCarnes.clear();
        nombredecarnes="";
        cantidadcarnes=0;
        marca3c = 1; marca4c = 1;marca5c = 1;marca6c = 1;marca7c = 1;marca8c = 1;marca9c = 1;marca10c = 1; marca11c = 1;marca12c = 1; 
        Botton7.setBackground(Botrojo);
        Botton12.setBackground(Botrojo);
        Botton8.setBackground(Botrojo);
        Botton9.setBackground(Botrojo);
        Botton10.setBackground(Botrojo);
        Botton11.setBackground(Botrojo);
        Botton13.setBackground(Botrojo);
        Botton14.setBackground(Botrojo);
        Botton27.setBackground(Botrojo);
        Botton28.setBackground(Botrojo);
        Botton29.setBackground(Botrojo);
        Botton30.setBackground(Botrojo);
        Botton31.setBackground(Botrojo);
        Botton32.setBackground(Botrojo);
        marca30 = 0;
        marca31 = 0;
        marca32 = 0;
        DefaultListModel modelo = new DefaultListModel();
        jList1.setModel(modelo);
          }
     
      private void agregaralist(){
  DefaultListModel listModel = new DefaultListModel();
//Recorrer el contenido del ArrayList
    for(int i=0; i<NombreCarnes.size(); i++) {
    //Añadir cada elemento del ArrayList en el modelo de la lista
    listModel.add(i, NombreCarnes.get(i));
}
//Asociar el modelo de lista al JList
jList1.setModel(listModel);

jList1.clearSelection();

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
        Botton24 = new Clases.PanelRound();
        Extra10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Botton25 = new Clases.PanelRound();
        Extra11 = new javax.swing.JLabel();
        Botton26 = new Clases.PanelRound();
        Extra12 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        Botton7 = new Clases.PanelRound();
        SalJumbo = new javax.swing.JLabel();
        Botton12 = new Clases.PanelRound();
        jLabel13 = new javax.swing.JLabel();
        Botton8 = new Clases.PanelRound();
        Salchi = new javax.swing.JLabel();
        Botton9 = new Clases.PanelRound();
        jLabel9 = new javax.swing.JLabel();
        Botton10 = new Clases.PanelRound();
        Chori = new javax.swing.JLabel();
        Botton11 = new Clases.PanelRound();
        jLabel10 = new javax.swing.JLabel();
        Botton13 = new Clases.PanelRound();
        Argentino = new javax.swing.JLabel();
        Botton14 = new Clases.PanelRound();
        jLabel6 = new javax.swing.JLabel();
        Botton27 = new Clases.PanelRound();
        ahumado = new javax.swing.JLabel();
        Botton28 = new Clases.PanelRound();
        jLabel5 = new javax.swing.JLabel();
        Botton29 = new Clases.PanelRound();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel4 = new javax.swing.JPanel();
        Botton30 = new Clases.PanelRound();
        Extra13 = new javax.swing.JLabel();
        Botton31 = new Clases.PanelRound();
        Extra14 = new javax.swing.JLabel();
        Botton32 = new Clases.PanelRound();
        Extra15 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));
        setPreferredSize(new java.awt.Dimension(730, 690));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ARRIBA.png"))); // NOI18N
        jButton2.setPreferredSize(new java.awt.Dimension(40, 47));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 590, -1, -1));

        cantidad.setEditable(false);
        cantidad.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        cantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cantidad.setText("1");
        add(cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 600, 50, 28));

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
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 590, -1, -1));

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

        add(BotonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 590, 120, -1));

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        Botton1.setBackground(new java.awt.Color(153, 204, 255));
        Botton1.setPreferredSize(new java.awt.Dimension(136, 60));
        Botton1.setRoundBottomLeft(15);
        Botton1.setRoundBottomRight(15);
        Botton1.setRoundTopLeft(15);
        Botton1.setRoundTopRight(15);

        UNO.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        UNO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UNO.setText("1");
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

        DOS.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        DOS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DOS.setText("2");
        DOS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DOSMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton2Layout = new javax.swing.GroupLayout(Botton2);
        Botton2.setLayout(Botton2Layout);
        Botton2Layout.setHorizontalGroup(
            Botton2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DOS, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
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

        TRES.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        TRES.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TRES.setText("3");
        TRES.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TRESMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton3Layout = new javax.swing.GroupLayout(Botton3);
        Botton3.setLayout(Botton3Layout);
        Botton3Layout.setHorizontalGroup(
            Botton3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TRES, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
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

        CUATRO.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        CUATRO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CUATRO.setText("4");
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

        CINCO.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        CINCO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CINCO.setText("5");
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
        SEIS.setText("6");
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
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
                        .addComponent(Botton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
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
                .addContainerGap(8, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 440, 140));

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));

        Botton15.setBackground(new java.awt.Color(153, 204, 255));
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

        Botton16.setBackground(new java.awt.Color(153, 204, 255));
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

        Botton17.setBackground(new java.awt.Color(153, 204, 255));
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

        Botton18.setBackground(new java.awt.Color(153, 204, 255));
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

        Botton19.setBackground(new java.awt.Color(153, 204, 255));
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
            .addComponent(SAlchi, javax.swing.GroupLayout.PREFERRED_SIZE, 75, Short.MAX_VALUE)
        );
        Botton19Layout.setVerticalGroup(
            Botton19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SAlchi, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        Botton20.setBackground(new java.awt.Color(153, 204, 255));
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

        Botton21.setBackground(new java.awt.Color(153, 204, 255));
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

        Botton22.setBackground(new java.awt.Color(153, 204, 255));
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
            .addComponent(ChoAhumado, javax.swing.GroupLayout.PREFERRED_SIZE, 75, Short.MAX_VALUE)
        );
        Botton22Layout.setVerticalGroup(
            Botton22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ChoAhumado, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        Botton23.setBackground(new java.awt.Color(153, 204, 255));
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
            .addComponent(ChoArgenti, javax.swing.GroupLayout.PREFERRED_SIZE, 75, Short.MAX_VALUE)
        );
        Botton23Layout.setVerticalGroup(
            Botton23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ChoArgenti, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        Botton24.setBackground(new java.awt.Color(153, 204, 255));
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Botton15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(Botton16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(Botton17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Botton18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(Botton19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(Botton20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Botton21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(Botton22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(Botton23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Botton24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Botton15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botton16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botton17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Botton18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botton19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botton20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Botton21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botton22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botton23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(Botton24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 250, 210));

        Botton25.setBackground(new java.awt.Color(153, 204, 255));
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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Extra11MouseEntered(evt);
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

        Botton26.setBackground(new java.awt.Color(153, 204, 255));
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

        Extra12.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        Extra12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Extra12.setText("TORTILLA");
        Extra12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Extra12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton26Layout = new javax.swing.GroupLayout(Botton26);
        Botton26.setLayout(Botton26Layout);
        Botton26Layout.setHorizontalGroup(
            Botton26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Extra12, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
        );
        Botton26Layout.setVerticalGroup(
            Botton26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Extra12, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Botton25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Botton26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Botton25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botton26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, 180, 60));

        jPanel5.setBackground(new java.awt.Color(255, 204, 204));

        Botton7.setBackground(new java.awt.Color(153, 204, 255));
        Botton7.setPreferredSize(new java.awt.Dimension(98, 46));
        Botton7.setRoundBottomLeft(20);
        Botton7.setRoundBottomRight(20);
        Botton7.setRoundTopLeft(20);
        Botton7.setRoundTopRight(20);

        SalJumbo.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        SalJumbo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SalJumbo.setText(" JUMBO");
        SalJumbo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalJumboMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SalJumboMousePressed(evt);
            }
        });

        javax.swing.GroupLayout Botton7Layout = new javax.swing.GroupLayout(Botton7);
        Botton7.setLayout(Botton7Layout);
        Botton7Layout.setHorizontalGroup(
            Botton7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SalJumbo, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
        );
        Botton7Layout.setVerticalGroup(
            Botton7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SalJumbo, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        Botton12.setBackground(new java.awt.Color(153, 204, 255));
        Botton12.setPreferredSize(new java.awt.Dimension(98, 46));
        Botton12.setRoundBottomLeft(20);
        Botton12.setRoundBottomRight(20);
        Botton12.setRoundTopLeft(20);
        Botton12.setRoundTopRight(20);
        Botton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton12MouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("TOCINO");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel13MousePressed(evt);
            }
        });

        javax.swing.GroupLayout Botton12Layout = new javax.swing.GroupLayout(Botton12);
        Botton12.setLayout(Botton12Layout);
        Botton12Layout.setHorizontalGroup(
            Botton12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
        );
        Botton12Layout.setVerticalGroup(
            Botton12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        Botton8.setBackground(new java.awt.Color(153, 204, 255));
        Botton8.setPreferredSize(new java.awt.Dimension(98, 46));
        Botton8.setRoundBottomLeft(20);
        Botton8.setRoundBottomRight(20);
        Botton8.setRoundTopLeft(20);
        Botton8.setRoundTopRight(20);

        Salchi.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        Salchi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Salchi.setText("SALCHICHA");
        Salchi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalchiMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SalchiMousePressed(evt);
            }
        });

        javax.swing.GroupLayout Botton8Layout = new javax.swing.GroupLayout(Botton8);
        Botton8.setLayout(Botton8Layout);
        Botton8Layout.setHorizontalGroup(
            Botton8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Salchi, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
        );
        Botton8Layout.setVerticalGroup(
            Botton8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Salchi, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        Botton9.setBackground(new java.awt.Color(153, 204, 255));
        Botton9.setPreferredSize(new java.awt.Dimension(98, 46));
        Botton9.setRoundBottomLeft(20);
        Botton9.setRoundBottomRight(20);
        Botton9.setRoundTopLeft(20);
        Botton9.setRoundTopRight(20);
        Botton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton9MouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("ADOBADO");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel9MousePressed(evt);
            }
        });

        javax.swing.GroupLayout Botton9Layout = new javax.swing.GroupLayout(Botton9);
        Botton9.setLayout(Botton9Layout);
        Botton9Layout.setHorizontalGroup(
            Botton9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
        );
        Botton9Layout.setVerticalGroup(
            Botton9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        Botton10.setBackground(new java.awt.Color(153, 204, 255));
        Botton10.setPreferredSize(new java.awt.Dimension(98, 46));
        Botton10.setRoundBottomLeft(20);
        Botton10.setRoundBottomRight(20);
        Botton10.setRoundTopLeft(20);
        Botton10.setRoundTopRight(20);
        Botton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton10MouseClicked(evt);
            }
        });

        Chori.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        Chori.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Chori.setText("BREMEN");
        Chori.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChoriMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ChoriMousePressed(evt);
            }
        });

        javax.swing.GroupLayout Botton10Layout = new javax.swing.GroupLayout(Botton10);
        Botton10.setLayout(Botton10Layout);
        Botton10Layout.setHorizontalGroup(
            Botton10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Chori, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
        );
        Botton10Layout.setVerticalGroup(
            Botton10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Chori, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        Botton11.setBackground(new java.awt.Color(153, 204, 255));
        Botton11.setPreferredSize(new java.awt.Dimension(98, 46));
        Botton11.setRoundBottomLeft(20);
        Botton11.setRoundBottomRight(20);
        Botton11.setRoundTopLeft(20);
        Botton11.setRoundTopRight(20);
        Botton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton11MouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("RES");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel10MousePressed(evt);
            }
        });

        javax.swing.GroupLayout Botton11Layout = new javax.swing.GroupLayout(Botton11);
        Botton11.setLayout(Botton11Layout);
        Botton11Layout.setHorizontalGroup(
            Botton11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
        );
        Botton11Layout.setVerticalGroup(
            Botton11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        Botton13.setBackground(new java.awt.Color(153, 204, 255));
        Botton13.setPreferredSize(new java.awt.Dimension(98, 46));
        Botton13.setRoundBottomLeft(20);
        Botton13.setRoundBottomRight(20);
        Botton13.setRoundTopLeft(20);
        Botton13.setRoundTopRight(20);
        Botton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton13MouseClicked(evt);
            }
        });

        Argentino.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        Argentino.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Argentino.setText(" ARGENTINO");
        Argentino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ArgentinoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ArgentinoMousePressed(evt);
            }
        });

        javax.swing.GroupLayout Botton13Layout = new javax.swing.GroupLayout(Botton13);
        Botton13.setLayout(Botton13Layout);
        Botton13Layout.setHorizontalGroup(
            Botton13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Argentino, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
        );
        Botton13Layout.setVerticalGroup(
            Botton13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Argentino, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        Botton14.setBackground(new java.awt.Color(153, 204, 255));
        Botton14.setPreferredSize(new java.awt.Dimension(98, 46));
        Botton14.setRoundBottomLeft(20);
        Botton14.setRoundBottomRight(20);
        Botton14.setRoundTopLeft(20);
        Botton14.setRoundTopRight(20);
        Botton14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton14MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("SALAMI");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel6MousePressed(evt);
            }
        });

        javax.swing.GroupLayout Botton14Layout = new javax.swing.GroupLayout(Botton14);
        Botton14.setLayout(Botton14Layout);
        Botton14Layout.setHorizontalGroup(
            Botton14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
        );
        Botton14Layout.setVerticalGroup(
            Botton14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        Botton27.setBackground(new java.awt.Color(153, 204, 255));
        Botton27.setPreferredSize(new java.awt.Dimension(98, 46));
        Botton27.setRoundBottomLeft(20);
        Botton27.setRoundBottomRight(20);
        Botton27.setRoundTopLeft(20);
        Botton27.setRoundTopRight(20);
        Botton27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton27MouseClicked(evt);
            }
        });

        ahumado.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        ahumado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ahumado.setText("AHUMADO");
        ahumado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ahumadoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ahumadoMousePressed(evt);
            }
        });

        javax.swing.GroupLayout Botton27Layout = new javax.swing.GroupLayout(Botton27);
        Botton27.setLayout(Botton27Layout);
        Botton27Layout.setHorizontalGroup(
            Botton27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ahumado, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
        );
        Botton27Layout.setVerticalGroup(
            Botton27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ahumado, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        Botton28.setBackground(new java.awt.Color(153, 204, 255));
        Botton28.setEnabled(false);
        Botton28.setPreferredSize(new java.awt.Dimension(98, 46));
        Botton28.setRoundBottomLeft(20);
        Botton28.setRoundBottomRight(20);
        Botton28.setRoundTopLeft(20);
        Botton28.setRoundTopRight(20);
        Botton28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton28MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("BORRAR");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton28Layout = new javax.swing.GroupLayout(Botton28);
        Botton28.setLayout(Botton28Layout);
        Botton28Layout.setHorizontalGroup(
            Botton28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
        );
        Botton28Layout.setVerticalGroup(
            Botton28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        Botton29.setBackground(new java.awt.Color(153, 204, 255));
        Botton29.setPreferredSize(new java.awt.Dimension(98, 46));
        Botton29.setRoundBottomLeft(20);
        Botton29.setRoundBottomRight(20);
        Botton29.setRoundTopLeft(20);
        Botton29.setRoundTopRight(20);
        Botton29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton29MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("LONGANIZA");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel7MousePressed(evt);
            }
        });

        javax.swing.GroupLayout Botton29Layout = new javax.swing.GroupLayout(Botton29);
        Botton29.setLayout(Botton29Layout);
        Botton29Layout.setHorizontalGroup(
            Botton29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
        );
        Botton29Layout.setVerticalGroup(
            Botton29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        jList1.setBackground(new java.awt.Color(140, 220, 218));
        jList1.setBorder(null);
        jList1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(Botton13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Botton12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(Botton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Botton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Botton11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(Botton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Botton10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Botton14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Botton27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Botton29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Botton28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Botton10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botton14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Botton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Botton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Botton11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Botton13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Botton12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Botton27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botton29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botton28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, 220));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("HUEVOS TERMINO"));

        Botton30.setBackground(new java.awt.Color(153, 204, 255));
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

        Extra13.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        Extra13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Extra13.setText("TIERNOS");
        Extra13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Extra13MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton30Layout = new javax.swing.GroupLayout(Botton30);
        Botton30.setLayout(Botton30Layout);
        Botton30Layout.setHorizontalGroup(
            Botton30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Extra13, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
        );
        Botton30Layout.setVerticalGroup(
            Botton30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Extra13, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        Botton31.setBackground(new java.awt.Color(153, 204, 255));
        Botton31.setPreferredSize(new java.awt.Dimension(75, 45));
        Botton31.setRoundBottomLeft(15);
        Botton31.setRoundBottomRight(15);
        Botton31.setRoundTopLeft(15);
        Botton31.setRoundTopRight(15);
        Botton31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton31MouseClicked(evt);
            }
        });

        Extra14.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        Extra14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Extra14.setText("COCIDOS");
        Extra14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Extra14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton31Layout = new javax.swing.GroupLayout(Botton31);
        Botton31.setLayout(Botton31Layout);
        Botton31Layout.setHorizontalGroup(
            Botton31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Extra14, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
        );
        Botton31Layout.setVerticalGroup(
            Botton31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Extra14, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        Botton32.setBackground(new java.awt.Color(153, 204, 255));
        Botton32.setPreferredSize(new java.awt.Dimension(75, 45));
        Botton32.setRoundBottomLeft(15);
        Botton32.setRoundBottomRight(15);
        Botton32.setRoundTopLeft(15);
        Botton32.setRoundTopRight(15);
        Botton32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botton32MouseClicked(evt);
            }
        });

        Extra15.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        Extra15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Extra15.setText("REVUELTOS");
        Extra15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Extra15MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Botton32Layout = new javax.swing.GroupLayout(Botton32);
        Botton32.setLayout(Botton32Layout);
        Botton32Layout.setHorizontalGroup(
            Botton32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Extra15, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
        );
        Botton32Layout.setVerticalGroup(
            Botton32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Extra15, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(Botton30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Botton31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Botton32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Botton31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botton30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Botton32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, 180, 130));
    }// </editor-fold>//GEN-END:initComponents

    private void UNOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UNOMouseClicked
        todosBotones();
        pan = 1;
        marcapan= 0;
        huevos = 1;
        NumSin.clear();
        NumSin2.clear();
        if (marca1 == 1) {
            Botton1.setBackground(Botverde);
            marca1 = 0;
        } else {
            Botton1.setBackground(Botrojo);
            marca1 = 1;
        }
        id_producto = 70;

    }//GEN-LAST:event_UNOMouseClicked

    private void DOSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DOSMouseClicked
        todosBotones();
        pan = 2;
        marcapan = 2;
        huevos = 1;
        NumSin.clear();
        NumSin2.clear();
        if (marca2 == 1) {
            Botton2.setBackground(Botverde);
            marca2 = 0;
        } else {
            Botton2.setBackground(Botrojo);
            marca2 = 1;
        }
        id_producto = 71;
    }//GEN-LAST:event_DOSMouseClicked

    private void TRESMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TRESMouseClicked
        todosBotones();
        pan = 0;
        huevos = 0;
        marcapan= 0;
        NumSin.add(51);
        NumSin2.clear();
        if (marca3 == 1) {
            Botton3.setBackground(Botverde);
            marca3 = 0;
        } else {
            Botton3.setBackground(Botrojo);
            marca3 = 1;
        }
        id_producto = 72;
        
    }//GEN-LAST:event_TRESMouseClicked

    private void CUATROMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CUATROMouseClicked
        todosBotones();
        pan = 0;
        marcapan= 0;
        huevos = 1;
        NumSin.add(51);
        NumSin2.clear();
        
       
        if (marca4 == 1) {
            Botton4.setBackground(Botverde);
            marca4 = 0;
        } else {
            Botton4.setBackground(Botrojo);
            marca4 = 1;
        }
        id_producto = 73;
    }//GEN-LAST:event_CUATROMouseClicked

    private void CINCOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CINCOMouseClicked
        todosBotones();
        pan = 0;
        huevos = 0;
        marcapan= 0;
        NumSin.add(51);
        NumSin2.clear();
        
        if (marca5 == 1) {
            Botton5.setBackground(Botverde);
            marca5 = 0;
        } else {
            Botton5.setBackground(Botrojo);
            marca5 = 1;
        }
        id_producto = 74;
    }//GEN-LAST:event_CINCOMouseClicked

    private void SEISMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SEISMouseClicked
        todosBotones();
        pan = 0;
        marcapan= 0;
        huevos = 0;
        NumSin.add(51);
        NumSin2.clear();
        if (marca6 == 1) {
            Botton6.setBackground(Botverde);
            marca6 = 0;
        } else {
            Botton6.setBackground(Botrojo);
            marca6 = 1;
        }
        id_producto = 75;
    }//GEN-LAST:event_SEISMouseClicked

    private void Botton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton6MouseClicked

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
        
        
        
         if(id_producto == 70 || id_producto == 71 || id_producto == 73)
         {
             System.out.println("entra validar huevos = "+huevos);
            if(NumSin2.size()==0){JOptionPane.showMessageDialog(null, "SELECCIONAR UNA TERMINO DE HUEVOS");}else{ingresarinfo();}
         }else{ingresarinfo();}
         
         
         
         
    }//GEN-LAST:event_jLabel3MouseClicked

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

    private void Extra11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Extra11MouseClicked
        
        if(pan>0){
        Botton26.setBackground(Botrojo);
        marca26 = 0;    
        pan = 1;    
        
        NumSin.clear();
        
        if (marca25 == 0) {
            Botton25.setBackground(Botverde);
            marca25 = 1;
            NumSin.add(46);
        } else {
            Botton25.setBackground(Botrojo);
            marca25 = 0;
            int remov = Num.indexOf(46);
            NumSin.remove(remov);
        }}
    }//GEN-LAST:event_Extra11MouseClicked

    private void Botton25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton25MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton25MouseClicked

    private void Extra12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Extra12MouseClicked
        if(pan>0){
        Botton25.setBackground(Botrojo);
        marca25 = 0;    
        pan = 2; 
        NumSin.clear();
        if (marca26 == 0) {
            Botton26.setBackground(Botverde);
            marca26 = 1;
            NumSin.add(47);
        } else {
            Botton26.setBackground(Botrojo);
            marca26 = 0;
            int remov = Num.indexOf(47);
            NumSin.remove(remov);
        }}
    }//GEN-LAST:event_Extra12MouseClicked

    private void Botton26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton26MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton26MouseClicked

    private void SalJumboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalJumboMouseClicked
        //Boton Salchicha Jumbo
        if(pan == 2){
        carne5();
        agregaralist();
        }
    }//GEN-LAST:event_SalJumboMouseClicked

    private void SalJumboMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalJumboMousePressed
        if ((evt.getModifiers() & 4) !=0){
            cantidadcarnes = 19;nombredecarnes ="JUMBO";
            Cantidacarnes.add(cantidadcarnes);
            NombreCarnes.add(nombredecarnes);
            JOptionPane.showMessageDialog(null, "AGREGADO OTRO "+nombredecarnes);
            agregaralist();
        }
    }//GEN-LAST:event_SalJumboMousePressed

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        //Boton Tocino
        if(pan == 2){
        carne10();
        agregaralist();
        }
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MousePressed
        if ((evt.getModifiers() & 4) !=0){
            nombredecarnes = "TOCINO";cantidadcarnes = 24;
            Cantidacarnes.add(cantidadcarnes);
            NombreCarnes.add(nombredecarnes);
            JOptionPane.showMessageDialog(null, "AGREGADO OTRO "+nombredecarnes);
            agregaralist();
        }
    }//GEN-LAST:event_jLabel13MousePressed

    private void Botton12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton12MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton12MouseClicked

    private void SalchiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalchiMouseClicked
        if(pan == 2){
        carne1();
        agregaralist();
        }
    }//GEN-LAST:event_SalchiMouseClicked

    private void SalchiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalchiMousePressed
        if ((evt.getModifiers() & 4) !=0){
            cantidadcarnes = 15;
            nombredecarnes ="SALCHICHA";
            Cantidacarnes.add(cantidadcarnes);
            NombreCarnes.add(nombredecarnes);
            JOptionPane.showMessageDialog(null, "AGREGADO OTRO "+nombredecarnes);
            agregaralist();
        }
    }//GEN-LAST:event_SalchiMousePressed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        //Boton Adobado
        if(pan == 2){
        carne6();
        agregaralist();
        }
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MousePressed
        if ((evt.getModifiers() & 4) !=0){
            nombredecarnes = "ADOBADO";cantidadcarnes = 20;
            Cantidacarnes.add(cantidadcarnes);
            NombreCarnes.add(nombredecarnes);
            JOptionPane.showMessageDialog(null, "AGREGADO OTRO "+nombredecarnes);
            agregaralist();
        }
    }//GEN-LAST:event_jLabel9MousePressed

    private void Botton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton9MouseClicked

    private void ChoriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChoriMouseClicked
        if(pan == 2){
        carne2(); //CHORIZO BREMEN
        agregaralist();
        }
    }//GEN-LAST:event_ChoriMouseClicked

    private void ChoriMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChoriMousePressed
        if ((evt.getModifiers() & 4) !=0){
            cantidadcarnes = 16;
            nombredecarnes = "BREMEN";
            Cantidacarnes.add(cantidadcarnes);
            NombreCarnes.add(nombredecarnes);
            JOptionPane.showMessageDialog(null, "AGREGADO OTRO "+nombredecarnes);
            agregaralist();
        }
    }//GEN-LAST:event_ChoriMousePressed

    private void Botton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton10MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        //Boton Res
        if(pan == 2){
        carne7();
        agregaralist();
        }
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MousePressed
        if ((evt.getModifiers() & 4) !=0){
            nombredecarnes = "RES";cantidadcarnes = 21;
            Cantidacarnes.add(cantidadcarnes);
            NombreCarnes.add(nombredecarnes);
            JOptionPane.showMessageDialog(null, "AGREGADO OTRO "+nombredecarnes);
            agregaralist();
        }
    }//GEN-LAST:event_jLabel10MousePressed

    private void Botton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton11MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton11MouseClicked

    private void ArgentinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ArgentinoMouseClicked
        //Boton Chorizo Argentino
        if(pan == 2){
        carne9();
        agregaralist();
        }
    }//GEN-LAST:event_ArgentinoMouseClicked

    private void ArgentinoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ArgentinoMousePressed
        if ((evt.getModifiers() & 4) !=0){
            nombredecarnes = "ARGENTINO";cantidadcarnes = 23;
            Cantidacarnes.add(cantidadcarnes);
            NombreCarnes.add(nombredecarnes);
            JOptionPane.showMessageDialog(null, "AGREGADO OTRO "+nombredecarnes);
            agregaralist();
        }
    }//GEN-LAST:event_ArgentinoMousePressed

    private void Botton13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton13MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton13MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        if(pan == 2){
        carne3(); //SALAMI
        agregaralist();
        }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MousePressed
        if ((evt.getModifiers() & 4) !=0){
            cantidadcarnes = 17;
            nombredecarnes = "SALAMI";
            Cantidacarnes.add(cantidadcarnes);
            NombreCarnes.add(nombredecarnes);
            JOptionPane.showMessageDialog(null, "AGREGADO OTRO "+nombredecarnes);
            agregaralist();
        }
    }//GEN-LAST:event_jLabel6MousePressed

    private void Botton14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton14MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton14MouseClicked

    private void ahumadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ahumadoMouseClicked
        //Boton Chorizo Ahumado
        if(pan == 2){
        carne8();
        agregaralist();
        }
    }//GEN-LAST:event_ahumadoMouseClicked

    private void ahumadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ahumadoMousePressed
        if ((evt.getModifiers() & 4) !=0){
            nombredecarnes = "AHUMADO";cantidadcarnes =22;
            Cantidacarnes.add(cantidadcarnes);
            NombreCarnes.add(nombredecarnes);
            JOptionPane.showMessageDialog(null, "AGREGADO OTRO "+nombredecarnes);
            agregaralist();
        }
    }//GEN-LAST:event_ahumadoMousePressed

    private void Botton27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton27MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton27MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        if(pan == 2){
        Botton14.setBackground(Botverde);
        timerBoton.setRepeats(false);
        timerBoton.start();
        Cantidacarnes.clear();
        NombreCarnes.clear();
        nombredecarnes="";
        cantidadcarnes=0;
        marca3c = 1; marca4c = 1;marca5c = 1;marca6c = 1;marca7c = 1;marca8c = 1;marca9c = 1;marca10c = 1; marca11c = 1;marca12c = 1; 
        Botton7.setBackground(Botrojo);
        Botton12.setBackground(Botrojo);
        Botton8.setBackground(Botrojo);
        Botton9.setBackground(Botrojo);
        Botton10.setBackground(Botrojo);
        Botton11.setBackground(Botrojo);
        Botton13.setBackground(Botrojo);
        Botton14.setBackground(Botrojo);
        Botton27.setBackground(Botrojo);
        Botton28.setBackground(Botrojo);
        Botton29.setBackground(Botrojo);
        DefaultListModel modelo = new DefaultListModel();
        jList1.setModel(modelo);
        }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void Botton28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton28MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton28MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        if(pan == 2){
        carne4(); //LONGANIZA
        agregaralist();
        }
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MousePressed
        if ((evt.getModifiers() & 4) !=0){
            cantidadcarnes = 18;
            nombredecarnes = "LONGANIZA";
            Cantidacarnes.add(cantidadcarnes);
            NombreCarnes.add(nombredecarnes);
            JOptionPane.showMessageDialog(null, "AGREGADO OTRO "+nombredecarnes);
            agregaralist();
        }
    }//GEN-LAST:event_jLabel7MousePressed

    private void Botton29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton29MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton29MouseClicked

    private void Extra13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Extra13MouseClicked
       
       if(id_producto == 70 || id_producto == 71 || id_producto == 73){
       Botton31.setBackground(Botrojo);
       Botton32.setBackground(Botrojo);
       huevos = 1;
       NumSin2.clear();

        if (marca30 == 0) {
            Botton30.setBackground(Botverde);
            marca30 = 1;
            NumSin2.add(48);
        } else {
            Botton30.setBackground(Botrojo);
            marca30 = 0;
            int remov = Num.indexOf(48);
            NumSin2.remove(remov);
        }
       }
    }//GEN-LAST:event_Extra13MouseClicked

    private void Botton30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton30MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton30MouseClicked

    private void Extra14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Extra14MouseClicked
       if(id_producto == 70 || id_producto == 71 || id_producto == 73){
       Botton30.setBackground(Botrojo);
       Botton32.setBackground(Botrojo);
       huevos = 1;
       NumSin2.clear();
       
        if (marca31 == 0) {
            Botton31.setBackground(Botverde);
            marca31 = 1;
            NumSin2.add(49);
        } else {
            Botton31.setBackground(Botrojo);
            marca31 = 0;
            int remov = Num.indexOf(49);
            NumSin2.remove(remov);
        }}
    }//GEN-LAST:event_Extra14MouseClicked

    private void Botton31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton31MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton31MouseClicked

    private void Extra15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Extra15MouseClicked
       if(id_producto == 70 || id_producto == 71 || id_producto == 73){
       Botton30.setBackground(Botrojo);
       Botton31.setBackground(Botrojo);
       huevos = 1;
       NumSin2.clear();
        if (marca32 == 0) {
            Botton32.setBackground(Botverde);
            marca32 = 1;
            NumSin2.add(50);
        } else {
            Botton32.setBackground(Botrojo);
            marca32 = 0;
            int remov = Num.indexOf(50);
            NumSin2.remove(remov);
        }}
    }//GEN-LAST:event_Extra15MouseClicked

    private void Botton32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botton32MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botton32MouseClicked

    private void Extra11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Extra11MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Extra11MouseEntered
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Argentino;
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
    private Clases.PanelRound Botton4;
    private Clases.PanelRound Botton5;
    private Clases.PanelRound Botton6;
    private Clases.PanelRound Botton7;
    private Clases.PanelRound Botton8;
    private Clases.PanelRound Botton9;
    private javax.swing.JLabel CINCO;
    private javax.swing.JLabel CUATRO;
    private javax.swing.JLabel ChoAhumado;
    private javax.swing.JLabel ChoArgenti;
    private javax.swing.JLabel Chori;
    private javax.swing.JLabel ChoriBremen;
    private javax.swing.JLabel DOS;
    private javax.swing.JLabel Extra10;
    private javax.swing.JLabel Extra11;
    private javax.swing.JLabel Extra12;
    private javax.swing.JLabel Extra13;
    private javax.swing.JLabel Extra14;
    private javax.swing.JLabel Extra15;
    private javax.swing.JLabel Extra3;
    private javax.swing.JLabel Extra4;
    private javax.swing.JLabel Extra6;
    private javax.swing.JLabel Extra7;
    private javax.swing.JLabel SAlchi;
    private javax.swing.JLabel SEIS;
    private javax.swing.JLabel SalJumbo;
    private javax.swing.JLabel SalPequeña;
    private javax.swing.JLabel Salchi;
    private javax.swing.JLabel TRES;
    private javax.swing.JLabel UNO;
    private javax.swing.JLabel ahumado;
    private javax.swing.JTextField cantidad;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

private void ingresarinfo(){
        System.out.println(marcapan);
        if(marcapan!=2){
        if(id_producto !=0){
        if(NumSin.size()!=0){
            InsertarProducto();
        }else{JOptionPane.showMessageDialog(null, "SELECCIONAR UNA OPCION DE PAN o TORTILLA");}
        }else{JOptionPane.showMessageDialog(null, "SELECCIONAR UNA OPCION DE DESAYUNO");}
        }
       
        else if(marcapan==2)
        {
        if(id_producto !=0){
         if(Cantidacarnes.size()!=0){
            if(NumSin.size()!=0){
            InsertarProducto();
        }else{JOptionPane.showMessageDialog(null, "SELECCIONAR UNA OPCION DE PAN o TORTILLA");}
         }else{JOptionPane.showMessageDialog(null, "SELECCIONAR  DOS OPCIONES DE CARNES");}
        }else{JOptionPane.showMessageDialog(null, "SELECCIONAR UNA OPCION DE DESAYUNO");}
        
        
        
     }
}
}
