public class Atv56 {
    public static void main(String[] args) {
        for (int i = 1; i <= 900; i++) {
            int nDivisores = 0;
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) nDivisores += j;
            }
            if (nDivisores == i) System.out.println(i);
        }
    }
}
