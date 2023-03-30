package br.com.jgdev.smartwarehouse;

import java.util.List;

import org.hibernate.dialect.function.ListaggStringAggEmulation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.jgdev.smartwarehouse.model.Equipamento;
import br.com.jgdev.smartwarehouse.services.EquipamentoService;

@Controller
@RequestMapping
public class Teste {

	@Autowired
	public EquipamentoService equipamentoService;

	@GetMapping("home")
	public String run() {

//		Equipamento e = new Equipamento();
//		e.setNome("Datashow");
//		e.setDescricao("Data show branco");
//		e.setStatus(StatusEquipamento.RESERVADO);
//		Equipamento a = new Equipamento();
//		a.setNome("Projetor");
//		a.setDescricao("projetor preto");
//		a.setStatus(StatusEquipamento.RESERVADO);
//		Equipamento b = new Equipamento();
//		b.setNome("DVD");
//		b.setDescricao("Aparelho obsoleto");
//		b.setStatus(StatusEquipamento.RESERVADO);
//		Equipamento c = new Equipamento();
//		c.setNome("Naitibruik");
//		c.setDescricao("Da xuca");
//		c.setStatus(StatusEquipamento.RESERVADO);
//		
//		
//		equipamentoService.cadastrar(e);
//		equipamentoService.cadastrar(a);
//		equipamentoService.cadastrar(b);
//		equipamentoService.cadastrar(c);
		
//		Long id = (long) 2;
//		
//		Equipamento e = equipamentoService.buscaPorId(id);
//		
//		if(!e.equals(null)) {
//		equipamentoService.excluir(e);
//		}else {
//			System.out.println("Variavel nula");
//		}
		
//		List<Equipamento> lista = equipamentoService.buscaTodos();
//		
//		if(lista.isEmpty()) {
//			
//			System.out.println("Não existem registros do tipo Equipamento");
//		}else {
//		
//		
//		lista.forEach( a ->{System.out.println(a.getNome());} );
//		}
//		
		
		return "/home";
	}
}
