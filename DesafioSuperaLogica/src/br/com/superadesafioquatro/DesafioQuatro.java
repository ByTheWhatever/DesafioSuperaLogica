package br.com.superadesafioquatro;

import java.util.Scanner;
public class DesafioQuatro {

	  public static void main(String[] args) {
		  		
		  		// entrada de dados com método scanner
				Scanner scanner = new Scanner(System.in);
				
				// variável que precisaremos
				int n = scanner.nextInt();
				
				// laço for que percorre a linha e faz a quebra conforme posição
				for (int i = 0; i < n; i++) {
					String linha = readLine(scanner);
					StringBuilder frase1 = new StringBuilder(linha.substring(0, linha.length() / 2));
					StringBuilder frase2 = new StringBuilder(linha.substring(linha.length() / 2, linha.length()));
					frase1.reverse();
					frase2.reverse();
					System.out.println(frase1.toString() + frase2.toString());
				}
			}
			
			
	  //-----------------------------------------------------------------------------
	  
	  // método que faz a leitura da linha 
	  public static String readLine(Scanner scanner) {
				String line = scanner.nextLine();
				while (line.isEmpty())
					line = scanner.nextLine();
				return line;
			}
			
		}