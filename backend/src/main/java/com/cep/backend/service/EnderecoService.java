package com.cep.backend.service;

import com.cep.backend.entity.Endereco;
import com.cep.backend.repository.EnderecoRepository;
import org.springframework.stereotype.Service;

@Service
public class EnderecoService {
    private final EnderecoRepository enderecoRepository;

    public EnderecoService(EnderecoRepository enderecoRepository) {
        this.enderecoRepository = enderecoRepository;
    }

    public Endereco cadastrar(Endereco endereco) {
        boolean cepExiste = enderecoRepository.existsByCep(endereco.getCep());

        if (cepExiste) {
            throw new RuntimeException("CEP já cadastrado");
        }

        return enderecoRepository.save(endereco);
    }
}
