import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if(a == b && b == c) arr[i] = 10000 + a * 1000;
            else if(a == b || b == c || a == c) {
                if(a == b || a == c) arr[i] = 1000 + a * 100;
                else arr[i] = 1000 + b * 100;
            }
            else {
                arr[i] = Math.max(a, Math.max(b, c)) * 100;
            }
        }

        Arrays.sort(arr);
        sb.append(arr[n - 1]);
        System.out.println(sb);
    }
}