/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.uisrael.ws;

import ec.edu.uisrael.ws.ejb.entidades.Producto;
import ec.edu.uisrael.ws.ejb.interfaces.WSRest;
import java.util.List;
import javax.ws.rs.Path;
/**
 *
 * @author Santi
 */

@Path("/helloworld")
public class EjemploREST implements WSRest{

    @Override
    public List<Producto> listarProductos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
