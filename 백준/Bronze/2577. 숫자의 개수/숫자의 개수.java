import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] arr = new int[10];

        String num = String.valueOf(Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()));

        for(int i = 0; i < num.length(); i++) {
            char ch = num.charAt(i);
            arr[ch - '0'] += 1;
        }

        for(int i : arr) {
            sb.append(i).append("\n");
        }

        System.out.println(sb);
    }
}