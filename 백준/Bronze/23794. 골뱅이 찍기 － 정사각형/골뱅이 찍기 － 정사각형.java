import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        sb.append("@".repeat(n + 2)).append("\n");
        for (int i = 1; i <= n; i++) {
            sb.append("@").append(" ".repeat(n)).append("@").append("\n");
        }
        sb.append("@".repeat(n + 2));

        System.out.println(sb);
    }
}