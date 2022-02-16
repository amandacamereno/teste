package com.teste.teste.DTO;


import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public class PlacaCarroDTO {
    @Schema(description = "Sequencia de letras", example = "abc")
    @NotEmpty(message = "Campo obriatorio")
    @Pattern(regexp = "^[A-Za-z ]+$", message = "O campo deve conter apenas letras")
    private String letras;
    @Schema(description = "Sequencia de numeros", example = "1234")
    @NotEmpty (message = "Campo obriatorio")
    @Pattern(regexp = "^[0-9;]+$", message = "O campo deve conter apenas numeros")
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



    public PlacaCarroDTO() {
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
