package com.gabriel.ecommerce.controller;

import com.gabriel.ecommerce.model.CarrinhoDeCompras;
import com.gabriel.ecommerce.repository.CarrinhoDeComprasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/carrinho")
public class CarrinhoDeComprasController {

    @Autowired
    private CarrinhoDeComprasRepository carrinhoRepository;

    @PostMapping("/adicionar")
    public CarrinhoDeCompras adicionarAoCarrinho(@RequestBody CarrinhoDeCompras item) {
        return carrinhoRepository.save(item);
    }

    @DeleteMapping("/remover/{id}")
    public void removerDoCarrinho(@PathVariable Long id) {
        carrinhoRepository.deleteById(id);
    }
}
