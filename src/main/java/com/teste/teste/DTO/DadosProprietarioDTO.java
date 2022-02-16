package com.teste.teste.DTO;


import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public class DadosProprietarioDTO {
    @Schema(description = "Nome do proprietario", example = "Fernando")
    @NotEmpty(message = "Campo obriatorio")
    @Pattern(regexp = "^[A-Za-z ]+$", message = "O campo deve conter apenas letras")
    private String nome;
    @Schema(description = "Sobrenome do proprietsrio", example = "Silva")
    @NotEmpty (message = "Campo obriatorio")
    @Pattern(regexp = "^[A-Za-z ]+$", message = "O campo deve conter apenas letras")
    private String sobrenome;
    @Schema(description = "Data de nascimento do proprietario", example = "04/11/1972")
    @NotEmpty (message = "Campo obriatorio")
    @Pattern(regexp = "^[0-9;/ ]+$", message = "O campo deve conter apenas numeros")
    private String dataNascimento;
    @Schema(description = "CPF do proprietario", example = "12345678912")
    @NotEmpty (message = "Campo obriatorio")
    @Pattern(regexp = "^[0-9; ]+$", message = "O campo deve conter apenas numeros")
    private String cpf;
    @Schema(description = "sexo", example = "masculino")
    @Pattern(regexp = "^[A-Za-z ]+$", message = "O campo deve conter apenas letras")
    private String sexo;
    @Schema(description = "Numero do documento", example = "123456789")
    @NotEmpty (message = "Campo obriatorio")
    @Pattern(regexp = "^[0-9; ]+$", message = "O campo deve conter apenas numeros")
    private String rg;
    @Schema (description = "Telefone para contato", example = "912345678")
    @NotEmpty (message = "Campo obriatorio")
    @Pattern(regexp = "^[0-9; ]+$", message = "O campo deve conter apenas numeros")
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


    public DadosProprietarioDTO() {
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
