public class PGCD {
    public static int pgcd(int a, int b) {
        if (b == 0) return a;
        return pgcd(b, a % b);
    }

    public static void main(String[] args) {
        int a = 56, b = 24;
        if (a < b) { 
            int temp = a;
            a = b;
            b = temp;
        }
        System.out.println("PGCD de " + a + " et " + b + " est : " + pgcd(a, b));
    }
}
