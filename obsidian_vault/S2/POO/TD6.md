méthode equals :

public class Personne  
{  
    protected String nom;  
    protected int age;
    ...
    public boolean equals(Object o)  
	{  
    if(o == null) return false;  
    if(!(o instanceof Personne)) return false;  
    //demande au compilateur de considérer o comme une Personne  
    Personne p = (Personne)o;  
    return (this.nom.equals(p.nom) && this.age == p.age);  
	}
}

public class Salarie extends Personne{  
    private String unNumeroSecu;  
    private String unEmployeur;
    ...
    @Override
	public boolean equals(Object o) {  
    if(o ==null) return false;  
    if(!(o instanceof Salarie)) return false;  
    return (super.equals(o)  
            && this.unNumeroSecu.equals(((Salarie)o).unNumeroSecu)  
            && this.unEmployeur.equals(((Salarie)o).unEmployeur));  
	}

**Héritage :**

public class Personne  
{  
    protected String nom;  
    protected int age;
    public Personne(){  
    //construit par défaut  
	}
}

public class Salarie extends Personne{  
    private String unNumeroSecu;  
    private String unEmployeur;  
  
	public Salarie() {  
    // puisque classe descendant de personne   
    // prend le constructeur par défaut de Personne   
    // et initialise tout seul les 4 attributs  
	}

#### classe Object
classe mère de toutes les autres classe