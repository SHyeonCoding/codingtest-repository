import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        long a = Long.parseLong(br.readLine());
        long b = Long.parseLong(br.readLine());
        long c = Long.parseLong(br.readLine());
        String s = String.valueOf(a * b * c);
        int[] arr = new int[10];

        for (int i = 0; i < s.length(); i++) {
            int ch = s.charAt(i) - '0';
            arr[ch]++;
        }

        for (int i : arr) {
            sb.append(i).append("\n");
        }

        System.out.println(sb);
    }
}