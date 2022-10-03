package edu.unicesumar.escoladeti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import edu.unicesumar.escoladeti.domain.NotaFiscal;
import edu.unicesumar.escoladeti.repository.NotaFiscalRepository;

@Service
public class NotaFiscalService {
	
	@Autowired
	public NotaFiscalRepository notaFiscalRepo;
	
	public NotaFiscal salvarNotaFiscal(NotaFiscal notaFiscal) {
		return notaFiscalRepo.save(notaFiscal);
	}
	
	public NotaFiscal atualizarNotaFiscal(NotaFiscal notaFiscal) {
		return notaFiscalRepo.save(notaFiscal);
	}
	
	public Page<NotaFiscal> buscarNotaFiscal(Pageable page) {
		return notaFiscalRepo.findAll(page);
	}
	
	public void deletarNotaFiscalPorId(String id) {
		notaFiscalRepo.deleteById(id);
	}
}
