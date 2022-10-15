package helloWorld;

import java.util.Scanner;

public class Leitura {
    public static void main (String args[]) {

        Scanner teclado = new Scanner(System.in);
        int valorInteiro;
        float valorFloat;

        System.out.println("Por favor, digite um valor inteiro");
        valorInteiro = teclado.nextInt();

        System.out.println("Por favor, digite um valor real");
        valorFloat = teclado.nextFloat();

        System.out.println("Você digitou os valores " + valorInteiro + " e " + valorFloat);

        teclado.close();
    }
}
