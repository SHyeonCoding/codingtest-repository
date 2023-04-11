import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String s = br.readLine();
            boolean check = true;
            if(s.equals("0")) break;
            for (int i = 0; i < s.length() / 2; i++) {
                if(s.charAt(i) != s.charAt(s.length() - i - 1)) {
                    sb.append("no");
                    check = false;
                    break;
                }
            }
            if(check) sb.append("yes");
            sb.append("\n");
        }

        System.out.println(sb);
    }
}