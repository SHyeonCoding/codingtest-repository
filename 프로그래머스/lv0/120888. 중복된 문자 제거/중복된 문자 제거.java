class Solution {
    public String solution(String my_string) {
        String answer = "";
        int[] arr = new int[53];
        
        for(int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            if(Character.isUpperCase(ch)) {
                arr[ch - 'A' + 26]++;
                if(arr[ch - 'A' + 26] <= 1) answer += ch;
            } else if(Character.isLowerCase(ch)){
                arr[ch - 'a']++;
                if(arr[ch - 'a'] <= 1) answer += ch;
            } else {
                arr[52]++;
                if(arr[52] <= 1) answer += " ";
            }
        }
        
        return answer;
    }
}