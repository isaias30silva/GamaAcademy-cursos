
public class Empregado {
	//parte 1 - declarar atributos
	private String nome;
	private double salario;
	
	//parte 2 - método construtor
	public Empregado(String nome, double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}
	
	//parte 3 - metodos getters e setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	//parte 4 - métodos do "business" propriamente ditos
	//método que exibirá os salários
	public String exibir() {
		return this.nome + " R$ " + this.salario;
	}
	
	//método que fará o reajuste do salário de acordo com o percentual informado no parâmetro
	public void aumentarSalario(double percentual) {
		this.salario += this.salario * percentual / 100;
	}

}
