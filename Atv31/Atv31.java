import java.util.Scanner;

public class Atv31 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;

        do{
            System.out.print("Insira um número: ");
            num = entrada.nextInt();

            if(num < 0){
                System.out.println("Digite um número positivo");
            } else if(num > 0){
                for (int i = 1; i <= num; i++) {
                    if(i < num){
                        System.out.print(i  + ", ");
                    } else{
                        System.out.println(i);
                    }
                }

            } else if (num == 0) {
                System.out.println("Fim do programa");
            }

        } while (num != 0);
    }
}

