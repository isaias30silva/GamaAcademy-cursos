
public class Loja {
	public static void main(String[] args) {
		
		Produto p, p2, p3;          //declarei
		p = new Produto(); //reservei (aloquei) a memória para isso
		p2 = new Produto();
		p3 = new Produto();
		
		p.codigo = 123;
		p.descricao = "Descrição";
		p.preco = 2500.00;
		
		p2.codigo = 1234;
		p2.descricao = "Mouse";
		p2.preco = 35.00;
		
		p3.codigo = 12345;
		p3.descricao = "Teclado";
		p3.preco = 100.00;
		
		p.mostrarAnuncio();
		p2.mostrarAnuncio();
		p3.mostrarAnuncio();
	}
}
