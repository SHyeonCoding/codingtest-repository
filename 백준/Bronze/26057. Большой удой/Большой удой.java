import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int l = Integer.parseInt(br.readLine());
        int t = Integer.parseInt(br.readLine());

        sb.append(t - (l - t));

        System.out.println(sb);
    }
}