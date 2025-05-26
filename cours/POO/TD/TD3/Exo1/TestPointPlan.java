
public class TestPointPlan {

    public static void main(String[] args) {
        PointPlan p1 = new PointPlan(12, 17);
        PointPlan p2 = new PointPlan(12, 17);
        if (p1 == p2) {
            System.out.println("ok");
        } else {
            System.out.println("pas ok");

        }
        if (p1.egaleA(p2)) {
            System.out.println("ok");
        } else {
            System.out.println("pas ok");
        }
    } // fin main
} // fin classe testPointPlan

