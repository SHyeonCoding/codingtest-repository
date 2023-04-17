import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int y = 0;
        int m = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            double x = Double.parseDouble(st.nextToken());
            if(x % 30 == 0) y += x / 30 + 1;
            else y += Math.ceil(x / 30);
            if(x % 60 == 0) m += m / 60 + 1;
            m += Math.ceil(x / 60);
        }

        if(y * 10 > m * 15) sb.append("M ").append(m * 15);
        else if(y * 10 < m * 15) sb.append("Y ").append(y * 10);
        else sb.append("Y M ").append(y * 10);
        System.out.println(sb);
    }
}