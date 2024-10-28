package com.gabriel.ecommerce.service;

import com.gabriel.ecommerce.model.Usuario;
import com.gabriel.ecommerce.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario salvarUsuario(Usuario usuario) {
        // Aqui poderia incluir lógica para encriptar a senha
        return usuarioRepository.save(usuario);
    }
}
