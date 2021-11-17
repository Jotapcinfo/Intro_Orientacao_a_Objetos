package br.com.portaljmti;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;

public class aulaPOO {

	public static void main(String[] args) {
		SpringApplication.run(aulaPOO.class, args);
		
		Locale.setDefault(Locale.US); // Para ler com o ponto na casa decimal
		Scanner sc = new Scanner(System.in);

		String nome1, nome2;
		double valorPorHora1, valorPorHora2, total;
		int horas1, horas2;

		System.out.println("Dados do primeiro funcionário: ");
		nome1 = sc.next(); // Ler uma string sem espaço em branco
		valorPorHora1 = sc.nextDouble();
		horas1 = sc.nextInt();

		System.out.println("Dados do segundo funcionário: ");
		nome2 = sc.next(); // Ler uma string sem espaço em branco
		valorPorHora2 = sc.nextDouble();
		horas2 = sc.nextInt();

		total = valorPorHora1 * horas1 + valorPorHora2 * horas2;

		System.out.printf("Total = %.2f%n", total);
	}

}