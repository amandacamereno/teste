package com.teste.teste.DTO;

import com.teste.teste.model.PlacaCarro;
import com.teste.teste.model.Veiculo;

import java.util.Date;

public class VeiculoDTO {

    private String codigo;
    private Date anoFabricacao;
    private String modeloVeiculo;
    private String marcaVeiculo;
    private String cor;
    private PlacaCarro placaCarro;

    public VeiculoDTO(String codigo, Date anoFabricacao, String modeloVeiculo, String marcaVeiculo, String cor, PlacaCarro placaCarro) {
        this.codigo = codigo;
        this.anoFabricacao = anoFabricacao;
        this.modeloVeiculo = modeloVeiculo;
        this.marcaVeiculo = marcaVeiculo;
        this.cor = cor;
        this.placaCarro = placaCarro;
    }

    public VeiculoDTO(Veiculo veiculo){
        this.anoFabricacao = veiculo.getAnoFabricacao();
        this.modeloVeiculo = veiculo.getModeloVeiculo();
        this.marcaVeiculo = veiculo.getMarcaVeiculo();
        this.cor = veiculo.getCor();
        this.placaCarro = veiculo.getPlacaCarro();
    }

    public VeiculoDTO() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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
