package com.betha.agendaempresas.agenda.repository;

import com.betha.agendaempresas.agenda.model.PessoaJuridica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PessoaJuridicaRepository extends JpaRepository<PessoaJuridica, Long>, QuerydslPredicateExecutor<PessoaJuridica> {

    List<PessoaJuridica>findByNomeFantasia(String nomefantasia);
    List<PessoaJuridica>findByCnpj(String cnpj);
}
