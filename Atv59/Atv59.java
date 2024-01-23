import java.util.Scanner;

public class Atv59 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o primeiro termo: ");
        int a = entrada.nextInt();
        System.out.print("Informe o segundo termo: ");
        int b = entrada.nextInt();
        int c;
        System.out.print("Informe a quantidade de termos desejadas: ");
        int qtd = entrada.nextInt();

        for (int i = 1; i <= qtd; i++) {
            System.out.print(a + " ");
            c = a + b;
            b = a;
            a = c;
        }
    }
}
