import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            int t = Integer.parseInt(br.readLine());
            for(int k = 0; k < t; k++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int num1 = Integer.parseInt(st.nextToken());
                int num2 = Integer.parseInt(st.nextToken());
                sb.append(num1 + num2).append(" ").append(num1 * num2).append("\n");
            }
        }

        System.out.println(sb);
    }
}