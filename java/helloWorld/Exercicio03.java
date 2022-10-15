//Exercicio03
//Sabendo que o valor de 100 kw corresponde a 1/7 do valor do salário mínimo, faça um algoritmo que receba
//o valor do salário mínimo e a quantidade de kw gasta por uma residência e calcule:
//a) o valor em reais de cada kw / b) o valor em reais a ser pago / c) o novo valor a ser pago por essa residência com um desconto de 10%

package helloWorld;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        double salarioMinimo, valor1Kw, qntdKw, valorTotal, valorComDesconto;

        //Entrada de dados
        System.out.println("Digite o valor do Salário Mínimo: ");
        salarioMinimo = teclado. nextDouble();
        System.out.println("Digite a quantidade de Kw consumidos: ");
        qntdKw = teclado.nextDouble();

        //Processamento
        //primeiro: saber quanto custa 1 kw
        valor1Kw = salarioMinimo / 7 / 100;

        //segundo: saber o valor da conta total
        valorTotal = qntdKw * valor1Kw;

        //terceiro: saber o valor do desconto
        //como será 10% de desconto, então, o valor da conta será, na verdade, 90% do valor original
        valorComDesconto = valorTotal * 0.9;

    //saída
    System.out.printf("O valor de 1Kw R$ %.2f\n", valor1Kw);
    System.out.printf("O valor total da conta R$ %.2f\n", valorTotal);
    System.out.printf("O valor com desconto R$ %.2f\n", valorComDesconto);

    teclado.close();

    }
}
