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
public class Precio {//creación de la clase Precio
    double euros;//declaración del atributo euros
    public double obtener (){//método para obtener el valor de euros
        return euros;
    }
    
    public void agregar (double x){/**método para agregar un valor a euros a
    *través de x */
        euros = x;
    }
}
