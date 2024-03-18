class Solution {
    public int minFlips(int a, int b, int c) {
        
    int flips = 0;
        
        int result = a | b;
        
        
        if ((result ^ c) == 0)
            return flips;
        
        
        for (int i = 0; i < 32; i++) {
            int bitA = (a >> i) & 1;
            int bitB = (b >> i) & 1;
            int bitC = (c >> i) & 1;
            
            
            if (bitC == 1) {
                
                if (bitA == 0 && bitB == 0)
                    flips++;
            } else {
                
                if (bitA == 1 && bitB == 1)
                    flips += 2; 
                else if (bitA == 1 || bitB == 1)
                    flips++; 
            }
        }
        
        return flips;
    }
    
}