package com.betha.agendaempresas.agenda.Resource;

import com.betha.agendaempresas.agenda.model.PessoaFisica;
import com.betha.agendaempresas.agenda.repository.PessoaFisicaRepository;
import com.querydsl.core.types.Predicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.querydsl.binding.QuerydslPredicate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/pessoa-fisica-all")
public class PessoaFisicaAll{

    @Autowired
    private PessoaFisicaRepository repository;

    @GetMapping
    public List<PessoaFisica> getPessoaFisica(){
        return repository.findAll();
    }
}
