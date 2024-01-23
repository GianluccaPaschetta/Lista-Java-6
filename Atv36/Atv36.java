import java.util.Scanner;

public class Atv36 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num;
		int contador = 1;


		do {
			System.out.print("Digite um número: ");
			num = entrada.nextInt();
			if(num < 0){
				System.out.println("O número precisa ser positivo");
			} else if(num > 0){
				for (int i = 1; i <= num; i++) {
					if(i == 1) System.out.print(i + ", ");
					if(i < num) System.out.print(1 + "/" + i + ", ");
					else System.out.print(1 + "/" + i);
				}
				System.out.println();
			} else{
				System.out.println("Fim do programa");
			}
		} while (num != 0);

	}
}
