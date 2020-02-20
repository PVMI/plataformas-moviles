/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carro;

/**
 *
 * @author Priscilla Moraga
 */
public abstract class Carro{   //las clases abstractas solo se pueden utilizar por herencias
    
    public abstract String tipo();
    
    public final void imprimir(){
        System.out.println("Yo soy un "+ tipo());
    }
}
