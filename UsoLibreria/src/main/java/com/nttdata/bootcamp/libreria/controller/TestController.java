package com.nttdata.bootcamp.libreria.controller;

import com.nttdata.bootcamp.libreria.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class TestController {

    @Autowired
    TestService testService;

    @GetMapping("saludo/{idioma}")
    public String saludo(@PathVariable("idioma") String idioma) {

        String saludoEnIdioma = testService.usoSaludo(idioma);
        return saludoEnIdioma;

    }

    @GetMapping("temperatura/{grados}")
    public double gradosFarenheit(@PathVariable("grados") double grados) {

        double gradosConvertidos = testService.usoConvertidor(grados);
        return gradosConvertidos;

    }

}
