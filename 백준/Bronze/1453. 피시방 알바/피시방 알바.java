import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[101];
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(st.nextToken());
            if(arr[m] == 1) cnt++;
            else arr[m] = 1;
        }

        sb.append(cnt);
        System.out.println(sb);
    }
}