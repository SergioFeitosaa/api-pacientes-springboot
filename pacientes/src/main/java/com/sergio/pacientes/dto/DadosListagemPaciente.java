package com.sergio.pacientes.dto;

import com.sergio.pacientes.entity.Paciente;

public record DadosListagemPaciente(
        long id,
        String nome,
        String telefone,
        String sexo){

    public DadosListagemPaciente (Paciente paciente){
        this(paciente.getId(),paciente.getNome(), paciente.getTelefone(), paciente.getSexo());
    }
}
