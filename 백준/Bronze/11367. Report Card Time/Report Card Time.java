import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int score = Integer.parseInt(st.nextToken());

            sb.append(name).append(" ");
            if(score >= 90) sb.append("A");
            else if(score >= 80) sb.append("B");
            else if(score >= 70) sb.append("C");
            else if(score >= 60) sb.append("D");
            else sb.append("F");

            if((score % 10 >= 7 || score == 100) && score >= 60) sb.append("+");

            sb.append("\n");
        }

        System.out.println(sb);
    }
}