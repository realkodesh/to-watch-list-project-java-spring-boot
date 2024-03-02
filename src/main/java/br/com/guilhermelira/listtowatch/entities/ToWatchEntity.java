package br.com.guilhermelira.listtowatch.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "towatch")
public class ToWatchEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	private String name;

	@NotBlank
	private String description;
	private boolean watched;
	private int note;
	private int prioridade;

	public ToWatchEntity() {

	}

	public ToWatchEntity(Long id, @NotBlank String name, @NotBlank String description, boolean watched, int note,
			int prioridade) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.watched = watched;
		this.note = note;
		this.prioridade = prioridade;

	}

	public ToWatchEntity(String name, String description, boolean watched, int note, int prioridade) {
		super();
		this.name = name;
		this.description = description;
		this.watched = watched;
		this.note = note;
		this.prioridade = prioridade;

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isWatched() {
		return watched;
	}

	public void setWatched(boolean watched) {
		this.watched = watched;
	}

	public int getNote() {
		return note;
	}

	public void setNote(int note) {
		this.note = note;
	}

	public int getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}

}
