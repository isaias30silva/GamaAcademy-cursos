//Exercício02h:
//informe o volume de um cilindro, dado seu diâmetro e considerando pi=3,14
//fórmula: 3.14 * raio * raio * altura

package helloWorld;

import java.util.Scanner;

public class Exercicio02h {
    public static void main(String args[]) {
    Scanner teclado = new Scanner(System.in);
    double raio, altura, volume;

    //Entrada de dados
    System.out.println("Digite o raio do cilindro:");
    raio = teclado.nextDouble();
    System.out.println("Digitle a altura do cilindro:");
    altura = teclado.nextDouble();

    //Processamento
    volume = 3.14 * raio * raio * altura;

    //Saída
    System.out.printf("O volume do cilindro vale %.3f\n", volume);

    teclado.close();

    }
}
