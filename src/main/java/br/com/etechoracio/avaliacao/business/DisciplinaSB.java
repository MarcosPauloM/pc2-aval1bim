package br.com.etechoracio.avaliacao.business;

import java.util.ArrayList;
import java.util.List;



import br.com.etechoracio.avaliacao.dao.BaseDAO;
import br.com.etechoracio.avaliacao.dao.DisciplinaDAO;
import br.com.etechoracio.avaliacao.model.Disciplina;

public class DisciplinaSB extends BaseDAO{

	private DisciplinaDAO disciplina;
	
	public void Save(DisciplinaDAO disciplina) {
	Disciplina.save(disciplina);
	}
}
