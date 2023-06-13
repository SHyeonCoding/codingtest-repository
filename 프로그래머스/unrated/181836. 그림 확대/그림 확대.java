class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        
        for(int i = 0; i < picture.length; i++) {
            String[] arr = picture[i].split("");
            String x = "";
            for(int j = 0; j < arr.length; j++) {
                 x += arr[j].repeat(k);
            }
            
            for(int j = 0; j < k; j++) {
                answer[i * k + j] = x;
            }
        }
        
        return answer;
    }
}