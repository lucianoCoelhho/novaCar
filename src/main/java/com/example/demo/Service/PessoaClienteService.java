package com.example.demo.Service;



import java.util.*;

import com.example.demo.Dto.PessoaDto;
import com.example.demo.Entity.Pessoa;
import com.example.demo.Repository.PessoaClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaClienteService {

    @Autowired
    private PessoaClienteRepository pessoaRepository;

    @Autowired
    private EmailService emailService;

    @Autowired
    private PermissaoPessoaService permissaoPessoaService;

    public Pessoa registrar(PessoaDto pessoaDto) {
        Pessoa pessoa = new PessoaDto().converter(pessoaDto);// foi convertido

        pessoa.setDataCriacao(new Date());
        Pessoa pessoaNova = pessoaRepository.saveAndFlush(pessoa);
        permissaoPessoaService.vincularPessoaPermissaoCliente(pessoaNova);
        //emailService.enviarEmailTexto(pessoaNova.getEmail(), "cadastro no AlugaAi", "O registro foi feito com sucesso. em breve voce recebera a senha de acesso por e-mail!! ");
        Map<String, Object> proprMap = new HashMap<>();
        proprMap.put("nome", pessoaNova.getNome());
        proprMap.put("mensagem", " O registro foi feito com sucesso. em breve voce recebera a senha de acesso por e-mail!! ");
        emailService.enviarEmailTemplate( pessoaNova.getEmail(), "Cadastro no AlugaAi", proprMap);
        return pessoaNova;
    }// ira salvar a pessoa

}
