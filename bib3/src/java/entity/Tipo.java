package entity;
// Generated 27-05-2017 13:33:40 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Tipo generated by hbm2java
 */
public class Tipo  implements java.io.Serializable {


     private int idTipo;
     private String nombreTipo;
     private TipoLibro tipoLibro;
     private TipoMedio tipoMedio;
     private Set documentos = new HashSet(0);

    public Tipo() {
    }

	
    public Tipo(int idTipo, String nombreTipo) {
        this.idTipo = idTipo;
        this.nombreTipo = nombreTipo;
    }
    public Tipo(int idTipo, String nombreTipo, TipoLibro tipoLibro, TipoMedio tipoMedio, Set documentos) {
       this.idTipo = idTipo;
       this.nombreTipo = nombreTipo;
       this.tipoLibro = tipoLibro;
       this.tipoMedio = tipoMedio;
       this.documentos = documentos;
    }
   
    public int getIdTipo() {
        return this.idTipo;
    }
    
    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }
    public String getNombreTipo() {
        return this.nombreTipo;
    }
    
    public void setNombreTipo(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }
    public TipoLibro getTipoLibro() {
        return this.tipoLibro;
    }
    
    public void setTipoLibro(TipoLibro tipoLibro) {
        this.tipoLibro = tipoLibro;
    }
    public TipoMedio getTipoMedio() {
        return this.tipoMedio;
    }
    
    public void setTipoMedio(TipoMedio tipoMedio) {
        this.tipoMedio = tipoMedio;
    }
    public Set getDocumentos() {
        return this.documentos;
    }
    
    public void setDocumentos(Set documentos) {
        this.documentos = documentos;
    }




}


