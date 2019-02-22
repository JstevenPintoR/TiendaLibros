/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stevenpc
 * @Description Clase que contiene los datos de los del cliente
 */
public class cliente { // en esta clase se reciben los datos de los clientes
    
    private int idCliente;
    private String  nombreCliente;
    private float  documentoCliente;
    private String  direccionCliente;
    private String  correoCliente;
    private String  telefonoCliente;
    
 /*
 * @author stevenpc
 * @Description constructor de la clase cliente
 * @param idCliente
 * @param nombreCliente
 * @param documentoCliente
 * @param direccionCliente
 * @param  correoCliente
 * @param id telefonoCliente
 */
    
    public cliente(int idCliente, String nombreCliente, float documentoCliente, String direccionCliente, String correoCliente, String telefonoCliente) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.documentoCliente = documentoCliente;
        this.direccionCliente = direccionCliente;
        this.correoCliente = correoCliente;
        this.telefonoCliente = telefonoCliente;
    }
    

    
public void insertarCLiente (){ // funcion  el la cual se ingresara el cliente 

}

    public int getIdCliente() { //metodo get para mostrar el atributo idCliente
        return idCliente;
    }

    public void setIdCliente(int idCliente) { // metodo set para modificar el atributo idCliente
        this.idCliente = idCliente;
    }

    public String getNombreCliente() { //metodo get para mostrar el atributo nombreCliente
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) { // metodo set para modificar el atributo nombreCliente
        this.nombreCliente = nombreCliente;
    }

    public float getDocumentoCliente() {  //metodo get para mostrar el atributo documentoCliente
        return documentoCliente;
    }

    public void setDocumentoCliente(float documentoCliente) {  // metodo set para modificar el atributo documentoCliente
        this.documentoCliente = documentoCliente;
    }

    public String getDireccionCliente() {  //metodo get para mostrar el atributo direccionCliente
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {  // metodo set para modificar el atributo direccionCliente
        this.direccionCliente = direccionCliente;
    }

    public String getCorreoCliente() {  //metodo get para mostrar el atributo correoCliente
        return correoCliente;
    }

    public void setCorreoCliente(String correoCliente) { // metodo set para modificar el atributo correoCliente
        this.correoCliente = correoCliente;
    }

    public String getTelefonoCliente() { //metodo get para mostrar el atributo telefonoCliente
        return telefonoCliente;
    }

    public void setTelefonoCliente(String telefonoCliente) { // metodo set para modificar el atributo  telefonoCliente
        this.telefonoCliente = telefonoCliente;
    }
}

