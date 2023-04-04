import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int cnt = 0;

            for (int j = start; j <= end; j++) {
                int x = j;

                if(x == 0) cnt++;

                while (x > 1) {
                    if(x % 10 == 0) cnt ++;
                    x /= 10;
                }
            }
            
            sb.append(cnt).append("\n");
        }

        System.out.println(sb);
    }
}