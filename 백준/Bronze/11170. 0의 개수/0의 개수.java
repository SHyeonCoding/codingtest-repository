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
                String num = String.valueOf(j);
                for (int k = 0; k < num.length(); k++) {
                    if(num.charAt(k) == '0') cnt++;
                }
            }
            sb.append(cnt).append("\n");
        }

        System.out.println(sb);
    }
}