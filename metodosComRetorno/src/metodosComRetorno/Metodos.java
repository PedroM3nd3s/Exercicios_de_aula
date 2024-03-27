package metodosComRetorno;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Metodos {
	public static int pares(List <Integer> lista) {
		int contador = 0;
		int numPar;
		for(int i=0;i < lista.size();i++) {
			if(lista.get(i)%2==0) {
				contador =contador+1;
				numPar = lista.get(i);
			}
		}
		return contador;
	}
	public static int soma(List<Integer> listaNum) {
		int somador = 0;
		for(int i = 1; i<listaNum.size();i++) {
			somador = somador + listaNum.get(i);
		}
		return somador;

	}
	public static double media(int qtd, double soma) {
		double media = soma/qtd;
		return media;
		}
	
	public static void numAleatorio(int[] n1 , int n2) {
		
	}
	public static int[] numAleatorio(int n1, int n2) {
		int[] vetor = new int[n1];
		Random al = new Random();
		for(int i = 0; i < n1;i++) {
			vetor[i]= al.nextInt(n2+1);
		}
		return vetor;
		
		
	}
} 
