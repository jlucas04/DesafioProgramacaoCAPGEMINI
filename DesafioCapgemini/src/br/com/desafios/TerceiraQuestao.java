package br.com.desafios;

import java.util.Scanner;

public class TerceiraQuestao {

	public static void main(String[] args) {
		String S;
		int T;
		Scanner teclado = new Scanner(System.in);
		S = teclado.nextLine();
		String result = S.replaceAll("\\s+","");
		char[] array = result.toCharArray();
		T = result.length();
		float raiz_quadrada = (float) Math.sqrt(T);
		int raiz_quadrada1 = (int) Math.ceil(raiz_quadrada);
		
		char [][] mat = new char [raiz_quadrada1][raiz_quadrada1];
		for (int i = 0; i < raiz_quadrada1; i++) {
			for (int j = 0; j < raiz_quadrada1; j++) {
				mat [i][j] = array[i];
				mat [i][j] = array[j];
			}
		}
		for (int i = 0; i < raiz_quadrada1; i++) {
			System.out.print(mat[i][i]);
		}
		System.out.println();
		teclado.close();	
		}
		
	}

