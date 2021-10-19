package com.grupo6.apigrupo6.servicios;

import com.grupo6.apigrupo6.repositorio.NovedadRepo;
import com.grupo6.apigrupo6.modelos.NovedadModelo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Optional;

@Service
public class NovedadServicio {

    @Autowired 
    NovedadRepo novedadRepo;
    
    public NovedadModelo guardarNovedad(NovedadModelo novedad){
        return novedadRepo.save(novedad);
    }

     //metodo para devolver todos los registros de la BD
     public ArrayList<NovedadModelo> obtenerNovedads(){
        return (ArrayList<NovedadModelo>)novedadRepo.findAll();
    }
     //metodo para devolver un estudiante
     public Optional<NovedadModelo> consultarNovedad(Long id ){
        return novedadRepo.findById(id);
    }
}