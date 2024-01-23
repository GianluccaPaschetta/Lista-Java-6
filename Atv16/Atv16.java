public class Atv16 {
    public static void main(String[] args) {
        double media = 0;
        int contador = 0;

        for (int i = 15; i <= 100; i++) {
            contador++;
            media += i;

        }
        System.out.println(media / contador);
    }
}
