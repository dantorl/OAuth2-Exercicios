package com.OAuth2.Contatos.repositories;

import com.OAuth2.Contatos.models.Contato;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ContatoRepository extends CrudRepository<Contato, Integer> {
    List<Contato> findByNameUsuario(String nameUsuario);
}
