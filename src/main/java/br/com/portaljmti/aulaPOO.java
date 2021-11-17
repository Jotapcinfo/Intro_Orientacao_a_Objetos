package br.com.portaljmti;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;

public class aulaPOO {

	public static void main(String[] args) {
		SpringApplication.run(aulaPOO.class, args);

		Locale.setDefault(Locale.US); // Para ler com o ponto na casa decimal
		Scanner sc = new Scanner(System.in);

		// Declarando as variáveis do tipo funcionario
		Funcionario f1, f2;

		// Instanciando (Criando) os objetos
		f1 = new Funcionario();
		f2 = new Funcionario();

		System.out.println("Dados do primeiro funcionário: ");
		f1.nome = sc.next(); // Ler uma string sem espaço em branco
		f1.valorPorHora = sc.nextDouble();
		f1.horas = sc.nextInt();

		System.out.println("Dados do segundo funcionário: ");
		f2.nome = sc.next(); // Ler uma string sem espaço em branco
		f2.valorPorHora = sc.nextDouble();
		f2.horas = sc.nextInt();

		double total = f1.total() + f2.total();

		System.out.printf("Total = %.2f%n", total);
	}

}