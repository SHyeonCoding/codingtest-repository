class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] win = {6, 6, 5, 4, 3, 2, 1};
        int max = 0;
        int min = 0;
        
        for(int i = 0; i < lottos.length; i++) {
            if(lottos[i] == 0) {
                max++;
                continue;
            }
            for(int j = 0; j < win_nums.length; j++) {
                if(lottos[i] == win_nums[j]) {
                    max++;
                    min++;
                    break;
                }
            }
        }
        
        return new int[]{win[max], win[min]};
    }
}