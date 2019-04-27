package Model;


import static java.lang.Class.forName;
import static java.lang.Integer.parseInt;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jif_c
 */
public class DataBase {
    String url;
    Connection conect;
    Statement ps;
    ResultSet st;
    PreparedStatement statement;
    public DataBase(){
        
        try {
            this.url = "jdbc:sqlserver://192.168.140.233:1433;databaseName=Banco;user=sa;password=1234;";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public boolean startConection() {
        try {
           this.conect  = DriverManager.getConnection(this.url);
           this.ps = conect.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    public boolean VerifyUser(String password, String user) throws SQLException {
        String sql = "SELECT * FROM credenciales where usuario ='"+ user+"' and pass ='" +password+"'";
        st = ps.executeQuery(sql);
        return st.next();
    }
    
    public String getUser(String user) {
        String sql = "SELECT *,c.Username,c.Password FROM users u inner join Credenciales on c.id= u.id where user ='"+ user+"'";
        try {
            String json ="";
            st = ps.executeQuery(sql);
            return json;
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
            return "No se encontró el usuario";
        }  
    }
    public boolean insertUser(String nombre, String apellido, String correo, String direccion,int cedula, int telefono, String user, String pass){
       String sql = "Insert into cliente (nombre, apellidos,correo, direccion, cedula,telefono,pregunta,respuesta) values('"
               +nombre+ "','"+ apellido +"','"+correo+"','"+direccion+"',"+cedula+","+telefono+",'NA','NA')";
        try {
            ps.executeUpdate(sql);
            sql= "Select Max(id) as Mid from cliente";
            st = ps.executeQuery(sql);
            st.next();
            String value = st.getString(1);
            sql= "insert into credenciales(id_cliente, usuario,pass) values("+value+",'"+user+"','"+pass+"')";
            ps.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
            
    }
    public boolean insertReservacion(String servicio,String FechaInicio, String FechaFinal,float precio,String lugar) {
       
            return false;
    }
}
