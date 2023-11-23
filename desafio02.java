package Fundamentos02;

import java.util.Scanner;

public class desafio03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite 1 número: ");
		int n1= entrada.nextInt();
		
		System.out.println("Digite o 2 número: ");
		int n2=entrada.nextInt();
		
		System.out.println("Digite 3 número: ");
		int n3=entrada.nextInt();
				    
		if (n1 > n2 && n2 > n3) {
		System.out.println("Numero 1 e o maior, e o Numero 3 e o menor");
		}
		else if (n3 > n2 && n2>n1) {
			System.out.println("Numero 3 e o maior, e o Numero 1 e o menor");
		}
		if (n2>n1 && n1>n3) {
			System.out.println("Numero 2 e o maior e o Numero 3 e o menor");
		}
		else if (n1>n3 && n3>n2) {
			System.out.println("Numero 1 e o maior e Numero 2 e o menor");
		}		
		if (n3>n1 && n1>n2) {
			System.out.println("Numero tres e o maior e o Numero 2 é o menor");
		 
		
		}	

	}
}

//else if
