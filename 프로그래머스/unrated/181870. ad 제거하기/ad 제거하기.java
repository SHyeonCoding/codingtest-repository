import java.util.ArrayList;

class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> list = new ArrayList();
        
        for(String s : strArr) {
            if(!s.contains("ad")) list.add(s);
        }
        
        return list.stream().toArray(String[]::new);
    }
}