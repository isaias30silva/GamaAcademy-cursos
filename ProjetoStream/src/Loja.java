import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Loja {
	public static void main(String[] args) {
		
		List<Produto> lista = new ArrayList<Produto>();
		
		lista.add(new Produto(1, "Computador", 1500.0));
		lista.add(new Produto(2, "Mouse", 30.0));
		lista.add(new Produto(3, "Teclado", 80.0));
		lista.add(new Produto(4, "Monitor", 500.0));
		lista.add(new Produto(5, "CPU", 600.0));
		
		//stream: tornar um fluxo
		//ao invés de criar um for para percorrer todo o array e exibir os resultados
		//é possível utilizar o stream e o forEach, para realizar a mesma tarefa com menos código
		
		lista.stream().forEach((p) -> {
			System.out.println(p);
			});
		
		//utilizando o stream e o sorted para imprimir resultados por ordem alfabética
		System.out.println("Produtos em ordem alfabética ...");
		lista.stream().sorted(Comparator.comparing(p -> p.getNome()))
						.forEach(p -> System.out.println(p));
	
		//utilizando o stream e o sorted para imprimir resultados por ordem de preço
		System.out.println("Produtos em ordem de preço ...");
		lista.stream().sorted(Comparator.comparing(p -> p.getPreco()))
						.forEach(p -> System.out.println(p));
		
		//utilizando o stream e o sorted para imprimir p produto mais caro
		System.out.println("Produto mais caro ...");
		Produto produtoMaisCaro;
		produtoMaisCaro = lista.stream().max(Comparator.comparing(p -> p.getPreco()))
						.orElse(null);
		if(produtoMaisCaro != null) {
			System.out.println("Produto mais caro ="+produtoMaisCaro);
		}
		
		
		//utilizando o stream e o sorted para imprimir p produto mais barato
		System.out.println("Produto mais barato ...");
		Produto produtoMaisBarato;
		produtoMaisBarato = lista.stream().min(Comparator.comparing(p -> p.getPreco()))
						.orElse(null);
		if(produtoMaisBarato != null) {
			System.out.println("Produto mais barato ="+produtoMaisBarato);
		}
		
		
	}
}
