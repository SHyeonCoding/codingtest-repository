import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] s = br.readLine().split("");
        int cnt = 0;

        for(int i = 0; i < s.length; i++){
            cnt += Math.pow(Double.parseDouble(s[i]), 5);
        }

        sb.append(cnt);
        System.out.println(sb);
    }
}