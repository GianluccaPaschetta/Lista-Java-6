import java.util.Scanner;

public class Atv21 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Quantos números deseja imprimir? ");
        int num = entrada.nextInt();
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        double media = 0;
        int valor;

        for (int i = 1; i <= num; i++) {
            System.out.println("Digite os valores:");
            valor = entrada.nextInt();

            if(valor > maior){
                maior = valor;
            }
            if(valor < menor){
                menor = valor;
            }
            media += (double) valor / num;
        }

        System.out.println(menor);
        System.out.println(maior);
        System.out.println(media);
    }
}

