import java.util.ArrayList;

public class Loja {
	public static void main(String[] args) {
		
		//ArrayList: diferente do Array[], o ArrayList permite a criação de listas de objetos
	    //sem a necessidade de especificar a quantidade de posições, e ainda, permite adicionar,
		//e remover objetos.Sendo portanto, mais dinâmico e flexível.
		
		//declarando um ArrayList. Dentro de <> vai o tipo de objeto que será armazenado dentro da lista.
		//e adiciona uma variável na sequência, onde o array será armazenado.
		//não esquecer de importar o java.util.ArrayList;
		ArrayList<Produto> lista;
		lista = new ArrayList<Produto>();
		
		//adicionando elementos no ArrayList com o .add:
		//sem se preocupar com o tamanho. Basta ir adicionando com o .add(new ...())
		lista.add(new Produto(1, "Computador", 1500.0));
		lista.add(new Produto(2, "Mouse", 30.0));
		lista.add(new Produto(3, "Teclado", 80.0));
		lista.add(new Produto(4,"Monitor", 400.0));
		lista.add(new Produto(5, "Impressora", 650.0));
		
		
		//removendo elementos do ArrayLista, no caso, o elemento que está na posição 2. 
		lista.remove(2);
		
		//método para percorrer e imprimir todos os elementos de um ArrayList
		for(int i=0; i<lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		
		//Produto lista[]; //aqui foi criada a lista de referência ao objeto
		//lista = new Produto[5]; //criado um array de objetos com 5 posições.
		
		//criando os objetos em cada posição do array fixo e atribuindo valores
		//lista[0] = new Produto(1, "Computador", 1500.0);
		//lista[1] = new Produto(2, "Mouse", 30.0);
		//lista[2] = new Produto(3, "Teclado", 80.0);
		//lista[3] = new Produto(4,"Monitor", 400.0);
		//lista[4] = new Produto(5, "Impressora", 650.0);
		
		//método para percorrer e imprimir os valores de todos os objetos da lista
		//for(int i=0; i<lista.length; i++) {
			//System.out.println(lista[i]);
		//}
		
		//for each: é um for, porém, com cabeçalho diferente
		//ele só serve se for para percorrer a lista toda, da primeira a ultima posição
		//se quiser percorrer a lista ao contrário ou as posições pares, por exemplo, utilizar o outro for.
		//a leitura do for each é: para cada p do tipo produto dentro da lista, faça:
		//for(Produto p : lista) {
			//System.out.println(p);
		//}
		
	}
}
