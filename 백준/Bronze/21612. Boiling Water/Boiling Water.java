import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int b = Integer.parseInt(br.readLine());

        int p = 5 * b - 400;

        sb.append(p).append("\n");
        if(p > 100) sb.append(-1);
        else if(p < 100) sb.append(1);
        else sb.append(0);

        System.out.println(sb);
    }
}