import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[Integer.parseInt(st.nextToken())];
        int k = Integer.parseInt(st.nextToken());

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for(int i = 0; i < arr.length; i++) {
            int n = Integer.parseInt(st1.nextToken());
            arr[i] = n;
        }

        Arrays.sort(arr);
        sb.append(arr[arr.length - k]);
        System.out.println(sb);
    }
}