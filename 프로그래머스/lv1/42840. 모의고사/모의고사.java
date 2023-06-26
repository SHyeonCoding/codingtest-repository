import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        ArrayList<Integer> list = new ArrayList();
        
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int aCnt = 0;
        int bCnt = 0;
        int cCnt = 0;
        
        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == a[i % 5]) aCnt++;    
            if(answers[i] == b[i % 8]) bCnt++;    
            if(answers[i] == c[i % 10]) cCnt++;    
        }
        
        int max = Math.max(aCnt, Math.max(bCnt, cCnt));
        if(max == aCnt) list.add(1);
        if(max == bCnt) list.add(2);
        if(max == cCnt) list.add(3);
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}