package br.com.orcamentopessoal.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import br.com.orcamentopessoal.entities.Receitas;

@Transactional(readOnly = true)
public interface ReceitasRepository extends JpaRepository<Receitas, Long>{
	@Transactional(readOnly = true)
	Optional<Receitas> findById(Long id);
}