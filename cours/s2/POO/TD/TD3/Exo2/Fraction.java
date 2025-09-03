
import javax.naming.LinkRef;
import java.util.Scanner;

public class Fraction {

    Scanner scan = new Scanner(System.in);
    private int numerateur;
    private int denominateur;

    public Fraction(int n, int d) {
        this.numerateur = n;
        this.denominateur = d;
    }

    public Fraction(Fraction f) { //copie d'une autre fraction
        this.numerateur = f.numerateur;
        this.denominateur = f.denominateur;
    }

    public Fraction() {
        this.numerateur = 4;
        this.denominateur = 8;
    }

    public void init() {
        this.numerateur = scan.next();
    }

    public String toString() {
        return this.numerateur + " / " + this.denominateur + " = " + this.fraction;
    }
}
