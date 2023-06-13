class Solution {
    public int solution(int n) {
        String a = Integer.toString(n, 3);
        return Integer.parseInt(new StringBuilder(a).reverse().toString(), 3);
    }
}