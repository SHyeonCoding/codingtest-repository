import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int cnt = 0;

        for(int i = 0; i < 6; i++) {
            String s = br.readLine();
            if(s.equals("W")) cnt++;
        }

        if(cnt >= 5) sb.append(1);
        else if(cnt >= 3) sb.append(2);
        else if(cnt >= 1) sb.append(3);
        else sb.append(-1);

        System.out.println(sb);
    }
}