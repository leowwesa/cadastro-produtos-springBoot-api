package com.example.Gerenciamento_Produtos.Controller;


import com.example.Gerenciamento_Produtos.Produto.Produto;
import com.example.Gerenciamento_Produtos.ProdutoService.ProdutoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://127.0.0.1:5500")
@RestController
@RequestMapping("/produto")
public class ProdutoController {

private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }
    @PostMapping
    public Produto salvarProduto(@RequestBody Produto produto){
        return produtoService.salvarProduto(produto);
    }
    @GetMapping
    public List<Produto> listarProdutos(){
        return produtoService.listarProdutos();
    }
    @DeleteMapping("/{Id}")
    public void deletarProduto(@PathVariable long Id){
        produtoService.deletarProduto(Id);
    }
    @PutMapping("/{Id}")
    public Produto atualizar(@PathVariable long Id, @RequestBody Produto produto){
        return produtoService.atualizarProduto(Id, produto);
    }


}
