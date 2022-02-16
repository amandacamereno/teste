package com.teste.teste.model;

import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotEmpty;


@Document
public class Veiculo {
    @Id
    private String codigo;
    @Schema(description = "Ano de fabricaco", example = "1994")
    private String anoFabricacao;
    @Schema(description = "Modelo do veiculo", example = "corsa")
    @NotEmpty (message = "Campo obriatorio")
    private String modeloVeiculo;
    @Schema(description = "Marca do veiculo ", example = "chevrolet")
    @NotEmpty (message = "Campo obriatorio")
    private String marcaVeiculo;
    @Schema(description = "Cor do veiculo", example = "prata")
    @NotEmpty (message = "Campo obriatorio")
    private String cor;
    //private PlacaCarro placaCarro;

    public Veiculo(String anoFabricacao, String modeloVeiculo, String marcaVeiculo, String cor) {
        this.anoFabricacao = anoFabricacao;
        this.modeloVeiculo = modeloVeiculo;
        this.marcaVeiculo = marcaVeiculo;
        this.cor = cor;
        //this.placaCarro = placaCarro;
    }

    public Veiculo() {
    }

    public String getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(String anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getModeloVeiculo() {
        return modeloVeiculo;
    }

    public void setModeloVeiculo(String modeloVeiculo) {
        this.modeloVeiculo = modeloVeiculo;
    }

    public String getMarcaVeiculo() {
        return marcaVeiculo;
    }

    public void setMarcaVeiculo(String marcaVeiculo) {
        this.marcaVeiculo = marcaVeiculo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    //public PlacaCarro getPlacaCarro() {return placaCarro}

    //public void setPlacaCarro(PlacaCarro placaCarro) {this.placaCarro = placaCarro;}

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
