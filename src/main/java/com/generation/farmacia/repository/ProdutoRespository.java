package com.generation.farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.farmacia.model.Produto;

public interface ProdutoRespository extends JpaRepository<Produto, Long> {

	List<Produto> findAllBynomeProdutoContainingIgnoreCase(String nomeProduto);


}
