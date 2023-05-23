class Solution {
    public String solution(String letter) {
        String[] arr = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] list = letter.split(" ");
        
        String answer = "";
        
        for(int i = 0; i < list.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                if(list[i].equals(arr[j])) {
                    answer += (char) (97 + j);
                    break;
                }
            }
        }
        
        return answer;
    }
}