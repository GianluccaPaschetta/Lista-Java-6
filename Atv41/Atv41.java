import java.util.Scanner;

public class Atv41 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        do {
            System.out.print("Digite um número: ");
            num = entrada.nextInt();
            int cont = num;
            int resultado = 1;
            if(num < 0){
                System.out.println("O número precisa ser positivo");
            } else if(num > 0){
                System.out.printf("%d! é ", num);
                for (int i = num; i >= 1; i--) {
                    if(i > 1) System.out.print(i + " * ");
                    if(i == 1) System.out.print(i + " = ");
                    resultado *= i;
                }
                System.out.println(" " + resultado);
                System.out.println();
            } else{
                System.out.println("Fim do programa");
            }
        } while (num != 0);

    }
}
