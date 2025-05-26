import java.util.Scanner;

/**
 * Created by zulupero on 20/06/16.
 */
public class Bug extends Buggle {
    public Bug(int posx, int posy, int dir) {
        super(posx, posy, dir);
    }

    public void enRoute() throws InterruptedException {
        int a;
        int b;
        int c;
        while (Main.input.hasNext()) { // lit une ligne du fichier
            a = Integer.valueOf(Main.input.next());
            b = Integer.valueOf(Main.input.next());
            c = Integer.valueOf(Main.input.next());
            /* calcul à intégrer ici*/
	    if((a >= 13 && a <= 19) ||(b >= 13 && b <= 19)|| (c >= 13 && c <= 19)){
		    System.out.println("ado");
			}
	    else{
	        System.out.println("pas ado");
		    }
	    
            
        }

    }
}
