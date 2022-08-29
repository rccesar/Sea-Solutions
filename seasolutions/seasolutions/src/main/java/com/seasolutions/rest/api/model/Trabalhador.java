package com.seasolutions.rest.api.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Trabalhador {

    @Column(nullable = false,length = 50)
    public String nome;

    @Column(nullable = false,length = 50)
    public String setor;
    @Column(nullable = false,length = 50)
    public String cargo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
