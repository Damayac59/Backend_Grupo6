package com.grupo6.apigrupo6.controlador;

import com.grupo6.apigrupo6.servicios.UsuarioServicio;
import com.grupo6.modelos.UsuarioModelo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("*/usuario")
public class UsuarioControlador {
    
    @Autowired
    UsuarioServicio usuarioServicio;

    @PostMapping
    public UsuarioModelo guardarUsuario(@RequestBody UsuarioModelo usuario){
        return usuarioServicio.guardarUsuario(usuario);
    }
}
