package com.lanchetero.lanche.Model;




import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "lanche")


public class Lanche {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
   @NotBlank(message = "adoiasjd")
    @Size(max = 20, min = 3)
    private String nomeLanche;

    @Column
    @NotEmpty
    private String ingredientes;

    @Column
    private double preco;

    public Lanche(int id, String nomeLanche, String ingredientes, double preco) {
        this.id = id;
        this.nomeLanche = nomeLanche;
        this.ingredientes = ingredientes;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }



    public String getNomeLanche() {
        return nomeLanche;
    }

    public void setNomeLanche(String nomeLanche) {
        this.nomeLanche = nomeLanche;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Lanche() {
    }
}
