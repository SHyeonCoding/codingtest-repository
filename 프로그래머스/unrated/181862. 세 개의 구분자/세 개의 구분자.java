class Solution {
    public String[] solution(String myStr) {
        myStr = myStr.replaceAll("[a-c]{2,}", "a").replaceAll("[a-c]", " ").trim();
        String[] arr = myStr.split(" ");
        
        return arr[0].equals("") ? new String[]{"EMPTY"} : arr;
    }
}