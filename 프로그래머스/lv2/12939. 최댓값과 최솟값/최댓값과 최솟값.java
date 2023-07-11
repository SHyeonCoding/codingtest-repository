import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String[] strArr = s.split(" ");
        int[] intArr = new int[strArr.length];
        
        for(int i = 0; i < strArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }
    
        Arrays.sort(intArr);
        return intArr[0] + " " + intArr[intArr.length - 1];
    }
}