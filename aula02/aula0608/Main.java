package aula0608;

public class Main {
	
	public static void main(String[] args) {
		/*
		Animal a1 = new Animal();
		a1.emitirSom();
		*/
		Gato g1 = new Gato();
		g1.emitirSom();
		
		Cachorro c1 = new Cachorro();
		c1.emitirSom();
		
		Passaro p1 = new Passaro();
		p1.emitirSom();
		
		ContaBancaria cb1 = new ContaBancaria();
		cb1.setNumero(1);
		cb1.setTitular("Dunga");
		cb1.setSaldo(700);
		System.out.println("Saldo da conta: " + cb1.getSaldo());
		cb1.depositar(-15);
		System.out.println("Saldo da conta: " + cb1.getSaldo());
		cb1.sacar(760);
		System.out.println("Saldo depois do sacar(): " + cb1.getSaldo());
		
		ContaCorrente cc1 = new ContaCorrente();
		cc1.setNumero(2);
		cc1.setTitular("Feliz");
		cc1.setLimite(200);
		cc1.setSaldo(300);
		System.out.println("Saldo cc1: " + cc1.getSaldo());
		cc1.sacar(400);
		System.out.println("Saldo cc1: " + cc1.getSaldo());
		
		Quadrado q1 = new Quadrado();
		q1.lado = 4.5;
		System.out.println("Área de q1: " + q1.calcularArea());
		
		Circulo ci1 = new Circulo();
		ci1.raio = 4.5;
		System.out.println("Área de ci1: " + ci1.calcularArea());
		
		Retangulo r1 = new Retangulo();
		r1.base = 4.5;
		r1.altura = 3.5;
		System.out.println("Área de r1: " + r1.calcularArea());
	}

}
