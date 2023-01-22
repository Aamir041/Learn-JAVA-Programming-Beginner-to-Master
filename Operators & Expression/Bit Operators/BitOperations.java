public class BitOperations {
    public static void main(String[] args){
        int x = 0b100; // 4 in binary
        int z = x<<1; // left shift x by 1 doubles the number
        System.out.println(z); 
        
        z = x>>1; // right shift x by 1 half's the number
        System.out.println(z);
        
        z = x<<2; // left shift x by 2 makes it 4 times
        System.out.println(x);

        int a = -10;
        int b = a>>1; // signed right shift
        System.out.println(Integer.toBinaryString(b));
        int k = a>>>1; // unsigned right shift
        System.out.println(String.format("%32s", Integer.toBinaryString(k)) );

        int m = 0b1010;
        int n = ~m; // not operation increments a number by 1 and inverts its sign.
        System.out.println(n);
    }    
}
