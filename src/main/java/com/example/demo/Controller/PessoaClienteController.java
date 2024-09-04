package com.example.demo.Controller;

import com.example.demo.Dto.PessoaDto;
import com.example.demo.Entity.Pessoa;
import com.example.demo.Service.PessoaClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cliente")
@CrossOrigin(origins = "*")
public class PessoaClienteController {

    @Autowired
    private PessoaClienteService pessoaClienteService;

    @PostMapping("/")
    public Pessoa inserir(@RequestBody PessoaDto pessoaDto) {
        return pessoaClienteService.registrar(pessoaDto);
    }

}
