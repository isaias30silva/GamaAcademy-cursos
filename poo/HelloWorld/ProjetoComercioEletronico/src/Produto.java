
//aqui eu estou preocupado em definir meu novo tipo de dado que será
//usado por outras classes / programas java

public class Produto {
	
	//declaro as variáveis que compoem a estrutura
	private int codigo;
	private String descricao;
	private double preco;
	
	//Método construtor: é criado automaticamente sempre que um novo objeto é instanciado com o new.
	//para criar o método construtor, ele deve obrigatoriamente ser public e ter o mesmo nome da classe.
	//dentro dos parênteses, são informados os atributos que o objeto terá ao ser criado.
	//é uma forma de customizar a criação de objetos e informar ao Java como ele deve ser criado.
	//a partir da criação do método construtor, é necessário informar os parâmetros do objeto em sua criação.
	//nesse sentido, o método construtor é útil para customizar quais atributos os novos objetos terão.
	
	
	public Produto(int codigo, String descricao, double preco) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.preco = preco;
	}
	
	public void setCodigo(int codigo) {  //parametro e atributo tem o mesmo nome = codigo
		this.codigo = codigo;           //o this. identifica o atributo.
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void mostrarAnuncio() {
		System.out.println("--------- PRODUTO -----------");
		System.out.println(codigo + ":" + descricao);
		System.out.printf("R$ %.2f\n", preco);
	}
	
	//métodos que recebem entradas através de parâmetros.
	//parâmetros são variáveis criadas na definição do método. 
	
	public void aplicarDesconto(double percentual) {
		preco = preco - preco * percentual / 100;
	}
	
	public double simularDesconto(double percentual) {
		double precoSimulado;
		precoSimulado = preco - preco * percentual / 100;
		return precoSimulado;
	}

}
