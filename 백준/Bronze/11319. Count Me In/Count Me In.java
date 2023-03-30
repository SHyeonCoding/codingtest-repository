import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int cnt = 0;
            String s = br.readLine().toUpperCase().replace(" ", "").replaceAll("[AEIOU]", "1");
            for (int j = 0; j < s.length(); j++) {
                if(String.valueOf(s.charAt(j)).equals("1")) cnt++;
            }
            sb.append(s.length() - cnt).append(" ").append(cnt).append("\n");
        }

        System.out.println(sb);
    }
}