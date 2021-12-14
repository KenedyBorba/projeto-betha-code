package com.betha.agendaempresas.agenda.repository;

import com.betha.agendaempresas.agenda.model.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<Login, Long>, QuerydslPredicateExecutor<Login> {
}
