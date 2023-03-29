package br.com.jgdev.smartwarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import br.com.jgdev.smartwarehouse.model.Equipamento;

@Repository
@Component
public interface EquipamentoRepository extends JpaRepository<Equipamento, Long>{

}
