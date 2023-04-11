import java.io.*;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] arr = new int[8];
        int[] num = new int[5];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < 8; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            map.put(arr[i], i + 1);
        }

        Arrays.sort(arr);
        int result = 0;
        for (int i = 3; i < 8; i++) {
            result += arr[i];
            num[i - 3] = map.get(arr[i]);
        }

        Arrays.sort(num);
        for (int i : num) {
            sb.append(i).append(" ");
        }

        System.out.println(result);
        System.out.println(sb);
    }
}