package com.example.emprestimo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.emprestimo.DTOS.EmprestimoDTO;
import com.example.emprestimo.model.Emprestimo;
import com.example.emprestimo.model.Usuario;
import com.example.emprestimo.repository.EmprestimoRepository;
import com.example.emprestimo.repository.UsuarioRepository;

@Service
public class EmprestimoService {
	
	@Autowired
    private EmprestimoRepository emprestimoRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;
    
    
    public Emprestimo buscarPorId(Long id) {
        return emprestimoRepository.findById(id).orElse(null);
    }
    
    public Emprestimo salvar(Long usuarioId, Emprestimo emprestimo) {
    	
    	Usuario usuario = usuarioRepository.findById(usuarioId).orElse(null);
    	
    	emprestimo.setUsuario(usuario);
    	
    	return emprestimoRepository.save(emprestimo);
    }
    
    public Emprestimo salvar(EmprestimoDTO dto) {
        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setDataEmprestimo(dto.getDataEmprestimo());
        emprestimo.setDataDevolucao(dto.getDataDevolucao());
        
        Usuario usuario = usuarioRepository.findById(dto.getUsuarioId())
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado com ID: " + dto.getUsuarioId()));
        
        emprestimo.setUsuario(usuario);
        
        return emprestimoRepository.save(emprestimo);
    }
    
    public List<Emprestimo> listarTodos() {
        return emprestimoRepository.findAll();
    }
    
    public List<Emprestimo> listarPorUsuario(Long usuarioId) {
        return emprestimoRepository.findByUsuarioId(usuarioId);
    }
    
    public void excluir(Long id) {
        emprestimoRepository.deleteById(id);
    }

}
