package com.cep.backend.repository;

import com.cep.backend.entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco,Long> {
    boolean existsByCep(String cep);
}
