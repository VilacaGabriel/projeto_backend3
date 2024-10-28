package com.gabriel.ecommerce.model;

import javax.persistence.*;

@Entity
public class CarrinhoDeCompras {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long produtoId;
    private int quantidade;

    // Getters e Setters
}
