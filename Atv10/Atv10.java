import java.util.Scanner;

public class Atv10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nota;
        int media = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite a nota dos alunos: ");
            nota = entrada.nextInt();

            media += nota / 10;
        }
        System.out.println("Média final: " + media);
    }

}
