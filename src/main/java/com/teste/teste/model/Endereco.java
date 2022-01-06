package com.teste.teste.model;

import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Endereco {
    @Id
    private String codigo;
    @Schema(description = "rua", example = "Avenida Brasil")
    private String rua;
    @Schema(description = "pais", example = "Brasil")
    private String pais;
    @Schema(description = "cidade", example = "Sao Paulo")
    private String cidade;
    @Schema(description = "bairro", example = "Cidade Jardins")
    private String bairro;
    @Schema(description = "estado", example = "Sao Paulo")
    private String estado;
    @Schema(description = "Numero da casa", example = "123")
    private String numero;
    @Schema(description = "Complemento do endereco", example = "apto 12")
    private String complemento;
    @Schema(description = "Numero do CEP", example = "12345678")
    private String cep;

    public Endereco(String rua, String pais, String cidade, String bairro, String estado, String numero, String complemento, String cep) {
        this.rua = rua;
        this.pais = pais;
        this.cidade = cidade;
        this.bairro = bairro;
        this.estado = estado;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
