class Solution {
    public int solution(String binomial) {
        String[] arr = binomial.split(" ");
        
        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[2]);
        
        if(arr[1].equals("+")) return n + m;
        else if(arr[1].equals("-")) return n - m;
        else return n * m;
    }
}