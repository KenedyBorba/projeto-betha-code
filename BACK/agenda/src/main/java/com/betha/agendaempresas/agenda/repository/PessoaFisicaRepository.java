package com.betha.agendaempresas.agenda.repository;

import com.betha.agendaempresas.agenda.model.PessoaFisica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PessoaFisicaRepository extends JpaRepository<PessoaFisica,Long>, QuerydslPredicateExecutor<PessoaFisica> {

    List<PessoaFisica> findByNome(String nome);

    List<PessoaFisica> findByCpf(String cpf);

    List<PessoaFisica> findByRg(String rg);
}
