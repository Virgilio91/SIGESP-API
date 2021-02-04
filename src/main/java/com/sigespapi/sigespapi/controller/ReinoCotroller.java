package com.sigespapi.sigespapi.controller;

import com.sigespapi.sigespapi.repository.ReinoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reino")
public class ReinoCotroller {

    @Autowired
    ReinoRepository reinoDao;


    
}
