import java.util.Scanner;

public class Atv58 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o primeiro termo: ");
        int a = entrada.nextInt();
        System.out.print("Informe o segundo termo: ");
        int b = entrada.nextInt();
        int c;

        for (int i = 1; i <= 10; i++) {
            System.out.print(a + " ");
            c = a + b;
            b = a;
            a = c;
        }
    }
}
