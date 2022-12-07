package br.edu.ifsp.dwea.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifsp.dwea.entities.Formulario;
import br.edu.ifsp.dwea.repositories.FormRepository;

@RestController
@RequestMapping(value ="/formulario")
public class FormController {
	
	@Autowired
	private FormRepository repository;
	
	@GetMapping
	public List<Formulario> findAll(){
		List<Formulario> result = repository.findAll();
		return result;
	}
	@GetMapping(value = "/{id}")
	public Formulario findById(@PathVariable Long id){
		Formulario result = repository.findById(id).get();
		return result;
	}
	@PostMapping
	public Formulario insert(@RequestBody Formulario formulario){
		Formulario result = repository.save(formulario);
		return result;
	}

} 
