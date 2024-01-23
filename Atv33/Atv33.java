import java.util.Scanner;

public class Atv33 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        int contador = 1;


        do {
            System.out.println("Digite um número: ");
            num = entrada.nextInt();
            if(num < 0){
                System.out.println("O número precisa ser positivo");
            } else if(num > 0){
                for (int i = 0; i < num; i++) {
                    if (i > 0) {
                        System.out.print(", ");
                    }
                    System.out.print(contador);
                    contador += 2;
                }
                System.out.println();
            } else{
                System.out.println("Fim do programa");
            }
        } while (num != 0);

    }
}
