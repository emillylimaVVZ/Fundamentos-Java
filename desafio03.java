package Fundamentos02;

import java.util.Scanner;

public class desafio04 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Digite a nota 1: ");
		double nota1 = entrada.nextDouble();
		System.out.println("Digite a nota 2: ");
		double nota2 = entrada.nextDouble();
	
		double media = (nota1+nota2)/2;
		System.out.println(media);
		
		if (media >=7) {
			System.out.println("Voce esta aprovado.");
		}
		else if (media>=4) {
			System.out.println("Você esta de recuperação.");
		}
		else {
			System.out.println("Parabens. Você esta reprovado.");
		}
		
			
		
 }
}
