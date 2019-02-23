/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg5_jairosierra;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Jairo Sierra
 */
public class Clan {
    private String nombre;
    private ArrayList<Usuarios> miembros = new ArrayList();
    private Date fecha;
    private Usuarios lider;
    private String tipo;

    public Clan() {
    }

    public Clan(String nombre, Date fecha, Usuarios lider, String tipo) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.lider = lider;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Usuarios> getMiembros() {
        return miembros;
    }

    public void setMiembros(ArrayList<Usuarios> miembros) {
        this.miembros = miembros;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Usuarios getLider() {
        return lider;
    }

    public void setLider(Usuarios lider) {
        this.lider = lider;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Clan{" + "nombre=" + nombre + '}';
    }
    
}
