public class Swapping {
    public static void main(String[] args) {
        // swapping using XOR operator
        int x = 9;
        int y = 12;
        System.out.println("Before swap X: "+x+" : Y: "+y);
        x = x^y;
        y = x^y;
        x = x^y;
        System.out.println("After swap X: "+x+" : Y: "+y);
    }    
}
