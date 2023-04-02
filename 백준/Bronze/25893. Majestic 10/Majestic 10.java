import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int cnt = 0;
            while (st.hasMoreTokens()) {
                int a = Integer.parseInt(st.nextToken());
                sb.append(a).append(" ");
                if(a >= 10) cnt++;
            }

            sb.append("\n");
            if(cnt == 0) sb.append("zilch");
            else if(cnt == 1) sb.append("double");
            else if(cnt == 2) sb.append("double-double");
            else sb.append("triple-double");
            sb.append("\n\n");
        }

        System.out.println(sb);
    }
}