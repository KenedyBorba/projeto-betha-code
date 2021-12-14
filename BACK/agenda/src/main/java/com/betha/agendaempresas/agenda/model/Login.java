package com.betha.agendaempresas.agenda.model;

import com.betha.agendaempresas.agenda.enterprise.AbstractID;
import org.hibernate.collection.internal.PersistentSortedMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Login extends AbstractID {

    @Column(name = "LOGIN")
    private String login;
    @Column(name = "SENHA")
    private String senha;
    @Column(name = "TIPO_CONTA")
    private String tipoConta;
    @ManyToOne
    @JoinColumn(name = "I_PESSOA_FISICA", referencedColumnName = "id")
    private PessoaFisica pessoaFisica;
    @ManyToOne
    @JoinColumn(name = "I_PESSOA_JURIDICA", referencedColumnName = "id")
    private PessoaJuridica pessoaJuridica;

    public String getLoging() {
        return login;
    }

    public void setLoging(String loging) {
        this.login = loging;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTipoConta() {
        return tipoConta;
    }


    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }
}
