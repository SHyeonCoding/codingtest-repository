import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        String[] a = st.nextToken().split("");
        String[] b = st.nextToken().split("");
        long result = 0;

        for (int i = 0; i < a.length; i++) {
            int x = Integer.parseInt(a[i]);
            for (int j = 0; j < b.length; j++) {
                int y = Integer.parseInt(b[j]);
                result = result + x * y;
            }
        }

        sb.append(result);
        System.out.println(sb);
    }
}