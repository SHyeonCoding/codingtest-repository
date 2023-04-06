import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int mistake = Integer.parseInt(st.nextToken());
            String[] str = st.nextToken().split("");

            str[mistake - 1] = "";
            for (String s : str) {
                sb.append(s);
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}