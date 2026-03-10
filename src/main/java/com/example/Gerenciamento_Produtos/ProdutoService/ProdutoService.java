package com.example.Gerenciamento_Produtos.ProdutoService;


import com.example.Gerenciamento_Produtos.Produto.Produto;
import com.example.Gerenciamento_Produtos.ProdutoRepository.ProdutoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProdutoService {
    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }
    public Produto salvarProduto(Produto produto){
        return produtoRepository.save(produto);
    }
    public List <Produto> listarProdutos(){
    return produtoRepository.findAll();
    }
    public void deletarProduto(long Id){
        produtoRepository.deleteById(Id);
    }
    public Produto atualizarProduto(long Id, Produto produto){
        Produto p = produtoRepository.findById(Id).orElseThrow(() -> new RuntimeException("Produto não encontrado (Favor cadastrar)"));

        p.setNomeProduto(produto.getNomeProduto());
        p.setValorProduto(produto.getValorProduto());
        p.setQuantidadeProduto(produto.getQuantidadeProduto());
        return produtoRepository.save(p);
    }

}
