package com.apirestdemo.test.controllers;
import com.apirestdemo.test.models.DatosTest;
import com.apirestdemo.test.services.DatosService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/lista")
public class DatosController {
    private DatosService datosService;

//    public ResponseEntity<ArrayList<DatosTest>> lista(){
//        ArrayList<DatosTest> listas = datosService.lista();
//        return new ResponseEntity<>(listas, HttpStatus.OK);
//    }
    @GetMapping
    public ArrayList<DatosTest> getLista(){
        return this.datosService.getDatos();
    }

}
