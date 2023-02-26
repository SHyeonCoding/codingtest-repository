import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int a1 = Integer.parseInt(br.readLine());
        int a2 = Integer.parseInt(br.readLine());
        int a3 = Integer.parseInt(br.readLine());
        int b1 = Integer.parseInt(br.readLine());
        int b2 = Integer.parseInt(br.readLine());
        int b3 = Integer.parseInt(br.readLine());

        int aScore = a1 * 3 + a2 * 2 + a3;
        int bScore = b1 * 3 + b2 * 2 + b3;

        if(aScore > bScore) sb.append("A");
        else if(aScore < bScore) sb.append("B");
        else sb.append("T");

        System.out.println(sb);
    }
}