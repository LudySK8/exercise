package org.example.dao;

import java.util.List;

import org.example.domain.Produto;

public interface IProdutoDao {

    public Produto cadastrar(Produto produto);

    public void excluir(Produto produto);

    public List<Produto> buscarTodos();

}