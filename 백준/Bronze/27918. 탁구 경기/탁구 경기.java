import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int x = 0;
        int y = 0;

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            if(s.equals("D")) x++;
            else y++;

            if(Math.abs(x - y) == 2) break;
        }

        sb.append(x + ":" + y);
        System.out.println(sb);
    }
}