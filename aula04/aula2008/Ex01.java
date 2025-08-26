package aula2008;

import java.util.ArrayList;

public class Ex01 {

	public static void main(String[] args) {

		ArrayList<Integer> numeros = new ArrayList<>();
		for(int i = 0; i < 10; i++) {
			numeros.add(i * 3);
		}
		System.out.println(numeros);
		for(int i = 0; i < numeros.size(); i++) {
			if(numeros.get(i) % 2 == 0) {
				System.out.println("Par: " + numeros.get(i));
			}
		}
	}

}
