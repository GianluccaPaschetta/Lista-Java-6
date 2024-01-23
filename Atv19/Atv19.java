import java.util.Scanner;

public class Atv19 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char verif;
        double valor;
        double media = 0;
        double valorT = 0;
        int contador = 0;
        do {
            contador++;
            System.out.print("Qual o valor da mercadoria? ");
            valor = entrada.nextDouble();
            valorT += valor;
            System.out.printf("Valor total: %.2f%n", valorT);
            media = valorT / (double) contador;
            System.out.print("Deseja adicionar outro valor de mercadoria? ");
            verif = entrada.next().toUpperCase().charAt(0);

        } while (verif == 'S');
        System.out.printf("Média: %.2f%n", media);

    }
}
