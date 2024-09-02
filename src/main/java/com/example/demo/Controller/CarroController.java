package com.example.demo.Controller;

import com.example.demo.Entity.Carro;
import com.example.demo.Service.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/carro")
@CrossOrigin(origins = "*")
public class CarroController {

    @Autowired
    CarroService carroService;

    @GetMapping
    public List<Carro> buscarTodos(){
        return carroService.buscarTodos();
    }
    @PostMapping
    public Carro inserir(@RequestBody Carro carro){
        return carroService.inserir(carro);
    }

    @PutMapping
    public Carro alterar(@RequestBody Carro carro){
        return carroService.alterar(carro);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable("id") long id){
        carroService.excluir(id);
        return ResponseEntity.ok().build();//verificar isso.
    }


}
