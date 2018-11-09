/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author david
 */
public class usuario {
    private String usuario;
    private String contraseña;
    private Date nacimiento;
    private int telefono;
    private String correo;
    private String nombre;
    private String favorito;
    private ArrayList<libro> libros=new ArrayList();
    private ArrayList<usuario> amigos=new ArrayList();

    public usuario() {
    }

    public usuario(String usuario, String contraseña, Date nacimiento, int telefono, String correo, String nombre, String favorito) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nacimiento = nacimiento;
        this.telefono = telefono;
        this.correo = correo;
        this.nombre = nombre;
        this.favorito = favorito;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFavorito() {
        return favorito;
    }

    public void setFavorito(String favorito) {
        this.favorito = favorito;
    }

    public ArrayList<libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<libro> libros) {
        this.libros = libros;
    }

    public ArrayList<usuario> getAmigos() {
        return amigos;
    }

    public void setAmigos(ArrayList<usuario> amigos) {
        this.amigos = amigos;
    }

    @Override
    public String toString() {
        return usuario;
    }
    
    
}
