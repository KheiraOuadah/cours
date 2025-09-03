
public class TestCommunicationInter {
    public static void main(String[] args) {
        CommunicationInter appel1 = new CommunicationInter(50,"0631952700","Allemagne",0.03);
        System.out.println(appel1.toString());
        System.out.println("prix de l'appel : "+ appel1.prixCommunication());


    }
}
