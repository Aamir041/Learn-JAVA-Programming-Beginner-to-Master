public class formatPrint {
    public static void main(String[] args) {
        
        // System.out.printf() & System.out.format() works the same
        // Format specifier syntax : %[argument index][flags][width][.precision]Conversions
        
                                        // Conversion
        
        // char -> c
        // char c = 'A';
        // System.out.printf("This is out char %c\n", c);

        // int -> d(decimal), o(octal), x(hexadecimal)
        // int number = 10;
        // System.out.printf("Number in decimal: %d\n", number);
        // System.out.printf("Number in octal: %o\n", number);
        // System.out.printf("Number in hexadecimal: %x\n", number);
        
        // float -> f(floating type), e(scientific format) 
        // float fNum = 123.56f;
        // System.out.printf("This is float type: %f\n", fNum);
        // System.out.printf("This is scientific representation: %e\n", fNum);
        
        // string -> %s
        // String name = "Aamir";
        // System.out.printf("%s\n",name);

                                   // Giving width to format specifier
        // System.out.printf("%10s\n", name);

                                             // Argument Index
        // System.out.printf("",[Arguments] <- these are arguments you wanna print);
        // int num1 = 10, num2 = 20;
        // System.out.printf("%2$d %1$d ", num1, num2);

        //  flags

        // 0 --> flag
        // int k = 9;
        // System.out.printf("%05d\n",k);

        // ( --> flag
        // int negativeNumber = -10;
        // int positiveNumber = 10;
        // System.out.printf("%(5d\n", positiveNumber); // -->   10
        // System.out.printf("%(5d\n",negativeNumber);  // --> (10)

        // + --> flag
        // int someNum1 = -10;
        // int someNum2 = 10;
        // System.out.printf("%5d %5d\n", someNum1, someNum2);
        // System.out.printf("%+5d %+5d", someNum1, someNum2);

        // - --> flag
        // String randomString = "JAVA";
        // System.out.printf("%10s\n", randomString);
        // System.out.printf("%-10s", randomString);

    }
}
