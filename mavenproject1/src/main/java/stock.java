
import java.sql.Array;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stevenpc}
* @Description Clase que contiene los datos de los de stock
*/
public class stock { 
    
        public Array libro[]; 
        
        /*
 * @author stevenpc
 * @Description constructor de la clase stock
 * @param libro
 */
    public stock(Array[] libro) {
        this.libro = libro;
    }

   
    public int calcularStock(int cantidad){
        return cantidad;     // en esta funcion calcularacuantos libros hay en stock
}
   
    
    
    public void calcularMenos ()  { // en esta funcion se calculara cuando hay menos de 10 libros en stock

    
}

    public Array[] getLibro() {  //metodo get para mostrar el atributo  libro
        return libro;
    }

    public void setLibro(Array[] libro) { // metodo set para modificar el atributo  libro
        this.libro = libro;
    }
}