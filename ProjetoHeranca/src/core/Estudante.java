package core;

//herança: ampliar os atributos que uma classe possui, ou seja, utilizar o que já existe
//e somar novos atributos.
//a palavra extends é utilizar para esse tipo de operação. No exemplo abaixo, 
//a classe Estudante vai herdar os atributos da classe Pessoa. 
//assim, não será preciso incluir o nome, email e telefone a este objeto, apenas o que for
//exclusivo a ele, como número de matrícula e curso, por exemplo.

//esta é a subclasse que utiliza a estrutura de atributos da superclasse, no caso, a classe Pessoa

public class Estudante extends Pessoa {
	
	private int numeroMatricula;
	private String curso;
	
	//essa classe está herdando uma estrutura de atributos de outra classe que possui construtor
	//portanto, ela também deve ter construtor.
	//nesse caso, precisa informar via parâmetro, na primeira linha, os tipos e variáveis
	//herdadas e próprias.
	//na segunda linha, utilizar a palavra reservada super e dentro de parênteses, passar as 
	//variáveis herdadas.
	//e logo abaixo, passar as variáveis próprias, usando a palavras reservada this.
	
	public Estudante(String nome, String email, String telefone, int numeroMatricula, String curso) {
		super(nome, email, telefone);
		this.numeroMatricula = numeroMatricula;
		this.curso = curso;
	}
	
	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	// aqui eu faço uma sobrescrita de método = redefinição
	// se o atributo na superClasse (nesse caso, a classe Pessoa) estiver protected
	// não é preciso usar o super. Aqui foi utilizado, mas não é´preciso.
	public String exibirInfo() {
		return super.nome + "/" +super.email + "/" + super.telefone + "/" + this.numeroMatricula + "/" + this.curso;
	}
	
}
