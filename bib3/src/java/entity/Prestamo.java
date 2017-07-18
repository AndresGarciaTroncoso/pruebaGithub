package entity;
// Generated 27-05-2017 13:33:40 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Prestamo generated by hbm2java
 */
public class Prestamo  implements java.io.Serializable {


     private int idPrestamo;
     private Ejemplar ejemplar;
     private Usuario usuario;
     private Date fechaPrestamo;
     private Date horaPrestamo;
     private Domicilio domicilio;
     private Sala sala;

    public Prestamo() {
    }

	
    public Prestamo(int idPrestamo, Ejemplar ejemplar, Usuario usuario, Date fechaPrestamo, Date horaPrestamo) {
        this.idPrestamo = idPrestamo;
        this.ejemplar = ejemplar;
        this.usuario = usuario;
        this.fechaPrestamo = fechaPrestamo;
        this.horaPrestamo = horaPrestamo;
    }
    public Prestamo(int idPrestamo, Ejemplar ejemplar, Usuario usuario, Date fechaPrestamo, Date horaPrestamo, Domicilio domicilio) {
       this.idPrestamo = idPrestamo;
       this.ejemplar = ejemplar;
       this.usuario = usuario;
       this.fechaPrestamo = fechaPrestamo;
       this.horaPrestamo = horaPrestamo;
       this.domicilio = domicilio;
    }
    
    public Prestamo(int idPrestamo, Ejemplar ejemplar, Usuario usuario, Date fechaPrestamo, Date horaPrestamo, Sala sala) {
       this.idPrestamo = idPrestamo;
       this.ejemplar = ejemplar;
       this.usuario = usuario;
       this.fechaPrestamo = fechaPrestamo;
       this.horaPrestamo = horaPrestamo;
       this.sala = sala;
    }
   
    public int getIdPrestamo() {
        return this.idPrestamo;
    }
    
    public void setIdPrestamo(int idPrestamo) {
        this.idPrestamo = idPrestamo;
    }
    public Ejemplar getEjemplar() {
        return this.ejemplar;
    }
    
    public void setEjemplar(Ejemplar ejemplar) {
        this.ejemplar = ejemplar;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public Date getFechaPrestamo() {
        return this.fechaPrestamo;
    }
    
    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }
    public Date getHoraPrestamo() {
        return this.horaPrestamo;
    }
    
    public void setHoraPrestamo(Date horaPrestamo) {
        this.horaPrestamo = horaPrestamo;
    }
    public Domicilio getDomicilio() {
        return this.domicilio;
    }
    
    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }
    public Sala getSala() {
        return this.sala;
    }
    
    public void setSala(Sala sala) {
        this.sala = sala;
    }




}

