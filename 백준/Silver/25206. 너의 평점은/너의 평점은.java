import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        double avg = 0.0;
        int sum = 0;
        Map<String, Double> rank = new HashMap<>();
        rank.put("A+", 4.5);
        rank.put("A0", 4.0);
        rank.put("B+", 3.5);
        rank.put("B0", 3.0);
        rank.put("C+", 2.5);
        rank.put("C0", 2.0);
        rank.put("D+", 1.5);
        rank.put("D0", 1.0);
        rank.put("F", 0.0);

        for(int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            st.nextToken();
            double grade = Double.parseDouble(st.nextToken());
            String s = st.nextToken();
            if(!s.equals("P")) {
                avg += rank.get(s) * grade;
                sum += grade;
            }
        }

        sb.append(String.format("%.6f",avg / sum));
        System.out.println(sb);
    }
}