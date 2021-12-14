package com.betha.agendaempresas.agenda.model;

import com.betha.agendaempresas.agenda.enterprise.AbstractID;
import com.sun.istack.NotNull;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
public class Servico extends AbstractID {

    @NotNull
    @Column(name = "VALOR")
    private Double valor;
    @NotNull
    @Column(name = "DESCRICAO")
    private String descricao;
    @NotNull
    @ManyToOne
    @JoinColumn(name = "I_PESSOAS_JURIDICAS", referencedColumnName = "id")
    private PessoaJuridica pessoaJuridica;

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public PessoaJuridica getPessoaJuridica() {
        return pessoaJuridica;
    }

    public void setPessoaJuridica(PessoaJuridica pessoaJuridica) {
        this.pessoaJuridica = pessoaJuridica;
    }

    @Override
    public String toString() {
        return "Servico{" +
                "valor=" + valor +
                ", descricao='" + descricao + '\'' +
                ", pessoaJuridica=" + pessoaJuridica +
                '}';
    }
}
