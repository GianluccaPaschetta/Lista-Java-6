import java.util.Scanner;

public class Atv48 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        do {
            System.out.print("Digite um número: ");
            num = entrada.nextInt();
            if(num < 1){
                System.out.println("O número precisa ser positivo e maior do que 1");
            } else if(num != 1){
                int contador = 0;
                for (int i = 2; contador < num; i++) {
                    boolean ehPrimo = true;
                    for (int j = 2; j < Math.sqrt(i); j++) {
                        if(i % j == 0){
                            ehPrimo = false;
                            break;
                        }
                    }
                    if (ehPrimo){
                        System.out.print(i + " ");
                        contador++;
                    }
                }
                System.out.println();
            } else{
                System.out.println("Fim do programa");
            }
        } while (num != 0);
    }
}

