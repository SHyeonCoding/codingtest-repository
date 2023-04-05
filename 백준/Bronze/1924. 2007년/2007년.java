import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int month = Integer.parseInt(st.nextToken());
        int day = Integer.parseInt(st.nextToken());

        int result = day;

        for (int i = 0; i < month - 1; i++) {
            result += arr[i];
        }

        switch (result % 7) {
            case 0:
                sb.append("SUN");
                break;
            case 1:
                sb.append("MON");
                break;
            case 2:
                sb.append("TUE");
                break;
            case 3:
                sb.append("WED");
                break;
            case 4:
                sb.append("THU");
                break;
            case 5:
                sb.append("FRI");
                break;
            case 6:
                sb.append("SAT");
                break;
        }

        System.out.println(sb);
    }
}