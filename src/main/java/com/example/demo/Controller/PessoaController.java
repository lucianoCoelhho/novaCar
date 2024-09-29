package com.example.demo.Controller;

import com.example.demo.Entity.Pessoa;
import com.example.demo.Service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoa")
@CrossOrigin(origins = "*")
public class PessoaController {

    @Autowired
    PessoaService pessoaService;

    @GetMapping
    public List<Pessoa> buscarTodos(){
        return pessoaService.buscarTodos();
    }

    @PostMapping("/")
    public Pessoa inserir(@RequestBody Pessoa pessoa){
        return pessoaService.inserir(pessoa);
    }

    @PutMapping
    public Pessoa alterar(@RequestBody Pessoa pessoa){
        return pessoaService.alterar(pessoa);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void>excluir(@PathVariable("id") long id){
        pessoaService.excluir(id);
        return ResponseEntity.ok().build();
    }

}
