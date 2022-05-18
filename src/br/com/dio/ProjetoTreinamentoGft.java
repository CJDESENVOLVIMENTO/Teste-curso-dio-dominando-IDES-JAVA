package br.com.dio;

import br.com.dio.model.CJinc;

public class ProjetoTreinamentoGft {

	public static void main(String[] args) {
		
		CJinc cjinc = new CJinc();
		Boleto boleto = new Boleto();
		
		System.out.println(cjinc);
		System.out.println(boleto);
		
	/*int a= 10*2;
	int b= 6*3;
	System.out.println("CJDEV" + (a+b));*/
		 
		}
	}
	class Boleto{
		private String nome;
		private String saldo;
	}
	
  
