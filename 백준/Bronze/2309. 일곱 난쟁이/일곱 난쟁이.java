import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] arr = new int[9];
        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            cnt += arr[i];
        }

        int sub = cnt - 100;
        int a = 0;
        int b = 0;
        loop: for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] + arr[j] == sub) {
                    a = arr[i];
                    b = arr[j];
                    break loop;
                }
            }
        }

        Arrays.sort(arr);
        for (int i : arr) {
            if(i != a && i != b) sb.append(i).append("\n");
        }

        System.out.println(sb);
    }
}