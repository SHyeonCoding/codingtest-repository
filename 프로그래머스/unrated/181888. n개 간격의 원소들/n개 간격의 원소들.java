class Solution {
    public int[] solution(int[] num_list, int n) {
        int len = num_list.length;
        int[] answer = new int[len % n == 0 ? len / n : len / n + 1];
        int idx = 0;
        
        for(int i = 0; i < num_list.length; i += n) {
            answer[idx++] = num_list[i];
        }
        return answer;
    }
}