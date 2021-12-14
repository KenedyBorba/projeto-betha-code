package com.betha.agendaempresas.agenda.Resource;

import com.betha.agendaempresas.agenda.model.PessoaFisica;

public class PessoaFisicaDTO {

    private Long id;
    private String nome;
    private String telefone;
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static PessoaFisicaDTO toDTO(PessoaFisica pessoaFisica){
        PessoaFisicaDTO dto = new PessoaFisicaDTO();
        dto.setId(pessoaFisica.getId());
        dto.setNome(pessoaFisica.getNome());
        dto.setEmail(pessoaFisica.getEmail());
        dto.setTelefone(pessoaFisica.getTelefone());
        return dto;
    }

    public static PessoaFisica fromDTO(PessoaFisicaDTO dto){
        PessoaFisica entity = new PessoaFisica();
        entity.setId(dto.getId());
        entity.setNome(dto.getNome());
        entity.setEmail(dto.getEmail());
        entity.setTelefone(dto.getTelefone());
        return entity;
    }
}
