package com.nttdata.bootcamp.libreria;

public class Temperatura {

    private double grados;

    public Temperatura(double grados) {

        this.grados = grados;

    }

    public double convertirFarenheit() {

        double gradosFarenheit;

        gradosFarenheit = (grados * 9 / 5) + 32;

        return gradosFarenheit;

    }

}
