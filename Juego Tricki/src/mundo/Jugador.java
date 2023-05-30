package mundo;
/**********************************************************************/
/* Autor: Francisco I. Leyva
 * Página web: http://www.panchosoft.com
 * Correo electrónico: yagami_2@hotmail.com
 *
 *
/**********************************************************************/

import javax.swing.*;
import java.awt.*;

public class Jugador {
    
   //ATRIBUTOS DEL JUGADOR
    String nombre;
    public int GANADOS, PERDIDOS, EMPATADOS;
    
    //IMAGEN DE LA FICHA DEL JUGADOR
    private ImageIcon ficha;
    
   //CREAR UN NUEVO JUGADR
    public Jugador(String nombre, String ruta) {
        
        /*Nombre del jugador.*/
        this.nombre = nombre;
        GANADOS = 0;
        PERDIDOS = 0;
        EMPATADOS = 0;
        
        /*Imagen por defecto.*/
        miFicha( ruta );
    }
    
        
  //CREAR UN NUEVO JUGADR
    public Jugador(String nombre, ImageIcon imagen ) {
        
        //NOMBRE DEL JUGADOR
        this.nombre = nombre;
        GANADOS = 0;
        PERDIDOS = 0;
        EMPATADOS = 0;
        
        //IMAGEN POR DEFECTO
        this.ficha = imagen;
    }

   //METODO QUE INCREMENTA JUEGOS GANADOS
    public void gano(){
        GANADOS ++;
    }
    public void perdio(){
        PERDIDOS ++;
    }
    public void empato(){
        EMPATADOS ++;
    }
    
    //METODO QUE DVUELVE LA IMAGEN DELA FICHA
    public ImageIcon obtenFicha(){
        return ficha;
    }
    
    //METODO QUE ESTABLESE LA FICHA
    public void miFicha(String ruta){
        this.ficha = new ImageIcon ( this.getClass().getResource(ruta) );
    }
    
}
