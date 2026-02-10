package com.sergio.pacientes.dto;

public record DadosCadastroPaciente(
        Long id,
        String nome,
        String email,
        String telefone,
        String sexo,
        DadosEndereco endereco) {
}
