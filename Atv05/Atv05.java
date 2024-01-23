import java.util.Scanner;
public class Atv05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;
        char verif;

        do {
            System.out.print("Digite um número maior que 0: ");
            n = entrada.nextInt();
            if(n == 0){
                System.out.println("Tem que ser maior que 0");
                System.out.print("Deseja calcular novamente? ");
                verif = entrada.next().toUpperCase().charAt(0);
            } else{
                for (int i = 1; i <= n; i++) {
                    System.out.println(i);
                }
            }
            System.out.print("Deseja calcular novamente? ");
            verif = entrada.next().toUpperCase().charAt(0);
        } while (verif == 'S');
    }
}

