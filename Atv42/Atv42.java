public class Atv42 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            int resultado = 1;
            System.out.printf("Fatorial de %d é: ", i);

            for (int j = i; j >= 1; j--) {
                resultado *= j;
                System.out.print(j);
                if(j > 1) System.out.print(" * ");
            }
            System.out.printf(" = %d%n", resultado);
        }
    }
}
