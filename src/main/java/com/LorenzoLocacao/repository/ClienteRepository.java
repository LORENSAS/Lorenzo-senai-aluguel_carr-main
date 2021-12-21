package com.LorenzoLocacao.repository;

import org.springframework.data.repository.CrudRepository;

import com.LorenzoLocacao.models.Cliente;

/**
 * Interface utilizada para fazer uma sobrescrita de m�todo do CrudRepository para a classe Cliente.
 * 
 * @author Widson.
 * @version 1.0.
 */
public interface ClienteRepository extends CrudRepository<Cliente, String>{
	Cliente findByCodigo(long codigo);
}
