import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        for(int i = 1; i <= n; i++) {
            String[] arr = String.valueOf(i).split("");
            for(int j = 0; j < arr.length; j++) {
               if(arr[j].equals("3") || arr[j].equals("6") || arr[j].equals("9")) cnt++;
            }
        }

        sb.append(cnt);
        System.out.println(sb);
    }
}