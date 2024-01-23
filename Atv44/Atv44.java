import java.util.Scanner;

public class Atv44 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        do {
            System.out.print("Digite um número: ");
            num = entrada.nextInt();
            if(num < 0){
                System.out.println("O número precisa ser positivo");
            } else if(num > 0){
                for (int i = 1; i <= num; i++) {
                    int resp = 1;
                    for (int j = i; j >= 1; j--) {
                        resp *= j;
                    }
                    System.out.printf("O fatorial de %d! é: %d%n", i, resp);
                }
                System.out.println();
            } else{
                System.out.println("Fim do programa");
            }
        } while (num != 0);

    }
}
