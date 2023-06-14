import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> list = new ArrayList();
        
        for(int i = l; i <= r; i++) {
            if(i % 5 == 0) {
                boolean checked = true;
                String s = i + "";
            
                for(int j = 0; j < s.length(); j++) {
                    if(s.charAt(j) != '0' && s.charAt(j) != '5') {
                        checked = false;
                        break;
                    }
                }
            
                if(checked) list.add(Integer.parseInt(s));
            }
        } 
        
        return list.size() == 0 ? new int[]{-1} : list.stream().mapToInt(i -> i).toArray();
    }
}