import java.util.Scanner;

public class Atv35 {
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n = 0;
		
		
		do{
			System.out.print("Digite o valor da sequencia: ");
			n = entrada.nextInt();
			if(n == 0) System.exit(0);
			if(n < 0){
				System.out.print("Digite um valor positivo");
				continue;
			}
		
			for(int i = 1;i <= n; i++){
				System.out.print(i + ", ");
				if(i < n) System.out.print("-" + i + ", ");
				
				if(i == n){
				System.out.println("-" + i + "\n");
				}
			}
		} while(n != 0);
		System.out.println("Fim do programa");
	}
}


