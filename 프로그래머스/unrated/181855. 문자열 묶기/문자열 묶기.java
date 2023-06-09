class Solution {
    public int solution(String[] strArr) {
        int[] arr = new int[30];
        int answer = 0;
        
        for(String s : strArr) {
            arr[s.length() - 1]++;
        }
        
        for(int i : arr) {
            if(i > answer) answer = i;
        }
        
        return answer;
    }
}