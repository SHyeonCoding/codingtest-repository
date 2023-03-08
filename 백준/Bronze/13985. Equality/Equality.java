import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = 0;

        for (int i = 0; i < 5; i++) {
            if (i == 0 || i == 2) {
                num += Integer.parseInt(st.nextToken());
            }
            else if(i == 4) {
                if(Integer.parseInt(st.nextToken()) == num) sb.append("YES");
                else sb.append("NO");
            }
            else st.nextToken();
        }

        System.out.println(sb);
    }
}