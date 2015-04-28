package main.java.zeroglosa;


import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

@XmlRootElement()
public class Turma {
	private ArrayList<Aluno> alunos = new ArrayList<Aluno>();

	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}

	public void addAluno(Aluno aluno) {
		this.alunos.add(aluno);
	}
}
