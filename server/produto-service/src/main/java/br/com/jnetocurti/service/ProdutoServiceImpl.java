package br.com.jnetocurti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jnetocurti.model.Produto;
import br.com.jnetocurti.repository.ProdutoRepository;

@Service
public class ProdutoServiceImpl implements ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;

	@Override
	public List<Produto> findAll() {
		return produtoRepository.findAll();
	}

}
