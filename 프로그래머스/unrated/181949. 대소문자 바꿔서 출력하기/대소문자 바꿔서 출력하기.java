import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        String result = "";
        for(int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if(ch >= 97) result += String.valueOf(ch).toUpperCase();
            else result += String.valueOf(ch).toLowerCase();
        }
        
        System.out.println(result);
    }
}