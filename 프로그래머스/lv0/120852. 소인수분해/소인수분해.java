import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        Set<Integer> list = new HashSet();
        
        for(int i = 2; i <= n; i++) {
            while(n % i == 0) {
                list.add(i);
                n /= i;
            }
        }
        
        Integer[] arr = list.toArray(new Integer[0]);
        Arrays.sort(arr);
        
        return Arrays.stream(arr).mapToInt(i -> i).toArray();
    }
}