package com.sergio.pacientes.dto;

import org.antlr.v4.runtime.misc.NotNull;

public record DadosAtualizacaoPaciente(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}
