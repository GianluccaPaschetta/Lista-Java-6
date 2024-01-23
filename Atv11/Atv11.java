import java.util.Scanner;

public class Atv11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int aluno, notas;
        double media = 0;

        System.out.print("De quantos alunos você deseja calcular a nota: ");
        aluno = entrada.nextInt();

        for (int i = 1; i <= aluno; i++) {
            System.out.printf("Digite a nota do aluno %d: ", i);
            notas = entrada.nextInt();

            media += (double) notas / aluno;
        }
        System.out.println(media);
    }
}
 