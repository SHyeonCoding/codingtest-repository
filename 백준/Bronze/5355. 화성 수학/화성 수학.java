import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double d = Double.parseDouble(st.nextToken());
            while(st.hasMoreTokens()) {
                String s = st.nextToken();
                if(s.equals("@")) d *= 3;
                else if(s.equals("%")) d += 5;
                else d -= 7;
            }

            sb.append(String.format("%.2f", d)).append("\n");
        }

        System.out.println(sb);
    }
}