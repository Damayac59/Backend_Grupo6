package com.grupo6.apigrupo6.repositorio;

import com.grupo6.modelos.UsuarioModelo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepo extends CrudRepository<UsuarioModelo,Long> {
    
}

