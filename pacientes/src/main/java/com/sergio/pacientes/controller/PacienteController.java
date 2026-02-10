package com.sergio.pacientes.controller;


import com.sergio.pacientes.dto.DadosCadastroPaciente;
import com.sergio.pacientes.dto.DadosListagemPaciente;
import com.sergio.pacientes.entity.Paciente;
import com.sergio.pacientes.repository.PacienteRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    private PacienteRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar (@RequestBody DadosCadastroPaciente dados) {
        repository.save(new Paciente(dados));
    }

    @GetMapping
    public List<DadosListagemPaciente> listar () {
        return repository.findAll().stream().map(DadosListagemPaciente::new).toList();
    }


}
