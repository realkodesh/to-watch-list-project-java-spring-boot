package br.com.guilhermelira.listtowatch.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import br.com.guilhermelira.listtowatch.entities.ToWatchEntity;
import br.com.guilhermelira.listtowatch.repository.ToWatchRepository;

@Service
public class ToWatchService {

	private ToWatchRepository towatchRepository;

	public ToWatchService(ToWatchRepository towatchRepository) {
		this.towatchRepository = towatchRepository;

	}

	// Pensando na interação com outros times todas operações, todas operações vai
	// retornar uma lista

	public List<ToWatchEntity> create(ToWatchEntity towatchEntity) {
		towatchRepository.save(towatchEntity);

		return list();

	}

	public List<ToWatchEntity> list() { // Criando o GET, que vai ler e trazer todos os objetos

		Sort sort = Sort.by(Direction.DESC, "prioridade").and(Sort.by(Direction.ASC, "id"));

		return towatchRepository.findAll(sort);

	}

	public List<ToWatchEntity> update(Long id, ToWatchEntity towatchEntity) {

		towatchRepository.save(towatchEntity);

		return list();

	}
	
	public List<ToWatchEntity> delete(Long id){
		towatchRepository.deleteById(id);
		
		return list();
		
	}

}
