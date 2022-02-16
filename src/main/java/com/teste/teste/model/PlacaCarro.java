package com.teste.teste.model;

import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotEmpty;

@Document
public class PlacaCarro {
   @Id
    private String codigo;
    @Schema(description = "Sequencia de letras", example = "abc")
    @NotEmpty(message = "Campo obriatorio")
    private String letras;
    @Schema(description = "Sequencia de numeros", example = "1234")
    @NotEmpty (message = "Campo obriatorio")
    private String numeros;
    @Schema(description = "Modelo da placa", example = "antigo")
    @NotEmpty (message = "Campo obriatorio")
    private String modelo;
    @Schema(description = "Cidade de registro da placa", example = "Sao Paulo")
    @NotEmpty (message = "Campo obriatorio")
    private String cidade;
    @Schema(description = "Estado de registro da placa", example = "Sao Paulo")
    @NotEmpty (message = "Campo obriatorio")
    private String estado;


    public PlacaCarro(String letras, String numeros, String modelo, String cidade, String estado) {
        this.letras = letras;
        this.numeros = numeros;
        this.modelo = modelo;
        this.cidade = cidade;
        this.estado = estado;


    }

    public PlacaCarro() {
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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
