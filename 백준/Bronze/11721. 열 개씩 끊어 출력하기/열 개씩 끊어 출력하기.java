import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();
        int len = s.length() / 10;

        for (int i = 0; i < len; i++) {
            sb.append(s, i * 10, (i + 1) * 10).append("\n");
        }

        if(s.length() % 10 != 0) sb.append(s, len * 10, s.length());

        System.out.println(sb);
    }
}