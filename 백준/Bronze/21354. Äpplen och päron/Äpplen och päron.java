import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        if(a * 7 > b * 13) sb.append("Axel");
        else if(a * 7 < b * 13) sb.append("Petra");
        else sb.append("lika");

        System.out.println(sb);
    }
}