public class TestClub {
    public static void main(String[] args) {
        Club c1 = new Club();

        c1.init();
        System.out.println(c1.toString());

        Club c2 = new Club(c1);
    }
}
