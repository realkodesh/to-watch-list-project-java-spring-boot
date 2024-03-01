package br.com.guilhermelira.listtowatch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.guilhermelira.listtowatch.entities.ToWatchEntity;

public interface ToWatchRepository extends JpaRepository<ToWatchEntity, Long>  {

}
