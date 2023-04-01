import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            sb.append("@".repeat(5 * n)).append("\n");
        }

        for (int i = 0; i < n * 3; i++) {
            sb.append("@".repeat(n)).append(" ".repeat(3 * n)).append("@".repeat(n)).append("\n");
        }

        for (int i = 0; i < n; i++) {
            sb.append("@".repeat(5 * n)).append("\n");
        }

        System.out.println(sb);
    }
}