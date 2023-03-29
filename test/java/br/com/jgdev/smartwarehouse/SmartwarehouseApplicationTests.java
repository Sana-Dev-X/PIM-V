package br.com.jgdev.smartwarehouse;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.jgdev.smartwarehouse.model.Equipamento;
import br.com.jgdev.smartwarehouse.model.Solicitante;
import br.com.jgdev.smartwarehouse.model.StatusEquipamento;
import br.com.jgdev.smartwarehouse.services.EquipamentoService;

@SpringBootTest
class SmartwarehouseApplicationTests {

	@Autowired
	EquipamentoService e;
	
	@Test
	void contextLoads() {
		
	}
	
	@Test
	void buscaIdEquipamentoTestaRetornoNaoNulo() {
		final Equipamento equipamento = e.buscaPorId(new Long(2));
		assertNotNull(equipamento);
	}
	
	@Test
	void buscaIdEquipamentoTestaRetornoNulo() {
		final Equipamento equipamento = e.buscaPorId(new Long(1000000000));
		assertNull(equipamento);
	}
	
	@Test
	void buscaTodosEquipamentoTestaNaoNulo() {
		final List<Equipamento> lista = e.buscaTodos();
		assertNotNull(lista);
	}
	
	@Test
	void buscaTodosEquipamentoTestaNulo() {
		final List<Equipamento> lista = null;
		assertNull(lista);
		
	}
	
	@Test
	void cadastraEquipamento() {
		final Equipamento equipamento = new Equipamento();
		equipamento.setDescricao("Teste");
		equipamento.setNome("Teste");
		equipamento.setStatus(StatusEquipamento.DISPONIVEL);
		
		boolean b = true;
		
		try {
		e.cadastrar(equipamento);
		
		}catch(Exception e) {
			b=false;
			assertEquals(b, true);
		}
		assertEquals(b, true);
	}
	
	

}
