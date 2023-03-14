import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        for(int i = 0; i < n; i++) {
            if(s.equals(br.readLine())) {
                cnt++;
            }
        }

        sb.append(cnt);
        System.out.println(sb);
    }
}