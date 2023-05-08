class Solution {
    public int[] solution(int[] arr) {
        int cnt = 0;
        
        for(int i : arr) {
            cnt += i;
        }
        
        int[] answer = new int[cnt];
        int x = 0;
        
        for(int i = 0; i < arr.length; i++) {
            int n = arr[i];
            
            for(int j = x; j < x + n; j++) {
                answer[j] = n;
            }
            
            x += n;
        }
        
        return answer;
    }
}