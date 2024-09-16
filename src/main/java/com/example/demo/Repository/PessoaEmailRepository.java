package com.example.demo.Repository;

import com.example.demo.Entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PessoaEmailRepository extends JpaRepository<Pessoa, Long> {
    Optional<Pessoa> findByEmail(String email);

}
