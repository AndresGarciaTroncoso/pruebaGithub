package entity;
// Generated 27-05-2017 13:33:40 by Hibernate Tools 4.3.1



/**
 * TipoMedio generated by hbm2java
 */
public class TipoMedio  implements java.io.Serializable {


     private int idTipo;
     private Tipo tipo;
     private String nombreTipoMedio;

    public TipoMedio() {
    }

    public TipoMedio(Tipo tipo, String nombreTipoMedio) {
       this.tipo = tipo;
       this.nombreTipoMedio = nombreTipoMedio;
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
    public String getNombreTipoMedio() {
        return this.nombreTipoMedio;
    }
    
    public void setNombreTipoMedio(String nombreTipoMedio) {
        this.nombreTipoMedio = nombreTipoMedio;
    }




}

