import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        sb.append("The largest square has side length ").append((int)Math.sqrt(n)).append(".");
        System.out.println(sb);
    }
}