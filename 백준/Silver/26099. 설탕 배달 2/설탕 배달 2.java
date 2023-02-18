import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        long n = Long.parseLong(br.readLine());
        long i = 1;
        long cnt = 0;
        long result = 1;

        if(n % 5 == 0) sb.append(n / 5);
        else {
            while(result > 0) {
                result = n - 3 * i;
                if(result % 5 == 0) {
                    cnt = i + result / 5;
                    break;
                }
                i++;
            }
            if(cnt == 0) sb.append(-1);
            else sb.append(cnt);
        }

        System.out.println(sb);
    }
}