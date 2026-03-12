package com.example.emprestimo.DTOS;

import com.example.emprestimo.model.Usuario;

public class UsuarioDTO {
	
	private Long id;
    private String nome;
    private String email;
    
    public UsuarioDTO(Usuario usuario) {
        this.id = usuario.getId();
        this.nome = usuario.getNome();
        this.email = usuario.getEmail();
    }
    
    public UsuarioDTO() {}

}
