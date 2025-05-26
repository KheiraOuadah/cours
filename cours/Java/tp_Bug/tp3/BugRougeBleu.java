/**
 * Created by zulupero on 20/06/16.
 */
public class Bug extends Buggle {
    public Bug(int posx, int posy, int dir) {
        super(posx, posy, dir);
    }

    //final Scanner input = new Scanner(System.in);
    public void enRoute() throws InterruptedException {
        setVitesse(2);
        int j;
        int i;

        while (Main.input.hasNext()) { // lit une ligne du fichier
            j = Integer.valueOf(Main.input.next());
            i = Integer.valueOf(Main.input.next());
	    setX(j);
	    setY(i);
	    if((j<=2 && i<=1)||(j>2 && j<=8 && i<=7)||(j>=9 && i <=4))//si une des trois conditions == True alors on colorie en rouge
		setCouleur(StdDraw.RED);
	    else
		setCouleur(StdDraw.BLUE);
	    baisseBrosse();
	    leveBrosse();
            
        }   
    }
}
