import java.util.Scanner;

public class Atv14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int aux ,num1, num2;
        int soma = 0;
        System.out.print("Digite um número: ");
        num1 = entrada.nextInt();
        System.out.print("Digite um número: ");
        num2 = entrada.nextInt();

        if(num1 > num2){
            System.out.println("O segundo valor deve ser maior que o primeiro");
        }

        for (; num1 <= num2; num1++) {
            soma +=  num1;
        }
        System.out.println(soma);
    }
}

