import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        if(n / 10000 == 555) sb.append("YES");
        else sb.append("NO");

        System.out.println(sb);
    }
}