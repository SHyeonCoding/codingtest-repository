class Solution {
    public int solution(int[][] dots) {
        double a_x = Math.max(dots[0][0], dots[1][0]) - Math.min(dots[0][0], dots[1][0]);
        double a_y = Math.max(dots[0][1], dots[1][1]) - Math.min(dots[0][1], dots[1][1]);
        
        double b_x = Math.max(dots[2][0], dots[3][0]) - Math.min(dots[2][0], dots[3][0]);
        double b_y = Math.max(dots[2][1], dots[3][1]) - Math.min(dots[2][1], dots[3][1]);
        
        return a_x / a_y == b_x / b_y ? 1 : 0;
    }
}