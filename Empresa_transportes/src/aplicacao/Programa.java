package aplicacao;

import java.util.Scanner;
import entidades.Motorista;
import entidades.Viagem;


public class Programa {
	
	public static void main (String [] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.printf("Quantos motoristas são?");
		int n = teclado.nextInt();
		
		Motorista [] motoristas = new Motorista[n];
		
		for (int i = 0; i < n; i++) {
			
			System.out.println("Motorista " + (i + 1));
			
			System.out.printf("Código: ");
			int cod =  teclado.nextInt();
			teclado.nextLine();
			
			System.out.printf("Nome: ");
			String nome = teclado.nextLine();
			
			System.out.printf("%nNúmero de viagens: ");
			int qtd = teclado.nextInt();
			
			motoristas[i] = new Motorista(cod, nome, qtd);
			
			for (int j = 0; j < qtd; j++) {
				System.out.println("Viagem: " + (j +1));
				
				System.out.printf("Código: ");
				int codViagem = teclado.nextInt();
				teclado.nextLine();
				
				System.out.printf("Destino: ");
				String destino = teclado.nextLine();
		
				System.out.printf("Distância: ");
				double distancia = teclado.nextDouble();
				
				System.out.printf("Tempo: ");
				double tempo = teclado.nextDouble();
				
				motoristas[i].getViagens()[j] =
						new Viagem(codViagem, destino, distancia, tempo);
			}
		}
		
		System.out.printf("%n--- RELATORIO ---%n");
		
		for (int i = 0; i<n; i++) {
			System.out.println("\n" + motoristas[i]);
			
			for (Viagem v: motoristas[i].getViagens()) {
				System.out.println(v);
			}
			
			System.out.printf("Distância total: %.2f km",
					motoristas[i].calcularDistanciaTotal());
			
			System.out.printf("%nTempo total: %.2f horas%n",
					motoristas[i].calcularTempoTotal());
		}
		teclado.close();
	}

}
