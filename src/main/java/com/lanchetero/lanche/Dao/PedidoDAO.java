package com.lanchetero.lanche.Dao;

import com.lanchetero.lanche.Model.Bebida;
import com.lanchetero.lanche.Model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoDAO extends JpaRepository<Pedido, Integer> {



}