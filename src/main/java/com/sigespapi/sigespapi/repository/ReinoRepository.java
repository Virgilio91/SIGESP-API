package com.sigespapi.sigespapi.repository;

import com.sigespapi.sigespapi.model.Reino;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReinoRepository extends JpaRepository<Reino, Integer>{
    
}
