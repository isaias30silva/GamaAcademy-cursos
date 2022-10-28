
public class Loja {
	public static void main(String[] args) {
		
		Produto p, p2, p3;          //declarei
		p = new Produto(123, "Computador", 2500.00); //reservei (aloquei) a memória para isso
		p2 = new Produto(456, "Mouse", 35.00);
		p3 = new Produto(123456, "Teclado", 100.00);
		
		/*
		p.setCodigo(123);
		p.setDescricao("Computador");
		p.setPreco(2500.00);
		
		p2.setCodigo(1234);
		p2.setDescricao("Mouse");
		p2.setPreco(35.00);
		
		p3.setCodigo(12345);
		p3.setDescricao("Teclado");
		p3.setPreco(100.00);
		
		System.out.println("Preços antes dos descontos");
		p.mostrarAnuncio();
		p2.mostrarAnuncio();
		p3.mostrarAnuncio(); */
		
		System.out.println("------------");
		
		p.aplicarDesconto(10);
		p.mostrarAnuncio();
		p2.setPreco(55.00);
		p3.setPreco(99.90);
		
		p2.mostrarAnuncio();
		p3.mostrarAnuncio();
		
		//simulando descontos
		System.out.println("O preço do " + p.getDescricao()+ " com mais 15% de desconto fica " + p.simularDesconto(15));
		p.mostrarAnuncio();
	}
}
