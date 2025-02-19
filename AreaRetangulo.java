package primeiraLista;
 import java.util.Scanner; 

public class AreaRetangulo {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a altura do retângulo: ");
		float altura = sc.nextFloat();
		
		System.out.println("Digite a largura do retângulo: ");
		float largura = sc.nextFloat();
		
		float resultado = altura * largura;
		
		System.out.println("A área do retângulo é: " + resultado);
		
		sc.close();
	}
}
