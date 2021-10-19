package com.grupo6.apigrupo6.repositorio;

import com.grupo6.apigrupo6.modelos.NovedadModelo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


 
@Repository
public interface NovedadRepo extends CrudRepository<NovedadModelo,Long>{
    
}
