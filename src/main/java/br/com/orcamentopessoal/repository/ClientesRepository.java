package br.com.orcamentopessoal.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import br.com.orcamentopessoal.entities.Clientes;

@Transactional(readOnly = true)
public interface ClientesRepository extends JpaRepository<Clientes, Long>{
	@Transactional(readOnly = true)
	Optional<Clientes> findById(Long id);
}
