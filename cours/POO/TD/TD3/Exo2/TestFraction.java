
public class TestFraction {

    public static void main(String[] args) {
        Fraction t1 = new Fraction(2, 3);

        Fraction t2 = new Fraction(t1) //copie d'une fraction par le bon constructeur

        Fraction t3 = new Fraction();
        t3.init();

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

    }
}
