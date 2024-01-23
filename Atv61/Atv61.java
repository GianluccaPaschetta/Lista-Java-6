import java.util.Scanner;
public class Atv61 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a quantidade de termo: ");
        int qtd = entrada.nextInt();
        int somaN = 0, somaD = 0;
        int contador = 1;
        for (int i = 1; i <= qtd; i++) {

            if(i == qtd) System.out.print(i * 2 + "\n");
            else System.out.print(i * 2 + " + ");
            somaN += i * 2;
        }
        for (int i = 1; i <= qtd; i++) {
            if (i == 1) System.out.print(contador);
            else if(i == 2) System.out.print(" " + (contador += 2) + " ");
            else System.out.print(" " + " " + (contador += 2) + " ");
            somaD += contador;
        }
        System.out.println();
        System.out.println((somaN + somaD));
    }
}
