import java.util.Arrays;

public class CrossCorrelation2 {
    /**
     * Calcule la corrélation croisée entre deux signaux audio en utilisant la FFT
     * @param sig1 Premier signal
     * @param sig2 Second signal
     * @return Tableau contenant les valeurs de corrélation pour chaque offset
     * @throws IllegalArgumentException si les signaux n'ont pas la même longueur
     */
    public static double[] crosscorrelation(double[] sig1, double[] sig2) {
        if (sig1.length != sig2.length) {
            throw new IllegalArgumentException("Les signaux doivent avoir la même longueur. " +
                    "Longueur sig1 : " + sig1.length + ", Longueur sig2 : " + sig2.length);
        }

        int n = sig1.length;
        int m = 1;
        while (m < n) m *= 2;
        m *= 2;  // Pour éviter le repliement

        // Création des tableaux complexes (partie réelle et imaginaire)
        double[] real1 = new double[m];
        double[] imag1 = new double[m];
        double[] real2 = new double[m];
        double[] imag2 = new double[m];

        // Copie des données d'entrée
        System.arraycopy(sig1, 0, real1, 0, n);
        System.arraycopy(sig2, 0, real2, 0, n);

        // Calcul des FFT
        fft(real1, imag1);
        fft(real2, imag2);

        // Multiplication complexe
        double[] realResult = new double[m];
        double[] imagResult = new double[m];
        for (int i = 0; i < m; i++) {
            realResult[i] = real1[i] * real2[i] + imag1[i] * imag2[i];
            imagResult[i] = imag1[i] * real2[i] - real1[i] * imag2[i];
        }

        // FFT inverse
        fft(realResult, imagResult);
        
        // Extraction du résultat
        double[] correlations = new double[n];
        for (int i = 0; i < n; i++) {
            correlations[i] = realResult[n-1-i] / m;
        }

        return correlations;
    }

    private static void fft(double[] real, double[] imag) {
        int n = real.length;
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (i < j) {
                // Échange des éléments
                double tempReal = real[i];
                double tempImag = imag[i];
                real[i] = real[j];
                imag[i] = imag[j];
                real[j] = tempReal;
                imag[j] = tempImag;
            }
            int k = n / 2;
            while (k <= j) {
                j -= k;
                k /= 2;
            }
            j += k;
        }

        // Calcul FFT
        for (int len = 2; len <= n; len *= 2) {
            double angle = -2 * Math.PI / len;
            for (int i = 0; i < n; i += len) {
                for (int k = 0; k < len/2; k++) {
                    int evenIndex = i + k;
                    int oddIndex = i + k + len/2;
                    double cos = Math.cos(angle * k);
                    double sin = Math.sin(angle * k);
                    
                    double oddReal = real[oddIndex] * cos - imag[oddIndex] * sin;
                    double oddImag = real[oddIndex] * sin + imag[oddIndex] * cos;
                    
                    real[oddIndex] = real[evenIndex] - oddReal;
                    imag[oddIndex] = imag[evenIndex] - oddImag;
                    real[evenIndex] += oddReal;
                    imag[evenIndex] += oddImag;
                }
            }
        }
    }

}