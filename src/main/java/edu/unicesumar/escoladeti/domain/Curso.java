package edu.unicesumar.escoladeti.domain;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Curso {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "codigo_curso")
	private int codigoCurso;
	
	private String nome;
	
	@Column(name = "ch_minima")
	private int chMinima;
	
	@Column(name = "ch_maxima")
	private int chMaxima;
	
	@Column(name = "data_aprovacao")
	private LocalDate dataAprovacao;
}
