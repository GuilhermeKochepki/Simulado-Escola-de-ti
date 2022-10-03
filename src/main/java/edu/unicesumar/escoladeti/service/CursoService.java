package edu.unicesumar.escoladeti.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.unicesumar.escoladeti.domain.Curso;
import edu.unicesumar.escoladeti.repository.CursoRepository;

@Service
public class CursoService {

	@Autowired
	private CursoRepository cursoRepository;
	
	public List<Curso> buscarTodos(){
		List<Curso>todos=cursoRepository.findAll();
		return todos;
	};
	
	public Curso criarCurso(Curso curso) {
		return cursoRepository.save(curso);
	}
	
	public Optional<Curso> obterPessoaPorId(long id) {
		return cursoRepository.findById(id);
	}
	
	public void deletarCursoPorId(long id) {
		cursoRepository.deleteById(id);
	}
	
	public Curso atualizarCurso(Curso curso) {
		if (Objects.nonNull(cursoRepository.findById(curso.getId()))) {
			return cursoRepository.save(curso);
		}
		return null;
	}
	
}
