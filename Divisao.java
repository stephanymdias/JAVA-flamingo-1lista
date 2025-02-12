package primeiraLista;
 import java.util.Scanner;

public class Divisao {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		float numero1 = sc.nextFloat();
		
		System.out.println("Digite outro valor: ");
		float numero2 = sc.nextFloat();
		float resultado = numero1 / numero2;
		
		System.out.println("O resultado é: " + resultado);
		sc.close();
	}

}
