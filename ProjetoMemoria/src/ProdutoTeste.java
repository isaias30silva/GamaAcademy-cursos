
public class ProdutoTeste {
	public static void main(String[] args) {
		Produto p1, p2;
		
		p1 = new Produto(123, "Computador", 1000.0);
		System.out.println("P1 = " + p1.exibir());
		
		p2 = p1;
		
		p2.setPreco(1500.00);
		System.out.println("P1 = " + p1.exibir());
		System.out.println("P2 = " + p2.exibir());
		
	}

}
