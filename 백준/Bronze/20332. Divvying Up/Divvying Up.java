import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int hap = 0;

        for(int i = 0; i < n; i++) {
            hap += Integer.parseInt(st.nextToken());
        }

        if(hap % 3 == 0) sb.append("yes");
        else sb.append("no");

        System.out.println(sb);
    }
}