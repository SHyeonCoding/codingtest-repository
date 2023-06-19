import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        if(array.length == 1) return array[0];
        Arrays.sort(array);
        int answer = -1;
        int cnt = 1;
        int max = 0;
        
        for(int i = 1; i < array.length; i++) {
            if(array[i - 1] == array[i]) {
                cnt++;
                if(cnt > max) {
                    max = cnt;
                    answer = array[i];
                } else if(cnt == max) {
                    answer = -1;
                }
            } else cnt = 1;
        }
        
        return answer;
    }
}