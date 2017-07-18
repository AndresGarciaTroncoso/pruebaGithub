package entity;
// Generated 27-05-2017 13:33:40 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Domicilio generated by hbm2java
 */
public class Domicilio  implements java.io.Serializable {


     private int idPrestamo;
     private Prestamo prestamo;
     private Date fechaDevolucion;
     private Date horaDevolucion;

    public Domicilio() {
    }

    public Domicilio(Prestamo prestamo, Date fechaDevolucion, Date horaDevolucion) {
       this.prestamo = prestamo;
       this.fechaDevolucion = fechaDevolucion;
       this.horaDevolucion = horaDevolucion;
    }
   
    public int getIdPrestamo() {
        return this.idPrestamo;
    }
    
    public void setIdPrestamo(int idPrestamo) {
        this.idPrestamo = idPrestamo;
    }
    public Prestamo getPrestamo() {
        return this.prestamo;
    }
    
    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }
    public Date getFechaDevolucion() {
        return this.fechaDevolucion;
    }
    
    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
    public Date getHoraDevolucion() {
        return this.horaDevolucion;
    }
    
    public void setHoraDevolucion(Date horaDevolucion) {
        this.horaDevolucion = horaDevolucion;
    }




}

