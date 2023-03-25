import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()) - 1;
            int b = Integer.parseInt(st.nextToken()) - 1;
            for (int j = 0; j <= (b - a) / 2; j++) {
                int temp = arr[a + j];
                arr[a + j] = arr[b - j];
                arr[b - j] = temp;
            }
        }

        for (int i : arr) {
            sb.append(i).append(" ");
        }

        System.out.println(sb);
    }
}