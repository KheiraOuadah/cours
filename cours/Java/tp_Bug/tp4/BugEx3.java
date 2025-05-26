/**
 * Created by zulupero on 20/06/16.
 */
public class Bug extends Buggle {
    public Bug(int posx, int posy, int dir) {
        super(posx, posy, dir);
    }

    public void enRoute() {
	setVitesse(5);
	int nbPas=0;
	// while(!isfaceMur())

	while(!isSurBiscuit()){/* ! car je ne veux pas qu'il soit face à un mur */
	    avance();
	    nbPas ++;
	}
	prendBiscuit();
	droite();
	droite();
	while(nbPas != 0){
	    avance();
	    nbPas --;
	}
	droite();
	droite();
    }
}
