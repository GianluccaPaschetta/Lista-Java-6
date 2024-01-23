import java.util.Scanner;

public class Atv23 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int filhos, salario, hab;
        double mediaP = 0;
        double mediaS = 0;
        int maior = Integer.MIN_VALUE;
        int salarioMenor = 0;

        System.out.print("Quantos habitantes há na cidade? ");
        hab = entrada.nextInt();
        for (int i = 1; i <= hab; i++) {
            System.out.printf("Quantos filhos possuem o %dº habitantes? ", i);
            filhos = entrada.nextInt();
            System.out.printf("Qual o salário do %dº habitante? ", i);
            salario = entrada.nextInt();

            if(salario > Integer.MIN_VALUE){
                maior = salario;
            }

            if (salario < 150){
                salarioMenor++;
            }

            mediaP += (double) filhos / hab;
            mediaS += (double) salario / hab;
        }
        System.out.println("Maior salário: " + maior);
        System.out.printf("Média de filhos: %.2f%n", mediaP);
        System.out.printf("Média de salário: %.2f%n", mediaS);
        System.out.printf("Pessoas com salário que R$150: %d pessoas%n", salarioMenor);
    }
}

