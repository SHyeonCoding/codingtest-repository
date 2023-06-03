class Solution {
    public boolean solution(int x) {
        String[] arr = String.valueOf(x).split("");
        int hap = 0;
        
        for(String s : arr) {
            hap += Integer.parseInt(s);
        }
        
        return x % hap == 0;
    }
}