public class Animal
{ private float poids;
   ...
   public void affiche( ) {...}
}
public class Mammifere extends Animal
{ private int nbMamelles ;
   public Mammifere(float p, int m)
   {
   super(p) ;
   this.nbMamelles = m ;
   }
   public void affiche( )
   { super.affiche( ) 
   System.out.println (this.mamelles) ;
   }
   }

 ==> La classe Mammifere est une extension de la classe Animal
 