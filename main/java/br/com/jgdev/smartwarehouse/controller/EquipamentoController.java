package br.com.jgdev.smartwarehouse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.jgdev.smartwarehouse.model.Equipamento;
import br.com.jgdev.smartwarehouse.services.EquipamentoService;

@Controller
public class EquipamentoController {
	
	@Autowired
	private EquipamentoService equipamentoService;
	
	@GetMapping("/equipamento/novo-equipamento")
	public String tela() {
		return "equipamento/novo-equipamento";
	}
	
	@PostMapping("/equipamento/grava-equipamento")
	public String novoEquipamento(Equipamento equipamento) {
		equipamentoService.cadastrar(equipamento);
		return "redirect:novo-equipamento";
	}
	
//	@GetMapping("/equipamento/lista-equipamento")
//	public String listaEquipamento() {
//		return "equipamento/lista-equipamento";
//	}
	
	@GetMapping("/equipamento/lista-equipamento")
	public String lista(Model model){
		
		List<Equipamento> lista = equipamentoService.buscaTodos();
			
		model.addAttribute("lista", lista);
		
		return "equipamento/lista-equipamento";
	}
}
