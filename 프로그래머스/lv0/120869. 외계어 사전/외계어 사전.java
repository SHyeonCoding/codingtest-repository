import java.util.Arrays;

class Solution {
    public int solution(String[] spell, String[] dic) {
        Arrays.sort(spell);
        
        for(int i = 0; i < dic.length; i++) {
            if(dic[i].length() != spell.length) continue;
            
            String[] arr = dic[i].split("");
            Arrays.sort(arr);
            
            if(Arrays.equals(spell, arr)) return 1;
        }
        return 2;
    }
}