public class Atv24 {
    public static void main(String[] args) {
        int tabuada;

        for (int i = 0; i <= 10; i++) {
            System.out.printf("%nTabuada do %d%n", i);

            for (int j = 1; j <= 10; j++) {
                tabuada = j * i;
                System.out.printf("%d * %d = %d%n", i, j, tabuada);
            }
        }
    }
}

