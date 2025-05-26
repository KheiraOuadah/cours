import java.util.Arrays;

public class CrossCorrelation1 {

    /**
     * Calcule la corrélation croisée entre deux signaux audio (de même longueur)
     * @param sig1 Premier signal
     * @param sig2 Second signal 
     * @return Tableau contenant les valeurs de corrélation pour chaque offset (saut)
     * @throws IllegalArgumentException si les signaux n'ont pas la même longueur
     */
    public static double[] crosscorrelation(double[] sig1, double[] sig2) {

        if (sig1.length != sig2.length) {
            throw new IllegalArgumentException("Les signaux doivent avoir la même longueur. " +
                "Longueur sig1 : " + sig1.length + ", Longueur sig2 : " + sig2.length);
        }

        int n = sig1.length;
        double[] correlations = new double[n];
        for (int offset = n - 1; offset >= 0; offset--) {

            double correlation = 0.0;
            for (int i = 0; i < n - offset; i++) {
                correlation += sig1[i] * sig2[i + offset];
            }
            correlations[n - 1 - offset] = correlation ;
        }
    
        return correlations;
    }

}