package com.example.emprestimo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.emprestimo.DTOS.CarteiraDTO;
import com.example.emprestimo.model.CarteiraBiblioteca;
import com.example.emprestimo.service.CarteiraService;

@RestController
@RequestMapping("/carteiras")
public class CarteiraController {
	
	@Autowired
    private CarteiraService carteiraService;
	
	@GetMapping
	public List<CarteiraBiblioteca> listar() {
		return carteiraService.listarTodas();
	
	}
	
	@PostMapping
    public CarteiraBiblioteca salvar(@RequestBody CarteiraDTO carteiraDTO) {
        return carteiraService.salvar(carteiraDTO);
    }
}
