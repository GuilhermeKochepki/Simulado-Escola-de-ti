package edu.unicesumar.escoladeti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.unicesumar.escoladeti.domain.Consumidor;
import edu.unicesumar.escoladeti.service.ConsumidorService;

@RestController
@RequestMapping("/consumidor")	
public class ConsumidorController {

	@Autowired
	private ConsumidorService consumidorServ;
	
	@PostMapping
	public ResponseEntity<Consumidor> salvarConsumidor(@RequestBody Consumidor consumidor){
		Consumidor consumidorSalvo = consumidorServ.salvarConsumidor(consumidor);
		return ResponseEntity.ok(consumidorSalvo);
	}
	
	@PutMapping
	public ResponseEntity<Consumidor> atualizarConsumidor(@PathVariable (name="id") Long id, @RequestBody Consumidor consumidor){
		Consumidor consumidorSalvo = consumidorServ.salvarConsumidor(consumidor);
		return ResponseEntity.ok(consumidorSalvo);
	}
	
	@GetMapping
	public List<Consumidor> buscarConsumidor(){
		return consumidorServ.buscarConsumidor();
	}
	
	@DeleteMapping("/{id}")
	public void deletarConsumidor(@PathVariable Long id) {
		consumidorServ.deletarConsumidorPorId(id);
	}
}
