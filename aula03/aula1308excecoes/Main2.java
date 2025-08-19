package aula1308excecoes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		int x = 0;
		//Tratando possível divisão por 0
		try {
			x = 7 / 2;
		} catch(ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println(x);
		
		String texto = "4567";
		int y = 0;
		//Tratando possível problema na conversão para int
		try {
			y = Integer.parseInt(texto);
		} catch(NumberFormatException e) {
			e.printStackTrace();
		}
		System.out.println(y);
		
		String[] nomes = {"Ana", "Marcelo", "Caio"};
		//Tratando acesso a uma posição inexistente do array
		try {
			System.out.println(nomes[5]);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getClass());
		} finally {
			System.out.println("Chamou o finally...");
		}
		System.out.println("Continuou...");
		System.out.println();
		
		int doArquivo = 0;
		BufferedReader bf = null;
		try {
			bf = new BufferedReader(
					new FileReader("dados.txt"));
			try {
				String linha = bf.readLine();
				try {
					doArquivo = Integer.parseInt(linha);
				} catch(NumberFormatException e) {
					e.printStackTrace();
				}
			} catch (IOException e) {
				e.printStackTrace();
			} 
			//Tratando arquivo não encontrado
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				bf.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Conteúdo do arquivo: " + doArquivo);
	}

}
