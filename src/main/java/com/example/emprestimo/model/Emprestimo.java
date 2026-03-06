package com.example.emprestimo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@AllArgsConstructor
@Setter
@NoArgsConstructor

@Entity
public class Emprestimo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private Date dataEmprestimo;
    private Date dataDevolucao;

    @ManyToOne
    private Usuario usuario;
}
