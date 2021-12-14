package com.betha.agendaempresas.agenda.Resource;

import com.betha.agendaempresas.agenda.enterprise.ValidationException;
import com.betha.agendaempresas.agenda.model.PessoaJuridica;
import com.betha.agendaempresas.agenda.repository.PessoaJuridicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/pessoa-juridica")
public class PessoaJuridicaController extends AbstractResourse {

    @Autowired
    private PessoaJuridicaRepository repository;

    @GetMapping
    public List<PessoaJuridicaDTO> getPessoaJuridica() {
        return repository.findAll().stream().map(pessoaJuridica -> PessoaJuridicaDTO.toDTO(pessoaJuridica)).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public PessoaJuridicaDTO getPessoaJuridicaId(@PathVariable(value = "id") Long pessoaJuridicaId) throws EntityNotFoundException {

        PessoaJuridica pessoaJuridicaFind = repository.findById(pessoaJuridicaId)
                .orElseThrow(() -> new EntityNotFoundException("Pessoa juridica não entrada com id :: " + pessoaJuridicaId));
        return PessoaJuridicaDTO.toDTO(pessoaJuridicaFind);
    }

    @PostMapping
    public PessoaJuridicaDTO create(@Valid @RequestBody PessoaJuridica pessoaJuridica) throws ValidationException {

        List<PessoaJuridica> byCnpj = repository.findByCnpj(pessoaJuridica.getCnpj());

        if (!byCnpj.isEmpty()) {
            throw new ValidationException("CNPJ duplicado");
        }
        return PessoaJuridicaDTO.toDTO(repository.save(pessoaJuridica));
    }

    @PutMapping("/{id}")
    public PessoaJuridicaDTO update(@PathVariable(value = "id") Long pessoaJuridicaId,
                             @RequestBody PessoaJuridica pessoaJuridica) throws EntityNotFoundException {
        PessoaJuridica pessoaJuridicaFind = repository.findById(pessoaJuridicaId)
                .orElseThrow(() -> new EntityNotFoundException("Pessoa Juridica não encontrado com ID :: " + pessoaJuridicaId));
        pessoaJuridicaFind.setId(pessoaJuridica.getId());
        pessoaJuridicaFind.setNomeFantasia(pessoaJuridica.getNomeFantasia());
        pessoaJuridicaFind.setEmail(pessoaJuridica.getEmail());
        pessoaJuridicaFind.setTelefone(pessoaJuridica.getTelefone());

        return PessoaJuridicaDTO.toDTO(repository.save(pessoaJuridicaFind));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable(value = "id") Long pessoaJuridicaId) throws EntityNotFoundException {
        PessoaJuridica pessoaJuridicaFind = repository.findById(pessoaJuridicaId).orElseThrow(() -> new EntityNotFoundException(" com ID :: " + pessoaJuridicaId));
        repository.delete(pessoaJuridicaFind);
        return ResponseEntity.noContent().build();
    }
}
