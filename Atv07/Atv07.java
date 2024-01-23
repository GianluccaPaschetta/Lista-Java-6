import java.util.Scanner;
public class Atv07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número maior que 0: ");
        int num = entrada.nextInt();
        for (int i = 1; i <= 10; i++) {
            int tabuada = num * i;
            System.out.printf("%d * %d = %d%n", i, num,tabuada);
        }
    }
}

