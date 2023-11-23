package Fundamentos02;

import java.util.Scanner;
//1 p sim 2 p nao 
public class desafio06 {
//cont
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Telefonou para vitima?");
		int resp1=entrada.nextInt();
		
		System.out.println("Esteve no local do crime?");
		int resp2=entrada.nextInt();
		
		System.out.println("Mora perto da vitima?");
		int resp3=entrada.nextInt();
		
		System.out.println("Devia para a vitima?");
		int resp4=entrada.nextInt();
		
		System.out.println("Ja trabalhou para a vitima?");
		int resp5=entrada.nextInt();
		
		int cont = (resp1+resp2+resp3+resp4+resp5);
		
		if (cont==10) {
			System.out.println("Inocente");
		}
		if (cont==5) {
			System.out.println("Assasino");
		}
		
		if (cont==8) {
			System.out.println("Suspeito");
			
		if (cont==7 || cont==6) {
			System.out.println("Cúmplice");
			
		}
		
		
		}
		
		
	}

}
