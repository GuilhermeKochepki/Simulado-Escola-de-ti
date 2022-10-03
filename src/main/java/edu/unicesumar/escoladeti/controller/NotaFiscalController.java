package edu.unicesumar.escoladeti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.unicesumar.escoladeti.domain.NotaFiscal;
import edu.unicesumar.escoladeti.service.NotaFiscalService;

@RestController
@RequestMapping("/nota-fiscal")
public class NotaFiscalController {

	@Autowired
	public NotaFiscalService notaFiscalServ;
	
	@PostMapping
	public ResponseEntity<NotaFiscal> salvar(@RequestBody NotaFiscal notaFiscal){
		NotaFiscal notaSalva = notaFiscalServ.salvarNotaFiscal(notaFiscal);
		return ResponseEntity.ok(notaSalva);
	}
	
	@GetMapping
	public ResponseEntity<Page<NotaFiscal>> buscarNotaFiscalPaginado(Pageable pageable){
		Page<NotaFiscal> notasPaginadas = notaFiscalServ.buscarNotaFiscal(pageable);
		return ResponseEntity.ok(notasPaginadas);
	}
	
}
