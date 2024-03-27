package metodosComRetorno;

import java.util.List;
import java.util.Scanner;

public class UsaMetodos {
	
	public static void main(String[] args) {
		/*/
		 * um método que receba uma lista contendo diversos valores inteiros;
		 * retorne a quantidade de números pares;
		 */
		List<Integer>lista = List.of(5,8,20,30,52,7,8);
		int qtdPares = Metodos.pares(lista);
		System.out.println("Essa lista tem: "+ qtdPares + " numeros pares");
		
		//..............................................................................................
		/*/
		 * um método que recebe um array de 10 elementos contendo valores inteiros;
		 * retorna à soma desses valores;
		 */
		List<Integer>listaNum = List.of(1,1,1,1,1,1,1,1,1,1,1);
		int quantidade = Metodos.soma(listaNum);
		System.out.println("A soma de seus numeros são: " + quantidade);
		
		//..............................................................................................
		/*/
		 * um método que recebe qualquer quantidade de notas de prova;
		 * retorna a média aritmética dessas notas.
		 */
		System.out.println("Quantas notas deseja inserir: ");
		Scanner ler = new Scanner(System.in);
		int qtd = ler.nextInt();
		double[] notas = new double[qtd+1];
		double soma = 0;
		for(int i = 1; i<notas.length;i++) {
			System.out.println("Digite sua nota " + i+":");
			notas[i] = ler.nextDouble();
			soma = soma + notas[i];
		}
		System.out.println("Sua média é " + Metodos.media(qtd, soma));
		//..............................................................................................
		/*/
		 * 	um método que recebe dois números inteiros (n1 e n2);
		 *  retorna um vetor contendo n1 valores gerados aleatoriamente	;
		 *  gera aleatoriamente valores que estejam compreendidos entre 0 e n2.
		 */
		int n1 = 2;
		int n2= 3;
		int[] vetor2 = Metodos.numAleatorio(n1, n2);
		for(int i = 0 ; i<vetor2.length;i++) {
			System.out.print(vetor2[i]+" ");
		}
		
	}

}