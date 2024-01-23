import java.time.temporal.IsoFields;
import java.util.Scanner;
public class Atv63 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a quantidade de termo: ");
        int qtd = entrada.nextInt();
        int somaN = 0;
        int contador = 0;
        int a = 0;
        int b = 1;
        int c;

        for (int i = 1; i <= qtd; i++) {

            if (i == qtd) System.out.print(a + "\n");
            else System.out.print(a + " + ");
            c = a + b;
            b = a;
            a = c;

            somaN += a;
        }

        for (int i = 2; contador < qtd; i++) {
            boolean ehPrimo = true;
            for (int j = 2; j < Math.sqrt(i); j++) {
                if(i % j == 0){
                    ehPrimo = false;
                    break;
                }
            }
            if (ehPrimo){
                System.out.print(i + "   ");
                contador++;
            }
        }
        System.out.println();
        System.out.println((somaN));
    }
}
