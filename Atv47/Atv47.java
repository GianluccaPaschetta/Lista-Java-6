public class Atv47 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            int nDivisores = 0;
            for (int j = 1; j <= i; j++) {
                if(i % j == 0) nDivisores++;
            }
            if(nDivisores == 2) System.out.print(i + ", ");
        }
    }
}

