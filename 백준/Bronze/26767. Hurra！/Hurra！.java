import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for(int i = 1; i <= n; i ++) {
            if(i % 7 == 0 && i % 11 == 0) sb.append("Wiwat!");
            else if(i % 7 == 0) sb.append("Hurra!");
            else if(i % 11 == 0) sb.append("Super!");
            else sb.append(i);

            sb.append("\n");
        }

        System.out.println(sb);
    }
}