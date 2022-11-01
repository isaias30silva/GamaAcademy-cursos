package userInterface;

import core.Estudante;
import core.Pessoa;

public class AppUniversidade {
	public static void main(String[] args) {
		
		//uma vez que é definido um método construtor, os valores dos atributos devem todos
		//ser passados via parâmetro, após o new _()
		//isso subtitui a necessidade de incluir um a um, conforme comentário abaixo.
		Pessoa p = new Pessoa("Isaias", "isaias30silva@gmail.com", "999999999");
		
		//aqui está comentado porque os valores foram passados via parâmetro
		//isso porque foi definido o construtor na classe Pessoa.
		//caso contrário, teria de ser feito do jeito que está abaixo:
		
		//p.setNome("Isaias");
		//p.setEmail("isaias30silva@gmail.com");
		//p.setTelefone("999999999");
		
		System.out.println(p.exibirInfo());
		
		//a classe Estudante possui construtor, portanto, os valores dos atributos devem ser
		//passados via parâmetro.
		Estudante estudante = new Estudante("Ismael", "ismaeljoao@gmail.com", "988767676", 323, "Pedagogia");
		//estudante.setNome("Ismael");
		//estudante.setEmail("ismaeljoao@gmail.com");
		//estudante.setTelefone("998876767");
		//estudante.setNumeroMatricula(323);
		//estudante.setCurso("Pedagogia");
		
		System.out.println(estudante.exibirInfo());
	}

}
