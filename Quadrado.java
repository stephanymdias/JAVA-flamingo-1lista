package primeiraLista;
 import java.util.Scanner;

public class Quadrado {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero1 = sc.nextInt();
		
		int resultado = numero1 * numero1;
		
		System.out.println("O resultado é: " + resultado);
		
		sc.close();
	}

}
