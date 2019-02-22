
import java.sql.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stevenpc
 * @Description Clase que contiene los datos de los de las ventas
 */
public class venta { 
    
public int idVenta;
public int idLibro;
public java.sql.Date fecha;
public int cantidad;
public float costoVenta;
public int idCliente;


/*
 * @author stevenpc
 * @Description constructor de la clase venta
 * @param idVenta
 * @param idLibro
 * @param cantidad
 * @param costoVenta
 * @param  idCliente
 */

    public venta(int idVenta, int idLibro, Date fecha, int cantidad, float costoVenta, int idCliente) {
        this.idVenta = idVenta;
        this.idLibro = idLibro;
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.costoVenta = costoVenta;
        this.idCliente = idCliente;
    }

    
public void inseretarVenta (){ // en esta funcion se calculara el libro mas vendido.
    
    
}

    public int getIdVenta() { //metodo get para mostrar el atributo  idVenta
        return idVenta;
    }

    public void setIdVenta(int idVenta) { // metodo set para modificar el atributo idVenta
        this.idVenta = idVenta;
    }

    public int getIdLibro() { //metodo get para mostrar el atributo idLibro
        return idLibro;
    }

    public void setIdLibro(int idLibro) { // metodo set para modificar el atributo idLibro
        this.idLibro = idLibro;
    }

    public Date getFecha() { //metodo get para mostrar el atributo fecha
        return fecha;
    }

    public void setFecha(Date fecha) { // metodo set para modificar el atributo  fecha
        this.fecha = fecha;
    }

    public int getCantidad() { //metodo get para mostrar el atributo cantidad
        return cantidad;
    }

    public void setCantidad(int cantidad) { // metodo set para modificar el atributo  cantidad
        this.cantidad = cantidad;
    }

    public float getCostoVenta() { //metodo get para mostrar el atributo costoVenta
        return costoVenta;
    }

    public void setCostoVenta(float costoVenta) { // metodo set para modificar el atributo  costoVenta
        this.costoVenta = costoVenta;
    }

    public int getIdCliente() { //metodo get para mostrar el atributo idCliente
        return idCliente;
    }

    public void setIdCliente(int idCliente) { // metodo set para modificar el atributo  idCliente
        this.idCliente = idCliente;
    }


}