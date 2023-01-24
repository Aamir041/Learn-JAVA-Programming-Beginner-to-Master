public class normalPrint {
    public static void main(String[] args) {
        // println
        System.out.println("Prints with creating new Line");

        // print
        System.out.print("Prints without");
        System.out.print("creating new Line");
        System.out.println("");

        // precedence and concatenation
        int x = 10, y = 20;
        System.out.println(x + y + " : Sum");

        System.out.println("Sum : " + x + y);
        System.out.println("Sum : " + (x + y));
    }
}