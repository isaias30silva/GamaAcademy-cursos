
public class ObjetoQueCalcula implements InterfaceModulo1, InterfaceModulo2 {
	
	public void realizaAlgumCalculo() {
		System.out.println("Pronto... calculei");
	}

	@Override
	public void efetivarContas() {
		// TODO Auto-generated method stub
		realizaAlgumCalculo();
		
	}

	@Override
	public void calcularValores() {
		// TODO Auto-generated method stub
		realizaAlgumCalculo();
	}

}
