package br.com.superadesafiodois;

import java.util.Locale;
import java.util.Scanner;

public class DesafioDois {

	public static void main(String[] args) {
		
		// Recebendo os dados como Double e setando o . como operador decimal	
		try (Scanner in = new Scanner(System.in).useLocale(Locale.US)) {
				
			System.out.println("Insira o valor desejado");
			
			// Declarando todas as variáveis que precisarei
		    double valor, cem, cinquenta, vinte, dez, cinco, dois, um_r, cinquenta_c, vintec_c, dez_c, cinco_c, um_c, resto;
		    
		    // Lendo as variáveis 
            valor = in.nextDouble();
            
            // Algoritmo para cálculo matemático das notas - preciso dividir e pegar o resto da divisão com %
            cem = valor / 100;
            resto = valor % 100;
            
            cinquenta = resto / 50;
            resto = resto % 50;
            
            vinte = resto / 20;
            resto = resto % 20;
            
            dez = resto / 10;
            resto = resto % 10;
            
            cinco = resto / 5;
            resto = resto % 5;
            
            dois = resto / 2;
            resto = resto % 2;

            // Fim do cálculo de notas e começo do cálculo de moedas pegando sempre o resto da divisão
            
            um_r = resto / 1;
            resto = resto % 1;
         
            // Para evitar problemas com resto da divisão que estavam ocorrendo fazemos o cálculo por 100 ( evitar 
            // quebra de números do tipo 0.499 )
            resto = resto * 100.0;
            
            cinquenta_c = resto / 50;
            resto = resto % 50;
            
            vintec_c = resto / 25;
            resto = resto % 25;
            
            dez_c = resto / 10;
            resto = resto % 10;
            
            cinco_c = resto / 5;
            resto = resto % 5;
            
            um_c = resto / 1;
            resto = resto % 1;
            
            // Todas as devidas saídas com os cálculos
            System.out.println("NOTAS:");
            System.out.println((int)cem + " nota(s) de R$ 100.00");
            System.out.println((int)cinquenta + " nota(s) de R$ 50.00");
            System.out.println((int)vinte + " nota(s) de R$ 20.00");
            System.out.println((int)dez + " nota(s) de R$ 10.00");
            System.out.println((int)cinco + " nota(s) de R$ 5.00");
            System.out.println((int)dois + " nota(s) de R$ 2.00");
            System.out.println("MOEDAS:");
            System.out.println((int)um_r + " moeda(s) de R$ 1.00");
            System.out.println((int)cinquenta_c + " moeda(s) de R$ 0.50");
            System.out.println((int)vintec_c + " moeda(s) de R$ 0.25");
            System.out.println((int)dez_c + " moeda(s) de R$ 0.10");
            System.out.println((int)cinco_c + " moeda(s) de R$ 0.05");
            System.out.println((int)um_c + " moeda(s) de R$ 0.01");
        }

}
}