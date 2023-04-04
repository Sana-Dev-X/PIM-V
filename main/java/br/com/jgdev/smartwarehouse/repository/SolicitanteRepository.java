package br.com.jgdev.smartwarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import br.com.jgdev.smartwarehouse.model.Solicitante;

@Repository
@Component
public interface SolicitanteRepository extends JpaRepository<Solicitante, Long>{

}
