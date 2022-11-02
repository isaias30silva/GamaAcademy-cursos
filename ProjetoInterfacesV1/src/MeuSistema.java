
public class MeuSistema {
	public static void main(String[] args) {
		InterfaceBD ibd;
		
		ibd = new BDMysql();
		//vou conectar no banco de dados
		ibd.conectar();
		
		//vou recuperar dados
		ibd.executar("SELECT * FROM tb_clients");
		
		//vou desconectar do banco de dados
		ibd.desconectar();
	}

}
