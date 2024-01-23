import java.util.Scanner;

public class Atv40 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        do {
            System.out.print("Digite um número: ");
            num = entrada.nextInt();
            int contador = num/2;
            if(num < 0){
                System.out.println("O número precisa ser positivo");
            } else if(num > 0){
                for (int i = 1; i <= num; i++) {
                    if(i <= num/2) System.out.print(i + ", ");
                    else if(i < num) System.out.print(contador-- + ", ");
                    else System.out.print(contador--);
                }
                System.out.println();
            } else{
                System.out.println("Fim do programa");
            }
        } while (num != 0);

    }
}
