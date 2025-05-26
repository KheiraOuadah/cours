public class Inverser {

    

    public static void main(String[] args){
        int[] tab = {1,2,3,4,5,6,7};
        for(int i =0;i<tab.length/2;i++){
            int temp = tab[i];
            tab[i] = tab[tab.length -i-1];
            tab[tab.length -i-1] = temp;
        }

        for (int elem:tab){
            System.out.println(elem + "");
        }
    }


}
