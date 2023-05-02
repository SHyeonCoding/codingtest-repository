class Solution {
    public int solution(int[] sides) {
        int answer = sides[0] + sides[1] + sides[2];
        int max = Math.max(sides[0], Math.max(sides[1], sides[2]));
        return answer - max > max ? 1 : 2;
    }
}