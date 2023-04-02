import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        String s1 = st.nextToken() + st.nextToken();
        String s2 = st.nextToken() + st.nextToken();

        sb.append(Long.parseLong(s1) + Long.parseLong(s2));
        System.out.println(sb);
    }
}