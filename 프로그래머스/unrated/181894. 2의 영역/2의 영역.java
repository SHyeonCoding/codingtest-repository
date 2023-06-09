import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int cnt = 0;
        int start = -1;
        int end = -1;
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 2) {
                if(start == -1) start = i;
                cnt++;
                end = i;
            }
        }
        
        return cnt == 0 ? new int[]{-1} : Arrays.copyOfRange(arr, start, end + 1);
    }
}