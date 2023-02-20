import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        long num1 = Long.parseLong(st.nextToken());
        long num2 = Long.parseLong(st.nextToken());

        if(num1 == num2) sb.append(0);
        else if(num1 < num2) sb.append(num2 - num1 - 1 + "\n");
        else sb.append(num1 - num2 - 1 + "\n");

        for(long i = Math.min(num1, num2) + 1; i < Math.max(num1, num2); i++) {
            sb.append(i).append(" ");
        }

        System.out.println(sb);
    }
}