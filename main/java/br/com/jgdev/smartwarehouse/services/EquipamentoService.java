package br.com.jgdev.smartwarehouse.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jgdev.smartwarehouse.model.Equipamento;
import br.com.jgdev.smartwarehouse.model.StatusEquipamento;
import br.com.jgdev.smartwarehouse.repository.EquipamentoRepository;

@Service
public class EquipamentoService extends Services {

	@Autowired
	private EquipamentoRepository repo;

	// Não mexer - está funcionando
	@Override
	public void cadastrar(Object o) {
		Equipamento a = (Equipamento) o;
		a.setStatus(StatusEquipamento.DISPONIVEL);
		repo.save(a);
	}



	@Override
	public void alterar(Object o) {

		Equipamento equipamento = (Equipamento) o;

		Optional<Equipamento> resultadoDaBusca = repo.findById(equipamento.getId());

		if (!resultadoDaBusca.equals(null)) {

			Equipamento a = resultadoDaBusca.get();

			a.setNome(equipamento.getNome());
			a.setDescricao(equipamento.getDescricao());
			a.setStatus(equipamento.getStatus());

			if (!o.equals(null)) {
				repo.save(a);
			}
		} else {
			System.out.println("objeto não encontrado no banco");
		}
	}

	// Não mexer - está funcionando
	@Override
	public void excluir(Object o) {
		repo.delete((Equipamento) o);
	}

	// Não mexer - está funcionando
	@Override
	public Object buscaPorId(Long id) {
		Optional<Equipamento> o = repo.findById(id);

		Equipamento resposta = null;
		if (!o.isEmpty() || o.equals(null)) {
			resposta = o.get();
			return resposta;
		}

		/*
		 * Se não encontrar precisa chamar um método que mostra que não existe nenhum
		 * objeto no banco com o id informado.
		 */

		return resposta;
	}

	// Não mexer - está funcionando
	@Override
	public List<Object> buscaTodos() {

		List<Object> lista = new ArrayList<Object>();
		List<Equipamento> x = repo.findAll();

		x.forEach(a->lista.add(a));
		
		if (!lista.isEmpty()) {
			return lista;
		}
		return null;
	}

}
