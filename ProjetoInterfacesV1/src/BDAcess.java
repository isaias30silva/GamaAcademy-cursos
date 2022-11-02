
public class BDAcess implements InterfaceBD {
	
	@Override
	public void conectar() {
		System.out.println("Concectando no banco Access");
	}
	
	@Override
	public void desconectar() {
		System.out.println("Desconectando no banco Access");
	}
	
	@Override
	public void executar(String comando) {
		System.out.println("ms-access> " +comando);
	}
}
