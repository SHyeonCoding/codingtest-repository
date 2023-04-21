import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            String s = br.readLine();
            int cnt = 1;
            int max = 1;
            for (int j = 1; j < s.length(); j++) {
                if(s.charAt(j - 1) == s.charAt(j)) {
                    cnt++;
                    if(cnt > max) max = cnt;
                }
                else cnt = 1;
            }
            sb.append(max).append("\n");
        }

        System.out.println(sb);
    }
}