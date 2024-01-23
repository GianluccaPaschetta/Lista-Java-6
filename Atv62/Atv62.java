import java.util.Scanner;
public class Atv62 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a quantidade de termo: ");
        int qtd = entrada.nextInt();
        int somaN = 0;
        int contador = 1;

        for (int i = 1; i <= qtd; i++) {
            int termo = i * 2;
            if(i % 2 == 0){
                if(i == qtd) System.out.print("- " + termo + "\n");
                else System.out.print("- " + termo + " ");
                somaN -= termo;
            } else {
                if(i == qtd) System.out.print("+ " + termo + "\n");
                else if(i == 1) System.out.print(termo + " ");
                else System.out.printf("+ " + termo + " ");
                somaN += termo;
            }

        }

        for (int i = 1; i <= qtd; i++) {
            if (i == 1) System.out.print(contador);
            else if(i == 2) System.out.print(" " + (contador += 2) + " ");
            else System.out.print(" " + " " + (contador += 2) + " ");

        }
        System.out.println();
        System.out.println((somaN));
    }
}
