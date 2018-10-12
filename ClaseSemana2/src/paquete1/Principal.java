/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

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
        System.out.println(p.euros);//imprimo el atributo euros de p
        p.euros = 10.1;//agrego un valor al atributo euros de p
        System.out.println(p.euros);//imprimo los cambios en euros
    }
    
}
