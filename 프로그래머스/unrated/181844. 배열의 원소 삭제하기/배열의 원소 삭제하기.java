class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int cnt = 0;
        
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < delete_list.length; j++) {
                if(arr[i] == delete_list[j]) {
                    arr[i] = 0;
                    cnt++;
                    break;
                }
            }
        }
        
        int[] answer = new int[arr.length - cnt];
        int idx = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                answer[idx++] = arr[i]; 
            }
        }
        
        return answer;
    }
}