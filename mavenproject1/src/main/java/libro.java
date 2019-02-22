/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stevenpc
 */
public class libro { //  en esta clase se recibira la informacion del los libros
    private int idLibro;
    private string  nombreLibro;
    private string  editorialLibro;
    private String  autorLibro;
    private float  costoLibro;
    private int  idProveedor;

    public libro(int idLibro, string nombreLibro, string editorialLibro, String autorLibro, float costoLibro, int idProveedor) {
        this.idLibro = idLibro;
        this.nombreLibro = nombreLibro;
        this.editorialLibro = editorialLibro;
        this.autorLibro = autorLibro;
        this.costoLibro = costoLibro;
        this.idProveedor = idProveedor;
    }
    
    
}
