public class Atv53 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c;

        for (int i = 1; i <= 250; i++) {
            if(a >= 250) break;
            System.out.print(a + " ");
            c = a + b;
            b = a;
            a = c;
        }
    }
}
