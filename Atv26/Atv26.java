public class Atv26 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + ", ");
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d ", j);
            }
            System.out.println();
        }
    }
}

