import java.util.Scanner;
public class Atv08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        int aux = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite um número: ");
            num = entrada.nextInt();

            if(num < 0){
                aux++;
            }
        }
        System.out.println(aux);
    }
}

