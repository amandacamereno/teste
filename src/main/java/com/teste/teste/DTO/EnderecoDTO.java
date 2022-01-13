package com.teste.teste.DTO;

import com.teste.teste.model.Endereco;

public class EnderecoDTO {

    private String codigo;
    private String rua;
    private String pais;
    private String cidade;
    private String bairro;
    private String estado;
    private String numero;
    private String complemento;
    private String cep;

    public EnderecoDTO(String codigo, String rua, String pais, String cidade, String bairro, String estado, String numero, String complemento, String cep) {
        this.codigo = codigo;
        this.rua = rua;
        this.pais = pais;
        this.cidade = cidade;
        this.bairro = bairro;
        this.estado = estado;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
    }

    public EnderecoDTO(Endereco endereco){
        this.rua = endereco.getRua();
        this.pais = endereco.getPais();
        this.cidade = endereco.getCidade();
        this.bairro = endereco.getBairro();
        this.estado = endereco.getEstado();
        this.numero = endereco.getNumero();
        this.complemento = endereco.getComplemento();
        this.cep = endereco.getCep();

    }

    public EnderecoDTO() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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
}
