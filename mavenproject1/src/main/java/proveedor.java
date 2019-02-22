/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stevenpc
 */
public class proveedor {  // en esta calse se van a recibir los datos del proveedor de los libros
    private int idProveedor;
    private string  nombreProveedor;
    private float  documentoProveedor;
    private string  direccionProveedor;
    private string  correoProveedor;
    private string  telefonoProveedor;     
    
    
    public proveedor(int idProveedor, string nombreProveedor, float documentoProveedor, string direccionProveedor, string correoProveedor, string telefonoProveedor) {
        this.idProveedor = idProveedor;
        this.nombreProveedor = nombreProveedor;
        this.documentoProveedor = documentoProveedor;
        this.direccionProveedor = direccionProveedor;
        this.correoProveedor = correoProveedor;
        this.telefonoProveedor = telefonoProveedor;
    }
    
     
}
