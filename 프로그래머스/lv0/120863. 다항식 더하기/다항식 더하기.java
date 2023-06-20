class Solution {
    public String solution(String polynomial) {
        String[] arr = polynomial.split(" \\+ ");
        int x = 0;
        int n = 0;
        
        for(String s : arr) {
            if(s.contains("x")) {
                if(s.length() > 1) {
                    x += Integer.parseInt(s.split("x")[0]);
                } else {
                    x++;
                }
            } else {
                n += Integer.parseInt(s);
            }
        }
        
        String answer = "";
        
        if(x != 0) {
            if(x == 1) answer += "x";
            else answer += x + "x";
        }
        
        if(n != 0) {
            if(answer.length() == 0) answer += String.valueOf(n);
            else answer += " + " + n;
        }
        
        return answer;
    }
}