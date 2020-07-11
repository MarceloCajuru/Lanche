package com.lanchetero.lanche.Model;

import javax.persistence.*;

@Entity
@Table(name = "adicional")


public class Adicional {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @Column
  private String nomeAdicional;

@Column
  private Double preco;

  public Adicional(int id, String nomeAdicional, Double preco) {
    this.id = id;
    this.nomeAdicional = nomeAdicional;
    this.preco = preco;
  }

  public int getId() {
    return id;
  }


  public String getNomeAdicional() {
    return nomeAdicional;
  }

  public void setNomeAdicional(String nomeAdicional) {
    this.nomeAdicional = nomeAdicional;
  }

  public Double getPreco() {
    return preco;
  }

  public void setPreco(Double preco) {
    this.preco = preco;
  }

  public Adicional() {
  }
}
