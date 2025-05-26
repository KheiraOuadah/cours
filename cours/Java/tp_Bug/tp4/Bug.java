/**
 * Created by zulupero on 20/06/16.
 */
import java.awt.Color;
public class Bug extends Buggle {
    public Bug(int posx, int posy, int dir) {
        super(posx, posy, dir);
    }

    public void enRoute() {
	setVitesse(15);
	setX(9);
	double coefcouleur =255;
	double pas= 12.7;
	int nbtour = 0;

	while(nbtour<10){
	    coefcouleur= coefcouleur - pas;
	    Color c = new Color(0,(int)coefcouleur,0);
	    setCouleur(c);
	    baisseBrosse();
	    for(int i=0;i<4;i++){
	    }
	    nbtour++;
	    System.out.println("fin du tour n°"+nbtour);
	}

    }
}


