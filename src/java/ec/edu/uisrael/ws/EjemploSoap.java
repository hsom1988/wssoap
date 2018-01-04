/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.uisrael.ws;

import ec.edu.uisrael.ws.entidades.Producto;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author master
 */
@WebService(serviceName = "EjemploSoap")
public class EjemploSoap {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "suma")
    public int suma(@WebParam(name = "n1") int n1, @WebParam(name = "n2") int n2) {
        //TODO write your implementation code here:
        return n1 + n2;
    }
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "login")
    public String login(@WebParam(name = "user") String user, @WebParam(name = "pwd") String pwd) {
        //TODO write your implementation code here:
        if (user.equals("uisrael") && pwd.equals("123")){
            return "OK";
        }
        return "-1";
    }
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "listarProductos")
    public List<Producto> listarProductos() {
         List<Producto> datos = new ArrayList<Producto>();
         datos.add(new Producto(1, "Papas1", 0.6 , "imagen1"));
         datos.add(new Producto(2, "Papas2", 1.6 , "imagen2"));
         datos.add(new Producto(3, "Papas3", 6.6 , "imagen3"));
         return datos;
    }
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "crearProductos")
    public String crearProductos(@WebParam(name = "producto") Producto producto) {
         /*
        Implementar la logica de ingreso a la base de datos
        */
         return "OK";
    }
}
