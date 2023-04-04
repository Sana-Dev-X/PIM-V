package br.com.jgdev.smartwarehouse.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import br.com.jgdev.smartwarehouse.model.Solicitante;
import br.com.jgdev.smartwarehouse.services.SolicitanteService;

@Controller
public class SolicitanteController {

	@Autowired
	private SolicitanteService solicitanteService;
	
	@GetMapping("/solicitante/novo-solicitante")
	public String tela() {
		return "solicitante/novo-solicitante";
	}
	
	@PostMapping("/solicitante/grava-solicitante")
	public String novoEquipamento(Solicitante solicitante) {
		solicitanteService.cadastrar(solicitante);
		return "redirect:novo-solicitante";
	}
	
	@GetMapping("/solicitante/lista-solicitante")
	public String lista(Model model){
		
		List<Solicitante> lista = new ArrayList();
		List<Object> l= solicitanteService.buscaTodos();
		
		l.forEach(a->lista.add((Solicitante)a));
		
		model.addAttribute("lista", lista);
		
		return "solicitante/lista-solicitante";
	}
}
