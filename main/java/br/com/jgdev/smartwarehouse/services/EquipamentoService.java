package br.com.jgdev.smartwarehouse.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jgdev.smartwarehouse.model.Equipamento;
import br.com.jgdev.smartwarehouse.repository.EquipamentoRepository;

@Service
public class EquipamentoService extends Services {

	@Autowired
	private EquipamentoRepository repo;

	//Não mexer - está funcionando
	@Override
	public void cadastrar(Object o) {
		repo.save((Equipamento) o);
	}

	@Override
	public List<Object> listar() {
		return null;
	}

	@Override
	public void alterar(Object o) {

		/*
		 * Equipamento e = (Equipamento)o; Optional<Equipamento> aux =
		 * repo.findById(e.getId());
		 * 
		 * e = aux.get();
		 */
		repo.save((Equipamento) o);
	}
	
	//Não mexer - está funcionando
	@Override
	public void excluir(Object o) {
		repo.delete((Equipamento) o);
		}

	
	//Não mexer - está funcionando
	@Override
	public Equipamento buscaPorId(Long id) {
		Optional<Equipamento> o = repo.findById(id);

		Equipamento resposta = null;
		if(!o.isEmpty()) {
			resposta = o.get();
		}	
		return resposta;
	}

	
	//Não mexer - está funcionando
	@Override
	public List<Equipamento> buscaTodos() {
		
	 List<Equipamento> lista = repo.findAll();
	 
	 if (!lista.isEmpty()) {
		 return lista;
	 }
		return null;
	}

}
