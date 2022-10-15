// comentario em Java de uma linha

/*
comentário em Java de bloco
 */

/**
comentário em Java para gerar documentação
 */


//Exercício 1
//Entrar com um número de 3 dígitos e invertê-los: Ex: 124 -> 321
//método para resolução: decomposição.

package helloWorld;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner (System.in);
        int numeroOriginal, centena, dezena, unidade, resto;
        int numeroNovo;

        //Entrada de dados
        System.out.println("Digite um numero inteiro de 3 dígitos: ");
        numeroOriginal = teclado.nextInt();

        //Processamento
        centena = numeroOriginal / 100; //divide o numero informado por 100 e armazena o resultado na variável centena
        resto = numeroOriginal % 100; //agora, utiliza o que sobrou da primeira divisão para continuar a decomposição
        dezena = resto / 10; //divide o resto da primeira divisão por 10, para encontrar a dezena e armazenar na variável dezena
        unidade = resto % 10; //divide o resto da primeira divisão por 10 e obtêm o resto dessa divisão, que serão as unidades. 

        //o resultado será o a unidade virando centena, a dezena, que continuará sendo dezena, e a centena virando unidade.
        numeroNovo = unidade * 100 + dezena * 10 + centena;


        //Saída
        System.out.println("O novo número vale: " +numeroNovo);

        teclado.close();
    }
}
