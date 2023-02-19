import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] arr = br.readLine().split(" ");
        int cnt = 0;

        for(int i = 0; i < 7; i++) {
            if(Math.abs(Integer.parseInt(arr[i]) - Integer.parseInt(arr[i + 1])) == 1) {
                cnt = 1;
            } else {
                cnt = Integer.parseInt(arr[i]) - Integer.parseInt(arr[i + 1]);
                break;
            }
        }

        if(cnt == 1 && Integer.parseInt(arr[0]) == 1) sb.append("ascending");
        else if(cnt == 1 && Integer.parseInt(arr[0]) == 8) sb.append("descending");
        else sb.append("mixed");

        System.out.println(sb);
    }
}