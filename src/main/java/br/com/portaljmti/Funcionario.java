package br.com.portaljmti;

public class Funcionario {
	
	//Atributos
		String nome;
		double valorPorHora;
		int horas;
		
		//Método 
		public double total() {
			return valorPorHora * horas;
		}
}