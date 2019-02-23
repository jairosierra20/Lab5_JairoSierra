/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg5_jairosierra;

/**
 *
 * @author Jairo Sierra
 */
public class Carta {
    private String nombre;
    private String dano;
    private String vida;
    private String objetivo;
    private String velocidad;
    private String elixir;
    
    public Carta() {
    }

    public Carta(String nombre, String dano, String vida) {
        this.nombre = nombre;
        this.dano = dano;
        this.vida = vida;
    }
    
    public Carta(String nombre, String dano, String vida, String objetivo, String velocidad, String elixir) {
        this.nombre = nombre;
        this.dano = dano;
        this.vida = vida;
        this.objetivo = objetivo;
        this.velocidad = velocidad;
        this.elixir = elixir;
    }    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDano() {
        return dano;
    }

    public void setDano(String dano) {
        this.dano = dano;
    }

    public String getVida() {
        return vida;
    }

    public void setVida(String vida) {
        this.vida = vida;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    public String getElixir() {
        return elixir;
    }

    public void setElixir(String elixir) {
        this.elixir = elixir;
    }

    @Override
    public String toString() {
        return "Carta{" + "nombre=" + nombre + '}';
    }
    
}
