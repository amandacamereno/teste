package com.teste.teste.DTO;



public class PlacaCarroDTO {
    private String codigo;
    private String letras;
    private String numeros;
    private String modelo;
    private String cidade;
    private String estado;

    public PlacaCarroDTO(String codigo, String letras, String numeros, String modelo, String cidade, String estado) {
        this.codigo = codigo;
        this.letras = letras;
        this.numeros = numeros;
        this.modelo = modelo;
        this.cidade = cidade;
        this.estado = estado;
    }

    public PlacaCarroDTO() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getLetras() {
        return letras;
    }

    public void setLetras(String letras) {
        this.letras = letras;
    }

    public String getNumeros() {
        return numeros;
    }

    public void setNumeros(String numeros) {
        this.numeros = numeros;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
