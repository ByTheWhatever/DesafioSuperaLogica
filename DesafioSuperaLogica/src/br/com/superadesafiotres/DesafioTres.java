package br.com.superadesafiotres;

import java.util.Scanner;

public class DesafioTres {
	public static void main(String[] args) throws Exception {

			// entrada de dados com método scanner
		 	Scanner scanner = new Scanner(System.in);

		    // variáveis que vou usar
		    int n = scanner.nextInt();
		    int k = scanner.nextInt();

		    // laço que vai percorrer a array para ver o tamanho dela
		    int[] arr = new int[n];
		    for (int i = 0; i < n; i++) {
		      arr[i] = scanner.nextInt();
		    }

		    // declaração do método que faz a subtração
		    int contador = comparador(arr, k);
		    System.out.println(contador);
		    
		    scanner.close();
		  }

		// método para subtrair os valores da array
		  public static int comparador(int[] arr, int k) {
		    int contador = 0;
		  
		    // laco for que percorre a array e subtrai o alvo pelos numeros declarados 
			// na array
		    for (int i = 0; i < arr.length; i++) {
		      for (int j = i+1; j < arr.length; j++) {
		        if (Math.abs(arr[i] - arr[j]) == k) {
		          contador++;
		        }
		      }
		    }
		    return contador;
		  }
		}
