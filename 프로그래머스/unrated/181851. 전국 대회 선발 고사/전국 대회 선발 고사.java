class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int[] arr = new int[3];
        int cnt = 1;
        int idx = 0;
        
        while(idx < 3) {
            for(int i = 0; i < rank.length; i++) {
                if(rank[i] == cnt) {
                    if(attendance[i]) {
                        arr[idx++] = i;
                        break;
                    }
                }
            }
            cnt++;
        }
        
        return 10000 * arr[0] + 100 * arr[1] + arr[2];
    }
}