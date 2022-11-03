import java.util.HashMap;

public class Loja {
	public static void main(String[] args) {
		
		//HashMap: é um tipo de lista, utilizada quando se precisa especificar a posição
		//de um elemento na lista. Assim, cada elemento terá uma chave associada a ele na
		//hora de incluí-lo na lista.
		//para declacar um hashmap, iniciar com a HashMap e dentro de <> informa o tipo
		//e o objeto, seguido do nome da variável que armazenará a lista.
		//atenção para a declaração do tipo: deve ser a referência do tipo primitivo.
		//ex: de a chave for número, ao invés de int, escrever Integer, Double, Float, Character, ..
		
		HashMap<Integer, Produto> mapa; //referência ao objeto
		mapa = new HashMap<Integer, Produto>(); //criação do HashMap de objeto
		
		//atribuindo valores aos elementos do HashMap usando o .put
		//depois do (, coloca a chave que será usada para identificar o elemento na lista
		mapa.put(1, new Produto(1, "Computador", 1500.0));
		mapa.put(2, new Produto(2, "Mouse", 80.0));
		mapa.put(3, new Produto(3, "Teclado", 150.0));
		mapa.put(4, new Produto(4, "Monitor", 450.0));
		
		//buscando o elemento na lista pela chave.
		//primeiro, crie uma variável, e atribua a ela o valor da chave.
		//depois faça a busca pelo método .get e passando como parâmetro a variável que tem a chave
		//faça também um if/else para verificar se a chave informada existe.
		//e retornar uma mensagem em caso negativo.
		
		int codigoAbuscar = 3;
		
		Produto p = mapa.get(codigoAbuscar);
		if(p!= null) {
			System.out.println("Encontrei \n" + p);
		} else {
			System.out.println("Não existe");
		}
		
	}
}
