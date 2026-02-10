package com.sergio.pacientes.dto;

public record DadosEndereco(
        String rua,
        String numero,
        String complemento,
        String bairro,
        String cidade,
        String uf,
        String cep) {
}
