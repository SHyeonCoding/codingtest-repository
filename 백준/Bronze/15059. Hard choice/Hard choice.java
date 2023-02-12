import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        int cnt = 0;
        for(int i = 0; i < 3; i++) {
            int maxFood = Integer.parseInt(st.nextToken());
            int checkFood = Integer.parseInt(st2.nextToken());

            if(checkFood - maxFood  > 0) {
                cnt += checkFood - maxFood;
            }
        }
        sb.append(cnt);
        System.out.println(sb);
    }
}