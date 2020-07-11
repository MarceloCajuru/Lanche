package com.lanchetero.lanche.Controller;

import com.lanchetero.lanche.Dao.AdicionalDAO;
import com.lanchetero.lanche.Dao.BebidaDAO;
import com.lanchetero.lanche.Dao.ClienteDAO;
import com.lanchetero.lanche.Dao.LancheDAO;
import com.lanchetero.lanche.Model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;
@Controller
public class CadastroController {

    @Autowired
    private ClienteDAO clienteDAO;

    @Autowired
    private BebidaDAO bebidaDAO;

    @Autowired
    private LancheDAO lancheDAO;

    @Autowired
    private AdicionalDAO adicionalDAO;

    @PostMapping("/cadastrarBebida")
    public String cadastrarBebida(@ModelAttribute Bebida bebida) {
        bebidaDAO.save(bebida);
        return "index";


    }

    @GetMapping("/Cardapio")
    public ModelAndView pedido() {
        List<Bebida> bebidas = bebidaDAO.findAll();
        List<Adicional> adicionals = adicionalDAO.findAll();
        List<Lanche> lanches = lancheDAO.findAll();

        ModelAndView mv = new ModelAndView("cardapio");
        mv.addObject("bebidas", bebidas);
        mv.addObject("adicionais", adicionals);
        mv.addObject("lanches", lanches);

        return mv;
    }





    @PostMapping("/cadastrarAdicional")
    public String cadastrarAdicional(@ModelAttribute Adicional adicional) {
        adicionalDAO.save(adicional);
        return "index";


    }

    @PostMapping("/cadastrarCliente")
    public String cadastrarCliente(@ModelAttribute Cliente cliente) {
        clienteDAO.save(cliente);
        return "index";

    }
    @PostMapping("/cadastrarLanches")
    public ModelAndView cadastrarLanche(@ModelAttribute @Valid Lanche lanche, BindingResult result){

        if(result.hasErrors()){
            return cadastrarLanche(lanche);
        }

        lancheDAO.save(lanche);


        return pedido();

}
    @GetMapping("/cadastrarLanches")
    public ModelAndView cadastrarLanche(Lanche lanche) {
        ModelAndView mv = new ModelAndView("cadastro_Lanches");
        mv.addObject("Lanche", lanche);

        return mv;

    }

}