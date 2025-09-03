import java.lang.Math;
import java.util.*;
public class Annee {
    
    public static void main(String[] args){
        ArrayList<Integer> micarremicube = new ArrayList<Integer>() ;
        int res = 0;
        for (int i = 1; i<2017 ; i++){
            for (int j = 1; j <2017;j++){
                res = (int)(Math.pow(i,2) + Math.pow(j,3));
                if (res < 2017){
                    micarremicube.add(res);
                }
            }
        }
        System.out.println(micarremicube);
    }
}
