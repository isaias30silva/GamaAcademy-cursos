public class InterrompendoLoop {
    public static void main(String args[]) {

        //break= vai interromper o loop quando o contador for igual à 5
        for(int contador=1; contador<=10; contador++) {
            if(contador == 5) {
                break;
            }
            System.out.println("Contador = "+ contador);
        }

        //continue= vai ignorar o loop apenas quando o contador for igual à 5 e continuar até quando o contador atingir a condição <=10.
        for(int contador=1; contador<=10; contador++) {
            if(contador == 5) {
                continue;
            }
            System.out.println("Contador = "+contador);
        }
    }
    
}
