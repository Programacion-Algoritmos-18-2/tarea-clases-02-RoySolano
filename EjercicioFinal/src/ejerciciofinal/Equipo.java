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
public class Equipo {
    String nombre;
    int num_jugadores;
    String ciudad;
    
    public String get_nombre(){//método para obtener nombre
        return nombre;
    }
    
    public int get_num_jugadores(){//método para obtener número de jugadores
        return num_jugadores;
    }
    
     public String get_ciudad(){//método para obtener ciudad
        return ciudad;
    }
    
     public void set_nombre(String x){//método para agregar nombre
        nombre = x;
    }
    
    public void set_num_jugadores(int x){//método para agregar número de jugadores
        num_jugadores = x;
    }
    
     public void set_ciudad(String x){//método para agregar ciudad
        ciudad = x;
    }
     
    public Equipo(){//primer constructor
        set_nombre("Emelec");//valor por defecto
        set_num_jugadores(11);//valor por defecto
        set_ciudad("Guayaquil");//valor por defecto
    }        
    
    public Equipo(String x){//segundo constructor
        set_nombre(x);//agrega directamente
    }
    
    public Equipo(String x, int y){//tercer constructor
        set_nombre(x);
        set_num_jugadores(y);
    }
    
    public Equipo(String x, int y, String z){//cuarto constructor
        set_nombre(x);
        set_num_jugadores(y);
        set_ciudad(z);
    }
}
