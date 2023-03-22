import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double h = Double.parseDouble(st.nextToken());
            double w = Double.parseDouble(st.nextToken());
            double bmi = w / (h / 100 * h / 100);
            if(h < 140.1) sb.append(6);
            else if(h < 146) sb.append(5);
            else if(h < 159) sb.append(4);
            else if(h < 161) {
                if(16 <= bmi && 35 > bmi) sb.append(3);
                else sb.append(4);
            }
            else if(h < 204) {
                if(20 <= bmi && 25 > bmi) sb.append(1);
                else if((18.5 <= bmi && 20 > bmi) || (25 <= bmi && 30 > bmi)) sb.append(2);
                else if((16 <= bmi && 18.5 > bmi) || (30 <= bmi && 35 > bmi)) sb.append(3);
                else sb.append(4);
            }
            else sb.append(4);
            sb.append("\n");
        }

        System.out.println(sb);
    }
}