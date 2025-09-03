import java.awt.event.MouseEvent;


public class Balle {

    public static void main(String[] args) {
		StdDraw.enableDoubleBuffering();

		// valeurs initiales. Pas en constantes car on peut éventuellement les prendre en ligne de commande
		double radius = 0.05;
		// gravité
		double g = 0.003;
		// elasticité <==> perte d'énergie au rebond
		double elast = 0.90;
		// frottements visqueux
		double frots = 1.0;
		// résidu de vitesse
		double epsilonV = 0.00001;

		double[] p = new double[2];
		double[] v = new double[2];

		// échelles de la fenêtre
		StdDraw.setXscale(-1.0 - radius, 1.0 + radius);
		StdDraw.setYscale(-1.0 - radius, 1.0 + radius);

		StdDraw.setPenColor(StdDraw.BLACK);

		while (true) {
			dragMouse(p, v);
			StdDraw.filledCircle(p[0], p[1], radius);
			do {

				// rebond sur murs verticaux
				if (Math.abs(p[0] + v[0]) >= 1.0) {
					v[0] = -elast * v[0];
					v[1] = elast * v[1];
				}
				//rebond sur murs horizontaux
				else if (Math.abs(p[1] + v[1]) >= 1.0) {
					v[0] = elast * v[0];
					v[1] = -elast * v[1];
				}

				v[1] = v[1] - g;

				// frottements visqueux (résistance de l'air)
				v[0] *= frots;
				v[1] *= frots;

				// mise à jour position
				p[0] += v[0];
				p[1] += v[1];

				if (p[1] < -1.0) p[1] = -1.0;

				// effacer la fenêtre
				StdDraw.clear(StdDraw.GRAY);
				// dessiner la balle
				StdDraw.setPenColor(StdDraw.BLACK);
				StdDraw.filledCircle(p[0], p[1], radius);

				// rafraichissement chaque 20ms
				StdDraw.show();
				StdDraw.pause(20);
			} while ((v[0] * v[0] + v[1] * v[1]) > epsilonV);
			StdDraw.clear();
		}
	}

    /**
     * Methode pour gérer un drag'n drop avec les capacités rudimentaires de StdDraw
     * @param p tableau des coordonnées du point cliqué
     * @param d tableau des coordonnées du vecteur 'dragué'
     */
    public static void dragMouse(double[] p, double[] d){
        boolean isDragging = false;
		boolean endDragging = false;
        while (!endDragging) {
            // clic initial
            if (StdDraw.isMousePressed() && !isDragging) {
                p[0] = StdDraw.mouseX();
                p[1] = StdDraw.mouseY();
                isDragging = true;
            }

            // tire un segment avec la souris (dragging)
            else if (StdDraw.isMousePressed() && isDragging) {
                d[0] = StdDraw.mouseX() - p[0];
                d[1] = StdDraw.mouseY() - p[1];
                StdDraw.clear();
                StdDraw.line(p[0], p[1], StdDraw.mouseX(), StdDraw.mouseY());
                StdDraw.show();
                StdDraw.pause(50);
            }

            // relache la souris
            else if (!StdDraw.isMousePressed() && isDragging) {
                isDragging = false;
				endDragging = true;
            }
        }

		isDragging = false;
		endDragging = false;
    }

}
