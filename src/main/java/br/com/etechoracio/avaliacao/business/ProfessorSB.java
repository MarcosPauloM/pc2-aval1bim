package br.com.etechoracio.avaliacao.business;

import java.util.ArrayList;
import java.util.List;

import org.primefaces.model.DualListModel;

import br.com.etechoracio.avaliacao.dao.ProfessorDAO;
import br.com.etechoracio.avaliacao.model.Professor;

public class ProfessorSB extends BaseSB{

	private ProfessorDAO professorDAO;
	
	
	public void postConstruct() {
		List<Professor> source = ProfessorSB.findAll();
		Professor = new DualListModel<Professor>()<Professor>(source new ArrayList<Professor>());
	}


}

