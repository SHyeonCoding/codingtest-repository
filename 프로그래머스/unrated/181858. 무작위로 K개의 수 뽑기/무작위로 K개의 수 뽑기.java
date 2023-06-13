import java.util.LinkedHashSet;
import java.util.Iterator;

class Solution {
    public int[] solution(int[] arr, int k) {
        LinkedHashSet<Integer> list = new LinkedHashSet();
        int[] answer = new int[k];
        
        for(int i : arr) {
            list.add(i);
        }
        
        Iterator iter = list.iterator();        
        for(int i = 0; i < k; i++) {
            if(iter.hasNext()) answer[i] = (int)iter.next();
            else answer[i] = -1;
        }
        
        return answer;
    }
}