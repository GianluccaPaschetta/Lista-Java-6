import java.util.Scanner;

public class Atv18 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double mercadoria, valor;
        double media = 0;
        double valorT = 0;

        System.out.print("Digite o total de mercadorias no estoque: ");
        mercadoria = entrada.nextDouble();

        for (int i = 1; i <= mercadoria ; i++) {
            System.out.print("Digite o valor da mercadoria no estoque: ");
            valor = entrada.nextDouble();

            valorT += valor;
            media = valorT / i;
        }
        System.out.println("Valor total: " + valorT);

        System.out.println("Média: " + media);
    }
}
