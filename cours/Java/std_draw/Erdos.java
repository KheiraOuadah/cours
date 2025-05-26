import java.util.*;

public class Erdos {
	static final Random HASARD = new Random();

	// variable hasard prend val aleatoire entre 0 et 1.
	public static void main(String[] args) {
		if (args.length < 2) {
			System.out
					.println("Erreur : vous devez fournir deux arguments :Erdos.java <nombre de points> <probabilité>");
			return;
		}
		int nbPoints = Integer.parseInt(args[0]);
		double proba = Double.parseDouble(args[1]);
		StdDraw.setXscale(-1.2, 1.2);
		StdDraw.setYscale(-1.2, 1.2);
		final double penP = 0.01;
		final double penS = 0.002;
		// dessiner les points
		StdDraw.setPenRadius(penP);
		tracePoints(nbPoints);
		// dessiner les segments
		StdDraw.setPenRadius(penS);
		StdDraw.setPenColor(StdDraw.GRAY);
		traceSegments(nbPoints, proba);
	}

	public static boolean tireProba(double p) {
		if (HASARD.nextDouble() < p)
			return true;
		return false;
	}

	public static void tracePoints(int n) {
		final double angle_step = 2 * Math.PI / n;
		for (int i = 0; i < n; i++) {
			StdDraw.point(Math.cos(i * angle_step), Math.sin(i * angle_step));
		}
		StdDraw.show();
	}

	public static void traceSegments(int points, double p) {
		// StdDraw.line
		final double angle_step = 2 * Math.PI / points;

		for (int i = 0; i < points; i++) {
			double x1 = Math.cos(i * angle_step);
			double y1 = Math.sin(i * angle_step);

			for (int j = i + 1; j < points; j++) {
				double x2 = Math.cos(j * angle_step);
				double y2 = Math.sin(j * angle_step);

				if (tireProba(p)) {
					StdDraw.line(x1, y1, x2, y2);
				}
			}
		}

		StdDraw.show();
	}
}
