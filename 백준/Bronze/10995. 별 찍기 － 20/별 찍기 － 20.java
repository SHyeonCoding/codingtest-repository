import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            if(i % 2 == 0) sb.append("* ".repeat(n - 1)).append("*");
            else sb.append(" *".repeat(n));
            sb.append("\n");
        }

        System.out.println(sb);
    }
}