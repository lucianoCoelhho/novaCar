package com.example.demo.Service;

import com.example.demo.Entity.Carro;
import com.example.demo.Repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CarroService {

    @Autowired
    private CarroRepository carroRepository;

    public List<Carro> buscarTodos(){
    return carroRepository.findAll();
    }

    public Carro inserir(Carro carro) {
        carro.setDataCriacao(new Date());
        Carro carro1 = carroRepository.saveAndFlush(carro);
        return carro1;
    }

    public Carro alterar(Carro carro){
        Carro carro1 = carroRepository.findById(carro.getId()).orElse(null);

        if (carro1 != null){
            carro.setDataCriacao(carro1.getDataCriacao());
            carro.setDataAtualizacao(new Date());
            return carroRepository.saveAndFlush(carro);
            }
        return null;
    }

    public void excluir(long id){
        Carro carro = carroRepository.findById(id).get();
        carroRepository.delete(carro);
    }

}


