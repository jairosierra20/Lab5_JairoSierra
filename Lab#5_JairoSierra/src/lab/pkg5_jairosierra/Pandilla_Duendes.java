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
public class Pandilla_Duendes extends Comun{

    public Pandilla_Duendes() {
    }

    public Pandilla_Duendes(String nombre, String dano, String vida, String objetivo, String velocidad, String elixir) {
        super(nombre, dano, vida, objetivo="Aereos\nTerrestres", velocidad="Alta", elixir="3");
    }

    @Override
    public String toString() {
        return "Pandilla_Duendes{" + '}';
    }
    
}
