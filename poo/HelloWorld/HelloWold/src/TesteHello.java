import java.util.Scanner;

public class TesteHello {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int valor;
		System.out.println("Ufa... funciona!! - Digite algo");
		valor = teclado.nextInt();
		System.out.println("Você digitou = " + valor);

		teclado.close();
	}

}
