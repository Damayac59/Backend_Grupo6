package com.grupo6.apigrupo6.servicios;

import com.grupo6.apigrupo6.repositorio.UsuarioRepo;
import com.grupo6.apigrupo6.modelos.UsuarioModelo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Optional;

@Service
public class UsuarioServicio {

    @Autowired 
    UsuarioRepo usuarioRepo;
    
    public UsuarioModelo guardarUsuario(UsuarioModelo usuario){
        return usuarioRepo.save(usuario);
    }

     //metodo para devolver todos los registros de la BD
     public ArrayList<UsuarioModelo> obtenerUsuarios(){
        return (ArrayList<UsuarioModelo>)usuarioRepo.findAll();
    }
     //metodo para devolver un estudiante
     public Optional<UsuarioModelo> consultarUsuario(Long id ){
        return usuarioRepo.findById(id);
    }
}
