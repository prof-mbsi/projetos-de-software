package aula2008;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Ex03 {

	public static void main(String[] args) {
		
		Map<String, Integer> produtos = new HashMap<>();
		produtos.put("Agua", 5);
		produtos.put("Coca cola", 7);
		produtos.put("Pizza", 45);
		
		for (Map.Entry<String, Integer> entrada : produtos.entrySet()) {
			if(entrada.getValue() > 10) {
				System.out.println(entrada.getKey());
			}
		}
		
		ArrayList<Integer> numeros = new ArrayList<>();
		for(int i = 0; i < 10; i++) {
			numeros.add(i * 3);
		}
		
		for(Integer x : numeros) {
			System.out.println("Valor de x: " + x);
		}
	}

}
