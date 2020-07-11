package com.lanchetero.lanche.Model;

import javax.persistence.*;

@Entity
@Table(name= "pedido")

public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String nome;

  @Column
    private String celular;

  @Column
  private int lanche;

  @Column
  private int bebida;

  @Column
  private int adicional;

  @Column

  private String cep;

  @Column
  private String endereco;

  @Column
  private int numero;

  @Column
  private String bairro;

  @Column
  private String complemento;

  @Column
  private String municipio;

  @Column
  private String uf;

  @Column
  private String formPgt;

    public Pedido(int id, String nome, String celular, int lanche, int bebida, int adicional, String cep, String endereco, int numero, String bairro, String complemento, String municipio, String uf, String formPgt) {
        this.id = id;
        this.nome = nome;
        this.celular = celular;
        this.lanche = lanche;
        this.bebida = bebida;
        this.adicional = adicional;
        this.cep = cep;
        this.endereco = endereco;
        this.numero = numero;
        this.bairro = bairro;
        this.complemento = complemento;
        this.municipio = municipio;
        this.uf = uf;
        this.formPgt = formPgt;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getLanche() {
        return lanche;
    }

    public void setLanche(int lanche) {
        this.lanche = lanche;
    }

    public int getBebida() {
        return bebida;
    }

    public void setBebida(int bebida) {
        this.bebida = bebida;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getFormPgt() {
        return formPgt;

    }

    public void setFormPgt(String formPgt) {
        this.formPgt = formPgt;
    }

    public int getAdicional() {
        return adicional;
    }

    public void setAdicional(int adicional) {
        this.adicional = adicional;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public int getId() {
        return id;
    }

    public Pedido() {
    }

}
