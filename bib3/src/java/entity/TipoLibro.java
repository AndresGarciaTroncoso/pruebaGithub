package entity;
// Generated 27-05-2017 13:33:40 by Hibernate Tools 4.3.1



/**
 * TipoLibro generated by hbm2java
 */
public class TipoLibro  implements java.io.Serializable {


     private int idTipo;
     private Tipo tipo;
     private String nombreTipoLibro;

    public TipoLibro() {
    }

    public TipoLibro(Tipo tipo, String nombreTipoLibro) {
       this.tipo = tipo;
       this.nombreTipoLibro = nombreTipoLibro;
    }
   
    public int getIdTipo() {
        return this.idTipo;
    }
    
    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }
    public Tipo getTipo() {
        return this.tipo;
    }
    
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
    public String getNombreTipoLibro() {
        return this.nombreTipoLibro;
    }
    
    public void setNombreTipoLibro(String nombreTipoLibro) {
        this.nombreTipoLibro = nombreTipoLibro;
    }




}


