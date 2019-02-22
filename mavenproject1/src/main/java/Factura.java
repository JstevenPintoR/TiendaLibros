

/**
 *
 * @author stevenpc
 * @Description Clase que contiene los datos de los de factura
 */
public class Factura {
    
    public int idFactura;
    public int idCliente;
    public int idVenta;
    
    /*
 * @author stevenpc
 * @Description constructor de la clase factura
 * @param idFactura
 * @param idCliente
 * @param idVenta
 */

    public Factura(int idFactura, int idCliente, int idVenta) {
        this.idFactura = idFactura;
        this.idCliente = idCliente;
        this.idVenta = idVenta;
    }
    
    public void insertarFactura(){  // funcion en la cual se ingresa la factura
        
    }
    
    public void CalcularMasVendido(){ // funcion en la cual se calcula el libro mas vendido
    }

    public void calcularMenosVendido(){ // funcion en la cual se calcula el libro menos vendido
    }
    public int getIdFactura() { //metodo get para mostrar el atributo idFactura
        return idFactura;
    }

    public void setIdFactura(int idFactura) { // metodo set para modificar el atributo idFactura
        this.idFactura = idFactura;
    }

    public int getIdCliente() { //metodo get para mostrar el atributo idCliente
        return idCliente;
    }

    public void setIdCliente(int idCliente) { // metodo set para modificar el atributo idCliente
        this.idCliente = idCliente;
    }

    public int getIdVenta() { //metodo get para mostrar el atributo idVenta
        return idVenta;
    }

    public void setIdVenta(int idVenta) { // metodo set para modificar el atributo idVenta
        this.idVenta = idVenta;
    }
    
    
    }
    

