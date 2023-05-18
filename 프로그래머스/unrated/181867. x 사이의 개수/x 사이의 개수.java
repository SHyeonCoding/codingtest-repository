class Solution {
    public int[] solution(String myString) {
        boolean checked = false;
        if(myString.endsWith("x")) {
            myString += "o";
            checked = true;
        }
        
        String[] arr = myString.split("x");
        int[] answer = new int[arr.length];
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = arr[i].length();
        }
        
        if(checked) answer[answer.length - 1]--;
        
        return answer;
    }
}