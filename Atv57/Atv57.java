import java.util.Scanner;

public class Atv57 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira a quantidade de termos: ");
        int qtd = entrada.nextInt();

        int contador = 0;
        for (int i = 1; contador < qtd; i++) {
            int nDivisores = 0;
            for (int j = 1; j <= i / 2; j++) {
                if(i % j == 0) nDivisores += j;
            }
            if (nDivisores == i) {
                System.out.println(i);
                contador++;
            }
        }
    }
}
