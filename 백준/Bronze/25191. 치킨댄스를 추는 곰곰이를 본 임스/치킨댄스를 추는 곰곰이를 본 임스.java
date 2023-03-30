import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int chicken = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int coke = Integer.parseInt(st.nextToken());
        int beer = Integer.parseInt(st.nextToken());

        int n = (coke / 2) + beer;

        if(n > chicken) sb.append(chicken);
        else sb.append(n);

        System.out.println(sb);
    }
}