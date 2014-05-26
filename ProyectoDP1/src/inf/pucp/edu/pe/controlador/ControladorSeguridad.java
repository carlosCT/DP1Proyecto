/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inf.pucp.edu.pe.controlador;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Luis
 */
public class ControladorSeguridad {
    
    public String codificar(String pass){
        
        String passwordToHash = pass;
        String generatedPassword = null;
        try {
            
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(passwordToHash.getBytes());
            byte[] bytes = md.digest();
            StringBuilder sb = new StringBuilder();
            
            for(int i=0; i< bytes.length ;i++)
            {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            
            generatedPassword = sb.toString();
        }
        catch (NoSuchAlgorithmException e)
        {
            e.printStackTrace();
        }
        
        return generatedPassword;
        
    }
        
    
    
}
