package com.betha.agendaempresas.agenda.Resource;

import com.betha.agendaempresas.agenda.enterprise.ValidationException;
import com.betha.agendaempresas.agenda.model.PessoaFisica;
import com.betha.agendaempresas.agenda.model.PessoaJuridica;
import com.betha.agendaempresas.agenda.repository.PessoaFisicaRepository;
import com.querydsl.core.types.Predicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslPredicate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/pessoa-fisica")
public class PessoaFisicaController extends AbstractResourse{

    @Autowired
    private PessoaFisicaRepository repository;

    @GetMapping
    public List<PessoaFisicaDTO> getPessoaFisica(@QuerydslPredicate(root = PessoaFisica.class)Predicate predicate){
        List<PessoaFisicaDTO> resultado = new ArrayList<>();
        Iterable<PessoaFisica> all = repository.findAll(predicate);
        all.forEach(pessoaFisica -> resultado.add(PessoaFisicaDTO.toDTO(pessoaFisica)));
        return resultado;
    }

    @GetMapping("/{id}")
    public PessoaFisicaDTO getPessoaFisicaId(@PathVariable(value = "id") Long pessoaFisicaId) throws EntityNotFoundException {

        PessoaFisica pessoaFisicaFind = repository.findById(pessoaFisicaId)
                .orElseThrow(() -> new EntityNotFoundException("Pessoa física não encontrada com id :: " + pessoaFisicaId));
        return PessoaFisicaDTO.toDTO(pessoaFisicaFind);
    }

    @PostMapping
    public PessoaFisicaDTO create(@Valid @RequestBody PessoaFisica pessoaFisica) throws ValidationException {

        List<PessoaFisica> byCpf = repository.findByCpf(pessoaFisica.getCpf());
        List<PessoaFisica> byRg = repository.findByRg(pessoaFisica.getRg());

        if((!byCpf.isEmpty()) || (!byRg.isEmpty())){
            throw new ValidationException("Documentos duplicados!");
        }

        return PessoaFisicaDTO.toDTO(repository.save(pessoaFisica));
    }

    @PutMapping("/{id}")
    public PessoaFisicaDTO update(@PathVariable(value = "id") Long pessoaFisicaId, @RequestBody PessoaFisica pessoaFisica) throws EntityNotFoundException {
        PessoaFisica pessoaFisicaFind = repository.findById(pessoaFisicaId)
                .orElseThrow(() -> new EntityNotFoundException("Pessoa Fisica não encontrado com ID :: " + pessoaFisicaId));
        pessoaFisicaFind.setId(pessoaFisica.getId());
        pessoaFisicaFind.setNome(pessoaFisica.getNome());
        pessoaFisicaFind.setEmail(pessoaFisica.getEmail());
        pessoaFisicaFind.setTelefone(pessoaFisica.getTelefone());

        return PessoaFisicaDTO.toDTO(repository.save(pessoaFisicaFind));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable(value = "id")Long pessoaFisicaId) throws EntityNotFoundException{
        PessoaFisica pessoaFisicaFind = repository.findById(pessoaFisicaId).orElseThrow(() -> new EntityNotFoundException(" com ID :: "+pessoaFisicaId));
        repository.delete(pessoaFisicaFind);

        return ResponseEntity.noContent().build();
    }
}
