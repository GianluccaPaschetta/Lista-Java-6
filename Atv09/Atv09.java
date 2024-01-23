import java.util.Scanner;

public class Atv09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        int dentro = 0;
        int fora = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite um número: ");
            num = entrada.nextInt();

            if(num >= 10 && num <= 20){
                dentro++;
            } else {
                fora++;
            }
        }
        System.out.println("Fora: " + fora);
        System.out.println("Dentro: " + dentro);
    }
}

