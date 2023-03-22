import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();

        while(!s.equals("***")) {
            for(int i = 0; i < s.length(); i++) {
                sb.append(s.charAt(s.length() - i - 1));
            }

            sb.append("\n");
            s = br.readLine();
        }

        System.out.println(sb);
    }
}