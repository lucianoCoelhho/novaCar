package com.example.demo.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table (name = "carro")
@Data
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String placa;
    private String numeroChassi;
    private String marca;
    private String modelo;
    private String cor;
    private String categoria;
    private String descricaoDetalhada;
    private double valorAluguel;


    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCriacao;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dataAtualizacao;

}
