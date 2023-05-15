class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int min = Integer.MAX_VALUE;
        
        for(int num : array) {
            if(Math.abs(num - n) < min) {
                answer = num;
                min = Math.abs(num - n);
            }
            if((Math.abs(num - n) == min) && (num < n)) answer = num;
        }
        
        return answer;
    }
}