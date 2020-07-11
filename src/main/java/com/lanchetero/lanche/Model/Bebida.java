package com.lanchetero.lanche.Model;

import org.hibernate.annotations.NotFound;

import javax.persistence.*;

@Entity
@Table(name = "bebida")


public class Bebida {

      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private int id;


      @Column
      private String nomeBebida;

      @Column
      private String marcaBebida;

      @Column
      private double preco;

      public Bebida(int id, String nomeBebida, String marcaBebida, double preco) {
            this.id = id;
            this.nomeBebida = nomeBebida;
            this.marcaBebida = marcaBebida;
            this.preco = preco;
      }

      public int getId() {
            return id;
      }



      public String getNomeBebida() {
            return nomeBebida;
      }

      public void setNomeBebida(String nomeBebida) {
            this.nomeBebida = nomeBebida;
      }

      public String getMarcaBebida() {
            return marcaBebida;
      }

      public void setMarcaBebida(String marcaBebida) {
            this.marcaBebida = marcaBebida;
      }

      public double getPreco() {
            return preco;
      }

      public void setPreco(double preco) {
            this.preco = preco;
      }


      public Bebida() {
      }
}
