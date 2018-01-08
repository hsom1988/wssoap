/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.uisrael.ws.ejb.interfaces;

import ec.edu.uisrael.ws.ejb.entidades.Producto;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
/**
 *
 * @author Santi
 */

@Path("/helloworld")
public interface WSRest {

	@GET
	@Path("/listarProductos")
	public List<Producto> listarProductos();

}
