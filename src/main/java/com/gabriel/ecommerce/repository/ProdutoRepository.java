package com.gabriel.ecommerce.repository;

import com.gabriel.ecommerce.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> { }
