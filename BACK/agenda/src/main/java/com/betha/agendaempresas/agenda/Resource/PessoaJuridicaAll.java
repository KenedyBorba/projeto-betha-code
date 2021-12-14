package com.betha.agendaempresas.agenda.Resource;

import com.betha.agendaempresas.agenda.model.PessoaFisica;
import com.betha.agendaempresas.agenda.model.PessoaJuridica;
import com.betha.agendaempresas.agenda.repository.PessoaFisicaRepository;
import com.betha.agendaempresas.agenda.repository.PessoaJuridicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/pessoa-juridica-all")
public class PessoaJuridicaAll {

    @Autowired
    private PessoaJuridicaRepository repository;

    @GetMapping
    public List<PessoaJuridica> getPessoaJuridica() {
        return repository.findAll();
    }
}