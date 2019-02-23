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
public class Minipekka extends Especial{

    public Minipekka(String nombre, String dano, String vida, String objetivo, String velocidad, String elixir) {
        super(nombre, dano, vida, objetivo="Terrestres", velocidad="Alta", elixir="4");
    }

    public Minipekka() {
    }

    @Override
    public String toString() {
        return "Minipekka{" + '}';
    }
    
}
