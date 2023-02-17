import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int hour = Integer.parseInt(st.nextToken());
        int drink = Integer.parseInt(st.nextToken());

        if(drink == 1) sb.append(280);
        else if(hour >= 12 && hour <= 16) sb.append(320);
        else sb.append(280);

        System.out.println(sb);
    }
}