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
	int vie = 9;
	// while(!isfaceMur())
	while(nbBiscuit<4 && !isFaceMur()){
	    if( getCouleurSol().equals(StdDraw.YELLOW) ){
		if(vie==0){
		    setCouleur(StdDraw.BLACK);
		    baisseBrosse();
		    return;
		}
		vie--;

	    }
	    avance();
	    nbPas ++;
	    if(isSurBiscuit()){
		prendBiscuit();
		nbBiscuit++;
	    
	
         if( getCouleurSol().equals(StdDraw.YELLOW) ){
	   if(vie==0){
	   setCouleur(StdDraw.BLACK);
	    baisseBrosse();
	    return;
	   }
	 }
	droite();
	droite();
	while(nbPas > 0){
	     avance();
	     nbPas --;
	     if( getCouleurSol().equals(StdDraw.YELLOW) ){
		if(vie==0){
		    setCouleur(StdDraw.BLACK);
		    baisseBrosse();
		    return;
		}
	     }
	}
	droite();
	droite();
    }
}
    }

}


