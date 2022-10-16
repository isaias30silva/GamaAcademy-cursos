public class TesteArgs {
    public static void main(String args[]) {
        System.out.println("Parametros passados pela linha de comando");
        for(int pos=0; pos<args.length; pos++) {
            System.out.println("Para "+pos+ " = "+args[pos]);
        }
    }
}
