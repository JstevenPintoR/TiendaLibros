
/**
 *
 * @author stevenpc
 * @Description Clase que contiene los datos de los libros
 */
public class libro { 
    private int idLibro;
    private String  nombreLibro;
    private String  editorialLibro;
    private String  autorLibro;
    private String  costoLibro;
    private int  idProveedor; 

    /*
 *
 * @author stevenpc
 * @Description constructor de la clase libro
 * @param id libro
 * @param Nombre
 * @param editorial
 * @param autor
 * @param  costo
 * @param id proveedor
 */
    public libro(int idLibro, String nombreLibro, String editorialLibro, String autorLibro, String costoLibro, int idProveedor) {
        this.idLibro = idLibro;
        this.nombreLibro = nombreLibro;
        this.editorialLibro = editorialLibro;
        this.autorLibro = autorLibro;
        this.costoLibro = costoLibro;
        this.idProveedor = idProveedor;
    }
    


public void ingresarLibro(){   //funcion utilizada para ingresar el libro

}

 public void ConsultaMasCostoso (){ // funcion utilizada para saber cual es el libro mas costoso
     
 }
public void ConsutaMasEconomico(){ // funcion utilixada para saber que libro es mas economico
    
}

    public int getIdLibro() {   //metodo get para mostrar el atributo idlibro
        return idLibro;
    }

    public void setIdLibro(int idLibro) {  // metodo set para modificar el atributo  idLirbo
        this.idLibro = idLibro;
    }

    public String getNombreLibro() { // metodo get para mostrar el atributo nombreLibro
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {  // metodo set para modificar el atributo nombreLibro
        this.nombreLibro = nombreLibro;
    }

    public String getEditorialLibro() {  // metodo get para mostrar el atributo editorialLibro
        return editorialLibro;
    }

    public void setEditorialLibro(String editorialLibro) {  // metodo set para modificar el atributo editorialLibro
        this.editorialLibro = editorialLibro;
    }

    public String getAutorLibro() {  // metodo get para mostrar el atributo autorLibro
        return autorLibro;
    }

    public void setAutorLibro(String autorLibro) {  // metodo set para modificar el atributo autorLibro
        this.autorLibro = autorLibro;
    }

    public String getCostoLibro() { // metodo get para mostrar el atributo costoLibro
        return costoLibro;
    }

    public void setCostoLibro(String costoLibro) {  // metodo set para modificar el atributo costoLibro
        this.costoLibro = costoLibro;
    }

    public int getIdProveedor() {   // metodo get para mostrar el atributo idProveedor
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {  // metodo set para modificar el atributo idProveedor
        this.idProveedor = idProveedor;
    }

}