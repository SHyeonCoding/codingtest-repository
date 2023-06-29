class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i = 0; i < n; i++) {
            String s = Integer.toBinaryString(arr1[i] | arr2[i]);
            
            s = "0".repeat(arr1.length - s.length()) + s;
            answer[i] = s.replace("1", "#").replace("2", "#").replace("0", " ");
        }
        
        return answer;
    }
}