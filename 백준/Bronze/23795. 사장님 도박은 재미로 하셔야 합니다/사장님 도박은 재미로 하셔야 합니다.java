import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        long cnt = 0;

        while(true) {
            long num = Long.parseLong(br.readLine());
            if(num == -1) break;

            cnt += num;
        }

        sb.append(cnt);
        System.out.println(sb);
    }
}