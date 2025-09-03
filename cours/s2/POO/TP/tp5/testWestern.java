public class testWestern {
    public static void main(String[] args) {
        Dame d = new Dame("Agnès","jaune");
        Brigand br = new Brigand("Barbarus");
        Cowboy cb = new Cowboy("Skibidi");
        Dame d2 = new Dame("katrine","rouge");

        System.out.println(d.sePresente());

        System.out.println(br.kidnappe(d));


        System.out.println(d2.sePresente());
        System.out.println(br.kidnappe(d2));
        System.out.println(br.sePresente());

        System.out.println(cb.tireSurBrigand(br));
        System.out.println(cb.libereDame(d,br));
        System.out.println(cb.libereDame(d2,br));
        System.out.println(cb.sePresente());




    }
}
