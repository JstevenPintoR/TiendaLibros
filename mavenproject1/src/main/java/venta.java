
import java.sql.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stevenpc
 */
public class venta { // en esta clase se capturan los datos de las ventas realizadas
    
public int idVenta;
public int idLibro;
public java.sql.Date fecha;
public int cantidad;
public float costoVenta;
public int idCliente;

    public venta(int idVenta, int idLibro, Date fecha, int cantidad, float costoVenta, int idCliente) {
        this.idVenta = idVenta;
        this.idLibro = idLibro;
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.costoVenta = costoVenta;
        this.idCliente = idCliente;
    }


public void CalcularMasVendido (){ // en esta funcion se calculara el libro mas vendido.
    
    
}

}