package com.example.emprestimo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.emprestimo.model.Usuario;
import com.example.emprestimo.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public List<Usuario> listarTodos() {
		return usuarioRepository.findAll();
	}
	
	public Usuario salvar(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
	public void deletarId(Long id) {
	    usuarioRepository.deleteById(id);
	}
	
	public Usuario buscarPorId(Long id) {
	    return usuarioRepository.findById(id).orElse(null);
	}

}
