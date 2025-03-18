public class Binary_Swap {
    public static int swapBits(int num, int i, int j) {

        int bit1 = (num >> i) & 1;
        int bit2 = (num >> j) & 1;
        
        if (bit1 != bit2) {
            int mask = (1 << i) | (1 << j);
            
            num ^= mask;
        }
        
        return num;
    }
    
    public static void main(String[] args) {
        int num = 0b101010; 
        int i = 1, j = 3;   
        
        System.out.println("Before swapping: " + Integer.toBinaryString(num));
        int swappedNum = swapBits(num, i, j);
        System.out.println("After swapping:  " + Integer.toBinaryString(swappedNum));
    }
}
