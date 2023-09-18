package com.apirestdemo.test.services;

import com.apirestdemo.test.models.DatosTest;
import com.apirestdemo.test.repositories.DatosTestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class DatosService {
    @Autowired
    DatosTestRepository datosRepository;
    public ArrayList<DatosTest> getDatos(){
        return (ArrayList<DatosTest>) datosRepository.findAll();
    }


}
