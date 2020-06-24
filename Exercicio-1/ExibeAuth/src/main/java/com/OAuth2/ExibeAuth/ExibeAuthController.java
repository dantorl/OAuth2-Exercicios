package com.OAuth2.ExibeAuth;

import com.OAuth2.ExibeAuth.security.Usuario;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExibeAuthController {
    @GetMapping("/exibeauth")
    public Usuario create(@AuthenticationPrincipal Usuario usuario){
        Usuario usuarioObj = usuario;

        return usuarioObj;
    }
}
