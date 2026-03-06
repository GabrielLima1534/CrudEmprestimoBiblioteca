package com.example.emprestimo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nome;
    private String email;

    @OneToMany(mappedBy = "usuario")
    private List<Emprestimo> emprestimos;

    @OneToOne(mappedBy = "usuario")
    private CarteiraBiblioteca carteiraBiblioteca;


}
