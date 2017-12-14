package br.com.jnetocurti.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jnetocurti.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
