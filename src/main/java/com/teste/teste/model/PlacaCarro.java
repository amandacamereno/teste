package com.teste.teste.model;

public class PlacaCarro {
    private String letras;
    private String numeros;
    private String modelo;

    public PlacaCarro(String letras, String numeros, String modelo) {
        this.letras = letras;
        this.numeros = numeros;
        this.modelo = modelo;
    }

    public String getLetras() {
        return letras;
    }

    public String getNumeros() {
        return numeros;
    }

    public String getModelo() {
        return modelo;
    }

    public void setLetras(String letras) {
        this.letras = letras;
    }

    public void setNumeros(String numeros) {
        this.numeros = numeros;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}
