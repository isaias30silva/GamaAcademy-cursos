//usando a interface sem precisar de uma classe que defina seus métodos.

public class ClasseQueUsa {
	public static void main(String[] args) {
		
		//chamando a Interface criada e acresentando a variável i para armazenar o resultado
		//do método.
		InterfaceServico i;
		
		//definindo o método criado pela Interface sem a necessidade de criar uma classe
		//específica para isso.
		i = new InterfaceServico() {
			public void executa(int valor) {
				System.out.println("Estou executando algo..." +valor);
			}
		};
		
		i.executa(10);
		
		
		//realizando a mesma operação, porém, simplificando o código com Lambda
		//porém, para usar Lambda, é preciso que o método seja funcional, ou seja
		//um único método em uma Interface ou Classe
		InterfaceServico i2 = (valor) -> {
				System.out.println("Outra lógica de execução..." +valor);
		};
		
		i2.executa(30);
	}
}
