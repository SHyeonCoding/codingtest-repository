import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for(int i = 1; i <= n; i++) {
            sb.append(" ".repeat(n - i)).append("*".repeat(2 * i - 1)).append("\n");
        }

        for(int i = n - 1; i > 0; i--) {
            sb.append(" ".repeat(n - i)).append("*".repeat(2 * i - 1)).append("\n");
        }

        System.out.println(sb);
    }
}