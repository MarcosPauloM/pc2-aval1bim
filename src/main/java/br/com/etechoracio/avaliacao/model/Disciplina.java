package br.com.etechoracio.avaliacao.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;

@Table(name="TBL_DISCIPLINA")
public class Disciplina {
	
	@Id
	@GeneratedValue
	@Column(name="ID_DISCIPLINA")
	private Long Id;
	@Column(name="TX_NOME")
	private String Nome;
	@Column(name="NR_AULAS_SEMANAIS")
	private Double aulasSemanais;
	@Column(name="DT_CRIACAO")
	@Temporal(TemporalType.DATE)
	private Date dataCriacao;
	@ManyToMany
	@JoinTable(name="TBL_REL_DISCIPLINA_PROFESSOR",
	joinColumns = { @JoinColumn(name = "ID_DISCIPLINA") },
	inverseJoinColumns = { @JoinColumn(name="ID_PROFESSOR")})
	private List<Professor> professores;
	
	public void setProfessores(List<Professor> target) {
		
		
	}
}
