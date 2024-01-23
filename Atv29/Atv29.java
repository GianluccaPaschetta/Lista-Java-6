public class Atv29 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            int cont = 1;
            System.out.print(i + ", ");
            for (int j = 1; j <= 5; j++) {
                if(i % 2 == 0){
                    System.out.print(j * 2 + " ");
                } else {
                    if(cont < 9) System.out.print((cont += 2) + " ");
                }
            }
            System.out.println();
        }
    }
}
