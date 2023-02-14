import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int result = 0;
        for(int i = 0; i < 3; i++) {
            int num = Integer.parseInt(st.nextToken());
            if(num - n > 0) result += n;
            else result += num;
        }

        sb.append(result);
        System.out.println(sb);
    }
}