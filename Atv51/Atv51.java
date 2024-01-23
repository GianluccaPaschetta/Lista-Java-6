import java.util.Scanner;

public class Atv51 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe a sequencia de termos:");
        int seq = entrada.nextInt();

        int a = 0;
        int b = 1;
        int c = 0;

        for (int i = 1; i <= seq; i++) {
            System.out.print(a + " ");
            c = a + b;
            b = a;
            a = c;
        }
    }
}
