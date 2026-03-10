package com.example.Gerenciamento_Produtos.ProdutoRepository;

import com.example.Gerenciamento_Produtos.Produto.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
