import java.util.Scanner;

public class Atv12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        int total = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Escreva um número: ");
            num = entrada.nextInt();

            total += num;
        }
        System.out.println(total);
    }
}

