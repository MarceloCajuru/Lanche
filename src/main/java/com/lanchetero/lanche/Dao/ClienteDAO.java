package com.lanchetero.lanche.Dao;


import com.lanchetero.lanche.Model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteDAO extends JpaRepository<Cliente, Integer> {



}