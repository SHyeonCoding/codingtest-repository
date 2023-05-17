class Solution {
    public int solution(int[] arr1, int[] arr2) {
        if(arr1.length != arr2.length) return arr1.length > arr2.length ? 1 : -1;
        
        int n1 = 0;
        int n2 = 0;
        
        for(int num : arr1) {
            n1 += num;
        }
        
        for(int num : arr2) {
            n2 += num;
        }
        
        return n1 == n2 ? 0 : n1 > n2 ? 1 : -1;
    }
}