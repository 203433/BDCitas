package com.verdi.citas.controller;


import com.verdi.citas.model.Cita;
import com.verdi.citas.model.CitaMascota;
import com.verdi.citas.model.Mascota;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
public class CitaController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping(value = "/listCitas")
    public List<Cita> getListCitas(){
        Cita[] citas = restTemplate.getForObject("http://localhost:8080/listCitas",Cita[].class);
        List<Cita> c = Arrays.asList(citas);
        return c;
    }

    @GetMapping(value = "/cita/{citaId}")
    public Cita getCitaById(@PathVariable("citaId") int citaId){
        Cita cita = restTemplate.getForObject("http://localhost:8080/cita/"+citaId, Cita.class);
        return cita;
    }

    @GetMapping(value = "/listCitas/mascotas/{mascotaId}")
    public Mascota getCitasOfMascota(@PathVariable("mascotaId") int mascId){
        CitaMascota citaMascota = restTemplate.getForObject("http://localhost:8080/mascota/"+mascId,CitaMascota.class);
        if(citaMascota!=null){
            Cita[] citas = restTemplate.getForObject("http://localhost:8080/cita/mascota/"+mascId,Cita[].class);
            citaMascota.setCitas(Arrays.asList(citas));
            return citaMascota;
        }
        return null;
    }



}
