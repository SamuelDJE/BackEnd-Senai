package com.example.biolab.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExemploController {
    @GetMapping(value = "/msg")
    public String mostrarMsg(){
        return "Oieee";
    }

    @PostMapping
    public String criar(@RequestBody String nome, String email){
        return "Criado com sucesso" +" O nome do email são" + nome + email;
    }
}
