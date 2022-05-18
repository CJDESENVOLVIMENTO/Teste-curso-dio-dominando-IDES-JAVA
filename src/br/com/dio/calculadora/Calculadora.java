package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			
			int a,b;
			
			System.out.println("Digite o primeiro numero: ");
			a = scan.nextInt();
			System.out.println("Digite o Segundo numero: ");
			b = scan.nextInt();
			
			int soma = soma(a,b);
			int subtracao = subtracao(a,b);
			int multiplicacao = multiplicacao(a,b);		
			double divisao = divisao(a,b);
			
		System.out.println("soma =  " + soma);
		System.out.println("subtacao =  " + subtracao);
		System.out.println("mutilicacao =  " + multiplicacao);
		System.out.println("divisao =  " + divisao);
		
	}

	public static int soma(int a, int b) {
		return a+b;
	
	}
	public static int subtracao(int a, int b) {
		return a-b;
		
	}
	public static int multiplicacao(int a, int b) {
		return a*b;
		
	}
	public static double divisao(double a, double b) {
		return a/b;
		
	}
	
}
