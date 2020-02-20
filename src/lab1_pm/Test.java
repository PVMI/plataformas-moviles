/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1_pm;

import avion.Avioneta;
import avion.Jet;
import carro.Carro;
import carro.SUV;
import carro.Sedan;

/**
 *
 * @author Priscilla Moraga
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    private static void ejecutarAvion(){
        Aeropuerto aer = new Aeropuerto(new Jet());
        aer.takeOff();
        
        aer = new Aeropuerto(new Avioneta());
        aer.takeOff();
    }
    private void ejecutarCarro(){
        Carro car = new Sedan(); //composicion: creando una instancia de la clase carro/ y polimorfismo al cambiar carro por suv que hereda carro
        car.imprimir();
        car = new SUV();
        car.imprimir();
    }
    public static void main(String[] args) {
        //new Test().ejecutarCarro();
        ejecutarAvion();
        
    }
    
    
    
}
