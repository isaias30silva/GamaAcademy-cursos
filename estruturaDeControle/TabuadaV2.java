import java.util.Scanner;

public class TabuadaV2 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        int numero = teclado.nextInt();
        int contador;

        contador = 100;
        do {
            System.out.println(numero + "x" + contador + "=" + (numero * contador));
            contador = contador+1;
        } while(contador <= 10);

        teclado.close();
    }
    
}
