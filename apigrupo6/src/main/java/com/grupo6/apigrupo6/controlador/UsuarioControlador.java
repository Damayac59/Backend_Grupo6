package com.grupo6.apigrupo6.controlador;

import com.grupo6.apigrupo6.servicios.UsuarioServicio;
import com.grupo6.apigrupo6.modelos.UsuarioModelo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/usuario")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST})
public class UsuarioControlador {
    
    @Autowired
    UsuarioServicio usuarioServicio;

    @PostMapping
    public UsuarioModelo guardarUsuario(@RequestBody UsuarioModelo usuario){
        return usuarioServicio.guardarUsuario(usuario);
    }

    @GetMapping
    public ArrayList<UsuarioModelo> obtenerUsuarios(){
        return usuarioServicio.obtenerUsuarios();
    }
    @GetMapping(path = "/{id}")
    public Optional<UsuarioModelo> cosultarUsuario(@PathVariable("id") Long id){
        return this.usuarioServicio.consultarUsuario(id);
    }
}

