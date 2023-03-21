import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < 3; i++) {
            int cnt = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()) {
                if(Integer.parseInt(st.nextToken()) == 0) cnt++;
            }

            if(cnt == 0) sb.append("E");
            else if(cnt == 1) sb.append("A");
            else if(cnt == 2) sb.append("B");
            else if(cnt == 3) sb.append("C");
            else sb.append("D");
            sb.append("\n");
        }

        System.out.println(sb);
    }
}