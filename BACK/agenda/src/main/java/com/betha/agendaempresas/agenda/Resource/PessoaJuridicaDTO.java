package com.betha.agendaempresas.agenda.Resource;

import com.betha.agendaempresas.agenda.model.PessoaJuridica;

public class PessoaJuridicaDTO {

    private Long id;
    private String nomeFantasia;
    private String email;
    private String telefone;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public static PessoaJuridicaDTO toDTO(PessoaJuridica pessoaJuridica){
        PessoaJuridicaDTO dto = new PessoaJuridicaDTO();
        dto.setId(pessoaJuridica.getId());
        dto.setNomeFantasia(pessoaJuridica.getNomeFantasia());
        dto.setEmail(pessoaJuridica.getEmail());
        dto.setTelefone(pessoaJuridica.getTelefone());
        return dto;
    }

    public static PessoaJuridica fromDTO(PessoaJuridicaDTO dto){
        PessoaJuridica entity = new PessoaJuridica();
        entity.setId(dto.getId());
        entity.setNomeFantasia(dto.getNomeFantasia());
        entity.setEmail(dto.getEmail());
        entity.setTelefone(dto.getTelefone());
        return entity;
    }
}
