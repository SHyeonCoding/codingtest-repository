import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        sb.append(" ".repeat(n - 1)).append("*");
        for (int i = 2; i <= n; i++) {
            sb.append("\n");
            sb.append(" ".repeat(n - i)).append("*").append(" ".repeat(2 * (i - 2) + 1)).append("*");
        }

        System.out.println(sb);
    }
}