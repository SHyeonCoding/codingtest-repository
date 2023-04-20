import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int cnt = 0;

        for (int i = 0; i < 8; i++) {
            String s = br.readLine();
            for (int j = 0; j < 8; j++) {
                if(i % 2 == 0 && j % 2 == 0) {
                    if(s.charAt(j) == 'F') cnt++;
                } else if(i % 2 == 1 && j % 2 == 1) {
                    if(s.charAt(j) == 'F') cnt++;
                }
            }
        }

        sb.append(cnt);
        System.out.println(sb);
    }
}