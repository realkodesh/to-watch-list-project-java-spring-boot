package br.com.guilhermelira.listtowatch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.guilhermelira.listtowatch.entities.ToWatchEntity;
import br.com.guilhermelira.listtowatch.service.ToWatchService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/towatch")
public class ToWatchController {

	@Autowired
	private ToWatchService towatchService;

	@PostMapping
	ResponseEntity<List<ToWatchEntity>> create(@Valid @RequestBody ToWatchEntity towatchEntity) {
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(towatchService.create(towatchEntity));

	}

	@GetMapping
	List<ToWatchEntity> list() {
		return towatchService.list();
	}

	@PutMapping("{id}")
	List<ToWatchEntity> update(@PathVariable Long id, @RequestBody ToWatchEntity towatchEntity) {
		return towatchService.update(id, towatchEntity);

	}

	@DeleteMapping("{id}")
	List<ToWatchEntity> delete(@PathVariable Long id) {
		return towatchService.delete(id);
	}

}
