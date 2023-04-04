package br.com.jgdev.smartwarehouse.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import br.com.jgdev.smartwarehouse.model.Solicitante;
import br.com.jgdev.smartwarehouse.repository.SolicitanteRepository;

@Service
public class SolicitanteService extends Services{

	@Autowired
	private SolicitanteRepository repo;

	@Override
	public void cadastrar(Object o) {
		Solicitante a=(Solicitante)o;	
		repo.save(a);
	}


	@Override
	public void alterar(Object o) {
		Solicitante s = (Solicitante)o;
		Optional<Solicitante> resultadoDaBusca = repo.findById(s.getId());
		
		
		
		if(!resultadoDaBusca.equals(null)) {
			Solicitante a = resultadoDaBusca.get();
			
			a.setNome(s.getNome());
			
			if(!o.equals(null)) {
				repo.save(a);
			}
			
		}else {
			System.out.println("objeto não encontrado no banco");
		}
	}

	@Override
	public void excluir(Object o) {
		repo.delete((Solicitante)o);
		
	}

	@Override
	public Object buscaPorId(Long id) {
		
		Optional<Solicitante> o = repo.findById(id);
		
		Solicitante resposta=null;
		if(!o.isEmpty() || o.equals(null)) {
			resposta = o.get();
			return resposta;
		}
		
		return null;
	}

	@Override
	public List<Object> buscaTodos() {
		
		List<Object> lista = new ArrayList();
		
		List<Solicitante>l = repo.findAll();
		l.forEach(a->lista.add(a));
		
		
		if(!lista.isEmpty()) {
			return lista;
		}
		
		return null;
	}
	
	
	
}
