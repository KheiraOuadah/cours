import java.util.function.Consumer;
import java.util.function.Function;
import java.util.*;
public class Profiler {
    static long globalTime = 0 ;
    static int counter = 0;

    public static long getGlobalTime(){
        return globalTime;
    }
    public static long moyenne(){
        long moy = globalTime/counter;
        return moy;
    }


//    public static double analyses(Function<Double, Double> oneMethod, double p){
//        long save_date = timestamp();
//        double res = oneMethod.apply(p);
//        System.out.println("[Profiler]"+(timestamp()-save_date) );
//        return res;
//    }
//    public static int[] analyse(Function<int[],int[]> oneMethod, int[] p){
//        long save_date = timestamp();
//        int[] res = oneMethod.apply(p);
//        System.out.println("[Profiler]"+(timestamp()-save_date)/1e9 + "s" );
//        return res;
//    }

    // traceSegments
//    public static void analyse(Consumer<Double> oneMethod, double p) {
//        long save_date = timestamp();
//        oneMethod.accept(p);
//        System.out.println(timestamp()-save_date);
//    }
    //tireProba
    public static boolean analyse(Function<Double,Boolean> oneMethod, double p) {
        long save_date = timestamp();
        boolean res = oneMethod.apply(p);
        System.out.println(timestamp() - save_date);
        counter++;
        globalTime += (timestamp() - save_date);

        return res;
    }


    /**
     * Si clock0 est >0, retourne une chaîne de caractères
     * représentant la différence de temps depuis clock0.
     * @param clock0 instant initial
     * @return expression du temps écoulé depuis clock0
     */
    public static String timestamp(long clock0) {
        String result = null;

        if (clock0 > 0) {
            double elapsed = (System.nanoTime() - clock0) / 1e9;
            String unit = "s";
            if (elapsed < 1.0) {
                elapsed *= 1000.0;
                unit = "ms";
            }
            result = String.format("%.4g%s elapsed", elapsed, unit);
        }
        return result;
    }

    /**
     * retourne l'heure courante en ns.
     * @return
     */
    public static long timestamp() {
        return System.nanoTime();
    }
}
