package com.example.biolab.controller;

import com.example.biolab.entities.Usuario;
import com.example.biolab.repositories.UsuarioRepositorio;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("usuario")
public class UsuarioController {

    private final UsuarioRepositorio usuarioRepositorio;

    public UsuarioController(UsuarioRepositorio usuarioRepositorio) {
        this.usuarioRepositorio = usuarioRepositorio;
    }

    @PostMapping
    public Usuario criarUsuario(@RequestBody Usuario u){
        Usuario usuario = new Usuario(u.getNome(), u.getEmail());
        usuarioRepositorio.save(usuario);
        return usuario;
    }

    @GetMapping(value = "User")
    public List<Usuario> mostraUsuario(){
        List<Usuario> listaUsuarios = usuarioRepositorio.findAll();
        return listaUsuarios;
    }
}
