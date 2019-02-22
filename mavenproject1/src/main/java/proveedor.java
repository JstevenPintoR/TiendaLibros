/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stevenpc
 * @Description Clase que contiene los datos de los de las proveedor
 */
public class proveedor {  // en esta calse se van a recibir los datos del proveedor de los libros
    private int idProveedor;
    private String  nombreProveedor;
    private String  documentoProveedor;
    private String  direccionProveedor;
      private String  correoProveedor;
    private String  telefonoProveedor; 

     /*
 * @author stevenpc
 * @Description constructor de la clase proveedor
 * @param idProveedor
 * @param nombreProveedor
 * @param documentoProveedor
 * @param direccionProveedor
 * @param  correoProveedor
 * @param id telefonoProveedor
 */
    public proveedor(int idProveedor, String nombreProveedor, String documentoProveedor, String direccionProveedor, String correoProveedor, String telefonoProveedor) {
        this.idProveedor = idProveedor;
        this.nombreProveedor = nombreProveedor;
        this.documentoProveedor = documentoProveedor;
        this.direccionProveedor = direccionProveedor;
        this.correoProveedor = correoProveedor;
        this.telefonoProveedor = telefonoProveedor;
    }
      


public void insertarProveedor(){ // esta funcion es utilizada para insertar el proveedor

}

    public int getIdProveedor() { //metodo get para mostrar el atributo idProveedor
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) { // metodo set para modificar el atributo idProveedor
        this.idProveedor = idProveedor;
    }

    public String getNombreProveedor() { //metodo get para mostrar el atributo nombreProveedor
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) { // metodo set para modificar el atributo nombreProveedor
        this.nombreProveedor = nombreProveedor;
    }

    public String getDocumentoProveedor() { //metodo get para mostrar el atributo documentoProveedor
        return documentoProveedor;
    }

    public void setDocumentoProveedor(String documentoProveedor) { // metodo set para modificar el atributo documentoProveedor
        this.documentoProveedor = documentoProveedor; 
    }

    public String getDireccionProveedor() { //metodo get para mostrar el atributo direccionProveedor
        return direccionProveedor;
    }

    public void setDireccionProveedor(String direccionProveedor) { // metodo set para modificar el atributo direccionProveedor
        this.direccionProveedor = direccionProveedor;
    }

    public String getCorreoProveedor() { //metodo get para mostrar el atributo correoProveedor
        return correoProveedor;
    }

    public void setCorreoProveedor(String correoProveedor) { // metodo set para modificar el atributo correoProveedor
        this.correoProveedor = correoProveedor;
    }

    public String getTelefonoProveedor() { //metodo get para mostrar el atributo telefonoProveedor
        return telefonoProveedor;
    }

    public void setTelefonoProveedor(String telefonoProveedor) { // metodo set para modificar el atributo telefonoProveedor
        this.telefonoProveedor = telefonoProveedor;
    }
}