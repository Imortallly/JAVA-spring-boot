package br.com.gomes.app.model.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.gomes.app.model.entities.Produto;

public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer>{

	public Iterable<Produto> findByNomeContainingIgnoreCase(String nome);
}
