import java.util.Scanner;

public class Atv54 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int a = 0;
        int b = 1;
        int c;

        System.out.print("Digite o termo inicial: ");
        int termoInicial = entrada.nextInt();
        System.out.print("Digite o termo final: ");
        int termoFinal = entrada.nextInt();

        for (int i = 1; i <= termoFinal; i++) {

            if(i >= termoInicial){
                System.out.print(a + " ");
            }
            c = a + b;
            b = a;
            a = c;
        }
    }


}
