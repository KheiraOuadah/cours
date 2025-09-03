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
	int nbBiscuit = 0;
	// while(!isfaceMur())
	while(nbBiscuit<4 && !isFaceMur()){
	    avance();
	    nbPas ++;
	    if(isSurBiscuit()){
		prendBiscuit();
		nbBiscuit++;
	    }
	}
       
	droite();
	droite();
	while(nbPas > 0){
	    avance();
	    nbPas --;
	}
	droite();
	droite();
    }
}
