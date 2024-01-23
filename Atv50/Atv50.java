import java.util.Scanner;
public class Atv50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o termo inicial: ");
        int numAtual = scanner.nextInt();
        System.out.print("Digite a quantidade de termos: ");
        int qtdTermos = scanner.nextInt();

        int contador = 0;
        for (int i = numAtual;contador < qtdTermos; i++){
            boolean ehPrimo = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if(i % j == 0){
                    ehPrimo = false;
                    break;
                }
            }
            if (ehPrimo){
                System.out.println(i);
                contador++;
            }
        }


    }
}
