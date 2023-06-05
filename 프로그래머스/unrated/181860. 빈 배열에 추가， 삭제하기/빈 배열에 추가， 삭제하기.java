class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        String str = "";
        
        for(int i = 0; i < arr.length; i++) {
            if(flag[i]) {
                str += String.valueOf(arr[i]).repeat(arr[i] * 2);
            } else {
                str = str.substring(0, str.length() - arr[i]);
            }
        }
        
        int[] answer = new int[str.length()];
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = str.charAt(i) - '0';
        }
        
        return answer;
    }
}