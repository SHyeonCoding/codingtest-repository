import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split("");

        int a = 0;
        int b = 0;
        for(String s : arr) {
            if(s.equals("A")) a++;
            else b++;
        }

        if(a > b) sb.append("A");
        else if(b > a) sb.append("B");
        else sb.append("Tie");
        System.out.println(sb);
    }
}