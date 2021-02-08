package com.sigespapi.sigespapi.repository;


import com.sigespapi.sigespapi.model.Reino;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReinoRepository extends CrudRepository<Reino, Integer>{
    
   
}
