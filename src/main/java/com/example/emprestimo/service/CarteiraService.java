package com.example.emprestimo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.emprestimo.DTOS.CarteiraDTO;
import com.example.emprestimo.model.CarteiraBiblioteca;
import com.example.emprestimo.model.Usuario;
import com.example.emprestimo.repository.CarteiraBibliotecaRepository;
import com.example.emprestimo.repository.UsuarioRepository;

@Service
public class CarteiraService {
	
	@Autowired
	private CarteiraBibliotecaRepository carteiraBibliotecaRepository;
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public List<CarteiraBiblioteca> listarTodas() {
        return carteiraBibliotecaRepository.findAll();
    }
	
	public CarteiraBiblioteca salvar(CarteiraDTO dto) {
        CarteiraBiblioteca carteira = new CarteiraBiblioteca();
        
        carteira.setNumeroCarteira(dto.getNumeroCarteira());
        carteira.setDataEmissao(dto.getDataEmissao());
        carteira.setValid(dto.isIsValid());

        Usuario usuario = usuarioRepository.findById(dto.getUsuarioId())
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
        
        carteira.setUsuario(usuario);
        
        return carteiraBibliotecaRepository.save(carteira);
    }
	
}
