package model;

//essa será uma subclasse que amplia a superclasse Conta
public class ContaEspecial extends Conta {
	private double limite;

	public ContaEspecial(String nomeTitular, String cpf, int numero, double saldo, double limite) {
		super(nomeTitular, cpf, numero, saldo);
		this.limite = limite;
	}
	
	//como na superclasse há o método toString, na subclasse também é necessário incluir.
	//assim, basta após o return incluir a palavra reservada super.toString()
	//é a forma de referenciar o método toString da superclasse e reaproveitá-lo aqui.
	//na sequência, adiciona os outros atributos - valores que serão utilizados desta classe.
	
	@Override
	public String toString() {
		return super.toString() + " Limite R$" +this.limite;
	}
	
	@Override
	public boolean debitar(double valor) {
		if(super.saldo + this.limite >= valor) {
			super.saldo -= valor;
			return true;
		}
		return true;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

}
