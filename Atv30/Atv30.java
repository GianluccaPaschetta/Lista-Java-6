public class Atv30 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            int cont = 1;
            System.out.printf("%d, ", i);

            if(i % 2 == 0){
                for (int j = 1; j <= i; j++) {
                    System.out.print((j * 2) + " ");
                }
            } else {
                for (int j = 1; j <= i - 1; j++) {
                    if(j == 1) System.out.print(1 + " ");
                    System.out.print((cont += 2) + " ");
                }
            }
            System.out.println();
        }
    }
}
