import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            int a = Integer.parseInt(br.readLine());
            if(Math.abs(a) % 2 == 0) sb.append(a).append(" is even");
            else sb.append(a).append(" is odd");
            sb.append("\n");
        }

        System.out.println(sb);
    }
}