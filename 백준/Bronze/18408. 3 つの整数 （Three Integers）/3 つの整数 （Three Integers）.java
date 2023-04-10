import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = 0;
        int b = 0;

        while (st.hasMoreTokens()) {
            if(Integer.parseInt(st.nextToken()) == 1) a++;
            else b++;
        }

        if(a > b) sb.append(1);
        else sb.append(2);
        System.out.println(sb);
    }
}