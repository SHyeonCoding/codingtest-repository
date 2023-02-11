import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt = 0;

        for(int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            boolean check = true;
            for(int j = 2; j <= (int)Math.sqrt(num); j++) {
                if(num % j == 0) {
                    check = false;
                    break;
                }
            }
            if(num >= 2 && check) cnt++;
        }

        sb.append(cnt);
        System.out.println(sb);
    }
}