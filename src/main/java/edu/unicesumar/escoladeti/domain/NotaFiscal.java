package edu.unicesumar.escoladeti.domain;

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
public class NotaFiscal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public String id;
	
	@Column(name="cpf")
	public String cpf;
	
	@Column(name="data_hora")
	public String dataHora;
}
