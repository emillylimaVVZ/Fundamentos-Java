package Fundamentos02;


import java.util.Scanner;


public class desafio05 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Digite uma Letra: ");
		char letra=entrada.nextLine().charAt(0);
		
		if (letra=='f' || letra=='F') {
			System.out.println("Feminino.");
		}
		
		if (letra=='m' || letra=='M') {
			System.out.println("Masculino.");
		}
		
		else {
			System.out.println("Letra Inválida.");
		}
		
		
		
	}

}
