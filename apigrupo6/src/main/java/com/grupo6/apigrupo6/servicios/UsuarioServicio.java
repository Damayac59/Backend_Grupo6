package com.grupo6.apigrupo6.servicios;

import com.grupo6.apigrupo6.repositorio.UsuarioRepo;
import com.grupo6.modelos.UsuarioModelo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServicio {

    @Autowired 
    UsuarioRepo usuarioRepo;
    
    public UsuarioModelo guardarUsuario(UsuarioModelo usuario){
        return usuarioRepo.save(usuario);
    }
}
