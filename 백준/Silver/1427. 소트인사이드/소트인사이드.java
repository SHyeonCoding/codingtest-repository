import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] arr = br.readLine().split("");
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[arr.length - i - 1]);
        }

        System.out.println(sb);
    }
}