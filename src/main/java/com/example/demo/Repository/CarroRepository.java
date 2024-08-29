package com.example.demo.Repository;

import com.example.demo.Entity.Carro;
import com.example.demo.Entity.Marca;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarroRepository extends JpaRepository<Carro, Long> {
}
