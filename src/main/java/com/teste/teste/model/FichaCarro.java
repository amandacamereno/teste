package com.teste.teste.model;

import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.constraints.NotEmpty;

public class FichaCarro {
    @Schema(description = "Multas", example = "sim")
    @NotEmpty(message = "Campo obriatorio")
    private Boolean multas;
    @Schema(description = "ipva", example = "pago")
    @NotEmpty (message = "Campo obriatorio")
    private Boolean ipva;
    @Schema(description = "roubado", example = "nao")
    @NotEmpty (message = "Campo obriatorio")
    private Boolean roubado;
    private Veiculo veiculo;

    public FichaCarro(Boolean multas, Boolean ipva, Boolean roubado, Veiculo veiculo) {
        this.multas = multas;
        this.ipva = ipva;
        this.roubado = roubado;
        this.veiculo = veiculo;
    }

    public Boolean getMultas() {
        return multas;
    }

    public void setMultas(Boolean multas) {
        this.multas = multas;
    }

    public Boolean getIpva() {
        return ipva;
    }

    public void setIpva(Boolean ipva) {
        this.ipva = ipva;
    }

    public Boolean getRoubado() {
        return roubado;
    }

    public void setRoubado(Boolean roubado) {
        this.roubado = roubado;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

}
