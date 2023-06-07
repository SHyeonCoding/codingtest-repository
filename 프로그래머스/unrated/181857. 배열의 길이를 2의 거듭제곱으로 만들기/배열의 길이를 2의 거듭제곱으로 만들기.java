class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1) return arr;
        int n = 2;
        
        while(n < arr.length) {
            n *= 2;
        }
        
        if(n == arr.length) return arr;
        
        int[] answer = new int[n];
        for(int i = 0; i < answer.length; i++) {
            if(i < arr.length) answer[i] = arr[i];
            else answer[i] = 0;
        }
        
        return answer;
    }
}