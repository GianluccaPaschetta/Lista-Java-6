import java.util.Scanner;
public class Atv46 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = entrada.nextInt();
        int nDivisores = 0;

        for (int i = 1; i <= n; i++) {
            if(n % i == 0){
                nDivisores++;
            }
        }
        if(nDivisores == 2) System.out.println("O número digitado é primo");
        else System.out.println("O número digitado não é primo");
    }
}
