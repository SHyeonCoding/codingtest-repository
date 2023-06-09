import java.util.Arrays;

class Solution {
    public String[] solution(String[] str_list) {
        int l = Arrays.asList(str_list).indexOf("l");
        int r = Arrays.asList(str_list).indexOf("r");
        
        if(l == -1 && r == -1) return new String[]{};
        
        if(l == -1) l = 20;
        if(r == -1) r = 20;
        
        return l < r ? Arrays.copyOfRange(str_list, 0, l) : Arrays.copyOfRange(str_list, r + 1, str_list.length);
    }
}