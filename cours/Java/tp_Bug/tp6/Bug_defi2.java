/**
 * Created by zulupero on 20/06/16.
 */
public class Bug extends Buggle {
    public Bug(int posx, int posy, int dir) {
        super(posx, posy, dir);
    }

    public void enRoute() {
        setVitesse(15);
        setCouleur(StdDraw.GRAY); // la couleur de la brosse après passage
        setX(8); setY(0);         // position initale
        baisseBrosse();
	
        while(isFaceSnake()) {
            avance();
	    for(int i= 0;i<4;i++)
	        if (!isFaceSnake())
		    droite();
	        else
		    break;
        }
        if (isSurBiscuit()) prendBiscuit();
    }

    /**
     * isFaceSnake
     * @return true si la case devant le bug appartient au serpent
     */
    public boolean isFaceSnake(){
	    boolean result = false;
	    leveBrosse();
	    if(isFaceMur())
		return false;
	    avance();
	    if(getCouleurSol() == StdDraw.GREEN)
		result = true  ;
	    droite();
	    droite();
	    avance();
	    gauche();
	    gauche();
	    baisseBrosse();
	    return result;
    }
}
