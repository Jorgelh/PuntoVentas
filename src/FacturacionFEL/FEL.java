/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FacturacionFEL;

import FELclass.CrearXML;
import FELclass.FELclas;
import FELclass.NumeroLetras;
import FELclass.RestApiClient;
import FELclass.Token;
import clas.BDConexion;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import org.json.JSONArray;
import org.json.JSONObject;
import org.w3c.dom.Document;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author jluis
 */
public class FEL extends javax.swing.JFrame {
     static final private Logger LOGGER = Logger.getLogger("mx.com.hash.pruebaxml.PruebaXML");
     String Token;
     String NI; //"000044653948";
     String grantotal;
     String TotalLetras;
     int validarnit;
    /**
     * Creates new form FEL
     */
    public FEL() {
        initComponents();
        this.setLocationRelativeTo(null);
        sumaTotal();
        
        
    }
    
    
    
    
    private void token(){
    
       String res = "";
       String URL = "https://felgttestaws.digifact.com.gt/gt.com.apinuc/api/login/get_token";
        
        try {
            Client client = ClientBuilder.newClient();
            WebTarget target = client.target(URL );
            Invocation.Builder solicitud = target.request();
            Token req = new Token();
            req.setUsername("GT.000120011662.TESTUSER");//NIT EMPRESA y USUARIO DIGIFAC
            req.setPassword("Coast$cm86");//CONTRASEÑA DIGIFAC
            Gson gson = new Gson();
            String jsonString = gson.toJson(req);
            Response post = solicitud.post(Entity.json(jsonString));
            String resJson = post.readEntity(String.class);
            res = resJson;
            String fichero = "";
            fichero = resJson;
            Properties properties = gson.fromJson(fichero, Properties.class);
            Token = (String) properties.get("Token");
            //nombre.setText((String) properties.get("Token"));
            //System.out.println("SOLO TOKEN= "+properties.get("Token"));
            //System.out.println("SOLO FECHA= " + properties.get("expira_en"));
        } catch (JsonSyntaxException e) {
            System.out.println("ERROR" );res = e.toString();
        }
    }
    
     public  void TokenLocal() {
      //  DecimalFormat df = new DecimalFormat("#.00");
            try {
                BDConexion conecta = new BDConexion();
                Connection cn = conecta.getConexion();
                java.sql.Statement stmt = cn.createStatement();
                ResultSet rs = stmt.executeQuery("select token  from TOKEN where idToken = 1");
                while (rs.next()) {
                      Token = rs.getString(1);
                }
                rs.close();
                stmt.close();
                cn.close();
            } catch (Exception error) {
                System.out.print(error);
            }
        }
    
    
    public  void NitLocal() {
      //  DecimalFormat df = new DecimalFormat("#.00");
            try {
                 BDConexion conecta = new BDConexion();
                Connection cn = conecta.getConexion();
                java.sql.Statement stmt = cn.createStatement();
                ResultSet rs = stmt.executeQuery("select nombre from compradornit where nit ='"+nit.getText()+"'");
                while (rs.next()) {
                       nombre.setText(rs.getString(1));
                }
                rs.close();
                stmt.close();
                cn.close();
            } catch (Exception error) {
                System.out.print(error);
            }
        }
    
    public  void NitValidar() {
      //  DecimalFormat df = new DecimalFormat("#.00");
            try {
                 BDConexion conecta = new BDConexion();
                Connection cn = conecta.getConexion();
                java.sql.Statement stmt = cn.createStatement();
                ResultSet rs = stmt.executeQuery("select count(nit) from compradornit where nit ='"+nit.getText()+"'");
                while (rs.next()) {
                    validarnit = rs.getInt(1);
                }
                rs.close();
                stmt.close();
                cn.close();
            } catch (Exception error) {
                System.out.print(error);
            }
        }
    
    
    public  void sumaTotal() {
      //  DecimalFormat df = new DecimalFormat("#.00");
            try {
                 BDConexion conecta = new BDConexion();
                Connection cn = conecta.getConexion();
                java.sql.Statement stmt = cn.createStatement();
                ResultSet rs = stmt.executeQuery("select sum(precio) as Total from PRODUCTOS_PEDIDO where id_pedido =" + Orden.getText());
                while (rs.next()) {
                      grantotal = rs.getString(1);
                      total.setText(grantotal);
                }
                rs.close();
                stmt.close();
                cn.close();
            } catch (Exception error) {
                System.out.print(error);
            }
        }
    
    
    private void Obtenernit(){
        
         String NitCeros = String.format("%12s", nit.getText()).replace(' ','0');
         NI = NitCeros;
     
   RestApiClient apiClient = new RestApiClient();
        
        try {
            String apiKey = "TAXID="+NI+"&DATA1=SHARED_GETINFONITcom&DATA2=NIT|"+nit.getText()+"&COUNTRY=GT&USERNAME=JULIOCIF";
            String accessToken = Token;
            String response = apiClient.get( apiKey, accessToken);
            JSONObject  jsonObject = new JSONObject(response);
            JSONArray arrayObject = (JSONArray) jsonObject.get("RESPONSE");
             for (int i = 0; i < arrayObject.length(); i++) {
                if (i == 0) {
            JSONObject object2 = (JSONObject) arrayObject.get(i);
                  String nombrev = object2.get("NOMBRE").toString();
                  String nitv = object2.get("NIT").toString();
            nombre.setText(nombrev);
            nit.setText(nitv);
                }
             }
      
   
   }    catch (IOException ex) {
            Logger.getLogger(FEL.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
    
    private void Certificar(){
    
    FELclas apiClient = new FELclas();
        
        try {
            String apiKey = "TAXID=000000123456&FORMAT=''&USERNAME=TESTUSER";//NIT DE NEGOCIO y USUARIO QUE DE DIGIFAC
            String accessToken = Token;
            System.out.println("Token = "+Token);
            String response = apiClient.get(apiKey, accessToken);
            JSONObject  jsonObject = new JSONObject(response);
            JSONObject object2 = (jsonObject); 
            System.out.println("JSON = "+jsonObject);
            String auto = object2.get("authNumber").toString();
            String lot = object2.get("batch").toString();
            String serie = object2.get("serial").toString();
            String fecha = object2.get("enrolledTimeStamp").toString();
            String nitempre = object2.get("taxID").toString();
            String nombreempre = object2.get("name").toString();
            autorizacion.setText(auto);
            lote.setText(lot);
            seriee.setText(serie);
            fechaout.setText(fecha);
           
            System.out.println("No. Autorizacion = "+auto);
            System.out.println("No. Lote = "+lot);
            System.out.println("No. Serie = "+serie);
            System.out.println("Fecha = "+fecha);
           


        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
        
    }
    
    private void crearXML(){
        
        NumeroLetras NumLetra  = new NumeroLetras();
        String numero = total.getText();
        TotalLetras =  (NumLetra .Convertir(numero,true));
    
         try {
            CrearXML ejemploXML = new CrearXML(nombre.getText(),nit.getText(),Orden.getText(),grantotal,TotalLetras);
            Document documento = ejemploXML.crearDocumento();
            
            //System.out.println(ejemploXML.convertirString(documento));
            
            ejemploXML.escribirArchivo(documento, "C:\\Reportes\\XMLFel.xml");            
            
        } catch (ParserConfigurationException ex) {
            LOGGER.log(Level.SEVERE, "Error de configuracion");
            LOGGER.log(Level.SEVERE, null, ex);
        } catch (TransformerException ex) {
            LOGGER.log(Level.SEVERE, "Error de transformacion XML a String");
            LOGGER.log(Level.SEVERE, null, ex);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nit = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        facturar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        autorizacion = new javax.swing.JLabel();
        lote = new javax.swing.JLabel();
        seriee = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        fechaout = new javax.swing.JLabel();
        Orden = new javax.swing.JLabel();
        total = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("NIT");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("NOMBRE");

        nit.setEditable(false);
        nit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nitActionPerformed(evt);
            }
        });

        nombre.setEditable(false);
        nombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        facturar.setBackground(new java.awt.Color(102, 255, 102));
        facturar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        facturar.setText("FACTURAR");
        facturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facturarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("#ORDEN:");

        autorizacion.setText("jLabel4");

        lote.setText("jLabel4");

        seriee.setText("jLabel4");

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setText("NIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setText("CF");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jButton1)
                .addGap(102, 102, 102)
                .addComponent(jButton2)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jButton3.setText("jButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("TOTAL");

        fechaout.setText("jLabel5");

        Orden.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Orden.setForeground(new java.awt.Color(255, 0, 0));
        Orden.setText("4377");

        total.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        total.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(facturar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombre)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2)
                                        .addComponent(nit, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lote)
                                    .addComponent(autorizacion)
                                    .addComponent(seriee)
                                    .addComponent(fechaout)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Orden, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(Orden)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(facturar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton3))
                .addGap(17, 17, 17)
                .addComponent(autorizacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lote)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(seriee)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fechaout)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void facturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facturarActionPerformed
        if(nit.getText().compareTo("")!=0 && nombre.getText().compareTo("")!=0){
            crearXML();
            TokenLocal();
            Certificar();
        }else {JOptionPane.showMessageDialog(null, "INGRESE UN NIT O MARCAR CF");}
    }//GEN-LAST:event_facturarActionPerformed

    private void nitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nitActionPerformed
        NitValidar();
      if(validarnit==1){
          NitLocal();
      }else{  
        TokenLocal();
        Obtenernit();
      }
        facturar.requestFocus();
    }//GEN-LAST:event_nitActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        nit.setText("CF");
        nombre.setText("CONSUMIDOR FINAL");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        nit.setText("");
        nombre.setText("");
        nit.setEditable(true);
        nit.requestFocus();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

      String NitCeros = String.format("%12s", nit.getText()).replace(' ','0');
        System.out.println("CEROS = "+NitCeros);
       
//crearXML();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(FEL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FEL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FEL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FEL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FEL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Orden;
    private javax.swing.JLabel autorizacion;
    private javax.swing.JButton facturar;
    private javax.swing.JLabel fechaout;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lote;
    private javax.swing.JTextField nit;
    private javax.swing.JTextField nombre;
    private javax.swing.JLabel seriee;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}
