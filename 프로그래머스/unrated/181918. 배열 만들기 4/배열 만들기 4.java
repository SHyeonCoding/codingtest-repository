import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList();
        
        int i = 0;
        
        while(i < arr.length) {
            if(list.isEmpty() || list.get(list.size() - 1) < arr[i]) {
                list.add(arr[i]);
                i++;
            } else {
                list.remove(list.size() - 1);
            }
        } 
        
        return list.stream().mapToInt(x -> x).toArray();
    }
}