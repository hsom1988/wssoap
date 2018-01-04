/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.uisrael.ws.entidades;

/**
 *
 * @author master
 */
public class Producto {
    private int codigo;
    private String nombre;
    private double pvp;
    private String imagen;

    public Producto() {
    }
    
    public Producto(int codigo, String nombre, double pvp, String imagen) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.pvp = pvp;
        this.imagen = imagen;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPvp() {
        return pvp;
    }

    public void setPvp(double pvp) {
        this.pvp = pvp;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
}
