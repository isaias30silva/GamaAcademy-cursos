import java.util.Scanner;

public class EmpregadoTeste {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Empregado e1, e2;
		
		String nome1, nome2;
		double salario1, salario2;
		
		//entrada de dados pelo usuário
		System.out.println("Digite o nome do funcionário");
		nome1 = teclado.nextLine();
		System.out.println("Digite o salário do funcionário");
		salario1 = Double.parseDouble(teclado.nextLine());
		
		System.out.println("Digite o nome do funcionário");
		nome2 = teclado.nextLine();
		System.out.println("Digite o salário do funcionário");
		salario2 = Double.parseDouble(teclado.nextLine());
		
		e1 = new Empregado(nome1, salario1);
		e2 = new Empregado(nome2, salario2);
		
		//antes do reajuste
		System.out.println("---------- informações originais ----------");
		System.out.println(e1.exibir());
		System.out.println(e2.exibir());
		
		e1.aumentarSalario(5.0);
		e2.aumentarSalario(7.0);
		
		//depois do reajuste
		System.out.println("---------- salários reajustados ----------");
		System.out.println(e1.exibir());
		System.out.println(e2.exibir());
		
		teclado.close();
	}
	

}
