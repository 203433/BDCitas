package com.verdi.citas.model;

import javax.persistence.*;

@Entity
@Table(name = "cita")
public class Cita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int citaId;

    @Column(name = "servicio")
    private String servicio;

    @Column(name = "fecha")
    private String fecha;

    @Column(name = "hora")
    private String hora;

    @Column(name = "mascotaId")
    private int mascotaId;

    public Cita(int citaId, String servicio, String fecha, String hora, int mascotaId) {
        this.citaId = citaId;
        this.servicio = servicio;
        this.fecha = fecha;
        this.hora = hora;
        this.mascotaId = mascotaId;
    }

    public Cita(){

    }

    public int getCitaId() {
        return citaId;
    }

    public void setCitaId(int citaId) {
        this.citaId = citaId;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getMascotaId() {
        return mascotaId;
    }

    public void setMascotaId(int mascotaId) {
        this.mascotaId = mascotaId;
    }
}
