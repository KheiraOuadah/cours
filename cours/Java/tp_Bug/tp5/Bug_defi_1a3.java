/**
 * Created by zulupero on 20/06/16.
 */
import static java.lang.System.exit;
public class Bug extends Buggle {
    public Bug(int posx, int posy, int dir) {
        super(posx, posy, dir);
    }

    public void enRoute() {
	setVitesse(60);
	int nbessais = 0;
	int nbcogne= 0;
	    while(!isSurBiscuit()){
		double val_alea = Math.random()*3;
		int val_int_alea=(int)val_alea;
		nbessais++;
		if(val_int_alea == 0){
		    if(isFaceMur()){
			nbcogne++;
		    }
		    avance();
		    if(nbcogne==1000){
			System.out.println("j'ai mal à la tête");
			exit(1);
		    }
		}else if(val_int_alea == 1)
		    droite();
		else
		    gauche();
		if(nbessais ==3000){
		    exit(1);
		    System.out.println("j'ai mal à la tête, j'arrête là");
		}
	    }
	    if(isSurBiscuit()){
		prendBiscuit();
	        System.out.println("nbressai" + nbessais);
	    }

    }
}
