/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg5_jairosierra;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Jairo Sierra
 */
public class Usuarios {
    private String nombre;
    private String apellido;
    private String usuario;
    private String contrasena;
    private Date fecha;
    private int edad;
    private Color color;
    private ArrayList<Mazos> mazo = new ArrayList();

    public Usuarios() {
    }

    public Usuarios(String nombre, String apellido, String usuario, String contrasena, Date fecha, int edad, Color color) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.fecha = fecha;
        this.edad = edad;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public ArrayList<Mazos> getMazo() {
        return mazo;
    }

    public void setMazo(ArrayList<Mazos> mazo) {
        this.mazo = mazo;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "nombre=" + nombre + '}';
    }
    
}
