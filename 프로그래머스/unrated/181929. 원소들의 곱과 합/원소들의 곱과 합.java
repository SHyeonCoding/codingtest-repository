class Solution {
    public int solution(int[] num_list) {
        int result1 = 1;
        int result2 = 0;
        for(int i : num_list) {
            result1 *= i;
            result2 += i;
        }
        return result1 > Math.pow(result2, 2) ? 0 : 1;
    }
}