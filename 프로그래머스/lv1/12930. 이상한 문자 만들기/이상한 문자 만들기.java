class Solution {
    public String solution(String s) {
        s = s.toLowerCase();
        boolean checked = true;
        String[] arr = s.split("");
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].isBlank()) {
                checked = true;
                continue;
            }
            if(checked) {
                arr[i] = arr[i].toUpperCase();
                checked = false;
            } else {
                checked = true;
            }
        }
        
        String answer = "";
        for(String str : arr) {
            answer += str;
        }
        
        return answer;
    }
}