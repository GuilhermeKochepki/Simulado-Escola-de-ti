package edu.unicesumar.escoladeti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.unicesumar.escoladeti.domain.Curso;
import edu.unicesumar.escoladeti.service.CursoService;

@RestController
@RequestMapping("/curso")
public class CursoController {

	@Autowired
	private CursoService cursoService;
	
	@GetMapping
	public List<Curso> buscarTodos(){
		return cursoService.buscarTodos();
	};
	
	@PostMapping
	public Curso criarCurso(@RequestBody Curso curso) {
		return cursoService.criarCurso(curso);
	}
	
	@PutMapping("/{id}")
	public Curso atualizarCurso(@PathVariable (name = "id") Long id, @RequestBody Curso curso) {
		return cursoService.atualizarCurso(curso);
	}
	
	@DeleteMapping("/{id}")
	public void deletarCurso(@PathVariable (name = "id") Long id, @RequestBody Curso curso) {
		cursoService.deletarCursoPorId(id);
	}
	
}
