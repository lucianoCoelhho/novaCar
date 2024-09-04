package com.example.demo.Service;

import java.util.*;

import com.example.demo.Entity.Permissao;
import com.example.demo.Entity.PermissaoPessoa;
import com.example.demo.Entity.Pessoa;
import com.example.demo.Repository.PermissaoPessoaRepository;
import com.example.demo.Repository.PermissaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PermissaoPessoaService {

    @Autowired
    private PermissaoPessoaRepository permissaoPessoaRepository;

    @Autowired
    private PermissaoRepository permissaoRepository;

    // recebera uma objeto do tipo pessoa
    public void vincularPessoaPermissaoCliente(Pessoa pessoa) {
        List<Permissao> listaPermissao = permissaoRepository.findByNome("cliente");// a consulta
        if(listaPermissao.size() > 0){
            PermissaoPessoa permissaoPessoa = new PermissaoPessoa();
            permissaoPessoa.setPessoa(pessoa);
            permissaoPessoa.setPermissao(listaPermissao.get(0));
            permissaoPessoa.setDataCriacao(new Date());
            permissaoPessoaRepository.saveAndFlush(permissaoPessoa);
        }
    }
}