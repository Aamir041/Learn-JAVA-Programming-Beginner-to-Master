public class studentChallenge2 {
    public static void main(String[] args) {
        String binaryString = "1101";
        System.out.println("Binary String: " + binaryString.matches("[01]+"));
        
        String notBinaryString = "002020";
        System.out.println("Not Binary String: "+notBinaryString.matches("[01]+"));

        String hexaDecimal = "B561";
        System.out.println("Hexadecimal : "+ hexaDecimal.matches("[0-9A-F]*")); 

        String date = "18/08/2001";
        System.out.println("Date: "+ date.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}"));

    }
}
