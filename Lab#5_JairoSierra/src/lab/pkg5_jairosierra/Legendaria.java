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
public class Legendaria extends Carta{

    public Legendaria() {
    }

    public Legendaria(String nombre, String dano, String vida, String objetivo, String velocidad, String elixir) {
        super(nombre, dano, vida, objetivo, velocidad, elixir);
    }

    @Override
    public String toString() {
        return "Legendaria{" + '}';
    }
    
}
