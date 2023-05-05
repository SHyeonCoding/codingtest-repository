class Solution {
    public int solution(String myString, String pat) {
        String str = "";
        
        for(String s : myString.split("")) {
            if(s.equals("A")) str += "B";
            else str += "A";
        }
        return str.contains(pat) ? 1 : 0;
    }
}