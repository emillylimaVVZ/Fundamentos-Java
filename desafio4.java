package Fundamentos02;
//if
import java.util.Scanner;

public class desafio4 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Digite um número: ");
		int numero = entrada.nextInt();
		
		if (numero==1) {
		System.out.println("Hoje é Domingo");
		}
		else if (numero==2){
			System.out.println("Hoje é Segunda");
		}
		if (numero==3) {
			System.out.println("Hoje é Terça");
		}
		else if (numero==4) {
			System.out.println("Hoje é Quarta");
		}
		if (numero==5) {
			System.out.println("Hoje é Quinta");
		}
		else if (numero==6) {
			System.out.println("Hoje é Sexta");
		}
		if (numero==7) {
			System.out.println("Hoje é Sábado");
		}
		
		else if (numero!=1234567) {
		System.out.println("Número inválido");
		}		
		
	}

}
