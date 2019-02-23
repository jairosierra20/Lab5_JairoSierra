/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg5_jairosierra;

import java.util.ArrayList;

/**
 *
 * @author Jairo Sierra
 */
public class Mazos {
    private double coste;
    private ArrayList<Carta> cartas = new ArrayList();

    public Mazos() {
    }

    public Mazos(double coste) {
        this.coste = coste;
    }

    public double getCoste() {
        return coste;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }

    @Override
    public String toString() {
        return "Mazos{" + "coste=" + coste + ", cartas=" + cartas + '}';
    }
    
}
