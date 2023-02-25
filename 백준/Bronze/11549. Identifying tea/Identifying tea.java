import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt = 0;

        for(int i = 0; i < 5; i++) {
            int num = Integer.parseInt(st.nextToken());
            if(n == num) cnt++;
        }

        sb.append(cnt);
        System.out.println(sb);
    }
}