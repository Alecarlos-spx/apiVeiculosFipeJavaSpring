package com.zupproject.desafio.model;

public class AnoModelo
{
    public AnoModelo(String nome, String codigo) {
        this.codigo = codigo;
        this.nome = nome;
    }

    private String codigo;
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
