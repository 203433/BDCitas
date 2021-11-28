package com.verdi.citas.model;

import java.util.List;

public class CitaMascota extends Mascota {

    private List<Cita> citas;

    public CitaMascota(int mascotaId, String nombre, String fechaIng, String razonIng, int tipoId, int propietarioId, List<Cita> citas) {
        super(mascotaId, nombre, fechaIng, razonIng, tipoId, propietarioId);
        this.citas = citas;
    }

    public CitaMascota(List<Cita> citas) {
        this.citas = citas;
    }

    public CitaMascota(int mascotaId, String nombre, String fechaIng, String razonIng, int tipoId, int propietarioId) {
        super(mascotaId, nombre, fechaIng, razonIng, tipoId, propietarioId);
    }

    public List<Cita> getCitas() {
        return citas;
    }

    public void setCitas(List<Cita> citas) {
        this.citas = citas;
    }
}
