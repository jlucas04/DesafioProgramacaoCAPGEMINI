package br.com.desafios;

import java.util.Scanner;

public class PrimeiraQuestao {

	public static void main(String[] args){
		// criar um algoritmo que entregue como resultado a mediana de um vetor com a quantidade de posições ímpares.
		// criar um vetor de n posições
		int vetor[];
		int auxiliar;
		Scanner teclado = new Scanner(System.in);
		int usuario; // variável para armazenar a quantidade de elementos do vetor
		float m1, m2, mediana_par;
		
		
		// entradas
		System.out.println("Informe a quantidade de posições do seu vetor: ");
		usuario = teclado.nextInt();
		
		vetor = new int [usuario];
		
		
		
		for (int i = 0; i < usuario; i++) {
			vetor[i] = teclado.nextInt();
		}
		// ordenando o vetor
		for (int i = 0; i < usuario; i++) {
			for (int j = 0; j < usuario; j++) {
				// trocar os valores caso i seja menor que j
				if(vetor[i] < vetor[j]) {
					auxiliar = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = auxiliar;
				}
			}
					
		}
		for (int f = 0; f < 1; f++) {
			if(usuario % 2 != 0){
			vetor[f] = vetor[(usuario - 1) /2];
			System.out.println(vetor[f]);
			}else {
				m1 = vetor[usuario / 2 - 1];
			    m2 = vetor[usuario / 2];     
			    m1 += m2;
			    mediana_par = m1 / 2 ;
			    System.out.println(mediana_par);
			 }
		}
		teclado.close();
	}
}
