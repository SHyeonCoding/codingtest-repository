import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        for(int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            int floor;
            if(n % h == 0) floor = h;
            else floor = n % h;

            int room;
            if(n % h == 0) room = n / h;
            else room = n / h + 1;

            if(room >= 10) sb.append(String.valueOf(floor)).append(String.valueOf(room) + "\n");
            else sb.append(String.valueOf(floor)).append("0").append(String.valueOf(room) + "\n");
        }

        System.out.println(sb);
    }
}