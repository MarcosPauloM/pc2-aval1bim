package br.com.etechoracio.avaliacao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;


import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

@Table(name="TBL_PROFESSOR")
public class Professor extends BaseORM{
	@Id
	@GeneratedValue
	@Column(name="ID_PROFESSOR")
	private Long Id;
	
	@Column(name="TX_NOME")
	private String Nome;
	
	@Column(name="NR_MATRICULA")
	private Long Matricula;
	
	
}
