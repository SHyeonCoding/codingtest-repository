import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            sb.append((long)Math.pow(Long.parseLong(br.readLine()), 2)).append("\n");
        }

        System.out.println(sb);
    }
}