class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for(int i = 0; i < answer.length; i++) {
            int result = Integer.MAX_VALUE;
            for(int j = queries[i][0]; j <= queries[i][1]; j++) {
                if(queries[i][2] < arr[j] && result > arr[j]) result = arr[j];
            }     
            if(result == Integer.MAX_VALUE) answer[i] = -1;
            else answer[i] = result;
        }
        
        return answer;
    }
}