package com.teste.teste.DTO;

import com.teste.teste.model.DadosProprietario;



public class DadosProprietarioDTO {
    private String codigo;
    private String nome;
    private String sobrenome;
    private String dataNascimento;
    private String cpf;
    private String sexo;
    private String rg;
    private String telefone;

    public DadosProprietarioDTO(String nome, String sobrenome, String dataNascimento, String cpf, String sexo, String rg, String telefone) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.sexo = sexo;
        this.rg = rg;
        this.telefone = telefone;
    }

    public DadosProprietarioDTO(DadosProprietario dadosProprietario){
        this.nome = dadosProprietario.getNome();
        this.sobrenome = dadosProprietario.getSobrenome();
        this.dataNascimento = dadosProprietario.getCpf();
        this.cpf = dadosProprietario.getSexo();
        this.sexo = dadosProprietario.getRg();
        this.telefone = dadosProprietario.getTelefone();
    }

    public DadosProprietarioDTO() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
