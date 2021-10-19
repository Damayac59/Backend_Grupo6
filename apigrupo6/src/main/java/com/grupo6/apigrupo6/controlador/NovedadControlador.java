package com.grupo6.apigrupo6.controlador;

import com.grupo6.apigrupo6.servicios.NovedadServicio;
import com.grupo6.apigrupo6.modelos.NovedadModelo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/novedad")
public class NovedadControlador {
    @Autowired
    NovedadServicio novedadServicio;

    @PostMapping
    public NovedadModelo guardarNovedad(@RequestBody NovedadModelo novedad){
        return novedadServicio.guardarNovedad(novedad);
    }

    @GetMapping
    public ArrayList<NovedadModelo> obtenerNovedads(){
        return novedadServicio.obtenerNovedads();
    }
    @GetMapping(path = "/{id}")
    public Optional<NovedadModelo> cosultarNovedad(@PathVariable("id") Long id){
        return this.novedadServicio.consultarNovedad(id);
    }

    
}
