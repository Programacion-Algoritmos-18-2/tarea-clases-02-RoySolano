/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciofinal;

/**
 *
 * @author Salas
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Equipo e = new Equipo();//primer objeto
        System.out.printf("Nombre %s - Jugadores %s - Ciudad %s\n", 
                e.get_nombre(), e.get_num_jugadores(), e.get_ciudad());/**
                 * presentación de atributos
                 */
        Equipo e2 = new Equipo("Liga de Loja");//segundo objeto
        e2.set_num_jugadores(20);//agregar atributo mediante métoo a e2
        e2.set_ciudad("Loja");//agregar atributo mediante métoo a e2
        System.out.printf("Nombre %s - Jugadores %s - Ciudad %s\n", 
                e2.get_nombre(), e2.get_num_jugadores(), e2.get_ciudad());/**
                 * presentación de atributos
                 */
        
        Equipo e3 = new Equipo("Deportivo Cuenca",21);//tercer objeto
        e3.set_ciudad("Cuenca");//agregar atributo mediante métoo a e3
        System.out.printf("Nombre %s - Jugadores %s - Ciudad %s\n", 
                e3.get_nombre(), e3.get_num_jugadores(), e3.get_ciudad());/**
                 * presentación de atributos
                 */
        
        Equipo e4 = new Equipo("Deportivo Quito",22,"Quito");//cuarto objeto
        System.out.printf("Nombre %s - Jugadores %s - Ciudad %s\n", 
                e3.get_nombre(), e3.get_num_jugadores(), e3.get_ciudad());/**
                 * presentación de atributos
                 */
    }
}
