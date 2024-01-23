import java.util.Scanner;

public class Atv60 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o primeiro termo: ");
        int a = entrada.nextInt();
        System.out.print("Informe o segundo termo: ");
        int b = entrada.nextInt();
        int c;
        System.out.print("Informe um número: ");
        int n = entrada.nextInt();

        boolean pertence = false;
        for (int i = 1; i < n; i++) {
            c = a + b;
            b = a;
            a = c;
            if(a == n){
                pertence = true;
                break;
            }
        }
        if(pertence) System.out.println("O número pertence a essa sequencia de Ricci");
        else System.out.print("Não pertence");
    }
}
