import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        ArrayList<Integer> list = new ArrayList();
        
        for(int i = 0; i < my_string.length(); i++) {
            if(my_string.charAt(i) - '0' < 10) {
                list.add(Character.getNumericValue(my_string.charAt(i)));
            }
        }
        
        Integer[] arr = list.toArray(new Integer[list.size()]);
        Arrays.sort(arr);
        return Arrays.stream(arr).mapToInt(Integer::intValue).toArray();
    }
}