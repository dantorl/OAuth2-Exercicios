package com.OAuth2.Contatos.models;


import javax.persistence.*;


@Entity
@Table(name = "Contato")
public class Contato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String telefone;

    private String nameUsuario;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNameUsuario() {
        return nameUsuario;
    }

    public void setNameUsuario(String nameUsuario) {
        this.nameUsuario = nameUsuario;
    }

    public Contato(Integer id, String name, String telefone, String nameUsuario) {
        this.id = id;
        this.name = name;
        this.telefone = telefone;
        this.nameUsuario = nameUsuario;
    }

    public Contato() {
    }
}
