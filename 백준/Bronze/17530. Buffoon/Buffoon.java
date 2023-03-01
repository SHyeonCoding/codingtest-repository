import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int v = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 0; i < n - 1; i++) {
            if(Integer.parseInt(br.readLine()) > v) {
                sb.append("N");
                cnt++;
                break;
            }
        }

        if(cnt == 0) sb.append("S");

        System.out.println(sb);
    }
}