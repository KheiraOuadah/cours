
/// RÉPONSES AUX QUESTIONS 
/// 1 - 
/// 2 - L'instruction 3 renvoie "pas ok" car p1 == p2 compare deux références différentes
/// 2 - L'instruction 4 renvoie "ok" car p1.egaleA(p2) compare les valeurs auxquelles elles renvoient soit (12, 17)
/// 3 - Moralité : le "==" n'est pas pour les objets, uniquement pour les types primitifs

public class PointPlan {

    private float abscisse;
    private float ordonnee;

    public PointPlan(float x, float y) {
        this.abscisse = x;
        this.ordonnee = y;
    }

    public PointPlan() {
        this.abscisse = 0;
        this.ordonnee = 0;
    }

    public PointPlan(PointPlan p) {
        this.abscisse = p.abscisse;
        this.ordonnee = p.ordonnee;
    }

    public boolean egaleA(PointPlan p) {
        return (this.abscisse == p.abscisse && this.ordonnee == p.ordonnee);

    }
}
