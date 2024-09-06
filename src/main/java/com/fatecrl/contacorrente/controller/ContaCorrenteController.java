package com.fatecrl.contacorrente.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/conta-corrente")
public class ContaCorrenteController {

    @GetMapping("/obter")    
    public String get(){
        return "conteudo";
    }
}
