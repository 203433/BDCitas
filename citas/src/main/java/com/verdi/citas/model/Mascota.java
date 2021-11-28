package com.verdi.citas.model;

import javax.persistence.*;

@Entity
@Table(name = "mascota")
public class Mascota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int mascotaId;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "fechaIng")
    private String fechaIng;

    @Column(name = "razonIng")
    private String razonIng;

    @Column(name = "tipoId")
    private int tipoId;

    @Column(name = "propietarioId")
    private int propietarioId;

    public Mascota(int mascotaId, String nombre, String fechaIng, String razonIng, int tipoId, int propietarioId) {
        this.mascotaId = mascotaId;
        this.nombre = nombre;
        this.fechaIng = fechaIng;
        this.razonIng = razonIng;
        this.tipoId = tipoId;
        this.propietarioId = propietarioId;
    }

    public Mascota() {

    }

    public void setMascotaId(int mascotaId) {
        this.mascotaId = mascotaId;
    }

    public int getMascotaId() {
        return mascotaId;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setFechaIng(String fechaIng) {
        this.fechaIng = fechaIng;
    }

    public String getFechaIng() {
        return fechaIng;
    }

    public void setRazonIng(String razonIng) {
        this.razonIng = razonIng;
    }

    public String getRazonIng() {
        return razonIng;
    }

    public int getTipoId() {
        return tipoId;
    }

    public void setTipoId(int tipoId) {
        this.tipoId = tipoId;
    }

    public int getPropietarioId() {
        return propietarioId;
    }

    public void setPropietarioId(int propietarioId) {
        this.propietarioId = propietarioId;
    }
}


