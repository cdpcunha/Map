package Programa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class VotaçãoSet {

	public static void main(String[] args) {
		String path = "E:\\JavaTemp\\Map\\votacao.txt";
		Map<String,Integer> votacao = new TreeMap<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String linha = br.readLine();
			while (linha != null) {
				String[] aux = linha.split(",");
				String nome = aux[0];
				Integer qtdVotos = Integer.parseInt(aux[1]);
								
				if(votacao.containsKey(nome)) {
					int contagem = votacao.get(nome);
					votacao.put(nome, qtdVotos+contagem);
				}else votacao.put(nome, qtdVotos);
				
				linha = br.readLine();
			}
			
			for(String x: votacao.keySet()) {
				System.out.println(x + " : " + votacao.get(x));
			}
		} catch (IOException e) {
			System.out.println(e.getLocalizedMessage());
		}
	}
}
