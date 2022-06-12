public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        HashMap<Integer, Integer> hm = new HashMap<>();
      
        int xorr = 0;
        int count = 0;
        
        for (int i = 0; i < A.size(); i++) {
            xorr ^= A.get(i);
            
            count += hm.getOrDefault(xorr ^ B, 0);
            
            if (xorr == B) count++;
            
            hm.put(xorr, hm.getOrDefault(xorr, 0) + 1);
        }
        
        return count;
    }
}
