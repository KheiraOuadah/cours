import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class CreateClass {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the class: ");
        String name = scanner.nextLine();
        System.out.println("Enter an attribute name: ");
        String attribute = scanner.nextLine();
        System.out.println("Enter an attribute type (String or int or float) : ");
        String attributeType = scanner.nextLine();
        Path path = Paths.get(name+".java");
        try {
            byte[] bs = getBytes(name, attributeType, attribute);
            Path writtenFilePath = Files.write(path, bs);
            System.out.println("Written content in file:\n"+ new String(Files.readAllBytes(writtenFilePath)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static byte[] getBytes(String name, String attributeType, String attribute) {
        String str = "import java.io.*;\n" +
                "import java.util.*;\n" +
                "public class "+ name +"{\n"+
                "   private "+ attributeType +" "+ attribute +";\n\n" +
                "   public "+ name +"(){\n";
        if (attributeType.equals("int")){
            str+= "       this."+attribute+" = 0;\n";
        }
        else if (attributeType.equals("float")){
            str+= "       this."+attribute+" = 0.0;\n";
        }
        else if (attributeType.equals("String")){
            str+= "       this."+attribute+" = \"\";\n";
        }
        str+= "   }\n\n"+
                "   public String print(){\n"+
                "       return \""+attribute+"\" + this."+attribute+";\n"+
                "   }\n\n"+

                "}";

        byte[] bs = str.getBytes();
        return bs;
    }
}
