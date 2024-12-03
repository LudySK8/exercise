package org.example;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;

import org.example.dao.ProdutoDao;
import org.example.dao.IProdutoDao;
import org.example.domain.Produto;

public class ProdutoTest {

    private IProdutoDao produtoDao;

    public ProdutoTest() {
        produtoDao = new ProdutoDao();
    }

    @Test
    public void cadastrar() {
        Produto produto = new Produto();
        produto.setCodigo("P1");
        produto.setDescricao("PRODUTO TESTE");
        produto.setNome("Monitor ACER 27'' ");
        produto = produtoDao.cadastrar(produto);

        assertNotNull(produto);
        assertNotNull(produto.getId());
    }

}