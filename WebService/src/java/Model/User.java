/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class User {
     DataBase data;
     public User() {
         this.data = new DataBase();
     }
     
    public boolean verifyLogin(String user, String password) {
        data.startConection();
        
         try {
             return data.VerifyUser(password, user);
         } catch (SQLException ex) {
             Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
             return false;
         }
    }
    public boolean insertUser(String nombre,String apellido,String  correo, String direccion, int cedula, int telefono,String user, String pass){
        data.startConection();
        return this.data.insertUser(nombre, apellido, correo, direccion, cedula, telefono, user,pass);
    }
}
