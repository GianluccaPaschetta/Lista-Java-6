import java.util.Scanner;

public class Atv17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota1, nota2, mediaS;
        char verif;
        do {
            System.out.print("Digite a primeira nota: ");
            nota1 = entrada.nextDouble();
            System.out.print("Digite a segunda nota: ");
            nota2 = entrada.nextDouble();
            if(nota1 > 10 && nota1 < 0 && nota2 > 10 && nota2 < 0){
                System.out.println("As notas devem estar entre 0 e 10");
            }
            mediaS = (nota1 + nota2) / 2;
            System.out.println("Sua média é: " + mediaS);
            System.out.print("Deseja calcular novamente? ");
            verif = entrada.next().toUpperCase().charAt(0);
        } while (verif == 'S');
    }
}

