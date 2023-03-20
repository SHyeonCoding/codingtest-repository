import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= n; i++) {
            if(i % x == 0 && i % y == 0) sb.append("FizzBuzz");
            else if(i % x == 0) sb.append("Fizz");
            else if(i % y == 0) sb.append("Buzz");
            else sb.append(i);
            sb.append("\n");
        }

        System.out.println(sb);
    }
}