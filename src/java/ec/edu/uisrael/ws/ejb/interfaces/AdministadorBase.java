/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.uisrael.ws.ejb.interfaces;

import java.util.List;
/**
 *
 * @author Santi
 */
public interface AdministadorBase<T> {
    
    void crear(T entity, Object user) throws Exception;
    
    void modificar(T entity, Object user) throws Exception;
    
    void eliminar(T entity, Object user) throws Exception;
    
    List<T> listar(Class clase) throws Exception;
}
