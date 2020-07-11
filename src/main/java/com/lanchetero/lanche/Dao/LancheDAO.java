package com.lanchetero.lanche.Dao;


import com.lanchetero.lanche.Model.Lanche;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LancheDAO extends JpaRepository<Lanche, Integer> {



}