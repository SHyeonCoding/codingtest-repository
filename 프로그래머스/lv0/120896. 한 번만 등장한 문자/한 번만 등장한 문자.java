class Solution {
    public String solution(String s) {
        int[] arr = new int[26];
        String answer = "";
        
        for(char ch : s.toCharArray()){
            arr[ch - 97]++; 
        }
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 1) answer += (char) (i + 97);
        }
        
        return answer;
    }
}