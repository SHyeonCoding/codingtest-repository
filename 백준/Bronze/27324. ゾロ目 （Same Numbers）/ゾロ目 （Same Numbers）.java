import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        if(n / 10 == n % 10) sb.append(1);
        else sb.append(0);
        System.out.println(sb);
    }
}