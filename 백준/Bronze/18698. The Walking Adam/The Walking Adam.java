import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] str = br.readLine().split("");
            int cnt = 0;
            for (int j = 0; j < str.length; j++) {
                if(str[j].equals("U")) cnt++;
                else break;
            }
            sb.append(cnt).append("\n");
        }

        System.out.println(sb);
    }
}