class Solution {
    public int solution(int n) {
        int answer = 1;
        return answer + (n % 7 == 0 ? n / 7 - 1 : n / 7);
    }
}