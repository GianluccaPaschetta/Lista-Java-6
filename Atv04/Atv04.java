import java.util.Scanner;
public class Atv04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;
        System.out.print("Digite um número maior que 0: ");
        n = entrada.nextInt();
        if(n == 0){
            System.out.println("maior que 0");
            System.exit(0);
        }
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}

