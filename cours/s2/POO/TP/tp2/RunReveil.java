public class RunReveil {
    public static void main(String[] args) {
        Reveil r1 = new Reveil();
        Reveil r2 = new Reveil();

        System.out.println("État initial de r1 : " + r1);
        System.out.println("État initial de r2 : " + r2);

        int[][] testCases = {{0, 0, 0}, {23, 59, 59}, {21, 59, 59}, {20, 18, 59}, {20, 15, 45}};
        for (int[] test : testCases) {
            r1.setHoraireCourant(test[0], test[1], test[2]);
            System.out.print("Avant incrémentation : " + r1);
            r1.incrementer();
            System.out.println(" => Après incrémentation : " + r1);
        }

        r1.setHoraireCourant(12, 30, 15);
        r2.setHoraireCourant(12, 30, 15);
        System.out.println("\nComparaison de r1 et r2 : " + r1.comparerA(r2));
        System.out.println("Différence entre r1 et r2 : " + r1.differenceAvec(r2) + " secondes");

        r2.setHoraireCourant(13, 15, 0);
        System.out.println("\nComparaison après changement de r2 : " + r1.comparerA(r2));
        System.out.println("Différence : " + r1.differenceAvec(r2) + " secondes");

        r1.setHoraireCourant(6, 28, 30);
        r1.setHoraireAlarme(6, 30, 0);
        r1.allumerAlarme();
        System.out.println("\nIncrémentation et test d'alarme...");
        for (int i = 0; i < 150; i++) {
            r1.incrementer();
            r1.controlerAlarme();
        }
    }
}
