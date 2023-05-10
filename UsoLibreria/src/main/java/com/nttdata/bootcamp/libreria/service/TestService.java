package com.nttdata.bootcamp.libreria.service;

import com.nttdata.bootcamp.libreria.Saludo;
import com.nttdata.bootcamp.libreria.Temperatura;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    public TestService() {}

    public String usoSaludo(String idioma) {

        Saludo saludo = new Saludo(idioma);
        return  saludo.mensajeSaludo();

    }

    public double usoConvertidor(double grados) {

        Temperatura temperatura = new Temperatura(28.00);
        return temperatura.convertirFarenheit();

    }

}
