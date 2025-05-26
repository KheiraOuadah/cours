/**
 * Created by zulupero on 20/06/16.
 */
public class Bug extends Buggle {
    public Bug(int posx, int posy, int dir) {
        super(posx, posy, dir);
     }

    public void enRoute() throws InterruptedException {
	
	int annee;

            while (Main.input.hasNext()) { // lit une ligne du fichier
                annee = Integer.valueOf(Main.input.next());
		if (annee%100==0)
		    System.out.println(annee+" n'est pas bissextile");
		else
			
		    if((annee%4==0)||(annee%400==0))
			System.out.println(annee+" est bissextile");
            
            }
	    System.out.println("terminé chef");
    }
}
