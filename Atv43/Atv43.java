import java.util.Scanner;

public class Atv43 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        for (int i = 1; i <= 7; i++) {
            int num, resul = 1;
            System.out.print("Digite um número: ");
            num = entrada.nextInt();

            System.out.printf("O fatorial de %d! é: ", num);
            for (int j = num; j >= 1; j--) {
                resul *= j;
                System.out.print(j);
                if(j > 1) System.out.print(" * ");
            }
            System.out.printf(" = %d%n", resul);
        }

    }
}
