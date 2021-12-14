package com.betha.agendaempresas.agenda.Resource;

import com.betha.agendaempresas.agenda.model.PessoaJuridica;
import com.betha.agendaempresas.agenda.model.Servico;
import com.betha.agendaempresas.agenda.repository.ServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@RestController
@RequestMapping("/api/servico")
public class ServicoController {

    @Autowired
    private ServicoRepository repository;

    @GetMapping
    public List<Servico> getServico(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Servico getServicoId(@PathVariable(value = "id") Long servicoId) throws EntityNotFoundException {

        Servico servicoFind = repository.findById(servicoId).orElseThrow(() -> new EntityNotFoundException("Serviço não encontrado com id :: " + servicoId));
        return servicoFind;
    }

    @PostMapping
    public Servico create(@RequestBody Servico servico){
        return repository.save(servico);
    }

    @PutMapping("/{id}")
    public Servico update(@PathVariable(value = "id") Long servicoId, @RequestBody Servico servico) throws EntityNotFoundException {
        Servico servicoFind = repository.findById(servicoId)
                .orElseThrow(() -> new EntityNotFoundException("Serviço não encontrado com ID :: " + servicoId));
        servicoFind.setId(servico.getId());
        servicoFind.setDescricao(servico.getDescricao());
        servicoFind.setValor(servico.getValor());
        servicoFind.setPessoaJuridica(servico.getPessoaJuridica());

        return repository.save(servicoFind);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable(value = "id")Long servicoId) throws EntityNotFoundException{
        Servico servicoFind = repository.findById(servicoId).orElseThrow(() -> new EntityNotFoundException(" com ID :: "+servicoId));
        repository.delete(servicoFind);
        return ResponseEntity.noContent().build();
    }
}
