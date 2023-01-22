public class MaskingMerging {
    public static void main(String[] args) {
        byte a = 9;
        byte b = 12;
        byte c;

        c = (byte) (a<<4); // << has least precedence there fore after just typecasting it would only treat a as byte and not 4 as byte therefore writing a<<4 in brackets makes typecast whole number

        c  = (byte) (c|b);
        System.out.println((c&0b11110000)>>4); // to check 9
        System.out.println((c&0b00001111)); // to check 12


    }
}
