import java.util.Scanner;

public class Atv52 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num = entrada.nextInt();
        int a = 0;
        int b = 1;
        int c;
        boolean pertence = false;
        for (int i = 1; i <= num; i++) {

            c = a + b;
            b = a;
            a = c;
            if(num == a){
                pertence = true;
                break;
            }
        }
        if (pertence) System.out.println("Pertence");
    }
}
