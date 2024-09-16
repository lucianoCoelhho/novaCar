package com.example.demo.Dto;

import com.example.demo.Entity.Pessoa;
import lombok.Data;
import org.springframework.beans.BeanUtils;

@Data
public class PessoaDto {

    private String nome;
    private String cpf;
    private String email;
    private String endereco;
    private String cep;

    // vai copiar todas as propriedades de RequestDTO para a pessoa
    public Pessoa converter(PessoaDto pessoaDto) {
        Pessoa pessoa = new Pessoa();
        BeanUtils.copyProperties(pessoaDto, pessoa);
        return pessoa;
    }
}
