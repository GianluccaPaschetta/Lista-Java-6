import java.util.Scanner;

public class Atv39 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        do {
            System.out.print("Digite um número: ");
            num = entrada.nextInt();
            int contador = num;
            if(num < 0){
                System.out.println("O número precisa ser positivo");
            } else if(num > 0){
                for (int i = 1; i <= num; i++) {
                    if(i < num) System.out.print(i + "/" + contador-- + ", ");
                    else System.out.print(i + "/" + contador--);
                }
                System.out.println();
            } else{
                System.out.println("Fim do programa");
            }
        } while (num != 0);

    }
}
