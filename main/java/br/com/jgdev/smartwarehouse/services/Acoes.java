package br.com.jgdev.smartwarehouse.services;

import java.util.List;

import org.springframework.stereotype.Component;

import br.com.jgdev.smartwarehouse.model.Equipamento;

@Component
public interface Acoes {
	
	void cadastrar(Object o);	
	void alterar(Object o);
	void excluir(Object o);
	public Object buscaPorId(Long id);
	public List<Object> buscaTodos();
}
