class Solution {
    public String[] solution(String[] quiz) {
        for(int i = 0; i < quiz.length; i++) {
            String[] arr = quiz[i].split(" ");
            
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[2]);
            int result = Integer.parseInt(arr[4]);
            if(arr[1].equals("+")) {
                if(a + b == result) quiz[i] = "O";
                else quiz[i] = "X";
            } else {
                if(a - b == result) quiz[i] = "O";
                else quiz[i] = "X";
            }
        }
        
        return quiz;
    }
}