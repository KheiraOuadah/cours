import java.util.* ;
class Conversion {
   static final Scanner input = new Scanner(System.in);

   public static void main(String[] args) {
     int fahr;
     double celsius;
     
     input.useLocale(Locale.ROOT);

     System.out.println("Entrer une température en Fahrenheit : ");
     fahr = input.nextInt();
     celsius = 5.0/9 * (fahr - 32);

     System.out.println("Température en degrés celsius = " + celsius+ "°C");
         }
}
