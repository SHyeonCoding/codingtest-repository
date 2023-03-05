import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());
        int max = Integer.parseInt(st.nextToken());

        int diff = Integer.MAX_VALUE;
        int result = 0;

        for(int i = min; i <= max; i++) {
            if(Math.abs(n - i) < diff) {
                diff = Math.abs(n - i);
                result = i;
            }
        }

        sb.append(result);
        System.out.println(sb);
    }
}