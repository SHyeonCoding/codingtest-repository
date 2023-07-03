import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> list = new HashSet();
        
        for(int i = 0; i < numbers.length - 1; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                list.add(numbers[i] + numbers[j]);
            }
        }
        
        int[] answer = new int[list.size()];
        int idx = 0;
        for(int i : list) {
            answer[idx++] = i;
        }
        
        Arrays.sort(answer);
        return answer;
    }
}