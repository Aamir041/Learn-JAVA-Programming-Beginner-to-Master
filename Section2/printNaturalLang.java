import java.lang.*;
// lec number : 18
public class printNaturalLang {
    public static void main(String[] args) {
        char x = 0x0370; // its a hexadecimal number for a greek letter 
        System.out.println(x);

        // printing every letter from greek language
        for(char c = 0x0370; c<=0x03FF; c++){
            System.out.print(c + " ");
        }
    }
}
