package core;

public class Pessoa {
	
	//esta é a superclasse, de onde os atributos básicos são obtidos.
	
	//o protected é um modificador de acesso que blinda o atributo do acesso de outras classes,
	//porém, cria uma abertura para que apenas classes com relação de herança possam acessá-los.
	protected String nome;
	protected String email;
	protected String telefone;
	
	//gerando o método construtor, é uma forma de obrigar a informação dos atributos
	//relacionados via parâmetro. Caso o construtor não seja inserido, o Java o faz manualmente,
	//porém, nesse caso, não haverá obrigatoriedade de passagem de parâmetros.
	public Pessoa(String nome, String email, String telefone) {
		super();
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String exibirInfo() {
		return nome + "/" + email + "/" + telefone;
	}

}
