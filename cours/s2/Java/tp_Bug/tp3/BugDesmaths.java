/**
 * Created by zulupero on 20/06/16.
 */
public class Bug extends Buggle {
    public Bug(int posx, int posy, int dir) {
        super(posx, posy, dir);
    }

    public void enRoute() throws InterruptedException {
            double op1, op2; // les opérandes
            char operateur;  // l'opérateur
            double resultat = 0.0; // pour ranger le résultat

            while (Main.input.hasNext()) { // lit une ligne du fichier
                op1 = Double.valueOf(Main.input.next());
                operateur = Main.input.next().charAt(0);
                op2 = Double.valueOf(Main.input.next());
		        if(operateur == '+')
		            resultat = op1 + op2;
	            if(operateur == '-')
		            resultat = op1 - op2;
		        if(operateur == '/')
		            resultat = op1 / op2;
		        if(operateur == 'x')
		            resultat = op1 * op2;
		           
		        /*switch(operateur){
		                case '+' : resultat=op1+op2;
		                           break;
		                case '-' : resultat=op1-op2;
		                           break;
		                case 'x' : resultat=op1*op2;
		                           break;
		     		    case '/' : resultat=op1/op2;
		                           break;
		                }
		               
		                System.out.println("op1"+" "+operateur+" "+op2+" = "+resultat);
		    */
		System.out.println(""+op1+" "+operateur+" "+op2+" = "+resultat);

		
            }
            
    }
}
