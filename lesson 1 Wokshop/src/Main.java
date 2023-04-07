public class Main {
    public static void main(String[] args) {
        // Data Types
        // string
        // string is a char array
        System.out.println("Wolcome Etiya academy");
        System.out.println("-------------------------------------------");
        // intager
        byte number1 = 0; // -128 to 127  1 byte
        short number2 = 11111; // 2 byte
        int number3 = 1111111111; // 4 byte
        System.out.println(number1);
        char latter = 'E';
        System.out.println(latter);
        System.out.println("-------------------------------------------");

        // if block

        String password = "";
        if (password == "") {
            System.out.println("password is empty. Enter password pls");
        } else if (password == "11111") {
            System.out.println("Login is success");
        } else {
            System.out.println("Try Again");
        }
        System.out.println("-------------------------------------------");

        // loop and array
        // find big number app
        short[] numbers = {1, 25, 88, 52, 12, 109, 256};
        int currentNumber = 0;

        for (short number : numbers) {
            if (number > currentNumber) {
                currentNumber = number;
            }
        }
        System.out.println("Big number:" + currentNumber);
        System.out.println("-------------------------------------------");

        //string process

        String text = "Akademiye merhaba      ";

        System.out.println(text.trim()); // clear gap
        System.out.println(text.charAt(8));
        System.out.println("leng"+text.length());
        System.out.println(text.toUpperCase()); // makes every word big
        System.out.println(text.contains("as")); // find
        System.out.println(text.isEmpty()); //null?
        System.out.println(text.concat("efe")); // add
        // etc.

        System.out.println("-------------------------------------------");
        // Calculator app
        System.out.println("Result: "+  Addition(1, 5, 7, 9));
        System.out.println("Result: "+  Multiplication(1, 5, 7, 9));


    }

    public static int Multiplication(int... numbers) {
        int total = 1;
        for (int number : numbers) {
            total *= number;
        }
        return total;
    }

    public static int Addition(int... numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }
}