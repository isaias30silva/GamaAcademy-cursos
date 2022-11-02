
public class BDMysql implements InterfaceBD {

	@Override
	public void conectar() {
		System.out.println("Connecting on MySQL Server...");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void desconectar() {
		System.out.println("MySQL Server disconnected ...");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void executar(String comando) {
		System.out.println("msql> " +comando);
		// TODO Auto-generated method stub
		
	}

}
