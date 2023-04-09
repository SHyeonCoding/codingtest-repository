import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        long n = Long.parseLong(br.readLine());
        long m = Long.parseLong(br.readLine());

        if(n == 1 || m == 1) sb.append(n * m);
        else sb.append((n * m) - ((n - 2) * (m - 2)));

        System.out.println(sb);
    }
}