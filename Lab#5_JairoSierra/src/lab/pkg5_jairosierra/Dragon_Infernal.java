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
public class Dragon_Infernal extends Legendaria{

    public Dragon_Infernal() {
    }

    public Dragon_Infernal(String nombre, String dano, String vida, String objetivo, String velocidad, String elixir) {
        super(nombre, dano, vida, objetivo="Aeros\nTerrestres", velocidad="Media", elixir="4");
    }

    @Override
    public String toString() {
        return "Dragon_Infernal{" + '}';
    }
    
}
