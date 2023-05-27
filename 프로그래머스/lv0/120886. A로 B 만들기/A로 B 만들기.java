import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        String[] arr1 = before.split("");
        String[] arr2 = after.split("");
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        
        return Arrays.toString(arr1).equals(Arrays.toString(arr2)) ? 1 : 0;
    }
}