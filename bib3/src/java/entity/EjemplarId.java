package entity;
// Generated 27-05-2017 13:33:40 by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * EjemplarId generated by hbm2java
 */
public class EjemplarId  implements java.io.Serializable {


     private int idEjemplar;
     private BigDecimal idDocumento;

    public EjemplarId() {
    }

    public EjemplarId(int idEjemplar, BigDecimal idDocumento) {
       this.idEjemplar = idEjemplar;
       this.idDocumento = idDocumento;
    }
   
    public int getIdEjemplar() {
        return this.idEjemplar;
    }
    
    public void setIdEjemplar(int idEjemplar) {
        this.idEjemplar = idEjemplar;
    }
    public BigDecimal getIdDocumento() {
        return this.idDocumento;
    }
    
    public void setIdDocumento(BigDecimal idDocumento) {
        this.idDocumento = idDocumento;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof EjemplarId) ) return false;
		 EjemplarId castOther = ( EjemplarId ) other; 
         
		 return (this.getIdEjemplar()==castOther.getIdEjemplar())
 && ( (this.getIdDocumento()==castOther.getIdDocumento()) || ( this.getIdDocumento()!=null && castOther.getIdDocumento()!=null && this.getIdDocumento().equals(castOther.getIdDocumento()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdEjemplar();
         result = 37 * result + ( getIdDocumento() == null ? 0 : this.getIdDocumento().hashCode() );
         return result;
   }   


}


