import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            String[] s = br.readLine().split("");
            String result = s[0];
            for(int j = 0; j < s.length - 1; j++) {
                if(!s[j].equals(s[j + 1])) result += s[j + 1];
            }
            sb.append(result).append("\n");
        }

        System.out.println(sb);
    }
}