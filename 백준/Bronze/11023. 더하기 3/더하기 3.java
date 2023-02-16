import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = 0;

        while(st.hasMoreTokens()) {
            sum += Integer.parseInt(st.nextToken());
        }

        sb.append(sum);
        System.out.println(sb);
    }
}