package com.lanchetero.lanche.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {


    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/Sobre")
    public String sobre() {
        return "sobre";
    }


    @GetMapping("/Calculadora")
    public String calculadora() {
        return "calculadora";
    }
}