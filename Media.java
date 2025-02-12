package primeiraLista;
  import java.util.Scanner;

public class Media {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		float numero1 = sc.nextFloat();
		System.out.println("Digite um valor: ");
		float numero2 = sc.nextFloat();
		System.out.println("Digite um valor: ");
		float numero3 = sc.nextFloat();
		
		float resultado = (numero1 + numero2 + numero3)/3;
		
		System.out.println("Digite um valor: " + resultado );
		
		sc.close();
	}

}
