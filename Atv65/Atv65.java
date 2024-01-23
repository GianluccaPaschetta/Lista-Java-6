import java.util.Scanner;

public class Atv65 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de termos desejados: ");
        int quantidadeTermos = scanner.nextInt();

        int termo1 = 1;
        int termo2 = -1;
        int soma = 0;

        System.out.print("Sequência: ");
        for (int i = 0; i < quantidadeTermos; i++) {
            if (i % 2 == 0) {
                System.out.print(termo1 + " ");
                soma += termo1;
                termo1 = termo1 + termo2;
            } else {
                System.out.print(termo2 + " ");
                soma += termo2;
                termo2 = termo1 + termo2;
            }
        }

        System.out.println("\nSoma dos termos: " + soma);
    }
}
