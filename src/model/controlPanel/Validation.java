/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.controlPanel;

import connection.Connection;
import java.sql.ResultSet;

/**
 *
 * @author Naveen
 */
public class Validation {

    connection.Connection connection;
    
    String currentPass;
    
    public Validation(){
        if (connection == null) {
            connection = new Connection();
        }
    }

    public boolean checkCurrPassword(String newPassword,String getId) {
        try {
            
            boolean b = false;
            
            ResultSet rs=connection.getData("SELECT password FROM login WHERE idlogin='"+getId+"'");
            if(rs.next()){
               currentPass=rs.getString("password");
            }
            if(currentPass.equals(newPassword)){
                    b= true;
            }
            return b;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean checkNewPass(String newPass,String confirmPass){
        if(newPass.equals(confirmPass)){
            return true;
        }else{
            return false;
        }
    }
}
