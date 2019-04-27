/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import Model.User;

/**
 *
 * @author jif_c
 */
@WebService(serviceName = "Webserve")
public class Webserve {

   
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    @WebMethod(operationName = "Login")
    public String login(@WebParam(name = "password")String password, @WebParam(name = "user") String User) {
        User user = new User();
       if(user.verifyLogin(User,password)){
            return "1";
       } else{
            return "0";
        }
    }
    @WebMethod(operationName = "registrar")
    public String registrar(String nombre, String apellido, String correo, String direccion, String cedula, String telefono,String users, String pass){
        User user = new User();
        if(user.insertUser(nombre, apellido, correo, direccion,Integer.parseInt(cedula),Integer.parseInt(telefono), users,pass)){
            return "1";
        } else {
            return "0";
        }
    } 
}
