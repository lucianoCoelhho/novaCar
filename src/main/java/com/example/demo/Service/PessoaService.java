package com.example.demo.Service;

import com.example.demo.Entity.Pessoa;
import com.example.demo.Repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public List<Pessoa> buscarTodos(){
        return pessoaRepository.findAll();
    }

    public Pessoa inserir(Pessoa pessoa) {
        pessoa.setDataCriacao(new Date());
        Pessoa pessoa1 = pessoaRepository.saveAndFlush(pessoa);
        return pessoa1;
    }

    public Pessoa alterar(Pessoa pessoa){
        Pessoa pessoa1 =  pessoaRepository.findById(pessoa.getId()).orElse(null);

        if (pessoa1 != null){
            pessoa.setDataCriacao(pessoa1.getDataCriacao());
            pessoa.setDataAtualizacao(new Date());
            return pessoaRepository.saveAndFlush(pessoa);
        }
        return null;
    }

    public void excluir(long id){
        Pessoa pessoa = pessoaRepository.findById(id).get();
        pessoaRepository.delete(pessoa);
    }

}


