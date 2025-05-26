public class BadCode_etu {

    public static void main(String[] args) {
        BadCode_etu example = new BadCode_etu();

        example.displayMessage("Hello, John!");
        example.displayMessage("Hello, Alice!");
        example.displayMessage("Hello, Mike!");

        example.processAction("start");

        example.complexMethod(5, 10);

        example.loopExample();

        example.alwaysFalseCondition();


        example.unusedVariables();
    }

    public void displayMessage(String message) {
        System.out.println(message);
        System.out.println("This is a message");
        System.out.println("Message length: " + message.length());
    }

    public void processAction(String action) {
        switch (action) {
            case "start":
                System.out.println("Starting...");
                break;
            case "stop":
                System.out.println("Stopping...");
                break;
            case "pause":
                System.out.println("Pausing...");
                break;
            default:
                System.out.println("problem...");
                break;
        }
    }

    public int complexMethod(int a, int b) {
        int result = 0;

        if (a > 5) {
            complexMethod1(result,a,b);

        } else {
            complexMethod2(result,a,b);
        }

        if (result > 50) {
            complexMethod3(result,a,b);
        } else if (result < 0) {
            complexMethod4(result,a,b);

        }

        if (a == b) {
            complexMethod5(result,a,b);
        } else {
            result -= (a + b) * 2;
        }
        System.out.println(result);
        return result;

    }
    public int complexMethod1(int result, int a, int b){
        for (int i = 0; i < a; i++) {
            if (i % 2 == 0) {
                result += i * b;
            } else {
                result -= i * a;
            }
        }
        return result;
    }
    public int complexMethod2(int result,int a, int b){
        for (int i = a; i < b; i++) {
            if (i % 3 == 0) {
                result += i + a;
            } else {
                result -= i - b;
            }

            for (int j = 0; j < i; j++) {
                result += j;
                if (j % 2 == 0) {
                    result -= a * j;
                }
            }
        }
        return result;
    }
    public int complexMethod3(int result,int a, int b){
        for (int k = 0; k < 10; k++) {
            if (k % 2 == 0) {
                result += k * a;
            } else {
                result -= k * b;
            }
            if (result > 100) {
                break;
            }
        }
        return result;
    }
    public int complexMethod4(int result,int a, int b){
        for (int l = b; l > 0; l--) {
            result += l;
            if (l % 5 == 0) {
                result -= l * a;
            } else {
                result += l * b;
            }
        }
        return result;
    }
    public int complexMethod5(int result,int a, int b){
        for (int m = 1; m <= a; m++) {
            result += m * (a - b);
        }
        return result;
    }




    public void loopExample() {
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
            i += 2;
        }
    }

    public void alwaysFalseCondition() {
        int count = 0;
        while (count < 1) {
            System.out.println("This will never execute");
            count++;
        }
    }

    public void unusedVariables() {
        int unusedInt = 100;
        String unusedString = "Goodbye";
        if (unusedString.equals("Goodbye")) {
            System.out.println("This will never be printed" + unusedInt);
        }
    }
}