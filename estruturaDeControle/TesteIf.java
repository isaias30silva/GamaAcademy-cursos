import java.util.Scanner;
public class TesteIf {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        double nota1, nota2, media;
        System.out.println("Digite a nota 1: ");
        nota1 = teclado.nextDouble();
        System.out.println("Digite a nota 2: ");
        nota2 = teclado.nextDouble();

        media = (nota1+nota2)/2;

        System.out.println("Sua media final é: "+media);

        if(media >= 9.0) {
            System.out.println("Conceito A");
        } else if(media >=8 && media < 9) {
                System.out.println("Conceito B");
            } else if(media >=7 && media < 8) {
                    System.out.println("Conceito C");
                } else if(media >= 6 && media < 7) {
                        System.out.println("Conceito D");
                    } else {
                        System.out.println("Conceito F");
                    }

        System.out.println("Fim do Programa");

        teclado.close();

        }
    }