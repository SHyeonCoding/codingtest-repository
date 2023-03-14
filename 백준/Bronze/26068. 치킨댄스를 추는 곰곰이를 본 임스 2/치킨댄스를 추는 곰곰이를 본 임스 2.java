import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), "-");
            st.nextToken();
            int dDay = Integer.parseInt(st.nextToken());
            if(dDay <= 90) cnt++;
        }

        sb.append(cnt);
        System.out.println(sb);
    }
}