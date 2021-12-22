package com.teste.teste.model;

import java.util.Date;

public class DadosProprietario {
    private String nome;
    private String sobrenome;
    private Date dataNascimento;
    private String cpf;
    private String sexo;
    private String rg;
    private DadosProprietario dadosProprietario;

    public DadosProprietario(String nome, String sobrenome, Date dataNascimento, String cpf, String sexo, String rg, DadosProprietario dadosProprietario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.sexo = sexo;
        this.rg = rg;
        this.dadosProprietario = dadosProprietario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public DadosProprietario getDadosProprietario() {
        return dadosProprietario;
    }

    public void setDadosProprietario(DadosProprietario dadosProprietario) {
        this.dadosProprietario = dadosProprietario;
    }


}
