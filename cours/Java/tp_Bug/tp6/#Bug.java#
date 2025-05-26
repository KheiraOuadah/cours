/**
 * Created by zulupero on 20/06/16.
 */
public class Bug extends Buggle {
    public Bug(int posx, int posy, int dir) {
        super(posx, posy, dir);
    }

     public void enRoute() {
        String mot_bin = "";
	int  mot_dec = 0;
        setVitesse(999999999);
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
	if (isSurBiscuit())
	    mot_bin += "1";
	else
	    mot_bin += "0";
        }
	mot_dec = binaryString2IntNatural(mot_bin);
	message("j'ai lu "+mot_bin);
	message("et sa représentation décimale est "+mot_dec);
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
    public int binaryString2IntNatural(String mot_bin){
	int taille  = mot_bin.length() ;
	int decimal = 0;
	int multip = 1;
	for(int i= taille - 1; i>=0; i--){
	    if(mot_bin.charAt(i) == '1')
		decimal += multip;
	    multip *=2;
	}
	return decimal;
    }
}
