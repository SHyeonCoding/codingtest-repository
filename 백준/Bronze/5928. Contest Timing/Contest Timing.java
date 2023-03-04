import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int day = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());
        int sec = Integer.parseInt(st.nextToken());

        if(day < 11 || (day == 11 && min < 11) || (day == 11 && min == 11 && sec < 11)) sb.append(-1);
        else sb.append((day - 11) * 1440 + (min - 11) * 60 + (sec - 11));

        System.out.println(sb);
    }
}