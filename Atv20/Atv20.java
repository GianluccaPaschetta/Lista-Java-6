import java.util.Scanner;

public class Atv20 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        
        for (int i = 1; i <= 100; i++) {
            System.out.print("Insira um valor: ");
            valor = entrada.nextInt();

            if(valor > maior){
                maior = valor;
            }
            if(valor < menor){
                menor = valor;
            }
        }
        System.out.println(menor);
        System.out.println(maior);
    }
}
