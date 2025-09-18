package aula2008;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		String[] nomes = new String[3];
		for(int i = 0; i < nomes.length; i++) {
			nomes[i] = "Nome";
			System.out.println(nomes[i]);
		}
		
		System.out.println(nomes);
		
		ArrayList<String> nomesList = new ArrayList<>();
		nomesList.add("Marlon");
		nomesList.add("Cidadão");
		nomesList.add("Outro Nome");
		System.out.println(nomesList);
		nomesList.remove("Marlon");
		System.out.println(nomesList);
		System.out.println(nomesList.get(0));
		System.out.println(nomesList.contains("Outro Nome"));
		
		System.out.println();
		System.out.println("Aqui começa Set:");
		Set<String> coisas = new HashSet<String>();
		coisas.add("Maçã");
		coisas.add("Banana");
		coisas.add("Batata");
		coisas.add("Maçã");
		coisas.add("Alface");
		System.out.println(coisas.contains("Bacana"));
		
		System.out.println();
		System.out.println("Aqui começa Map:");
		Map<Integer, String> alunos = new HashMap<>();
		alunos.put(12, "Cauã");
		alunos.put(15, "Natan");
		alunos.put(18, "João");
		System.out.println(alunos);
		System.out.println(alunos.get(12));
		alunos.remove(12);
		System.out.println(alunos);
		
	}

}
