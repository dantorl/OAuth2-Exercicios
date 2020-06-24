package br.com.mastertech.carro;

import br.com.mastertech.carro.security.Usuario;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class CarroController {

    @PostMapping("/{modelo}")
    public Carro create(@PathVariable String modelo, @AuthenticationPrincipal Usuario usuario) {
        Carro carro = new Carro();
        carro.setModelo(modelo);
        carro.setDono(usuario.getName());
        return carro;
    }


}
