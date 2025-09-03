public class Cycloide {

    static double transformex(double xA, double tps, double rayon,
    double freq, double theta,int N){
        // retourne xB
        return xA+rayon*Math.cos((2*Math.PI*freq*tps/N)+theta);
    }

    public static void main(String[] args) {
        StdDraw.clear();
        StdDraw.setXscale(-200, 200);
        StdDraw.setYscale(-200, 200);
        int N = 300;
        //données cercle 1 
        int r1 = 100;
        int f1 = 1;//fréquence réduite

        for(t=0;t<N-1;t++){
            StdDraw.clear();

        }
    }
}
