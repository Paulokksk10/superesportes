package edu.pw2.superesportes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.pw2.superesportes.model.Partida;
import edu.pw2.superesportes.model.PartidaDados;

@Controller
@RequestMapping("/partidas")
public class PartidaController {

    @GetMapping
    public String loadPartidaForm(){
        return "partida/cadastro";
    }

    @GetMapping("/cadastrar")
    public String salvaPartida(PartidaDados dados, Model model){
        Partida p1 = new Partida(dados);
        model.addAttribute("partida",p1);
        return "partida/exibir";
    }
}
