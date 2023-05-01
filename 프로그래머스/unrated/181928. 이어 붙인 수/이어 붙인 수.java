class Solution {
    public int solution(int[] num_list) {
        String odd = "";
        String even = "";
        
        for(int i : num_list) {
            if(i % 2 == 0) even += Integer.toString(i);
            else odd += Integer.toString(i);
        }
        
        return Integer.parseInt(even) + Integer.parseInt(odd);
    }
}