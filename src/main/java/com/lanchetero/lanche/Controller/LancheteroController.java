package com.lanchetero.lanche.Controller;

import com.lanchetero.lanche.Dao.PedidoDAO;
import com.lanchetero.lanche.Model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class LancheteroController {

    @Autowired
    private PedidoDAO pedidoDAO;


    @GetMapping("/cadastrarBebidas")
    public ModelAndView cadastrarBebidas(Bebida bebida) {
        ModelAndView mv = new ModelAndView("cadastro_Bebidas");
        mv.addObject("Bebida", bebida);

        return mv;

    }


    @GetMapping("/cadastrarCliente")
    public ModelAndView cadastrarCliente(Cliente cliente) {
        ModelAndView mv = new ModelAndView("cadastro_Clientes");
        mv.addObject("Cliente", cliente);

        return mv;

    }

    @GetMapping("/Pedido")
    public ModelAndView Pedido(Pedido pedido) {
        ModelAndView mv = new ModelAndView("pedido");
        mv.addObject("Pedido", pedido);

        return mv;

    }

    @PostMapping("/fazerPedido")
    public String fazerPedido(@ModelAttribute Pedido pedido) {
        pedidoDAO.save(pedido);
        return "index";


    }

    @GetMapping("/pedidosProcessados")
    public ModelAndView pedido() {
        List<Pedido> pedidos = pedidoDAO.findAll();

        ModelAndView mv = new ModelAndView("/pedidos_Processados");
        mv.addObject("pedidosProcessados", pedidos);

        return mv;
    }

    @GetMapping("/excluirPedido/{id}")
    public ModelAndView excluir(@PathVariable("id") Integer id, Pedido pedido) {
        pedidoDAO.deleteById(id);

        ModelAndView mv = new ModelAndView("/pedidos_Processados");
        mv.addObject("pedidosProcessados", pedido);

        return mv;

    }

    @GetMapping("/cadastrarAdicional")
    public ModelAndView cadastrarAdicional(Adicional adicional) {
        ModelAndView mv = new ModelAndView("cadastro_Adicional");
        mv.addObject("Adicional", adicional);

        return mv;

    }



}
