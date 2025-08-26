package aula2008;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex02 {

	public static void main(String[] args) {
		
		String remover;
		
		Set<String> nomes = new HashSet<>();
		nomes.add("Nome1");
		nomes.add("Nome2");
		nomes.add("Nome3");
		nomes.add("Nome4");
		nomes.add("Nome5");
		
		System.out.println(nomes);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe nome que deseja remover: ");
		remover = sc.nextLine();
		
		if(nomes.contains(remover)) {
			nomes.remove(remover);
		}
		System.out.println(nomes);
	}

}
