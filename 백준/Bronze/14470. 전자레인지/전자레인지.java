import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());
        int e = Integer.parseInt(br.readLine());

        if(a < 0) sb.append(Math.abs(a) * c + d + b * e);
        else if(a == 0) sb.append(d + b * e);
        else sb.append((b - a) * e);

        System.out.println(sb);
    }
}