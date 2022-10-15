package helloWorld;

import java.util.Scanner;

public class DiversasLeituras{
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int codigo;
        double preco;
        String nome, texto;

        System.out.print("Digite o código: ");
        texto = teclado.nextLine();

        //convertendo o texto em formato numerico
        codigo = Integer.parseInt(texto);

        System.out.print("Digite o nome :");
        nome = teclado.nextLine();

        //convertendo o texto em formato numerico
        System.out.print("Digite o preço :");
        texto = teclado.nextLine();
        preco = Double.parseDouble(texto);

        System.out.println("Você digitou "+codigo+ " - " +nome+ " R$" +preco);

        //formatando a saída de texto com o printf. Ele não pula linha, então, é preciso colocar \n no fim.
        //%d - indica que será um número inteiro
        //%s = indica que será um texto (String)
        //%.2f - indica que será um número real, que limite de 2 casas decimais depois da vírgula.
        //depois de acrescentar essas notações, inclui uma vírgula e indica quais várias substituirão cada uma delas.

        System.out.printf("Você Digitou %d - %s R$ %.2f\n", codigo, nome, preco);
        teclado.close();
    }
}