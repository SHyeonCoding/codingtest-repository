import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for(int i = 1; i <= n; i++) {
            sb.append("*".repeat(i)).append(" ".repeat(2 * n - 2 * i)).append("*".repeat(i)).append("\n");
        }

        for(int i = 1; i < n; i++) {
            sb.append("*".repeat(n - i)).append(" ".repeat(2 * i)).append("*".repeat(n - i)).append("\n");
        }

        System.out.println(sb);
    }
}