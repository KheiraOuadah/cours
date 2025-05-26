public class Distributeur {
    public static void main(String[] args) {
        int total = 100;
        int count = 0;

        for (int b20 = 0; b20 <= total / 20; b20++) {
            for (int b10 = 0; b10 <= total / 10; b10++) {
                for (int b5 = 0; b5 <= total / 5; b5++) {
                    if (b20 * 20 + b10 * 10 + b5 * 5 == total) {
                        System.out.println("20€ x " + b20 + " | 10€ x " + b10 + " | 5€ x " + b5);
                        count++;
                    }
                }
            }
        }

        System.out.println("Nombre total de combinaisons : " + count);
    }
}
