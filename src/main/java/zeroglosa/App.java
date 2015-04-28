package main.java.zeroglosa;

import java.util.*;

public class App {
	public static void main(String[] args) throws Exception {
		String arquivoUm = args[0];
		String arquivoDois = args[0];
		executarTarefaUm(arquivoUm);
		executarTarefaDois(arquivoDois);
	}

	private static void executarTarefaUm(String arquivoUm) throws Exception {
		List<Map<String, String>> obj = LeitoCSV.obtenhaDadosDoArquivo(arquivoUm);
		Turma turma = new Turma();
		for (Map<String, String> mapa : obj) {
			turma.addAluno(new Aluno(mapa.get("nome"), mapa.get("email")));
		}
		System.out.println(TransformadorXML.obtenhaXMl(turma, Turma.class));
	}

	private static void executarTarefaDois(String arquivoDois) throws Exception {
//		DvOrdered dvOrdered = new DvDate();
//		dvOrdered.setNormalRange(null);
//		System.out.println(TransformadorXML.obtenhaObj(arquivoDois, DvOrdered.class));
	}

}
