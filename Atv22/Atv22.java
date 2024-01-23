import java.util.Scanner;

public class Atv22 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int preco;
        double media = 0;
        int maior = Integer.MIN_VALUE;
        for (int i = 1; i <= 15; i++) {
            System.out.print("Digite o valor dos produtos: ");
            preco = entrada.nextInt();

            if(preco > maior){
                maior = preco;
            }

            media += (double) preco / 15;
        }
        System.out.println(maior);
        System.out.println(media);
    }
}

