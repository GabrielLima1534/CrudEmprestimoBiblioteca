package com.example.emprestimo.repository;

import com.example.emprestimo.model.CarteiraBiblioteca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarteiraBibliotecaRepository extends JpaRepository<CarteiraBiblioteca, Long> {
}
