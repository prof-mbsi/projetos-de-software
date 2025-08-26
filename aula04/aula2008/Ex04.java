package aula2008;

import java.util.ArrayList;

public class Ex04 {

	public static void main(String[] args) {

		ArrayList<String> nomes = new ArrayList<>();
		nomes.add("Ana");
		nomes.add("André");
		nomes.add("Rodolfo");
		nomes.add("Geraldo");
		
		ArrayList<String> remover = new ArrayList<>();
		
		System.out.println(nomes);
		
		for(int i = 0; i < nomes.size(); i++) {
			if(nomes.get(i).startsWith("A")) {
				remover.add(nomes.get(i));
			}
		}
		
		nomes.removeAll(remover);
		
		System.out.println(nomes);
	}

}
