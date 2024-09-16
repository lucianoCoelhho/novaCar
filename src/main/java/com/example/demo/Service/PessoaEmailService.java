package com.example.demo.Service;

import com.example.demo.Dto.PessoaDto;
import com.example.demo.Entity.Pessoa;
import com.example.demo.Repository.PessoaEmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaEmailService {

    @Autowired
    private PessoaEmailRepository pessoaEmailRepository;

    @Autowired
    private EmailService emailService;

    public Pessoa registrar(PessoaDto pessoaDto) {
        Pessoa pessoa = new PessoaDto().converter(pessoaDto);// foi convertido
        Pessoa pessoaNova = pessoaEmailRepository.saveAndFlush(pessoa);
        emailService.enviarEmailTexto(pessoaNova.getEmail(), "cadastro no AlugaAi", "O registro foi feito com sucesso. em breve voce recebera a senha de acesso por e-mail!! ");
        return pessoaNova;
    }// ira salvar a pessoa

}
