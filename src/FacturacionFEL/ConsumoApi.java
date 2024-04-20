/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FacturacionFEL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author jluis
 */
public class ConsumoApi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            URL url = new URL("https://felgtaws.digifact.com.gt/gt.com.apinuc/api/login/get_token");
            //URL url = new URL("https://felgttestaws.digifact.com.gt/gt.com.apinuc/api/login/get_token");
            Map<String,String> params = new LinkedHashMap<>();
            params.put("Username:","GT.000120011662.120011662");
            params.put("Password:","Factur4$Fel");
            
            StringBuilder postData = new StringBuilder();
            for(Map.Entry<String, String> param : params.entrySet())
            {
            if(postData.length()!=0){
                postData.append('&');
            }
                postData.append(URLEncoder.encode(param.getKey(), "UTF-8"));
                postData.append('=');
                postData.append(URLEncoder.encode(String.valueOf(param.getValue()), "UTF-8"));
            }
            byte[] postBytes = postData.toString().getBytes("UTF-8");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "raw");
            conn.setRequestProperty("Content-Length",String.valueOf( postBytes.length));
            conn.getOutputStream().write(postBytes);
            Reader in = new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));
            for (int c = in.read();c!=-1;c=in.read()) {
                System.out.println("imprime algo"+(char)c);
            }
            
        } catch (IOException e) {
            System.out.println("CUAL ERROR "+e);
        }
    }
    
}
