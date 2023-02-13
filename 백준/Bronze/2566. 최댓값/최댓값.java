import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int max = 0;
        int c = 1;
        int r = 1;

        for(int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 9; j++) {
                int n = Integer.parseInt(st.nextToken());
                if(n > max) {
                    max = n;
                    c = i + 1;
                    r = j + 1;
                }
            }
        }
        sb.append(max + "\n").append(c + " ").append(r);

        System.out.println(sb);
    }
}