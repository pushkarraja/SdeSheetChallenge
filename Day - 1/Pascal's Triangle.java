class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();
        
        
        for (int i = 0; i < numRows; i++) {
            List<Integer> small = new ArrayList<Integer>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == j) {
                    small.add(1);
                } else {
                    small.add(pascal.get(i - 1).get(j - 1) + pascal.get(i - 1).get(j));
                }
            }
            
            pascal.add(small);
        }
        
        return pascal;
    }
}
