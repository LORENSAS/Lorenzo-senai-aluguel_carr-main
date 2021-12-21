package com.LorenzoLocacao.repository;


import org.springframework.data.repository.CrudRepository;

import com.LorenzoLocacao.models.Locacao;

/**
 * Interface utilizada para fazer uma sobrescrita de m�todo do CrudRepository para a classe Locacao.
 * 
 * @author Widson.
 * @version 1.0.
 */
public interface LocacaoRepository extends CrudRepository<Locacao, String>{
	Locacao findByCodigo(long codigo);
}
