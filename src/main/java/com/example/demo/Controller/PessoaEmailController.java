package com.example.demo.Controller;


import com.example.demo.Dto.PessoaDto;
import com.example.demo.Entity.Pessoa;
import com.example.demo.Service.PessoaEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/email")
@CrossOrigin(origins = "*")
public class PessoaEmailController {

    @Autowired
    private PessoaEmailService pessoaEmailService;

    @PostMapping("/")
    public Pessoa inserir(@RequestBody PessoaDto pessoaDto) {
        return pessoaEmailService.registrar(pessoaDto);
    }

}
