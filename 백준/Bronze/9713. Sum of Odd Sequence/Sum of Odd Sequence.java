import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            int cnt = 0;
            int num = Integer.parseInt(br.readLine());
            for(int j = 1; j <= num; j++) {
                if(j % 2 != 0) {
                    cnt += j;
                }
            }
            sb.append(cnt).append("\n");
        }

        System.out.println(sb);
    }
}