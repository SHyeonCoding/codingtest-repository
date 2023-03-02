import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int min = Integer.MAX_VALUE;
        String lowLevel = "";

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            int level = Integer.parseInt(st.nextToken());

            if(min > level) {
                min = level;
                lowLevel = s;
            }
        }

        sb.append(lowLevel);
        System.out.println(sb);
    }
}