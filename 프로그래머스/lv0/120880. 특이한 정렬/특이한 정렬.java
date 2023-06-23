import java.util.Arrays;

class Solution {
    public int[] solution(int[] numlist, int n) {
        double[] newArr = new double[numlist.length];
        int[] answer = new int[numlist.length];
        
        for(int i = 0; i < newArr.length; i++) {
            int x = Math.abs(numlist[i] - n);
            newArr[i] = numlist[i] - n < 0 ? x + 0.5 : x;
        }
        
        Arrays.sort(newArr);
        
        for(int i = 0; i < numlist.length; i++) {
            if(newArr[i] % 1 != 0) answer[i] = n - (int) newArr[i];
            else answer[i] = (int) newArr[i] + n;
        }
        
        return answer;
    }
}