package com.example.emprestimo.repository;

import com.example.emprestimo.model.Emprestimo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmprestimoRepository extends JpaRepository<Emprestimo, Long> {
	
	List<Emprestimo> findByUsuarioId(Long usuarioId);
}
