/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author andre
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            
            
            
            
            DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            
            dao.autorDAO gestionAutor = new dao.autorDAO();
            dao.editorialDAO gestionEditorial = new dao.editorialDAO();
            dao.edicionDAO gestionEdicion = new dao.edicionDAO();
            dao.tipoDAO gestionTipo = new dao.tipoDAO();
            dao.categoriaDAO gestionCategoria = new dao.categoriaDAO();
            
            String titulo = "ASDASD";
            Date anio = new Date();
            
            
            
            entity.Autor autor = new entity.Autor();
            
            
            try {
                autor = gestionAutor.getAutorById(1);
            } catch (Exception ex) {
                Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            entity.Editorial editorial = new entity.Editorial();
            editorial = gestionEditorial.getEditorialById(1);
            
            
            entity.Edicion edicion = new entity.Edicion();
            edicion = gestionEdicion.getEdicionById(1);
            
            
            entity.Tipo tipo = new entity.Tipo();
            try {
                tipo = gestionTipo.getTipoById(1);
            } catch (Exception ex) {
                Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            entity.Categoria categoria = new entity.Categoria();
            try {
                categoria = gestionCategoria.getCategoriaById(1);
            } catch (Exception ex) {
                Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            entity.Documento nuevoDocumento = new entity.Documento();
            
            nuevoDocumento.setEdicion(edicion);
            nuevoDocumento.setEditorial(editorial);
            nuevoDocumento.setTipo(tipo);
            nuevoDocumento.setEditorial(editorial);
            nuevoDocumento.setTipo(tipo);
            nuevoDocumento.setAutor(autor);
            nuevoDocumento.setCategoria(categoria);
            nuevoDocumento.setTitulo(titulo);
            nuevoDocumento.setAnoPublicacion(anio);
            
            
            dao.documentoDAO documentoDAO = new dao.documentoDAO();
            
            try {
                if(documentoDAO.add(nuevoDocumento))
                    System.out.println("Se agrego");
                else
                    System.out.println("No Se agrego");
            } catch (Exception ex) {
                Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        } catch (Exception ex) {
            Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
        }
                  
                    
    }
    
}
