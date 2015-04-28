package main.java.zeroglosa;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeitoCSV {

	static List<Map<String, String>> obtenhaDadosDoArquivo(String nomeArquivo) {
		List<Map<String, String>> dados = new ArrayList<Map<String, String>>();
		try {
			FileReader arq = new FileReader(nomeArquivo);
			BufferedReader lerArq = new BufferedReader(arq);
			String linha = lerArq.readLine();
			while (linha != null) {
				insiraDados(linha, dados);
				linha = lerArq.readLine();
			}
			arq.close();
		} catch (IOException e) {
			System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
		}

		return dados;
	}

	private static void insiraDados(String linha, List<Map<String, String>> dados) {
		Map<String, String> mapa = new HashMap<String, String>();
		String[] d = linha.split(";");
		mapa.put("nome", d[0]);
		mapa.put("email", d[1]);
		dados.add(mapa);
	}


}
