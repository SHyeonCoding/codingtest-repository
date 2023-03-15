import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int cnt = 0;

        for(int i = 0; i < 5; i++) {
           String s = br.readLine();
           if(s.indexOf("FBI") != -1) {
               sb.append(i + 1).append(" ");
               cnt++;
           }
        }

        if(cnt == 0) sb.append("HE GOT AWAY!");
        System.out.println(sb);
    }
}