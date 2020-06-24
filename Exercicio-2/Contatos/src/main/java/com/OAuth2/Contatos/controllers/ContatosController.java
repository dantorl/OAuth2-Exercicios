package com.OAuth2.Contatos.controllers;

import com.OAuth2.Contatos.models.Contato;
import com.OAuth2.Contatos.security.Usuario;
import com.OAuth2.Contatos.services.ContatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ContatosController {

    @Autowired
    ContatoService contatoService;

    @PostMapping("/contato")
    public Contato create(@RequestBody Contato contato, @AuthenticationPrincipal Usuario usuario){
        Usuario usuarioObj = usuario;
        contato.setNameUsuario(usuarioObj.getName());

        return contatoService.cadastrarContato(contato);
    }

    @GetMapping("/contatos")
    public List<Contato> create(@AuthenticationPrincipal Usuario usuario){
        Usuario usuarioObj = usuario;

        return contatoService.buscarTodosPorUsuario(usuarioObj);
    }
}

