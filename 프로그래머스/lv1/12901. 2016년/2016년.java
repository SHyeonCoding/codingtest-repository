class Solution {
    public String solution(int a, int b) {
        int[] arr = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] dayList = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int day = 0;
        
        for(int i = 0; i < a - 1; i++) {
            day += arr[i];
        }

        return dayList[(day + b - 1) % 7];
    }
}