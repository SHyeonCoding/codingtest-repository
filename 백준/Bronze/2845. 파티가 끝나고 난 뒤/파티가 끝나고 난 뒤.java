import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());

        for(int i = 0; i < 5; i++) {
            sb.append(Integer.parseInt(st2.nextToken()) - n).append(" ");
        }

        System.out.println(sb);
    }
}