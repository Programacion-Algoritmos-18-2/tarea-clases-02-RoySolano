/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author Salas
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Precio p = new Precio();//creo un objeto de clase Precio
        
        p.set(20.2);//utilizo 
        System.out.println(p.get());
    }
    
}
