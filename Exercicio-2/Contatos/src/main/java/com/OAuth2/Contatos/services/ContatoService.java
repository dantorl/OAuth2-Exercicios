package com.OAuth2.Contatos.services;

import com.OAuth2.Contatos.models.Contato;
import com.OAuth2.Contatos.repositories.ContatoRepository;
import com.OAuth2.Contatos.security.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContatoService {
    @Autowired
    private ContatoRepository contatoRepository;

    public Contato cadastrarContato(Contato contato) {
        Contato contatoObjeto = contatoRepository.save(contato);
        return contatoObjeto;
    }

    public List<Contato> buscarTodosPorUsuario(Usuario usuario) {
        List<Contato> contatos = contatoRepository.findByNameUsuario(usuario.getName());
        return contatos;
    }
}
