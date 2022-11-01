package app;

import model.Conta;
import model.ContaEspecial;

public class PIBank {
	public static void main(String[] args) {
		
		Conta c1 = new Conta("Isaias", "414.111.444-22", 1112, 100);
		Conta c2 = new ContaEspecial("Jose", "444.555.666-77", 2242, 200.00, 220.00);
		
		
		//Já que estou utilizando o método toString na classe Conta, não é preciso 
		//utilizar a forma que seria utilizada sem ele. 
		//no caso, seria preciso colocar o c1. seguido do nome do método.
		//exemplo: c1.exibirInfo();
		//com o toString, é possível imprimir o objeto sem essa estrutura.
		System.out.println(c1);
		System.out.println(c2);
		
		c1.debitar(80);
		c2.debitar(180);
		
		System.out.println(c1);
		System.out.println(c2);
	}

}
