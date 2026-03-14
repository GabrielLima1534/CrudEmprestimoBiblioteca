package com.example.emprestimo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreType;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class CarteiraBiblioteca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numeroCarteira;
    private Date dataEmissao;
    private boolean isValid;

    @OneToOne
    @JsonIgnore
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

	public Long getNumeroCarteira() {
		return numeroCarteira;
	}

	public void setNumeroCarteira(Long numeroCarteira) {
		this.numeroCarteira = numeroCarteira;
	}

	public Date getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public boolean isValid() {
		return isValid;
	}

	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}
    
    
    
    

}
