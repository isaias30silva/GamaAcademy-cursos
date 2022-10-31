
public class Comparador {
	public static void main(String[] args) {
		String s1, s2;
		
		s1 = "Oi, tudo bem?";
		s2 = "Oi, tudo bem?";
		
		if(s1 == s2) { //não está comparando os conteúdos, mas se são os mesmos locais na memória
			System.out.println("mesmo endereço de memória");
		} else {
			System.out.println("endereços diferentes na memória");
		}
		
		if(s1.equals(s2)) { // equals: mesmo em locais diferentes na memória, os conteúdos de 
						   //s1 e s2 são iguais?
			System.out.println("conteúdos iguais");
		} 
		else {
			System.out.println("conteúdos diferentes");
		}
		
		s2 = "Agora vai!!!";
		
		System.out.println(s1);
		System.out.println(s2);
	}
}
