package com.example.emprestimo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.emprestimo.DTOS.EmprestimoDTO;
import com.example.emprestimo.model.CarteiraBiblioteca;
import com.example.emprestimo.model.Emprestimo;
import com.example.emprestimo.model.Usuario;
import com.example.emprestimo.repository.EmprestimoRepository;
import com.example.emprestimo.repository.UsuarioRepository;
import com.example.emprestimo.service.EmprestimoService;

@RestController
@RequestMapping("/emprestimos")
public class EmprestimoController {
	
	@Autowired
    private EmprestimoService emprestimoService;
	
	@GetMapping("/{id}")
	public Emprestimo buscarPorId(@PathVariable Long id) {
	    return emprestimoService.buscarPorId(id);
	}

    
	@PostMapping
	public Emprestimo salvar(@RequestBody EmprestimoDTO dto) { // Use DTO aqui para facilitar
	    return emprestimoService.salvar(dto);
	}
    
    
    @GetMapping
    public List<Emprestimo> listar() {
        return emprestimoService.listarTodos();
    }

    @GetMapping("/usuario/{usuarioId}")
    public List<Emprestimo> listarPorUsuario(@PathVariable Long usuarioId) {
        return emprestimoService.listarPorUsuario(usuarioId);
    }
    
    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        emprestimoService.excluir(id);
    }
        
 
    

}
