import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] arr = new int[9];
        int[] rm = new int[2];
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            result += arr[i];
        }

        loop: while (true) {
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if(result - (arr[i] + arr[j]) == 100) {
                        rm[0] = arr[i];
                        rm[1] = arr[j];
                        break loop;
                    }
                }
            }
        }

        for (int i : arr) {
            if(i != rm[0] && i != rm[1]) sb.append(i).append("\n");
        }

        System.out.println(sb);
    }
}