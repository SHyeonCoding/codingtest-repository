import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] arr = new int[5];
        int avg = 0;

        for(int i = 0; i < arr.length; i++) {
            int n = Integer.parseInt(br.readLine());
            avg += n;
            arr[i] = n;
        }

        Arrays.sort(arr);
        sb.append(avg / 5 + "\n").append(arr[2]);
        System.out.println(sb);
    }
}