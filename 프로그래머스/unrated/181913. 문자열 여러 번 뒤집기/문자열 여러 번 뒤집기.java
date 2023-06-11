class Solution {
    public String solution(String my_string, int[][] queries) {
        String[] arr = my_string.split("");
        
        for(int i = 0; i < queries.length; i++) {
            for(int j = 0; j <= (queries[i][1] - queries[i][0]) / 2; j++) {
                String temp = arr[queries[i][0] + j];
                arr[queries[i][0] + j] = arr[queries[i][1] - j];
                arr[queries[i][1] - j] = temp;
            }
        }
        
        String answer = "";
        for(String s : arr) {
            answer += s;
        }
        
        return answer;
    }
}