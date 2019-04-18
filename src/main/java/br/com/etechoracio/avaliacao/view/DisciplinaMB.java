package br.com.etechoracio.avaliacao.view;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.ManagedBean;

import br.com.etechoracio.avaliacao.business.DisciplinaSB;
import br.com.etechoracio.avaliacao.model.Disciplina;
import br.com.etechoracio.avaliacao.business.ProfessorSB;
import br.com.etechoracio.avaliacao.model.Professor;
import br.com.etechoracio.training.model.Aluno;
import lombok.Getter;
import lombok.Setter;

import org.primefaces.model.DualListModel;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@ManagedBean
@Getter
@Setter
@Controller
@Scope("view")
public class DisciplinaMB extends BaseMB{

	private ProfessorSB professorSB;
	private DisciplinaSB disciplinaSB;
	private Disciplina edit;
	private DualListModel<Professor> professores;
	
	
	
	private void postConstruct() {
		List<Professor> source = professorSB.findAll(professores);
		professores = new org.primefaces.model.DualListModel<Professor>(Professor, new ArrayList<Professor>());
	}
	
	private void onSave() {
		edit.setProfessores(professores.getTarget());
		DisciplinaSB.save(edit);
		showInsertMessage();
	}
}

