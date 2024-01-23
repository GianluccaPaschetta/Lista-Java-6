import java.util.Scanner;

public class Atv55 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = entrada.nextInt();
        int somaDivisores = 0;

        for (int i = 1; i <= n/2; i++) {
            if(n % i == 0) somaDivisores += i;
        }
        if (n == somaDivisores) System.out.print("É perfeito");
        else System.out.print("Não é perfeito");
    }
}
