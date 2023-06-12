import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList();
        
        int i = 0;
        while(i < arr.length) {
            if(list.size() == 0) list.add(arr[i]);
            else if(list.get(list.size() - 1) == arr[i]) list.remove(list.size() - 1);
            else list.add(arr[i]);
            i++;
        }
        
        return list.size() == 0 ? new int[]{-1} : list.stream().mapToInt(x -> x).toArray();
    }
}