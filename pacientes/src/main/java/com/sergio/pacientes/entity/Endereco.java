package com.sergio.pacientes.entity;

import com.sergio.pacientes.dto.DadosEndereco;
import jakarta.persistence.Embeddable;
import lombok.*;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {

    private String rua;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String uf;
    private String cep;


    public Endereco(DadosEndereco dados) {
            this.rua = dados.rua();
            this.numero = dados.rua();
            this.complemento = dados.complemento();
            this.bairro = dados.bairro();
            this.cidade = dados.cidade();
            this.uf = dados.uf();
            this.cep = dados.cep();
    }
}
