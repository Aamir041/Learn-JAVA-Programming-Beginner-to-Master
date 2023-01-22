import java.lang.*;
// lec : 30
public class ArithmeticOperators {
    public static void main(String[] args) {
        int a = 4;
        int b = 2;

        int resultInt = a/b;
        System.out.println(resultInt);
        resultInt = a%b;
        System.out.println(resultInt);

        // typecasting
        float resultFloat = (float)a/b;
        System.out.println(resultFloat);
        resultFloat = (float)a%b;
        System.out.println(resultFloat);

        // float results
        float a1 = 14.3f;
        float b1 = 3.2f;
        resultFloat = a1/b1;
        System.out.println(resultFloat);
        resultFloat = a1%b1;
        System.out.println(resultFloat);

        // short = short + byte <= this will giver error, It has to be -> int = short/byte/int + short/byte/int

        // float = float + double <= is not possible, It has to be -> double = float + double

        // long = long + float <= is not possible, It has to be -> float = float + long

        int exp1 = 10+20/2;
        System.out.println("Answer of 10+20/2 : " + exp1 ); // 20

        int exp2 = (10+20)/2;
        System.out.println("Answer of (10+20)/2 : " + exp2); // 15

        // left to right precedence
        int exp3 = 10/2*5;
        System.out.println("Answer of 10/2*5 : "+ exp3); // 25
        int exp4 = 10/(2*5);
        System.out.println("Answer of 10/(2*5) : "+ exp4); // 1

        int exp5 = 5*5/6;
        System.out.println("Answer of 5*5/6 : " + exp5);
        int exp6 = 5*(5/6);
        System.out.println("Answer of 5*(5/6) : " + exp6);
    }    
}
