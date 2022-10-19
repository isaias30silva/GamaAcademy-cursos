
//aqui eu estou preocupado em definir meu novo tipo de dado que será
//usado por outras classes / programas java

public class Produto {
	
	//declaro as variáveis que compoem a estrutura
	int codigo;
	String descricao;
	double preco;
	
	void mostrarAnuncio() {
		System.out.println("--------- PRODUTO -----------");
		System.out.println(codigo + ":" + descricao);
		System.out.printf("R$ %.2f\n", preco);
	}

}
