/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1_pm;

import avion.AvionI;
import avion.Jet;

/**
 *
 * @author Priscilla Moraga
 */
public class Aeropuerto {
    private final AvionI avion;
    
    public Aeropuerto(AvionI avion){
        this.avion = avion;
    }
    public void takeOff(){
        System.out.println("Saliendo "+avion.tipo());
    }
}
