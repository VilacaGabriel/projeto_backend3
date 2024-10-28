package com.gabriel.ecommerce.controller;

import com.gabriel.ecommerce.model.Usuario;
import com.gabriel.ecommerce.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping("/registrar")
    public Usuario registrarUsuario(@RequestBody Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    // Implementação de login pode ser adicionada aqui posteriormente
}
