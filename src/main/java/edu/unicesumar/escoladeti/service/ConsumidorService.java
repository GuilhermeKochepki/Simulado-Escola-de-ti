package edu.unicesumar.escoladeti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import edu.unicesumar.escoladeti.domain.Consumidor;
import edu.unicesumar.escoladeti.repository.ConsumidorRepository;

@Service
public class ConsumidorService {
	
	@Autowired
	public ConsumidorRepository consumidorRepo;

	public Consumidor salvarConsumidor(Consumidor consumidor) {
		return consumidorRepo.save(consumidor);
	}
	
	public Consumidor atualizarConsumidor(Consumidor consumidor) {
		return consumidorRepo.save(consumidor);
	}
	
	public void deletarConsumidorPorId(long id) {
		consumidorRepo.deleteById(id);
	}
	
	public List<Consumidor> buscarConsumidor() {
		List<Consumidor> todos = consumidorRepo.findAll();
		return todos;
	}
}
