package com.teste.teste.model;

import java.util.Date;

public class Veiculo {
    private Date anoFabricacao;
    private String modeloVeiculo;
    private String marcaVeiculo;
    private String cor;
    private PlacaCarro placaCarro;

    public Veiculo(Date anoFabricacao, String modeloVeiculo, String marcaVeiculo, String cor, PlacaCarro placaCarro) {
        this.anoFabricacao = anoFabricacao;
        this.modeloVeiculo = modeloVeiculo;
        this.marcaVeiculo = marcaVeiculo;
        this.cor = cor;
        this.placaCarro = placaCarro;
    }

    public Date getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(Date anoFabricacao) {
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

    public PlacaCarro getPlacaCarro() {
        return placaCarro;
    }

    public void setPlacaCarro(PlacaCarro placaCarro) {
        this.placaCarro = placaCarro;
    }

}
