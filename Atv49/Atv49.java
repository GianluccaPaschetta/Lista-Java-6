import java.util.Scanner;

public class Atv49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de termos da sequência de números primos: ");
        int quantidadeTermos = scanner.nextInt();

        if (quantidadeTermos <= 0) {
            System.out.println("Por favor, digite um número inteiro positivo maior que 0.");
        } else {
            System.out.println("Sequência de " + quantidadeTermos + " números primos (do final para o início):");

            int contador = 0;

            for (int numeroAtual = Integer.MAX_VALUE; contador < quantidadeTermos; numeroAtual--) {
                boolean ehPrimo = true;

                for (int i = 2; i <= Math.sqrt(numeroAtual); i++) {
                    if (numeroAtual % i == 0) {
                        ehPrimo = false;
                        break;
                    }
                }

                if (ehPrimo) {
                    System.out.print(numeroAtual + " ");
                    contador++;
                }
            }
        }
    }
}
