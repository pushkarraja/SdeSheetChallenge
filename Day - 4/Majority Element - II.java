public class Solution 
{
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) 
    {
        int length = arr.size();
        int majorValue = length / 3;
        
        int firstMajor = Integer.MAX_VALUE, secondMajor = Integer.MAX_VALUE, 
        firstSum = 0, secondSum = 0;
        
        for (int x : arr) {
            if (x == firstMajor) {
                firstSum++;
            } else if (x == secondMajor) {
                secondSum++;
            } else if (firstSum == 0) {
                firstMajor = x;
                firstSum = 1;
            } else if (secondSum == 0) {
                secondMajor = x;
                secondSum = 1;
            } else {
                firstSum--;
                secondSum--;
            }
        }
        
        firstSum = 0;
        secondSum = 0;
        
        for (int x : arr) {
            if (x == firstMajor) {
                firstSum++;
            } else if (x == secondMajor) {
                secondSum++;
            }
        }
        
        ArrayList<Integer> returnList = new ArrayList<>();
        
        if (firstSum > majorValue) {
            returnList.add(firstMajor);
        }
        if (secondSum > majorValue) {
            returnList.add(secondMajor);
        }
        
        return returnList;
        
    }
}
